package com.houzw.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 *
 * @author houzw
 */
@SpringBootApplication(scanBasePackages = {"com.houzw.demo","com.houzw.demo.web"})
@MapperScan("com.houzw.demo.database")
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
