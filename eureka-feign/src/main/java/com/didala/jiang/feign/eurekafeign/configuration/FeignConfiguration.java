package com.didala.jiang.feign.eurekafeign.configuration;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author chuanzhang
 * @description TODO
 * @date 2020/5/3
 */
@Configuration
public class FeignConfiguration {


    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
