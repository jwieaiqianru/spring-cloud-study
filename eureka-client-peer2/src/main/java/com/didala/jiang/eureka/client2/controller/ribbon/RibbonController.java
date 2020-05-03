package com.didala.jiang.eureka.client2.controller.ribbon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chuanzhang
 * @description 测试 ribbon 服务
 * @date 2020/5/3
 */
@RestController
public class RibbonController {

    @Value("${spring.application.name}")
    private String applicationName;


    @GetMapping("/hi")
    public String  hi() {
        return  "Hi：" + applicationName;
    }

}
