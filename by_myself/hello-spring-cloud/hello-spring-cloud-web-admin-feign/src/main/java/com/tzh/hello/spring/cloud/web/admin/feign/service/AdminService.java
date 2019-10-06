package com.tzh.hello.spring.cloud.web.admin.feign.service;

import com.tzh.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHytrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(value = "hello-spring-cloud-service-admin" ,fallback = AdminServiceHytrix.class)
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);

    @RequestMapping(value = "login", method =RequestMethod.GET)
    String login (@RequestParam(value = "name") String name,@RequestParam(value = "pwd") String pwd);

    @RequestMapping(value = "userList" , method = RequestMethod.GET)
    List userList();
}