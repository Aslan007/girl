package com.lx;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Aslan on 2017/8/8.
 */
//获取配置文件里面的信息，对应关系
    //component注解必须要，否则会自动注入失败
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
