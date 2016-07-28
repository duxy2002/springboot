package com.hpe.ddc;

import com.hpe.ddc.framework.config.DruidConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 为了让SpringBoot支持过滤器、监听器。需要加上@ServletComponentScan
 */
@SpringBootApplication
@ServletComponentScan
//@MapperScan("com.hpe.ddc.dao")
public class SpringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplication.class, args);
	}
}
