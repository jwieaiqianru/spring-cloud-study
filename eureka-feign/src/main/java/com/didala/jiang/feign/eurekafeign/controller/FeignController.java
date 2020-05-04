package com.didala.jiang.feign.eurekafeign.controller;

import com.didala.jiang.feign.eurekafeign.remote.HelloApi;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chuanzhang
 * @description TODO
 * @date 2020/5/3
 */
@RestController
@Slf4j
public class FeignController {


    @Value("${spring.application.name}")
    private String applicationName;

    @Resource
    private HelloApi helloApi;
    @GetMapping("/hello")
    public String hello() {
        log.info(applicationName);
        String hello = helloApi.hello();
        return hello;
    }

}
