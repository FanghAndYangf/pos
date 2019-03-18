package com.fanghong.pos.oauth2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomLogoutSuccessHandler
        extends AbstractAuthenticationTargetUrlRequestHandler
        implements LogoutSuccessHandler {

    public static final String HEADER_AUTHORIZATION = "authorization";
    public static final String BEARER_AUTHORIZATION = "Bearer";

    @Autowired
    private TokenStore tokenStore;
    @Override
    public void onLogoutSuccess(HttpServletRequest request,
                         HttpServletResponse response,
                         Authentication authentication)
            throws IOException, ServletException {

        String token = request.getHeader(HEADER_AUTHORIZATION);
        if(null != token && token.startsWith(BEARER_AUTHORIZATION)){

            OAuth2AccessToken oAuth2AccessToken = tokenStore.readAccessToken(token.split(" ")[0]);

            if (null != oAuth2AccessToken){
                tokenStore.removeAccessToken(oAuth2AccessToken);
            }
        }

    }
}
