package com.hpe.ddc.framework.result;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Result<T> implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5296547281614863590L;

	/**
	 * 返回码
	 */
	Integer code = 0;

	/**
	 * 返回信息
	 */
	String msg = null;

	/**
	 * 返回数据
	 */
	T data;

	public Result() {
		super();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/**
	 * 取得返回码
	 *
	 * @return 返回码
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * 创建返回码
	 *
	 * @param code
	 *            返回码
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * 取得返回信息
	 *
	 * @return 返回信息
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * 创建返回信息
	 *
	 * @param msg
	 *            返回信息
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 取得返回数据
	 *
	 * @return 返回数据
	 */
	public T getData() {
		return data;
	}

	/**
	 * 创建返回数据
	 *
	 * @param data
	 *            返回数据
	 */
	public void setData(T data) {
		this.data = data;
	}
}
