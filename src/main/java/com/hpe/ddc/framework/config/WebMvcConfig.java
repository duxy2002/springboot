package com.hpe.ddc.framework.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 需要增加自己的额外的配置的时候，可以定义一个配置类并继承WebMvcConfigurerAdapter,无须使用@EnableWebMvc注解。
 * Created by duxi on 2016/7/27.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 通过@Bean定义HttpMessageConverter是向项目中添加消息转换器最简便的办法，这类似于之前提到的添加Servlet Filters。
     * 如果Spring扫描到HttpMessageConverter类型的bean，就会将它自动添加到调用链中。<br/>
     * 因为configureMessageConverters方法会覆盖掉spring mvc默认注册的多个HttpMessageConverter，
     * 并且不能确保重写后的configureMessageConverters方法按照固定顺序执行。所以使用了下面的方法
     * @return
     */
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        final ObjectMapper objectMapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT);
        return new MappingJackson2HttpMessageConverter(objectMapper);
    }

    /**
     * 通过@Bean定义HttpMessageConverter是向项目中添加消息转换器最简便的办法，这类似于之前提到的添加Servlet Filters。
     * 如果Spring扫描到HttpMessageConverter类型的bean，就会将它自动添加到调用链中。<br/>
     * @return
     */
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        return new StringHttpMessageConverter(StandardCharsets.UTF_8);
    }
//    /**
//     * 重载会覆盖掉spring mvc默认注册的多个HttpMessageConverter
//     * @param converters
//     */
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        //让输出的JSON带有缩进功能，这样更好确认
//        final ObjectMapper objectMapper = new ObjectMapper()
//                .enable(SerializationFeature.INDENT_OUTPUT);
//        converters.add(new MappingJackson2HttpMessageConverter(objectMapper));
//        //让输出的结果的字符集为UTF-8
//        //Add a converter for the String sent via HTTP
//        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter(StandardCharsets.UTF_8);
//        //See SPR-7316
//        //SPR-7316: to avoid Accept-Charset header overhead
//        stringConverter.setWriteAcceptCharset(false);
//        converters.add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
//    }

    /**
     * 为了让静态资源能有正确的Header
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Resources without Spring Security. No cache control response headers.
        //registry.addResourceHandler("/static/public/**")
        //        .addResourceLocations("classpath:/static/public/");

        // Resources controlled by Spring Security, which
        // adds "Cache-Control: must-revalidate".
        Integer ONE_YEAR_SECONDS = 60*60*24*365;
        // 在SpringBoot中，静态资源的目录为/static，/public,/resources,/META-INF/resources。
        // /static映射到了classpath:/resources/static
        // /public映射到了classpath:/resources/public
        // 另外/webjars/*其实是映射到了classpath:/META/resources/webjars/
        // 假如在静态目录中有相同文件，那么优先级别为META/resources > resources > static > public 。
        registry.addResourceHandler( "/webjars/**", "/**/*.js", "/**/*.css", "/**/*.less", "/**/*.png", "/**/*.gif", "/**/*.jpg", "/**/*.map","**/favicon.ico" )
                .addResourceLocations( "classpath:/META-INF/resources/webjars/", "classpath:/static/", "classpath:/public/" )
                .setCachePeriod( ONE_YEAR_SECONDS );

    }

    /**
     * 跨域访问的设置<br/>
     * 在SpringBoot中有2中比较方便的方法<br/>
     * 1. @CrossOrigin注解。
     * 2. 如下，在addCorsMappings方法中做设定<br/>
     * 还有一个方法
     * In order to support CORS with filter-based security framework like Spring Security, <br/>
     * or with other projects that does not support natively CORS yet like Spring Data REST, <br/>
     * we also provide a CorsFilter. In that case, instead of using @CrossOrigin or WebMvcConfigurer#addCorsMappings(CorsRegistry), <br/>
     * you can for example declare the filter as following in your Spring Boot application:
     * @Configuration
     * public class MyConfiguration {
     *     @Bean
     *     public FilterRegistrationBean corsFilter() {
     *          UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
     *          CorsConfiguration config = new CorsConfiguration();
     *          config.setAllowCredentials(true);
     *          config.addAllowedOrigin("http://domain1.com");
     *          config.addAllowedHeader("*");
     *          config.addAllowedMethod("*");
     *          source.registerCorsConfiguration("/**", config);
     *          FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
     *          bean.setOrder(0);
     *          return bean;
     *     }
     * }
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //public CorsRegistration addMapping(String pathPattern)
        //Enable cross origin request handling for the specified path pattern.
        //Exact path mapping URIs (such as "/admin") are supported as well as Ant-style path patterns (such as "/admin/**").
        //By default, all origins, all headers, credentials and GET, HEAD, and POST methods are allowed, and the max age is set to 30 minutes.

                registry
                        //接收所有的Path
                        .addMapping("/**")
                        //只接受localhost:9000过来的跨域请求
                        //一个域是由schema、host、port三者共同组成，与路径无关。
                        //所谓跨域，是指在http://example-foo.com/域上通过XMLHttpRequest对象调用http://example-bar.com/域上的资源。
                        //CORS约定服务器端和浏览器在HTTP协议之上，通过一些额外HTTP头部信息，进行跨域资源共享的协商。
                        //服务器端和浏览器都必需遵循规范中的要求。
                        .allowedOrigins("http://localhost:9000")
                        //接收所有的Header
                        .allowedHeaders("*")
                        //接收所有的方法。POST/PUT/DELETE/GET等等
                        .allowedMethods("*")
                        //是否允许cookie随请求发送，使用时必须指定具体的域
                        .allowCredentials(true)
                        //预请求的结果的有效期，默认30分钟。这里设定为60分钟
                        .maxAge(3600);

    }
}
