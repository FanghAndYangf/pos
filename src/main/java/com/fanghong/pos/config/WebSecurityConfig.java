package com.fanghong.pos.config;

import com.fanghong.pos.security.CustomUserService;
import com.fanghong.pos.security.MyPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserService customUserService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new MyPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(customUserService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        authenticationProvider.setHideUserNotFoundExceptions(false);
        return authenticationProvider;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        //auth.userDetailsService(customUserService);         //UserDetails Service 验证
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                // swagger start
                .antMatchers("/swagger-ui.html").hasRole("ADMIN")
                .antMatchers("/swagger-resources/**").hasRole("ADMIN")
                .antMatchers("/images/**").hasRole("ADMIN")
                .antMatchers("/webjars/**").hasRole("ADMIN")
                .antMatchers("/v2/api-docs").hasRole("ADMIN")
                .antMatchers("/configuration/ui").hasRole("ADMIN")
                .antMatchers("/configuration/security").hasRole("ADMIN")
                // swagger end
                .anyRequest()
                .authenticated()                //任何请求登陆后访问
                .and()
                .formLogin()
                .permitAll()                   //登陆页面任何人可访问
                .and()
                .logout().permitAll();          //注销行为任意访问
    }

}
