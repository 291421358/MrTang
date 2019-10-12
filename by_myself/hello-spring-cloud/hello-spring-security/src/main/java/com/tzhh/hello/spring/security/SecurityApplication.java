package com.tzhh.hello.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/723:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class);
    }
}
