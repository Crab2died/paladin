package com.github.eureka.consumer.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemInfo {

    @Autowired
    EurekaClient client;

    @GetMapping("/consumer")
    public String sysInfo() {
        return client.sysInfo();
    }
}
