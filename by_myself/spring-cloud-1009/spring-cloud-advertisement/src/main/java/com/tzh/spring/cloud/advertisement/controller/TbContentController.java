package com.tzh.spring.cloud.advertisement.controller;

import com.tzh.spring.cloud.advertisement.domain.TbContent;
import com.tzh.spring.cloud.advertisement.dto.ResponseResult;
import com.tzh.spring.cloud.advertisement.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @title: TZH
 * @projectName spring-cloud-1009
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/1021:03
 */
@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @GetMapping(value = "/")
    public ResponseResult<List<TbContent>> selectAll() {
        return new ResponseResult<>(HttpStatus.OK.value(),
                HttpStatus.OK.toString(), tbContentService.selectAll());
    }
}
