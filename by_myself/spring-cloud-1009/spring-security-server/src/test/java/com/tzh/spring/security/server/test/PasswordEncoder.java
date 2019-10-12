package com.tzh.spring.security.server.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Administrator
 * @title: TZH
 * @projectName spring-cloud-1009
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/1014:48
 */
public class PasswordEncoder {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
