package com.hpe.ddc.framework.config;

import com.hpe.ddc.framework.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

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
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private DataSource dataSource;
    /**
     * 请求授权
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/sbadmin2/css/**").permitAll()
                .antMatchers("/sbadmin2/js/**").permitAll()
                .antMatchers("/sbadmin2/bower_components/**").permitAll()
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
                .and().rememberMe()
                .tokenRepository(jdbcTokenRepository())
                .tokenValiditySeconds(604800) // remember for a week. ( 1 * 60 * 60 * 24 * 7 ) sec
        ;

    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    public PersistentTokenRepository jdbcTokenRepository() {
        JdbcTokenRepositoryImpl repository = new JdbcTokenRepositoryImpl();
        //
        repository.setDataSource(dataSource);
//     repository.setCreateTableOnStartup(true);
        return repository;
    }
}
