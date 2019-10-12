package com.tzh.spring.security.server.controller;

import com.mysql.cj.protocol.x.Notice;
import com.tzh.spring.security.server.ResultVO;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

/**
 * @author Administrator
 * @title: TZH
 * @projectName spring-cloud-1009
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/1218:05
 */
@RestController
@RequestMapping
public class SendCodeController {

    @GetMapping("/sendCode")
    public ResultVO    sendCode(String code) throws URISyntaxException {
//        MultiValueMap<String, String> MultiValueMap = new LinkedMultiValueMap<>();
//        MultiValueMap.add("grant_type","authorization_code");
        String url = "http://client:123456@localhost:8080/oauth/token?grant_type=authorization_code&code"+code;
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        // 以表单的方式提交
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //将请求头部和参数合成一个请求
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(null,headers);
        //执行HTTP请求，将返回的结构使用ResultVO类格式化
        System.out.println("发送请求");
        ResponseEntity<ResultVO> response = client.exchange(url, method, requestEntity, ResultVO.class);

        return response.getBody();
    }



}
