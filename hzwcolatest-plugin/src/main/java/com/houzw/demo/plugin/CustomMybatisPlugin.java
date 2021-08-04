package com.houzw.demo.plugin;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;

import java.lang.reflect.Field;
import java.util.List;

/**
 * mybatis 代码生成插件
 * @author houzw
 *
 */
public class CustomMybatisPlugin extends PluginAdapter {

	private static final String SUPER_CLASS_NAME = "com.houzw.demo.gatewayimpl.database.dataobject.BaseDO";

	@Override
	public boolean validate(List<String> warnings) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean clientGenerated(Interface interfaze, IntrospectedTable introspectedTable) {

		return super.clientGenerated(interfaze, introspectedTable);
	}

	@Override
	public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
		// 反射修改属性，使每次生成 xxxMapper.xml 时不是追加的
//			Field field = sqlMap.getClass().getDeclaredField("isMergeable");
//			field.setAccessible(true);
//			field.setBoolean(sqlMap,false);
		sqlMap.setMergeable(false);

//		try {
//			introspectedTable.getPrimaryKeyColumns().forEach(pk -> {
//				if(pk.isAutoIncrement()){
//					sqlMap.
//				}
//			});
//		} catch (NoSuchFieldException | IllegalAccessException e) {
//			e.printStackTrace();
//		}


		return super.sqlMapGenerated(sqlMap, introspectedTable);
	}
}
