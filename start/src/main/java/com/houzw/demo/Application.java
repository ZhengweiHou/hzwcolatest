package com.houzw.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot Starter
 *
 * @author houzw
 */
@SpringBootApplication
//@MapperScan("com.houzw.demo.database")
@MapperScan(basePackages = {"com.houzw.demo.database.mybatisplus.mapper"})
@ComponentScan({"com.houzw.demo.database.mybatisplus","com.houzw.demo"})

@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("Begin to start Spring Boot Application");
        long startTime = System.currentTimeMillis();

        SpringApplication.run(Application.class, args);

        long endTime = System.currentTimeMillis();
        log.info("End starting Spring Boot Application, Time used: "+ (endTime - startTime) );
    }
}
