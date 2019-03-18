package com.fanghong.pos.dao;

import com.fanghong.pos.domain.OauthClientDetailsDomain;

public interface OauthClientDetailsMapper {

    int insert(OauthClientDetailsDomain record);
    int countOauthClientDetailsByClientId(String clientId);
}
