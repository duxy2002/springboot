package com.hpe.ddc.sample.advice;

import javax.servlet.http.HttpServletRequest;

import com.hpe.ddc.framework.constants.ErrorCodeConstants;
import com.hpe.ddc.framework.exception.ApplicationException;
import com.hpe.ddc.framework.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ControllerAdvice(basePackages = { "com.hpe.ddc.sample.restcontroller" })
public class RESTfulExceptionHandlerAdvice {

	private static final Logger LOGGER = LoggerFactory.getLogger(RESTfulExceptionHandlerAdvice.class);

	@ExceptionHandler
	public Result<?> defaultExceptionHandler(Throwable ex, HttpServletRequest request) {
		String message = ex.getMessage() != null ? ex.getMessage() : "server internal error";
		Result<?> result = new Result();
		result.setCode(ErrorCodeConstants.CommonError.getCode());
		result.setMsg(message);
		return result;
	}

	@ExceptionHandler(value = ApplicationException.class)
	public Result<?> subscriptionExceptionHandler(ApplicationException ex, HttpServletRequest request) {
		String message = ex.getMessage();
		int code = ex.getCode();
		Result<?> result = new Result();
		result.setCode(code);
		result.setMsg(message);
		return result;
	}
}
