package com.github.eureka.consumer.feign.hystrix;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-provider", fallback = EurekaHystrixClientFallback.class)
public interface EurekaHystrixClient {

    @GetMapping("/sys/info")
    String consumer();
}
