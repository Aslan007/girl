package com.lx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Aslan on 2017/8/8.
 */
@RestController
public class GirlController {

    //这个本应该在service里面调用的，但是这里太简单  就直接调用了
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     *list
     * @return
     */
    @GetMapping(value = "/findAll")
    public List<Girl> findAll(){

        return  girlRepository.findAll();
    }

    /**
     * 添加
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/addGirl")
    public Girl addGirl(@RequestParam("name") String name,
                        @RequestParam("age") Integer age)
    {
        Girl girl = new Girl();
        girl.setName(name);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    @GetMapping(value = "/queryGirl/{id}")
    public Girl queryGirl(@PathVariable("id") Integer id){

        return girlRepository.findOne(id);
    }

    @DeleteMapping(value = "/deleteGirl/{id}")
    public void deleteGirl(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }


    //这里注意使用post man 发请求时，编码格式要选x-www-form-urlencoded,不能选form-data
    @PutMapping(value = "/updateGirl/{id}")
    public Girl updateGirl(
                            @PathVariable("id") Integer id,
                            @RequestParam("name") String name,
                            @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setName(name);
        girl.setId(id);

       return girlRepository.save(girl);
    }

    @GetMapping(value = "/findByAge/{age}")
    public List<Girl> findGirlByAge(@PathVariable("age") Integer age){

        return girlRepository.findByAge(age);
    }

    @PutMapping(value = "/insert2")
    public void insert2(){

        girlService.insert2();
    }

}
