package com.tzh.spring.security.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tzh.spring.security.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;

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
public interface TbPermissionMapper extends BaseMapper<TbPermission> {
       List<TbPermission> selectByUserId(@Param("userId") Long UserId);
}