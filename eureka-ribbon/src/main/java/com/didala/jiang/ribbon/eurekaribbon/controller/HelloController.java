package com.didala.jiang.ribbon.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chuanzhang
 * @description TODO
 * @date 2020/5/3
 */
@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String hello() {
        return "Hello " +  applicationName;
    }
}
