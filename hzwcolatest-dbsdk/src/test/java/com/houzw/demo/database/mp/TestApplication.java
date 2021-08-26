package com.houzw.demo.database.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//开启通用注解扫描
@MapperScan(basePackages = {"com.houzw.demo.database.mybatisplus.mapper"})
@ComponentScan({"com.houzw.demo.database.mybatisplus","com.houzw.demo.database.mp"})
// configration 注解的配置类需要被扫描到才能生效
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
