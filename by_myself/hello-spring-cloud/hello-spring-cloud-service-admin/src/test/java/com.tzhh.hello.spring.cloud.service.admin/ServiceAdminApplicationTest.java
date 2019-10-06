package com.tzhh.hello.spring.cloud.service.admin;

import com.tzhh.hello.spring.cloud.service.admin.dao.MsuserMapper;
import com.tzhh.hello.spring.cloud.service.admin.entity.Msuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
@Transactional
@Rollback
public class ServiceAdminApplicationTest {

    @Test
    public void contextLoads() {
    }

    /***
     * @description: select
     * @param      -
     * @return     - 
     * @author     -TZH
     * @date       -2019/9/27 21:09 
     */
    @Autowired
    private MsuserMapper userMapper;

    @Test
    public void testSelect(){
//        List<Msuser> msusers = userMapper.selectAll();
//        for (Msuser user : msusers){
//            System.out.println(user.getName());
//        }
    }

    @Test
    public void testPage(){
//        System.err.println("123123123123123123123123123123123123123123123");
        //全表查询&分页查询
        /*PageHelper.startPage(1,10);
        Example example = new Example(Msuser.class);
        PageInfo<Msuser> pageInfo = new PageInfo<>(userMapper.selectByExample(example));
        List<Msuser> list = pageInfo.getList();
        int i = 1;
        for (Msuser msuser : list) {
            while (msuser.getName().length() > 11) {
                String s = msuser.getName() + " ";
            }

            System.out.println(msuser.getName()+"\t第"+ (i++) +
                    "个数据");
        }*/

        //
        //查询实体内有数据且与数据库相等数据，该实体没有数据则跳过比较
        Msuser msuser = new Msuser();
        msuser.setName("123");
        msuser.setPwd("1");
        List<Msuser> select = userMapper.select(msuser);
        for (Msuser msuser1 : select) {
            System.err.println(msuser1.getName()+"\t"+msuser.getPwd());
        }


    }
}
