package com.han.oauth.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * @Author: Wuj
 * @Description: 设置用户认证信息所依赖的配置类是 WebSecurityConfigurer 类，
 * Spring Security 同样提供了 WebSecurityConfigurerAdapter 类来简化该配置类的使用方式，
 * 我们可以继承 WebSecurityConfigurerAdapter 类并且覆写其中的 configure() 的方法来完成配置工作。
 * 关于 WebSecurityConfigurer 配置类，我们首先需要明确配置的内容。实际上，设置用户信息非常简单，
 * 只需要指定用户名（User）、密码（Password）和角色（Role）这三项数据即可，如下所示：
 * @DateTime: 2023/7/23 16:47
 **/
@Configuration

public class SpringWebSecurityConfigurer extends WebSecurityConfigurerAdapter {


    @Override

    @Bean

    public AuthenticationManager authenticationManagerBean() throws Exception {

        return super.authenticationManagerBean();

    }



    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {

        return super.userDetailsServiceBean();

    }



    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder
                .inMemoryAuthentication()
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("spring_user")
                .password("password1")
                .roles("USER")
                .and()
                .withUser("spring_admin")
                .password("{noop}password2")
                .roles("USER", "ADMIN");

    }
}
