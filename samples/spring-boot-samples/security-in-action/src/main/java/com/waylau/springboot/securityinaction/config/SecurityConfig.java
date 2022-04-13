package com.waylau.springboot.securityinaction.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security 配置类.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2022年4月13日
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated() // 所有请求都要认证
                .and()
                .httpBasic(); // 启用HTTP基本认证
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("waylau") // 用户名
                .password("{noop}waylau123") // Spring Security要求设置密码时设置加密算法，
                // 为了简化演示，这里设置noop来指明不设置加密算法。
                .roles("USER"); // 用户角色

    }
}