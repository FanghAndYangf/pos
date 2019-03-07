package com.fanghong.pos.Model;

import java.util.Date;

public class Cashier {
    private Integer cashierKey;

    private String cashierPassword;

    private String userId;

    private String userPassword;

    private String userName;

    private String userMobile;

    private String deptId;

    private String cashierStatus;

    private String registType;

    private String resourceFrom;

    private Date createts;

    private Date modifiyts;

    public Integer getCashierKey() {
        return cashierKey;
    }

    public void setCashierKey(Integer cashierKey) {
        this.cashierKey = cashierKey;
    }

    public String getCashierPassword() {
        return cashierPassword;
    }

    public void setCashierPassword(String cashierPassword) {
        this.cashierPassword = cashierPassword == null ? null : cashierPassword.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
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

    public String getCashierStatus() {
        return cashierStatus;
    }

    public void setCashierStatus(String cashierStatus) {
        this.cashierStatus = cashierStatus == null ? null : cashierStatus.trim();
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