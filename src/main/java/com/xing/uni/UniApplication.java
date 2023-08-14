package com.xing.uni;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@MapperScan("com.xing.uni.mapper")
@SpringBootApplication
public class UniApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniApplication.class, args);
    }
}