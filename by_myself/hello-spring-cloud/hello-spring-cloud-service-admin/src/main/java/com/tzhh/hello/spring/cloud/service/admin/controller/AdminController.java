package com.tzhh.hello.spring.cloud.service.admin.controller;

import com.tzhh.hello.spring.cloud.service.admin.dao.MsuserMapper;
import com.tzhh.hello.spring.cloud.service.admin.entity.Msuser;
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
 * TODO
 * @date 2019/9/2917:56
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private MsuserMapper msuserMapper;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s<p></p> i am from port : %s", message, port);
    }

    @RequestMapping(value = "login")
    public String serverLogin(String name,String pwd){
        Msuser msuser = new Msuser(name , pwd);
        List<Msuser> select = msuserMapper.select(msuser);
        if (select.size() >= 1){
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "userList")
    public List<Msuser> userSelect(){
        return msuserMapper.selectAll();
    }
}
