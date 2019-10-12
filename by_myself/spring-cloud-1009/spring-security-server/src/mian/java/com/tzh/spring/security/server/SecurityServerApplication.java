package com.tzh.spring.security.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @title: TZH
 * @projectName spring-cloud-1009
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/1012:58
 */
@SpringBootApplication
@MapperScan("com.tzh.spring.security.server.mapper")
public class SecurityServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityServerApplication.class ,args);
    }
}
