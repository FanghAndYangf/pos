package com.fanghong.pos.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

@Data
@NoArgsConstructor
public class UserDomain implements UserDetails {

    //public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    private Integer userKey;        //用户主键
    private Date createts;      //创建日期
    private Date modifyts;      //修改日期
    private String nickName;        //用户真实姓名
    private String username;        //用户登陆id
    @JsonIgnore
    private String password;        //用户登陆密码
    private String deptId;      //用户所在部门
    private String userMobile;      //用户手机号码
    private String resourceFrom;        //用户来源
    private String userStatus;      //用户状态
    private String userType;        //用户类型
    private String createUserId;        //用户创建者
    private String modifyUserId;        //用户更新者
    private Map<String,Object> associatedResources = new HashMap<>();       //该用户关联的企业/区块id
    private List<String> favourite = new ArrayList<>();         //用户关注的企业列表
    private List<String> roles = new ArrayList<>();     //用户初始化用户权限
    private List<RoleDomain> roleDomainList;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
