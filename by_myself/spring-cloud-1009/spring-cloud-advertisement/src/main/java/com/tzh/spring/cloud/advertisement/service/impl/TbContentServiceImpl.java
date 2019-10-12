package com.tzh.spring.cloud.advertisement.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tzh.spring.cloud.advertisement.domain.TbContent;
import com.tzh.spring.cloud.advertisement.mapper.TbContentMapper;
import com.tzh.spring.cloud.advertisement.service.TbContentService;
/**  
    * @title: TZH
    * @projectName spring-cloud-1009
    * @description: TODO
       包括：
       TODO
    * @author Administrator
    * @date 2019/10/1020:47
    */
@Service
public class TbContentServiceImpl extends ServiceImpl<TbContentMapper, TbContent> implements TbContentService{

       @Resource
       private TbContentMapper tbContentMapper;

       @Override
       public List<TbContent> selectAll() {
              return tbContentMapper.selectList(null);
       }
}
