package com.houzw.demo.plugin.mybatisplus.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.config.ITypeConvert;
import com.baomidou.mybatisplus.generator.config.converts.DB2TypeConvert;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.converts.TypeConverts;
import com.baomidou.mybatisplus.generator.config.querys.AbstractDbQuery;
import com.baomidou.mybatisplus.generator.config.querys.DB2Query;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.keywords.BaseKeyWordsHandler;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import lombok.Getter;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author sirius
 * @since 2021-08-26
 */
@Getter
public class PluginDataSourceConfig {

    /**
     * 数据库类型
     */
    @Parameter
    public DbType dbType;
    /**
     * 驱动连接的URL
     */
    @Parameter(required = true)
    public String url;
    /**
     * 驱动名称
     */
    @Parameter(required = true)
    public String driverName;
    /**
     * 数据库连接用户名
     */
    @Parameter(required = true)
    public String username;
    /**
     * 数据库连接密码
     */
    @Parameter(required = true)
    public String password;


    public ITypeConvert getTypeConvert(){
        ITypeConvert typeConvert = null;
        TypeConverts.getTypeConvert(dbType);
        switch (dbType){
            case MYSQL:
                typeConvert = new MySqlTypeConvert();
                break;
            case DB2:
                typeConvert = new DB2TypeConvert();
                break;
        }
        return typeConvert;
    }

    public AbstractDbQuery getDbQuery(){
        AbstractDbQuery dbQuery = null;
        switch (dbType){
            case MYSQL:
                dbQuery = new MySqlQuery();
                break;
            case DB2:
                dbQuery = new DB2Query();
                break;
        }
        return dbQuery;
    }

    public BaseKeyWordsHandler getKeyWordsHandler(){
        BaseKeyWordsHandler keyWordsHandler = null;
        switch (dbType){
            case MYSQL:
                keyWordsHandler = new MySqlKeyWordsHandler();
                break;
            case DB2:
                keyWordsHandler = new Db2KeyWordsHandler();
                break;
        }
        return keyWordsHandler;
    }

}
