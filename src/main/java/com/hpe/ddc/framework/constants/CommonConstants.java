package com.hpe.ddc.framework.constants;

import org.apache.commons.lang3.builder.ToStringBuilder;

public enum CommonConstants {
	COMMON_DATA_FLOW_INFO("COMMON_DATA_FLOW_INFO", "处理Request时，各个Layer的入出力情报");

	CommonConstants(String key, String desc) {
		this.key = key;
		this.desc = desc;
	}

	/**
	 * Key
	 */
	private String key;

	/**
	 * 描述
	 */
	private String desc;


	/**
	 * 获取Key
	 * @return key
	 */
	public String getKey() {
	    return key;
	}

	/**
	 * 创建Key
	 * @param key key
	 */
	public void setKey(String key) {
	    this.key = key;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * 获取描述
	 * @return desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * 创建描述
	 * @param desc 描述
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
