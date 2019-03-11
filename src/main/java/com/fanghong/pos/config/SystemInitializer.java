package com.fanghong.pos.config;

import com.fanghong.pos.domain.RoleDomain;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
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

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    public boolean initialize() throws Exception {
        try{
            InputStream userInputStream = getClass().getClassLoader().getResourceAsStream(userFileName);
            if(null == userInputStream) throw new Exception("initialzation user file not found: " + userFileName);

            InputStream roleInputStream = getClass().getClassLoader().getResourceAsStream(roleFileName);
            if(null == roleInputStream) throw new Exception("initialzation role file not found: " + roleFileName);

            //导入初始的系统超级管理员角色
            Type roleTokenType = new TypeToken<ArrayList<RoleDomain>>(){}.getType();
            Gson gson = new GsonBuilder()
                    .serializeNulls()
                    .setDateFormat("yyyy-MM-dd HH:mm:ss")
                    .setPrettyPrinting()
                    .disableHtmlEscaping()
                    .create();
            ArrayList<RoleDomain> roleDomains = gson.fromJson(new InputStreamReader(roleInputStream,
                            StandardCharsets.UTF_8),
                            roleTokenType);

        }
    }
}
