package com.hpe.ddc.sample.advice;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice(basePackages = { "com.hpe.ddc.sample.controller" })
public class ExceptionHandlerAdvice {

	private static final Logger LOGGER = LoggerFactory.getLogger(RESTfulExceptionHandlerAdvice.class);

	@ExceptionHandler
	public String defaultExceptionHandler(Throwable ex, HttpServletRequest request) {
		return "error";
	}
}
