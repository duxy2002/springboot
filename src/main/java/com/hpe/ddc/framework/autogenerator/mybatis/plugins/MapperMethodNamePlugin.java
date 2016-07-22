package com.hpe.ddc.framework.autogenerator.mybatis.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class MapperMethodNamePlugin extends PluginAdapter {

	public MapperMethodNamePlugin() {
		super();
	}

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public void initialized(IntrospectedTable table) {
		super.initialized(table);

	}

	@Override
	public boolean clientCountByExampleMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);
		return true;
	}

	@Override
	public boolean clientCountByExampleMethodGenerated(Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);
		return true;
	}

	public boolean clientDeleteByExampleMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);
		return true;
	}

	public boolean clientDeleteByExampleMethodGenerated(Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);
		return true;
	}

	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);
		return true;
	}

	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);
		return true;
	}

	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);

		return true;
	}

	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);

		return true;
	}

	public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);

		return true;
	}

	public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);
		return true;
	}

	public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);

		return true;
	}

	public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);

		return true;
	}

	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);

		return true;
	}

	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String name = method.getName();
		name = name.replace("ByExample", "ByCriteria");
		method.setName(name);

		return true;
	}

	public boolean sqlMapCountByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

	public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

	public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

	public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

	private void changeElementIDValue(XmlElement element) {
		List<Attribute> attributes = element.getAttributes();
		boolean flag = false;
		int i =0;
		if ((null != attributes) && (!attributes.isEmpty())) {
			int length = attributes.size();
			for (i=0; i<length; i++) {
				Attribute attribute = attributes.get(i);
				if  (("id".equals(attribute.getName())) && (attribute.getValue().contains("ByExample"))) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			String nodeValue = attributes.get(i).getValue();
			nodeValue = nodeValue.replace("ByExample", "ByCriteria");
			nodeValue = nodeValue.replace("Example_", "ByCriteria");
			Attribute attribute= new Attribute("id", nodeValue);
			attributes.set(i, attribute);
		}
	}

	public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

	public boolean sqlMapUpdateByExampleWithBLOBsElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

	public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		changeElementIDValue(element);
		return true;
	}

}
