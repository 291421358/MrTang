package com.tzhh.hello.feign.auth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: 用户信息DAO
 * @date 2019/10/723:09
 */
@Data
@TableName("es_member")
public class MemberEntity {
    /**
     * 主键
     * @TableId中可以决定主键的类型,不写会采取默认值,默认值可以在yml中配置
     * AUTO: 数据库ID自增
     * INPUT: 用户输入ID
     * ID_WORKER: 全局唯一ID，Long类型的主键
     * ID_WORKER_STR: 字符串全局唯一ID
     * UUID: 全局唯一ID，UUID类型的主键
     * NONE: 该类型为未设置主键类型
     */
    @TableId(type = IdType.AUTO)
    private Long id;
     /*
     名字
      */
     private String membername;
     /*
    密码
      */
     private String password;
     /*
     邮箱
      */
     private String email;
     /*
     性别
      */
     private String sex;
     /*
     电话
      */
     private String phone;
     /*
     生日
      */
     private String birthday;
     /*
     创建时间
      */
     private String createTime;
    
}
