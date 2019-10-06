package com.tzhh.hello.spring.cloud.service.admin.tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-boot-mybatis
 * @description: 自己的mapper，不能够被扫描，否则会出错
 * 包括：
 * TODO
 * @date 2019/9/2719:14
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
