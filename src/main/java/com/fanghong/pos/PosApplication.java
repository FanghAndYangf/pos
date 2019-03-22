package com.fanghong.pos;

import com.fanghong.pos.security.AuthorizationServerConfig;
import com.fanghong.pos.security.ResourceServerConfig;
import com.fanghong.pos.security.WebSecurityConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@MapperScan("com.fanghong.pos.dao")
@EnableAutoConfiguration(exclude = {
        SecurityAutoConfiguration.class, OAuth2ClientAutoConfiguration.class, OAuth2ResourceServerAutoConfiguration.class
})
public class PosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PosApplication.class, args);
    }

}
