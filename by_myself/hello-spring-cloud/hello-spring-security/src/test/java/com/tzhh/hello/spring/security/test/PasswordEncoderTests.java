package com.tzhh.hello.spring.security.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/818:28
 */
public class PasswordEncoderTests {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
