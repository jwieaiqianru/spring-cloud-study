package com.didala.jiang.eureka.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientPeer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientPeer2Application.class, args);
    }

}
