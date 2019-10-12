package com.tzh.spring.cloud.advertisement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @title: TZH
 * @projectName spring-cloud-1009
 * @description:
 * 包括：
 *
 * @date 2019/10/1020:21
 */
@SpringBootApplication
@MapperScan(basePackages = "com.tzh.spring.cloud.advertisement.mapper")
public class AdvertisementApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdvertisementApplication.class ,args);
    }
}
