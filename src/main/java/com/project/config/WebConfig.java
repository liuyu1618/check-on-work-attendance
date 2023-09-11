package com.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Description
 * 配置类
 * 1.controller
 * 2.全局异常处理器
 * 3.静态资源处理
 * 4.json转化器
 * @Author：阿牛
 * @Date：Created in 2023/9/11 10:54
 */
@Configuration
@EnableWebMvc
@ComponentScan({"com.project.controller"})
public class WebConfig implements WebMvcConfigurer {


    /**
     * 视图解析器，指定前后缀，可以快速添加前后缀，后期返回字符串即可。
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/*",".html");
    }

    /**
     * 开启静态资源查找
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * 拦截器配置
     * @param registry
     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor()   //拦截器的类
//                .addPathPatterns()  //拦截器包含的路径
//                .excludePathPatterns(); //排除的路径
//    }
}
