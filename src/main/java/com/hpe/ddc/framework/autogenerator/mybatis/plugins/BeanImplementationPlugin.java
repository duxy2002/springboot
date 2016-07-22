package com.hpe.ddc.framework.autogenerator.mybatis.plugins;

import java.util.List;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class BeanImplementationPlugin extends PluginAdapter {

	private FullyQualifiedJavaType iReqDTO;
	private FullyQualifiedJavaType iRespDTO;
	private FullyQualifiedJavaType serializable;

	public BeanImplementationPlugin() {
		super();
		iReqDTO = new FullyQualifiedJavaType("com.hpe.ddc.framework.dto.IReqDTO");

		serializable = new FullyQualifiedJavaType("java.io.Serializable");

		iRespDTO = new FullyQualifiedJavaType("com.hpe.ddc.framework.dto.IRespDTO");
	}

	public boolean validate(List<String> warnings) {
		return true;
	}

	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		implementBean(topLevelClass, introspectedTable.getFullyQualifiedTable());
		return true;
	}

	public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		implementBean(topLevelClass, introspectedTable.getFullyQualifiedTable());
		return true;
	}

	public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		implementBean(topLevelClass, introspectedTable.getFullyQualifiedTable());
		return true;
	}

	protected void implementBean(TopLevelClass topLevelClass, FullyQualifiedTable table) {
		topLevelClass.addSuperInterface(serializable);
		topLevelClass.addImportedType(serializable);
		topLevelClass.addSuperInterface(iReqDTO);
		topLevelClass.addImportedType(iReqDTO);
		topLevelClass.addSuperInterface(iRespDTO);
		topLevelClass.addImportedType(iRespDTO);
	}

}
