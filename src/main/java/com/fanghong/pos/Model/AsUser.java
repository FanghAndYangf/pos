package com.fanghong.pos.Model;

import java.util.Date;

public class AsUser {
    private Integer userKey;

    private String userId;

    private String loginId;

    private String userName;

    private String userMobile;

    private String deptId;

    private String userStatus;

    private String registType;

    private String resourceFrom;

    private Date createts;

    private Date modifiyts;

    public Integer getUserKey() {
        return userKey;
    }

    public void setUserKey(Integer userKey) {
        this.userKey = userKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getRegistType() {
        return registType;
    }

    public void setRegistType(String registType) {
        this.registType = registType == null ? null : registType.trim();
    }

    public String getResourceFrom() {
        return resourceFrom;
    }

    public void setResourceFrom(String resourceFrom) {
        this.resourceFrom = resourceFrom == null ? null : resourceFrom.trim();
    }

    public Date getCreatets() {
        return createts;
    }

    public void setCreatets(Date createts) {
        this.createts = createts;
    }

    public Date getModifiyts() {
        return modifiyts;
    }

    public void setModifiyts(Date modifiyts) {
        this.modifiyts = modifiyts;
    }
}