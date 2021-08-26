package com.houzw.demo.plugin.mybatisplus.config;

import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.Getter;
import org.apache.maven.plugins.annotations.Parameter;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author sirius
 * @since 2021-08-26
 */
@Getter
public class PluginStrategyConfig {


    @Parameter
    private NamingStrategy naming;

    @Parameter
    private String[] include = null;


    @Parameter
    private String[] exclude = null;

    @Parameter
    private String superEntityClass;


}
