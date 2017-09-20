package com.github.config.server.git;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerGitBootstrap.class).web(true).run(args);
    }
}
