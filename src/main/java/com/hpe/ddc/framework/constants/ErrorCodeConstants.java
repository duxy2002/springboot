package com.hpe.ddc.framework.constants;

import org.apache.commons.lang3.builder.ToStringBuilder;

public enum ErrorCodeConstants {
	CommonError(500, "服务器异常，请联系管理员");

	ErrorCodeConstants(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	private int code;
	private String desc;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
