package com.github.eureka.consumer.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-provider")
public interface EurekaClient {

    @GetMapping("/sys/info")
    String sysInfo();
}
