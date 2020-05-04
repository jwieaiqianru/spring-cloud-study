package com.didala.jiange.eureka.client1.service;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chuanzhang
 * @description TODO
 * @date 2020/5/3
 */
@Service
public class RibbonService {

    @Resource
    private LoadBalancerClient loadBalancerClient;



}
