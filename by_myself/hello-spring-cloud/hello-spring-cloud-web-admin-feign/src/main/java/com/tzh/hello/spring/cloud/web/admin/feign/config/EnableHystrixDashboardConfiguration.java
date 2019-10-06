package com.tzh.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @title: TZH
 * @projectName hello-spring-cloud
 * @description: TODO
 * 包括：
 * 配置熔断器仪表盘的severlet
 * @date 2019/9/3011:50
 */
@Configuration
public class EnableHystrixDashboardConfiguration {
    @Bean
    public ServletRegistrationBean getServlet() {
        //new一个severlet
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        //注册一个severlet
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        //启动顺序
        registrationBean.setLoadOnStartup(1);
        //mapping--路径
        registrationBean.addUrlMappings("/hystrix.stream");
        //serverlet-name
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
