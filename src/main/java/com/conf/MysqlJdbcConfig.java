package com.conf;

import com.alibaba.druid.pool.DruidDataSource;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
@Data
@ConfigurationProperties(prefix = "mysqlsource")
//@ConfigurationProperties(prefix = "hivesource")
public class MysqlJdbcConfig {
    private String url;
    private String password;
    private String username;
    private String driverClassName;


    @Bean
    public DataSource dataSource(){
        System.out.println(url+"  "+password+"  "+username+"  "+driverClassName);
        DruidDataSource datasource = new DruidDataSource();
        //配置数据源属性
        datasource.setUrl(url);
        datasource.setDriverClassName(driverClassName);
        datasource.setUsername(username);
        datasource.setPassword(password);

        datasource.setInitialSize(5);
        datasource.setMinIdle(5);
        datasource.setMaxActive(20);
        datasource.setMaxWait(60000);
        datasource.setTimeBetweenEvictionRunsMillis(60000);
        datasource.setMinEvictableIdleTimeMillis(300000);
        datasource.setTestWhileIdle(true);
        datasource.setTestOnBorrow(false);
        datasource.setTestOnReturn(false);
        datasource.setPoolPreparedStatements(true);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(20);

         return datasource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
