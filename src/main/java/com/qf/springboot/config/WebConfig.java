package com.qf.springboot.config;

import com.qf.springboot.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Object
 * @Date 2019/7/30
 */
@Configuration
public class WebConfig {
    @Autowired
    private MyFilter myFilter;
    @Bean
    public FilterRegistrationBean initFilterRegisterBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("MyFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

}
