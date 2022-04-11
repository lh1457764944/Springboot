package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com
 * @File ：SpringbootApplication.java
 * @date 2021/12/8 10:23
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableScheduling
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
