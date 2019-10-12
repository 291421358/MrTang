package com.tzh.spring.security.server.test;

import com.tzh.spring.security.server.SecurityServerApplication;
import com.tzh.spring.security.server.domain.TbPermission;
import com.tzh.spring.security.server.mapper.TbPermissionMapper;
import com.tzh.spring.security.server.service.TbPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 权限查询测试
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-04-04 23:47:25
 * @see com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SecurityServerApplication.class)
public class TbPermissionServiceTests {

    @Autowired
    private TbPermissionService tbPermissionService;

    @Autowired
    private TbPermissionMapper tbPermissionMapper;

//    @Test
    public void testSelectByUserId() {
        tbPermissionService.selectByUserId(37L).forEach(tbPermission -> System.out.println(tbPermission));
    }

    @Test
    public void testSelectByUser() {
        System.err.println("begin");
//        tbPermissionMapper.selectAll().forEach(tbPermission -> System.out.println(tbPermission + "111"));
        List<TbPermission> tbPermissions = tbPermissionMapper.selectByUserId(37L);
        System.err.println(tbPermissions.size());
        tbPermissions.forEach(tbPermission -> System.out.println(tbPermission));
    }
}
