package com.hpe.ddc.framework.autogenerator.mybatis.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class MapperClassNamePlugin extends PluginAdapter {

	private FullyQualifiedJavaType repository;

	public MapperClassNamePlugin() {
		super();
		repository = new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper");
	}

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable table) {
		super.initialized(table);

		String name = table.getMyBatis3JavaMapperType();
		table.setMyBatis3JavaMapperType(name.replaceAll("Mapper$", "DAO"));

	}

	@Override
	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		if (null != interfaze) {
			interfaze.addAnnotation("@Mapper");
			interfaze.addImportedType(repository);
		} else {
			System.out.println("This is a NG!");
		}
		return true;
	}

}
