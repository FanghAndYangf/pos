package com.fanghong.pos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class UserAndRoleDomain {
    private Integer roleUserKey;        //用户-角色 关联关系主键
    private Integer userKey;            //用户主键
    private Integer roleKey;            //角色主键
    private Date createts;              //创建时间
    private Date modifyts;              //更新时间
}
