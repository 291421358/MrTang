package com.tzh.spring.cloud.feign.service.hystrix;

import com.tzh.spring.cloud.feign.service.AdminService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/9/3011:36
 */
@Component
public class AdminServiceHytrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Your message is %s but request is bad",message);
    }

    @Override
    public String login(String name, String pwd) {
        return String.format("Your name is %s, pwd is %s but request is bad",name,pwd);
    }

    @Override
    public List userList() {
        return null;
    }
}
