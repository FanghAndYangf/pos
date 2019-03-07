package com.fanghong.pos.Dao;

import com.fanghong.pos.Model.AsUser;

public interface AsUserMapper {
    int deleteByPrimaryKey(Integer userKey);

    int insert(AsUser record);

    int insertSelective(AsUser record);

    AsUser selectByPrimaryKey(Integer userKey);

    int updateByPrimaryKeySelective(AsUser record);

    int updateByPrimaryKey(AsUser record);
}