package com.didala.jiang.eureka.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chuanzhang
 * @description TODO
 * @date 2020/5/2
 */

@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String applicationName;


    @RequestMapping("/hello")
    public String hello() {
        return  "Hello :  " + applicationName;
    }
}
