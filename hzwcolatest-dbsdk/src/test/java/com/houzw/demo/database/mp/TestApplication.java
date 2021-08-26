package com.houzw.demo.database.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//开启通用注解扫描
@MapperScan(basePackages = {"com.houzw.demo.database.mybatisplus.mapper"})
@ComponentScan("com.houzw.demo.database.mybatisplus")
//@EnableAutoConfiguration
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
