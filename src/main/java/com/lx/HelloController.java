package com.lx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aslan on 2017/8/8.
 */
@RestController
public class HelloController {

    //使用注解的方式获取配置文件里面的值，yml与properties均可
    @Value("${value}")
    private String value;
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello", "/hi"},method = RequestMethod.GET)
    public String say(){
       // return value;
        return girlProperties.getName();
    }
    @RequestMapping(value ="/val/{id}" , method = RequestMethod.GET)
    public String say1(@PathVariable ("id") Integer myid){
        // return value;
        return "id="+myid;
    }
    //@GetMapping(value = "/val2")和下面的相等
    @RequestMapping(value ="/val2" , method = RequestMethod.GET)
    public String say2(@RequestParam(value ="id",defaultValue = "0",required = false) Integer myid){
        // return value;
        return "id="+myid;
    }
}
