package com.fanghong.pos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class LoginAuthenticationProvider implements AuthenticationProvider{

    @Autowired
    private CustomUserService customUserService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String userName = (String) authentication.getPrincipal();       //获取表单输入中返回的用户名
        String password = (String) authentication.getCredentials();     //获取表单中输入的密码

        UserDetails userDetails = customUserService.loadUserByUsername(userName);

        if (!userDetails.getPassword().equalsIgnoreCase(password)) {
            throw new BadCredentialsException("密码不正确");
        }

        return new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
