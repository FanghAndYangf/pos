package com.fanghong.pos.config;

import com.fanghong.pos.dao.UserMapper;
import com.fanghong.pos.domain.RoleDomain;
import com.fanghong.pos.domain.UserDomain;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * 系统初始化配置类,主要用于加载内置数据到目标数据库上
 */
@Component
public class SystemInitializer {

    @Value("${initialzation.file.users:users.json}") private String userFileName;
    @Value("${initialzation.file.roles:roles.json}") private String roleFileName;

    @Resource
    private UserMapper userMapper;

    @PostConstruct
    public boolean initialize() throws Exception {
        InputStream userInputStream = null;
        InputStream roleInputStream = null;
        try{
            userInputStream = getClass().getClassLoader().getResourceAsStream(userFileName);
            if(null == userInputStream) throw new Exception("initialzation user file not found: " + userFileName);

            roleInputStream = getClass().getClassLoader().getResourceAsStream(roleFileName);
            if(null == roleInputStream) throw new Exception("initialzation role file not found: " + roleFileName);

            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd HH:mm:ss")
                    .setPrettyPrinting()
                    .disableHtmlEscaping()
                    .create();
            //导入初始的系统超级管理员角色
            /*Type roleTokenType = new TypeToken<ArrayList<RoleDomain>>(){}.getType();

            ArrayList<RoleDomain> roleDomains = gson.fromJson(new InputStreamReader(roleInputStream,
                            StandardCharsets.UTF_8),
                            roleTokenType);*/

            //导入初始的系统超级管理员角色
            Type userTokenType = new TypeToken<ArrayList<UserDomain>>(){}.getType();
            ArrayList<UserDomain> userDomains = gson.fromJson(new InputStreamReader(userInputStream,
                            StandardCharsets.UTF_8),
                    userTokenType);
            for(UserDomain user : userDomains){
                userMapper.insert(user);
            }
        }finally {
            if(null != userInputStream) userInputStream.close();
            if(null != roleInputStream) roleInputStream.close();
        }


        return true;
    }
}
