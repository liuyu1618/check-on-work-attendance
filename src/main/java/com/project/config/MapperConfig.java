package com.project.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Description
 * 持久层配置类：sqlSessionFactory，Mapper代理对象
 * @Author：阿牛
 * @Date：Created in 2023/9/11 16:53
 */
@Configuration
public class MapperConfig {

    @Bean
    //sqlSessionFactory加入ioc容器
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //指定数据库连接池对象
        sqlSessionFactoryBean.setDataSource(dataSource);
        Resource resource = new ClassPathResource("mybatis-config.xml");
        sqlSessionFactoryBean.setConfigLocation(resource);
//        org.apache.ibatis.session.Configuration configuration
//                = new org.apache.ibatis.session.Configuration();
//        //开启驼峰映射
//        configuration.setMapUnderscoreToCamelCase(true);
//        //日志输出
//        configuration.setLogImpl(Slf4jImpl.class);
//        //开启resultMap自动映射
//        configuration.setAutoMappingBehavior(AutoMappingBehavior.FULL);
//        sqlSessionFactoryBean.setConfiguration(configuration);
//
//        //给实体类起别名
//        sqlSessionFactoryBean.setTypeAliasesPackage("com.project.pojo");
//
//        //插件设置
//        PageInterceptor pageInterceptor = new PageInterceptor();
//        Properties properties = new Properties();
//        properties.setProperty("helperDialect","mysql");
//        pageInterceptor.setProperties(properties);
//        sqlSessionFactoryBean.setPlugins(pageInterceptor);
        return sqlSessionFactoryBean;
    }

    @Bean
    //mapper代理对象加入到ioc容器
    public MapperScannerConfigurer mapperScan(){
        MapperScannerConfigurer mapperScannerConfigurer =
                new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.project.mapper");//mapper接口和mapperxml所在的共同的包
        return mapperScannerConfigurer;
    }
}
