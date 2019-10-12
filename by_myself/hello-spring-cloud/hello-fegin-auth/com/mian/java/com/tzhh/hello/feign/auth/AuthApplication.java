package com.tzhh.hello.feign.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/722:46
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.curise.eshop.auth.dao")
public class AuthApplication {
}
