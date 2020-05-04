package com.didala.jiang.feign.eurekafeign.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chuanzhang
 * @description TODO
 * @date 2020/5/3
 */
@FeignClient(value = "eureka-client-peer1")
public interface HelloApi {



    @GetMapping("/hello")
    String hello();


}
