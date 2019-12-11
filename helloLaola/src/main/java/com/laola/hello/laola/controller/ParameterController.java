package com.laola.hello.laola.controller;


import com.laola.hello.laola.entity.User;
import com.laola.hello.laola.server.LaolaProjectParameters;
import com.laola.hello.laola.vo.ProjectListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "parameter")
public class ParameterController {

    @Autowired
    private LaolaProjectParameters laolaProjectParameters;

    @RequestMapping(value = "projectList" , method = RequestMethod.GET)
    public List<ProjectListVO> projectList(){
        List<ProjectListVO> projectListVOS = laolaProjectParameters.projectList();
        return projectListVOS;
    }

    @RequestMapping(value = "onePoject" , method = RequestMethod.GET)
    public User onePoject(Integer id){
        User user = laolaProjectParameters.onePoject(id);
        return user;
    }

    @RequestMapping(value = "update" , method = RequestMethod.GET)
    public String update(User user){
        laolaProjectParameters.update(user);
        return "200";
    }
}
