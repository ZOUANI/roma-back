package com.zs.commandev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Commandev2Application {

    public static void main(String[] args) {
        SpringApplication.run(Commandev2Application.class, args);
    }

}
