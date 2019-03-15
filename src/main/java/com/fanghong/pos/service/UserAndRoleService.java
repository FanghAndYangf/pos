package com.fanghong.pos.service;

import com.fanghong.pos.domain.RoleDomain;
import com.fanghong.pos.domain.UserDomain;

import java.util.List;

public interface UserAndRoleService {
    void addUserAndRole(UserDomain userDomain, List<RoleDomain> roleDomainList);
}
