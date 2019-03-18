package com.fanghong.pos.config;

import com.fanghong.pos.adapter.SpringfoxJsonToGsonAdapter;
import com.fanghong.pos.dao.OauthClientDetailsMapper;
import com.fanghong.pos.dao.RoleMapper;
import com.fanghong.pos.dao.UserAndRoleMapper;
import com.fanghong.pos.dao.UserMapper;
import com.fanghong.pos.domain.OauthClientDetailsDomain;
import com.fanghong.pos.domain.RoleDomain;
import com.fanghong.pos.domain.UserAndRoleDomain;
import com.fanghong.pos.domain.UserDomain;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统初始化配置类,主要用于加载内置数据到目标数据库上
 */
@Component
public class SystemInitializer {

    @Value("${initialzation.file.users:users.json}") private String userFileName;
    @Value("${initialzation.file.roles:roles.json}") private String roleFileName;
    @Value("${initialzation.file.clients:clients.json}") private String oauth2FileName;

    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private OauthClientDetailsMapper oauthClientDetailsMapper ;
    @Resource
    private UserAndRoleMapper userAndRoleMapper;

    @PostConstruct
    public boolean initialize() throws Exception {
        InputStream userInputStream = null;
        InputStream roleInputStream = null;
        InputStream oauth2ClientsStream = null;
        try{
            userInputStream = getClass().getClassLoader().getResourceAsStream(userFileName);
            if(null == userInputStream) throw new Exception("initialzation user file not found: " + userFileName);

            roleInputStream = getClass().getClassLoader().getResourceAsStream(roleFileName);
            if(null == roleInputStream) throw new Exception("initialzation role file not found: " + roleFileName);

            oauth2ClientsStream = getClass().getClassLoader().getResourceAsStream(oauth2FileName);
            if(null == oauth2ClientsStream) throw new Exception("initialzation role file not found: " + oauth2FileName);
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd HH:mm:ss")
                    .setPrettyPrinting()
                    .disableHtmlEscaping()
                    //.registerTypeAdapter(Json.class, new SpringfoxJsonToGsonAdapter())
                    .create();
            //导入初始的系统超级管理员角色
            Type roleTokenType = new TypeToken<ArrayList<RoleDomain>>(){}.getType();

            ArrayList<RoleDomain> roleDomains = gson.fromJson(new InputStreamReader(roleInputStream,
                            StandardCharsets.UTF_8),
                            roleTokenType);
            for(RoleDomain role : roleDomains){
                int isExist = roleMapper.countByName(role.getName());
                if(isExist == 0) roleMapper.insert(role);
            }

            //导入初始的系统超级管理员角色
            Type userTokenType = new TypeToken<ArrayList<UserDomain>>(){}.getType();
            ArrayList<UserDomain> userDomains = gson.fromJson(new InputStreamReader(userInputStream,
                            StandardCharsets.UTF_8),
                    userTokenType);
            for(UserDomain user : userDomains){
                int isExist = userMapper.countByUserName(user.getUsername());
                if(isExist == 0){
                    userMapper.insert(user);
                    List<String> roles = user.getRoles();
                    for(String roleName : roles){
                        RoleDomain role  = roleMapper.selectRloeByMap(roleName);
                        UserAndRoleDomain userAndRoleDomain = new UserAndRoleDomain();
                        userAndRoleDomain.setRoleKey(role.getRoleKey());
                        userAndRoleDomain.setUserKey(user.getUserKey());
                        userAndRoleMapper.insert(userAndRoleDomain);
                    }
                }
            }

            //导入初始的oauth2_clients信息
            Type oauth2ClientsConfigTokenType = new TypeToken<ArrayList<OauthClientDetailsDomain>>(){}.getType();
            ArrayList<OauthClientDetailsDomain> oauthClientDetailsDomains = gson.fromJson(new InputStreamReader(oauth2ClientsStream,
                    StandardCharsets.UTF_8),oauth2ClientsConfigTokenType);
            for(OauthClientDetailsDomain oauthClientDetailsDomain : oauthClientDetailsDomains){
                int isExist = oauthClientDetailsMapper.countOauthClientDetailsByClientId(oauthClientDetailsDomain.getClientId());
                if(isExist == 0) {
                    oauthClientDetailsMapper.insert(oauthClientDetailsDomain);
                }
            }

        }finally {
            if(null != userInputStream) userInputStream.close();
            if(null != roleInputStream) roleInputStream.close();
        }


        return true;
    }
}
