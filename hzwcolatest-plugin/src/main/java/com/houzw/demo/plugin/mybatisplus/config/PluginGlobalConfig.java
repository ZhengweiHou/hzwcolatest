package com.houzw.demo.plugin.mybatisplus.config;

import com.baomidou.mybatisplus.annotation.IdType;
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

    /**
     * 是否覆盖已有文件
     */
    @Parameter(defaultValue = "false")
    private boolean fileOverride;

    /**
     * 是否打开输出目录
     */
    @Parameter(defaultValue = "false")
    private boolean open;

    /**
     * 生成文件的输出目录
     */
    @Parameter
    private String outputDir = "src/main/java";

    /**
     * 是否在xml中添加二级缓存配置
     */
    @Parameter(defaultValue = "false")
    private boolean enableCache;

    /**
     * 开启 swagger模式
     */
    @Parameter(defaultValue = "false")
    private boolean swagger;

    @Parameter
    private String author = "sirius's plugin by mybatis_plus generator";

    /**
     * 时间类型对应策略
     */
    @Parameter
    private DateType dateType = DateType.ONLY_DATE;

    /**
     * 开启 BaseResultMap
     */
    @Parameter
    private boolean baseResultMap = false;




    /**
     * 开启 baseColumnList
     */
    private boolean baseColumnList = false;

    /**
     * 各层文件名称方式，例如： %sAction 生成 UserAction
     * %s 为占位符
     */
    @Parameter
    private String entityName;
    @Parameter
    private String mapperName;
    @Parameter
    private String xmlName;
    @Parameter
    private String serviceName;
    @Parameter
    private String serviceImplName;
    @Parameter
    private String controllerName;

    /**
     * 指定生成的主键的ID类型
     */
    @Parameter
    private IdType idType;

}
