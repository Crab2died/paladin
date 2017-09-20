package com.github.eureka.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemInfo {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/sys/info")
    public String sysInfo(){
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return "Windows is OK !";
    }
}
