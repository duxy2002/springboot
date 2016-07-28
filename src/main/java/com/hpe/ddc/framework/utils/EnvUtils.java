package com.hpe.ddc.framework.utils;

import java.net.InetAddress;

import com.hpe.ddc.framework.constants.ErrorCodeConstants;
import com.hpe.ddc.framework.exception.ApplicationException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class EnvUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(EnvUtils.class);

	public static String getHostName() {
	    try {
	        return InetAddress.getLocalHost().getHostName();
	    }catch (Exception ex) {
	    	LOGGER.error("get host name error:{}", ExceptionUtils.getStackTrace(ex));
	        throw new ApplicationException(ErrorCodeConstants.CommonError.getCode(),ErrorCodeConstants.CommonError.getDesc());
	    }
	}
}
