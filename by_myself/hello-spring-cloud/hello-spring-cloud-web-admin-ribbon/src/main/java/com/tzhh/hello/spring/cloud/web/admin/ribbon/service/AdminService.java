package com.tzhh.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/9/2918:05
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class) + "<p></p>through :" + port;
    }

    public String hiError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
