package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Description
 *  业务层配置类：service，aop，tx
 *  1.加载service进ioc容器
 *  2.开启aop注解的支持
 *  3.tx声明式事务管理
 *  4.增强类也是在这里开启包扫描
 * @Author：阿牛
 * @Date：Created in 2023/9/11 16:41
 */
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan({"com.project.service","com.project.mapper"})
public class ServiceConfig {

    @Bean
    //事务管理器实现
    public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
