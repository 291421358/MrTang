package com.curise.eshop.member.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 〈〉
 *
 * @author Curise
 * @create 2018/12/12
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api")
@Api(value = "用户的增删改查")
public class MemberController {

    @GetMapping("hello")
    @PreAuthorize("hasAnyAuthority('hello')")
    @ApiImplicitParam(paramType = "query",name= "username" ,value = "hello",dataType = "string")
    @ApiOperation(value = "hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("current")
    @ApiOperation(value = "未知")
    @ApiModelProperty(value="user",notes = "修改后用户信息的json串")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping("query")
    @ApiOperation(value = "获取用户列表，目前没有分页")
    @PreAuthorize("hasAnyAuthority('query')")
    @ApiImplicitParam(paramType = "query",name= "username" ,value = "query",dataType = "string")
    public String query() {
        return "具有query权限";
    }
}
