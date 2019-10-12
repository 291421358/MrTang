package com.tzh.spring.security.server.service;

import com.tzh.spring.security.server.domain.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tzh.spring.security.server.mapper.TbUserMapper;

import javax.annotation.Resource;

/**
    * @title: TZH
    * @projectName spring-cloud-1009
    * @description: TODO
       包括：
       TODO
    * @author Administrator
    * @date 2019/10/1018:36
    */
public interface TbUserService extends IService<TbUser>{


    TbUser getByUsername(String username);
}
