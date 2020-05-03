package com.didala.jiange.eureka.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientPeer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientPeer1Application.class, args);
    }

}
