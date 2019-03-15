package com.fanghong.pos.service;

import com.fanghong.pos.domain.UserDomain;

public interface UserService {
    UserDomain getUserAndRoleByName(String name);
}
