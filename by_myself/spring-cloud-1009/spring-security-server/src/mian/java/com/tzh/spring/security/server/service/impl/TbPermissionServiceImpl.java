package com.tzh.spring.security.server.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tzh.spring.security.server.mapper.TbPermissionMapper;
import com.tzh.spring.security.server.domain.TbPermission;
import com.tzh.spring.security.server.service.TbPermissionService;

import javax.annotation.Resource;
import java.util.List;

/**
    * @title: TZH
    * @projectName spring-cloud-1009
    * @description: TODO
       包括：
       TODO
    * @author Administrator
    * @date 2019/10/1019:02
    */
@Service
public class TbPermissionServiceImpl extends ServiceImpl<TbPermissionMapper, TbPermission> implements TbPermissionService{

       @Resource
       TbPermissionMapper tbPermissionMapper;

       @Override
       public List<TbPermission> selectByUserId(Long userId) {

              return tbPermissionMapper.selectByUserId(userId);
       }
}
