package com.didala.jiang.eureka.client2.controller.ribbon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chuanzhang
 * @description 测试 ribbon 服务
 * @date 2020/5/3
 */
@RestController
public class RibbonController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Resource
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client-peer1");
        return serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }


    /**
     * hello 接口
     *
     * @return
     */
    @GetMapping("/hi")
    public String hi() {
        return "Hi：" + applicationName;
    }

}
