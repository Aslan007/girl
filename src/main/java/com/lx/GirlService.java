package com.lx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Aslan on 2017/8/8.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insert2(){

        Girl girlA = new Girl();
        girlA.setAge(19);
        girlA.setName("lucky");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlA.setAge(23);
        girlA.setName("lin");
        girlRepository.save(girlB);
    }
}
