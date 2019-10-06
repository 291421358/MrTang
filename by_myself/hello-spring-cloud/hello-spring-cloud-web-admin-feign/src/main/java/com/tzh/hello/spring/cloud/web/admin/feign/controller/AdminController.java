package com.tzh.hello.spring.cloud.web.admin.feign.controller;

import com.tzh.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * @date 2019/9/2918:53
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message) + "</p>though port:" + port;
    }

    @RequestMapping(value = "login" , method = RequestMethod.GET)
    public String login(String name,String pwd){
        return adminService.login(name, pwd) + "</p>though port:" + port;
    }
    @RequestMapping(value = "userList" ,method = RequestMethod.GET)
    public List userList(){
        return adminService.userList();
    }
}
