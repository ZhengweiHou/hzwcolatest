package com.houzw.demo.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class MybatisPlsConfigration {

    // 乐观锁插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        ArrayList<InnerInterceptor> innerInterceptors = new ArrayList<>();
        innerInterceptors.add(new OptimisticLockerInnerInterceptor());
        mybatisPlusInterceptor.setInterceptors(innerInterceptors);
        return mybatisPlusInterceptor;
    }
}
