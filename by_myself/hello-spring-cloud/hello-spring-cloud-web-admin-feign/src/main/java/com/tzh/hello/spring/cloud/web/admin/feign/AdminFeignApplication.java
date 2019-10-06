package com.tzh.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/9/2918:46
 */
@EnableHystrixDashboard
@SpringBootApplication
@EnableFeignClients
public class AdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminFeignApplication.class);
    }
}
