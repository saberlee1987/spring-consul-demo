package com.saber.spring_consul_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringConsulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConsulDemoApplication.class, args);
    }

}
