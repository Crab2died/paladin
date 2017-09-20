package com.github.eureka.consumer.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SystemInfo {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String sysInfo() {
        return restTemplate.getForObject("http://eureka-provider/sys/info", String.class);
    }
}
