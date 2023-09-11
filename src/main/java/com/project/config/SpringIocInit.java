package com.project.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Description
 * @Author：阿牛
 * @Date：Created in 2023/9/11 19:33
 */
public class SpringIocInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    //ioc容器的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DataSourceConfig.class, MapperConfig.class, ServiceConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
