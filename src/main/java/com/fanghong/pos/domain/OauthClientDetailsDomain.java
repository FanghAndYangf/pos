package com.fanghong.pos.domain;

import lombok.Data;

import java.util.List;

@Data
public class OauthClientDetailsDomain {

    private String clientId;        //客户端id
    private String resourceIds;     //资源名称
    private String clientSecret;        //客户端加密方式
    private String scope;           //权限scope
    private String[] authorizedGrantTypes;      //认证方式
    private String webServerRedirectUri;        //重定向uri
    private String authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    private String additionalInformation;
    private String autoapprove;
}
