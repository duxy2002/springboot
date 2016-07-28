package com.hpe.ddc.framework.utils;

import java.security.KeyStoreException;
import java.util.Arrays;

import com.hpe.ddc.framework.constants.ErrorCodeConstants;
import com.hpe.ddc.framework.exception.ApplicationException;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.client.RestTemplate;



public class RestClientUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestClientUtils.class);

	/**
	 * 发起https请求并获取结果
	 *
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @param outputString
	 *            提交的数据
	 * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
	 * @throws KeyStoreException
	 */
	public static String httpsSSLRequest(String requestUrl, String requestMethod, String outputString) {

		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);

		RestTemplate restTemplate = new RestTemplate(requestFactory);

		String result = "";
		if ("GET".equalsIgnoreCase(requestMethod)) {
			ResponseEntity<String> entity = restTemplate.getForEntity(requestUrl, String.class);
			if (entity.getStatusCode().is2xxSuccessful()) {
				result = entity.getBody();
			} else {
				LOGGER.error("REST http error:{}", entity.getStatusCode().value());
				throw new ApplicationException(ErrorCodeConstants.CommonError.getCode(),
						ErrorCodeConstants.CommonError.getDesc());
			}
		} else if ("POST".equalsIgnoreCase(requestMethod)) {
			ResponseEntity<String> entity = restTemplate.postForEntity(requestUrl, outputString, String.class);
			if (entity.getStatusCode().is2xxSuccessful()) {
				result = entity.getBody();
			} else {
				LOGGER.error("REST https error:{}", entity.getStatusCode().value());
				throw new ApplicationException(ErrorCodeConstants.CommonError.getCode(),
						ErrorCodeConstants.CommonError.getDesc());
			}
		}

		return result;
	}

	public static ResponseEntity<byte[]> downloadImageFilehttpsSSLRequest(String requestUrl) {
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier())
				.build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);

		RestTemplate restTemplate = new RestTemplate(requestFactory);
		 restTemplate.getMessageConverters().add(
		            new ByteArrayHttpMessageConverter());
		 HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM));

		    HttpEntity<String> entity = new HttpEntity<String>(headers);
		    ResponseEntity<byte[]> response = restTemplate.exchange(requestUrl, HttpMethod.GET, entity, byte[].class,"");
		    return response;
	}

	public static void main(String[] args) {
		downloadImageFilehttpsSSLRequest("https://api.weixin.qq.com/cgi-bin/media/get?access_token=Nwz_Lbr03WdyZ464tJb1sWmbnMu3Qn9iwLOAJAgyfLAQa72Qj9wSaBedCfPKKKHXzkrHRRBLL7mpX1NRgOBX53bQg9pOYbOP0NGO3d4JTe4Yl9-4SUtr14zyP4Q_nBDBOMMcAFAWUU&media_id=kf-267CX57qjt6P-w_CrvGW7CeX5W0SGK5cT_s05IjExsQCv96JDVNm55VvpayJo");
	}
	/**
	 * 发起http请求并获取结果
	 *
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @param outputString
	 *            提交的数据
	 * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
	 * @throws KeyStoreException
	 */
	public static String httpRequest(String requestUrl, String requestMethod, String outputString) {

		RestTemplate restTemplate = new RestTemplate();

		String result = "";
		if ("GET".equalsIgnoreCase(requestMethod)) {
			ResponseEntity<String> entity = restTemplate.getForEntity(requestUrl, String.class);
			if (entity.getStatusCode().is2xxSuccessful()) {
				result = entity.getBody();
			} else {
				LOGGER.error("REST http error:{}", entity.getStatusCode().value());
				throw new ApplicationException(ErrorCodeConstants.CommonError.getCode(),
						ErrorCodeConstants.CommonError.getDesc());
			}
		} else if ("POST".equalsIgnoreCase(requestMethod)) {
			ResponseEntity<String> entity = restTemplate.postForEntity(requestUrl, outputString, String.class);
			if (entity.getStatusCode().is2xxSuccessful()) {
				result = entity.getBody();
			} else {
				LOGGER.error("REST https error:{}", entity.getStatusCode().value());
				throw new ApplicationException(ErrorCodeConstants.CommonError.getCode(),
						ErrorCodeConstants.CommonError.getDesc());
			}
		}
		return result;
	}
}
