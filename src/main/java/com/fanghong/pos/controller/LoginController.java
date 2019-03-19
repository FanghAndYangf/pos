package com.fanghong.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

public class LoginController {

    public String login(Map<String,Object> paramMap){
        paramMap.put("name", "张三");
        paramMap.put("age", 35);
        return "login";
    }
}
