package com.houzw.demo.plugin.mybatisplus.config;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.ITypeConvert;
import com.baomidou.mybatisplus.generator.config.converts.DB2TypeConvert;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.AbstractDbQuery;
import com.baomidou.mybatisplus.generator.config.querys.DB2Query;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.keywords.BaseKeyWordsHandler;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import lombok.Getter;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author sirius
 * @since 2021-08-26
 */
@Getter
public class PluginGlobalConfig {

    @Parameter(defaultValue = "false")
    private boolean fileOverride;

    @Parameter(defaultValue = "false")
    private boolean open;

    @Parameter
    private String outputDir = "src/main/java";

    @Parameter(defaultValue = "false")
    private boolean enableCache;

    @Parameter(defaultValue = "false")
    private boolean swagger;

    @Parameter
    private String author = "sirius's plugin by mybatis_plus generator";

    @Parameter
    private DateType dateType = DateType.ONLY_DATE;

}
