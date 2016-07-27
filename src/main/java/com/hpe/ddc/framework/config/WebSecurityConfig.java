package com.hpe.ddc.framework.config;

import com.hpe.ddc.framework.business.impl.PersistentTokenBusinessImpl;
import com.hpe.ddc.framework.service.impl.UserDetailsServiceImpl;
import com.hpe.ddc.framework.utils.SessionExpiredDetectingLoginUrlAuthenticationEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.security.web.csrf.MissingCsrfTokenException;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Spring Security的配置和Spring MVC的配置类似，只需在一个配置类上注解@EnableWebSecurity,
 * 并让这个类继承WebSecurityConfigurerAdapter即可。但是在SpringBoot中，当我们需要自己扩展的配置时，只需要配置类继承
 * WebSecurityConfigurerAdapter类即可，无需使用@EnableWebSecurity注解。<br/>
 * 配置完成后，在Controller层就可以用@Secured来指定权限名了。@Secured既可以注解在类级别上，也可以注解在方法级别上。假如注解在方法级别上，
 * 那么需要在下面类中加上@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled=true)。其中securedEnabled表示
 * 启用Spring的@Secured注解。prePostEnabled = true表示开启方法级别注解？
 * Created by duxi on 2016/7/22.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private PersistentTokenBusinessImpl persistentTokenRepositoryImpl;

    /**
     * 因为SpringSecurity会把静态Resource的Cache给关闭，所以在这儿把这个功能打开。
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }

    /**
     * 请求授权
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Sets the key to identify tokens created for remember me authentication. Default is a secure randomly generated key.
        String rememberMeKey = UUID.randomUUID().toString();

        http.authorizeRequests()
                .antMatchers("/sbadmin2/css/**").permitAll()
                .antMatchers("/sbadmin2/js/**").permitAll()
                .antMatchers("/sbadmin2/bower_components/**").permitAll()
                .antMatchers("/webjars/**", "/**/*.js", "/**/*.css", "/**/*.less", "/**/*.png", "/**/*.gif", "/**/*.jpg", "/**/*.map","**/favicon.ico").permitAll()
                .anyRequest().fullyAuthenticated()
              .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("userid")
                .passwordParameter("password")
                .defaultSuccessUrl("/sbadmin2/index.html")
                .failureUrl("/login?error").permitAll()
              .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login?logout")
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true).permitAll()
              .and()
                .rememberMe()
                .key(rememberMeKey)
                .rememberMeServices(getRememberMeServices(rememberMeKey))
                .tokenValiditySeconds(604800) // remember for a week. ( 1 * 60 * 60 * 24 * 7 ) sec
              .and()
                .exceptionHandling()
                // 通常Request和ajax都能对应的类。SessionTimeout的时候的处理
                .authenticationEntryPoint(authenticationEntryPoint())
                // 假如没有session，那么CSRF就不起作用。
                // 所以SessionTimeout的时候POST，就会返回403 Forbidden错误
                // 在这儿做的处理就是发生MissingCsrfTokenException的时候，重新回到login画面。
                .accessDeniedHandler(accessDeniedHandler())
        ;

    }

    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return new AccessDeniedHandler() {
            @Override
            public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
                if (accessDeniedException instanceof MissingCsrfTokenException) {
                    authenticationEntryPoint().commence(request, response, null);
                } else {
                    new AccessDeniedHandlerImpl().handle(request, response, accessDeniedException);
                }
            }
        };
    }

    @Bean
    AuthenticationEntryPoint authenticationEntryPoint() {
        return new SessionExpiredDetectingLoginUrlAuthenticationEntryPoint("/login");
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }


    private RememberMeServices getRememberMeServices(String rememberMeKey) {
        PersistentTokenBasedRememberMeServices rememberMeServices = new PersistentTokenBasedRememberMeServices(rememberMeKey, userDetailsService, persistentTokenRepositoryImpl);
        rememberMeServices.setAlwaysRemember(true);
        return rememberMeServices;
    }


//    @Bean
//    public PersistentTokenRepository jdbcTokenRepository() {
//        JdbcTokenRepositoryImpl repository = new JdbcTokenRepositoryImpl();
//        //
//        repository.setDataSource(dataSource);
//        //在指定为true的手，会在启动的时候，自动生成下面的表。但是假如已经存在，那么出错。所以这儿做注释，然后自动生成下面的表。
//        //-- remember me 認証
//        //create table persistent_logins(
//        //        username varchar(64) not null,
//        //        series varchar(64) primary key,
//        //token varchar(64) not null,
//        //        last_used timestamp not null
//        //);
////     repository.setCreateTableOnStartup(true);
//        return repository;
//    }

}
