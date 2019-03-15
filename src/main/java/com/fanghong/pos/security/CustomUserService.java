package com.fanghong.pos.security;

import com.fanghong.pos.domain.RoleDomain;
import com.fanghong.pos.domain.UserDomain;
import com.fanghong.pos.service.UserService;
import com.fanghong.pos.serviceImpl.UserServiceImpl;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = "customUserService")
public class CustomUserService implements UserDetailsService{

    @Resource
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        UserDomain userDomain = userService.getUserAndRoleByName(s);
        if(userDomain == null) throw new UsernameNotFoundException(String.format("No user found with username: %s", s));
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        List<RoleDomain> rolesList = userDomain.getRoleDomainList();
        List<String> roles = rolesList.stream().map(roleDomain -> roleDomain.getName()).collect(Collectors.toList());
        for(String role : roles){
            authorityList.add(new SimpleGrantedAuthority(role));
        }
        return new User(userDomain.getUsername(), userDomain.getPassword(),
                userDomain.isEnabled(), userDomain.isAccountNonExpired(),
                userDomain.isCredentialsNonExpired(), userDomain.isAccountNonLocked(), authorityList);
    }
}
