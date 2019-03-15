package com.fanghong.pos.dao;

import com.fanghong.pos.domain.UserDomain;

public interface UserMapper {

    int insert(UserDomain record);
    int countByUserName(String userName);
    UserDomain selectUserAndRoleByName(String userName);
}
