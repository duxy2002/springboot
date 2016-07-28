package com.hpe.ddc.framework.exception;


public class ApplicationException extends RuntimeException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3317930764234724038L;

	/** 错误码 */
    private Integer code = null;

    /** 错误信息 */
    private String message = null;

    /**
     * 无参数构造方法
     */
    public ApplicationException() {
        super();
    }


    /**
     * 通过错误码来初始化
     *
     * @param errorCode 错误码
     */
    public ApplicationException(Integer errorCode) {
        super();
        this.code = errorCode;
    }

    /**
     * 通过错误码和异常发生源来初始化
     *
     * @param errorCode 错误码
     * @param cause 异常发生源
     */
    public ApplicationException(Integer errorCode, Throwable cause) {
        super(cause);
        this.code = errorCode;
    }

    /**
     * 通过错误码，错误信息和异常发生源来初始化
     *
     * @param errorCode 错误码
     * @param errorMessage 错误信息
     * @param cause 异常发生源
     */
    public ApplicationException(Integer errorCode, String errorMessage, Throwable cause) {
        super(cause);
        this.code = errorCode;
        this.message = errorMessage;
    }

    /**
     * 通过错误码，错误信息来初始化
     *
     * @param errorCode 错误码
     * @param errorMessage 错误信息
     */
    public ApplicationException(Integer errorCode, String errorMessage) {
        super();
        this.code = errorCode;
        this.message = errorMessage;
    }

	/**
	 * 取得错误码
	 * @return 错误码
	 */
	public Integer getCode() {
	    return code;
	}


	/**
	 * 创建错误码
	 * @param code 错误码
	 */
	public void setCode(Integer code) {
	    this.code = code;
	}


	/**
	 * 取得错误信息
	 * @return 错误信息
	 */
	public String getMessage() {
	    return message;
	}


	/**
	 * 创建错误信息
	 * @param message 错误信息
	 */
	public void setMessage(String message) {
	    this.message = message;
	}



}