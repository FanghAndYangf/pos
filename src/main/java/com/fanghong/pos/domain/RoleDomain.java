package com.fanghong.pos.domain;


import lombok.Data;

import java.util.Date;

@Data
public class RoleDomain {

    private Integer roleKey;     //主键
    private Date createts;      //创建日期
    private Date modifyts;      //修改日期
    private boolean isRemoved = false;      //是否被移除
    private String name;        //角色名，用于权限校验
    private String nickname;        //角色中文名,用于显示
    private String description;     //角色描述信息
    private boolean builtIn = false;        //是否为内置
    private boolean banned = false;     //角色状态，是否已禁用
    //private List<JsonPermissions.SimplePermission> permissions;       //角色可进行操作列表
    private String createUserId;        //角色创建者
    private String modifyUserId;        //角色更新者
    /**
     * Spring Security 4.0以上版本角色都默认以'ROLE_'开头
     * @param name
     */
    public void setName(String name){
        if(name.indexOf("ROLE_") == -1){
            this.name = "ROLE_".concat(name);
        }else{
            this.name = name;
        }
    }
}
