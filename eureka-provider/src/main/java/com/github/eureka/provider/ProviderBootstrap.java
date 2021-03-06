package com.github.eureka.provider;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringCloudApplication
public class ProviderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderBootstrap.class).web(true).run(args);
    }
}
