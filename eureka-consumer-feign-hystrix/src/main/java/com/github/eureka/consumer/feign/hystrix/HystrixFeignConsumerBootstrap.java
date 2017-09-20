package com.github.eureka.consumer.feign.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixFeignConsumerBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixFeignConsumerBootstrap.class).web(true).run(args);
    }
}
