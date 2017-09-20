package com.github.config.client.git;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConfigClientGitBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientGitBootstrap.class).web(true).run(args);
    }
}
