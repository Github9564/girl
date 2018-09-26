package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 侯宇飞
 * 日期: 2018-07-17
 * 时间: 10:37
 */
@RestController
public class HelloController {
    //通过Value注解将配置的文件属性加载到cupSize中

    @Value("${cupSize}")
    private  String  cupSize;

    @Value("${age}")
    private Integer age;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!" +cupSize +age ;
    }

}
