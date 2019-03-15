package com.fanghong.pos.dao;

import com.fanghong.pos.domain.RoleDomain;

public interface RoleMapper {

    int insert(RoleDomain record);
    int countByName(String name);
    RoleDomain selectRloeByMap(String name);
}
