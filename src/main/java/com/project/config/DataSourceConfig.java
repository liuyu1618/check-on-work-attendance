package com.project.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/11 19:16
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {
    /**
     * 创建数据库连接池
     * @return
     */
    @Bean
    public DataSource dataSource(@Value("${jdbc.driver}") String driver,@Value("${jdbc.url}")String url,
                                 @Value("${jdbc.username}")String username,@Value("${jdbc.password}")String password){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
