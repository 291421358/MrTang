package com.tzh.spring.security.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tzh.spring.security.server.domain.TbUser;
import com.tzh.spring.security.server.mapper.TbUserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tzh.spring.security.server.service.TbUserService;

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
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService{
       @Resource
       private TbUserMapper tbUserMapper;

       @Override
       public  TbUser getByUsername(String username){
              QueryWrapper<TbUser> queryWrapper = new QueryWrapper();
              QueryWrapper<TbUser> username2 = queryWrapper.eq("username", username);
              return tbUserMapper.selectOne(username2);
       }

}
