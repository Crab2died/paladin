package com.github.eureka.consumer.feign.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemInfo {

    @Autowired
    private EurekaHystrixClient eurekaHystrixClient;

    @GetMapping("/consumer")
    public String sysInfo() {
        return eurekaHystrixClient.consumer();
    }
}
