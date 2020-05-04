package com.didala.jiang.ribbon.eurekaribbon.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chuanzhang
 * @description TODO
 * @date 2020/5/3
 */
@RestController
public class RibbonController {


    @Resource
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client-peer2");
        return serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }
}
