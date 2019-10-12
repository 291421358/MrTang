package com.tzh.spring.security.server.service;

import com.tzh.spring.security.server.domain.TbPermission;
import com.baomidou.mybatisplus.extension.service.IService;

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
public interface TbPermissionService extends IService<TbPermission>{

    List<TbPermission> selectByUserId(Long UserId);
}
