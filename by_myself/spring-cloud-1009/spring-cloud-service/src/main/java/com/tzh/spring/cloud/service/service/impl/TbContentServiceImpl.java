package com.tzh.spring.cloud.service.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tzh.spring.cloud.service.mapper.TbContentMapper;
import com.tzh.spring.cloud.service.domain.TbContent;
import com.tzh.spring.cloud.service.service.TbContentService;
/**  
    * @title: TZH
    * @projectName spring-cloud-1009
    * @description: TODO
       包括：
       TODO
    * @author Administrator
    * @date 2019/10/1223:55
    */
@Service
public class TbContentServiceImpl extends ServiceImpl<TbContentMapper, TbContent> implements TbContentService{

}
