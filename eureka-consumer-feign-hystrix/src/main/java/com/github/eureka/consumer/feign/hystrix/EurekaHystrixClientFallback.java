package com.github.eureka.consumer.feign.hystrix;

import org.springframework.stereotype.Component;

@Component
public class EurekaHystrixClientFallback implements EurekaHystrixClient{

    @Override
    public String consumer() {
        return "fallback";
    }
}
