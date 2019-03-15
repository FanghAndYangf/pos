package com.fanghong.pos.model;

import java.util.Date;

public class Pos {
    private Integer posKey;

    private String posMac;

    private String hostName;

    private String ip;

    private String posName;

    private String posType;

    private String storeId;

    private String posStatus;

    private String posOrganizationCode;

    private String prePaidFlag;

    private Date createts;

    private Date modifyts;

    public Integer getPosKey() {
        return posKey;
    }

    public void setPosKey(Integer posKey) {
        this.posKey = posKey;
    }

    public String getPosMac() {
        return posMac;
    }

    public void setPosMac(String posMac) {
        this.posMac = posMac == null ? null : posMac.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName == null ? null : posName.trim();
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType == null ? null : posType.trim();
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus == null ? null : posStatus.trim();
    }

    public String getPosOrganizationCode() {
        return posOrganizationCode;
    }

    public void setPosOrganizationCode(String posOrganizationCode) {
        this.posOrganizationCode = posOrganizationCode == null ? null : posOrganizationCode.trim();
    }

    public String getPrePaidFlag() {
        return prePaidFlag;
    }

    public void setPrePaidFlag(String prePaidFlag) {
        this.prePaidFlag = prePaidFlag == null ? null : prePaidFlag.trim();
    }

    public Date getCreatets() {
        return createts;
    }

    public void setCreatets(Date createts) {
        this.createts = createts;
    }

    public Date getModifyts() {
        return modifyts;
    }

    public void setModifyts(Date modifyts) {
        this.modifyts = modifyts;
    }
}