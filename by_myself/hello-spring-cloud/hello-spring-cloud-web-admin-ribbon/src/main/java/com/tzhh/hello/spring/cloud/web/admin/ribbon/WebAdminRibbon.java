package com.tzhh.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/9/2914:06
 */
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
public class WebAdminRibbon {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbon.class);
    }
}
