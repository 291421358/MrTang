package com.tzh.spring.cloud.advertisement.service;

import com.tzh.spring.cloud.advertisement.domain.TbContent;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
    * @title: TZH
    * @projectName spring-cloud-1009
    * @description: TODO
       包括：
       TODO
    * @author Administrator
    * @date 2019/10/1020:47
    */
public interface TbContentService extends IService<TbContent>{

    List<TbContent> selectAll();
}
