package com.tzhh.hello.spring.security.config.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * 〈OAuth2认证服务器〉
 *
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Bean
    @Primary//主配置
    @ConfigurationProperties(prefix = "spring.datasource")//指定配置数据源
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    public TokenStore tokenStore(){
        return new JdbcTokenStore(dataSource());

    }

    public ClientDetailsService jdbcClientDeatails(){
        return  new JdbcClientDetailsService(dataSource());
    }


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//添加Basic Auth认证的信息
    //定义客户端详细信息服务的配置程序。可以初始化客户端详细信息，或者您可以仅引用现有store。
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(jdbcClientDeatails());
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore());
    }
}
