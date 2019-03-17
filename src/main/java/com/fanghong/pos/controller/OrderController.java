package com.fanghong.pos.controller;

import com.fanghong.pos.domain.UserDomain;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class OrderController {

    @RequestMapping(value="order/demo")
    public UserDomain getDemo() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth);
        UserDomain userDomain = new UserDomain();
        userDomain.setUsername("FANHONG");
        userDomain.setPassword("123456");
        return userDomain;
    }

}
