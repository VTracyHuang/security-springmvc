package com.tracy.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 功能描述：
 *
 * @Author Tracy
 * @Date 2020/5/7 14:49
 */

@Configuration //相当于applicationContext.xmls
@ComponentScan(basePackages = "com.tracy.security"
                ,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
public class ApplicationConfig {

    //在此配置除了Controller的其他Bean,比如：数据库连接池，事务管理器，业务Bean等
}
