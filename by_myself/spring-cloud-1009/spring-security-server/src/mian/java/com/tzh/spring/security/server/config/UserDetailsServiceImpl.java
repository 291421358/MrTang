package com.tzh.spring.security.server.config;

import com.tzh.spring.security.server.domain.TbPermission;
import com.tzh.spring.security.server.domain.TbUser;
import com.tzh.spring.security.server.service.TbPermissionService;
import com.tzh.spring.security.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @title: TZH
 * @projectName spring-cloud-1009
 * @description: TODO
 * 包括：
 * TODO
 * @date 2019/10/1019:20
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUsername(s);
        List<GrantedAuthority> grantedAuthorityList = Lists.newArrayList();
        if (tbUser != null) {
            //TODO 自定义错误后，==null可改成该用户不存在
            //获取用户授权
            List<TbPermission> tbPermissionList = tbPermissionService.selectByUserId(tbUser.getId());
            // 声明用户授权
            tbPermissionList.forEach(tbPermission ->
            {
                SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorityList.add(simpleGrantedAuthority);
            });
        }

        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorityList);
    }
}
