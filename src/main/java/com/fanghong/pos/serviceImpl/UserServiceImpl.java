package com.fanghong.pos.serviceImpl;

import com.fanghong.pos.dao.UserMapper;
import com.fanghong.pos.domain.UserDomain;
import com.fanghong.pos.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDomain getUserAndRoleByName(String name) {
        return userMapper.selectUserAndRoleByName(name);
    }
}
