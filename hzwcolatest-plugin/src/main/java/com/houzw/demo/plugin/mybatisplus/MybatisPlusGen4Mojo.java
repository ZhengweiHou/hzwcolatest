package com.houzw.demo.plugin.mybatisplus;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.houzw.demo.plugin.mybatisplus.config.PluginDataSourceConfig;
import com.houzw.demo.plugin.mybatisplus.config.PluginGlobalConfig;
import com.houzw.demo.plugin.mybatisplus.config.PluginPackageConfig;
import com.houzw.demo.plugin.mybatisplus.config.PluginStrategyConfig;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.Optional;

@Mojo(name="mybatisplusgen4",defaultPhase= LifecyclePhase.NONE)
public class MybatisPlusGen4Mojo extends AbstractMojo {

    public static void main(String[] args) throws MojoFailureException, MojoExecutionException {
        new MybatisPlusGen4Mojo().execute();
    }

    @Parameter(required = true)
    private PluginDataSourceConfig dataSource;

    @Parameter(required = false)
    private PluginGlobalConfig global;

    @Parameter(required = true)
    private PluginStrategyConfig strategy;

    @Parameter(required = false)
    private PluginPackageConfig packageInfo;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {


//        GlobalConfig globalConfig = new GlobalConfig();
//        globalConfig.setFileOverride(true);
//        globalConfig.setOpen(false);
//        globalConfig.setOutputDir("src/main/java");
////        globalConfig.setSwagger2(true);
//        globalConfig.setAuthor("hzw");
//        globalConfig.setDateType(DateType.TIME_PACK);
        GlobalConfig globalConfig = new GlobalConfig();
        if(!Optional.ofNullable(global).isPresent()){
            global = new PluginGlobalConfig();
        }
        globalConfig.setFileOverride(global.isFileOverride());
        globalConfig.setOpen(global.isOpen());
        globalConfig.setOutputDir(global.getOutputDir());
        globalConfig.setSwagger2(global.isSwagger());
        globalConfig.setAuthor(global.getAuthor());
        globalConfig.setDateType(global.getDateType());
        globalConfig.setEnableCache(global.isEnableCache());


//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setUrl("jdbc:mysql://192.168.32.201:3306/hzwcolatest");
//        dataSourceConfig.setUsername("root");
//        dataSourceConfig.setPassword("root");
//        dataSourceConfig.setTypeConvert(new MySqlTypeConvert());
//        dataSourceConfig.setDbQuery(new MySqlQuery());
//        dataSourceConfig.setKeyWordsHandler(new MySqlKeyWordsHandler());
//        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl(dataSource.getUrl());
        dataSourceConfig.setUsername(dataSource.getUsername());
        dataSourceConfig.setPassword(dataSource.getPassword());
        dataSourceConfig.setTypeConvert(dataSource.getTypeConvert());
        dataSourceConfig.setDbQuery(dataSource.getDbQuery());
        dataSourceConfig.setKeyWordsHandler(dataSource.getKeyWordsHandler());
        dataSourceConfig.setDriverName(dataSource.getDriverName());


//        PackageConfig packageConfig = new PackageConfig();
//        packageConfig.setParent("com.houzw.demo.database.mybatisplus");
//        packageConfig.setEntity("entity");
//        packageConfig.setMapper("mapper");
//        packageConfig.setService("service");
//        packageConfig.setServiceImpl("service.impl");
//        packageConfig.setXml("mapper.xmls");
        PackageConfig packageConfig = new PackageConfig();
        if(!Optional.ofNullable(packageInfo).isPresent()){
            packageInfo = new PluginPackageConfig();
        }
        packageConfig.setParent(packageInfo.getParent());
        packageConfig.setModuleName(packageInfo.getModuleName());
        packageConfig.setEntity(packageInfo.getEntity());
        packageConfig.setMapper(packageInfo.getMapper());
        packageConfig.setService(packageInfo.getService());
        packageConfig.setServiceImpl(packageInfo.getServiceImpl());
        packageConfig.setXml(packageInfo.getXml());


        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.disable(TemplateType.CONTROLLER);
//        templateConfig.disable(TemplateType.SERVICE);
//        templateConfig.disable(TemplateType.XML);
//        templateConfig.disable(TemplateType.ENTITY);
//        templateConfig.disable(TemplateType.MAPPER);
        templateConfig.setEntity     ("templates/hzw_entity.java");
        templateConfig.setMapper     ("templates/hzw_mapper.java");
        templateConfig.setXml        ("templates/hzw_mapper.xml");
        templateConfig.setService    ("templates/hzw_service.java");
        templateConfig.setServiceImpl("templates/hzw_serviceImpl.java");


//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setInclude("hzw_user");
////        strategyConfig.setExclude("hzw_linux");
////        strategyConfig.setFieldPrefix("l");
////        strategyConfig.setTablePrefix("hzw");
//        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//        strategyConfig.setEntityLombokModel(true);
        StrategyConfig strategyConfig = new StrategyConfig();
        Optional.ofNullable(strategy.getInclude()).ifPresent(include -> strategyConfig.setInclude(include));
        if (!Optional.ofNullable(strategy.getInclude()).isPresent()) {
            Optional.ofNullable(strategy.getExclude()).ifPresent(exclude -> strategyConfig.setExclude(exclude));
        }
//        strategyConfig.setFieldPrefix("l");
//        strategyConfig.setTablePrefix("hzw");
        strategyConfig.setNaming(strategy.getNaming());
//        strategyConfig.setEntityLombokModel(true);
        Optional.ofNullable(strategy.getSuperEntityClass()).ifPresent(sec -> strategyConfig.setSuperEntityClass(sec));


//        InjectionConfig injectionConfig = new InjectionConfig() {
//            @Override
//            public void initMap() {
//                System.out.println("hehe");
//            }
//        };


        ConfigBuilder configBuilder = new ConfigBuilder(packageConfig,dataSourceConfig,strategyConfig,templateConfig,globalConfig);
//        configBuilder.setInjectionConfig(injectionConfig);

        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setConfig(configBuilder);

        autoGenerator.execute(); // 默认velocity引擎
//        autoGenerator.execute(new FreemarkerTemplateEngine());  // 指定FreemarkerTemplateEngine
    }
}
