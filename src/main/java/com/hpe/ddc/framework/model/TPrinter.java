package com.hpe.ddc.framework.model;

import com.hpe.ddc.framework.dto.IReqDTO;
import com.hpe.ddc.framework.dto.IRespDTO;
import java.io.Serializable;
import java.util.Date;

public class TPrinter implements IRespDTO, Serializable, IReqDTO {
    private Long id;

    private String name;

    private String displayName;

    private String proxy;

    private String sn;

    private Long printerId;

    private String manufacture;

    private String model;

    private String setupUrl;

    private String supportUrl;

    private String updateUrl;

    private String firmware;

    private String localSettings;

    private String semacticState;

    private String userCode;

    private String capabilites;

    private String defaults;

    private String signature;

    private Integer status;

    private String address;

    private Long ownerId;

    private Long userId;

    private Long technianId;

    private String qrUrl;

    private Date expireDate;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Long getPrinterId() {
        return printerId;
    }

    public void setPrinterId(Long printerId) {
        this.printerId = printerId;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSetupUrl() {
        return setupUrl;
    }

    public void setSetupUrl(String setupUrl) {
        this.setupUrl = setupUrl;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public String getLocalSettings() {
        return localSettings;
    }

    public void setLocalSettings(String localSettings) {
        this.localSettings = localSettings;
    }

    public String getSemacticState() {
        return semacticState;
    }

    public void setSemacticState(String semacticState) {
        this.semacticState = semacticState;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getCapabilites() {
        return capabilites;
    }

    public void setCapabilites(String capabilites) {
        this.capabilites = capabilites;
    }

    public String getDefaults() {
        return defaults;
    }

    public void setDefaults(String defaults) {
        this.defaults = defaults;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTechnianId() {
        return technianId;
    }

    public void setTechnianId(Long technianId) {
        this.technianId = technianId;
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TPrinter other = (TPrinter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getProxy() == null ? other.getProxy() == null : this.getProxy().equals(other.getProxy()))
            && (this.getSn() == null ? other.getSn() == null : this.getSn().equals(other.getSn()))
            && (this.getPrinterId() == null ? other.getPrinterId() == null : this.getPrinterId().equals(other.getPrinterId()))
            && (this.getManufacture() == null ? other.getManufacture() == null : this.getManufacture().equals(other.getManufacture()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getSetupUrl() == null ? other.getSetupUrl() == null : this.getSetupUrl().equals(other.getSetupUrl()))
            && (this.getSupportUrl() == null ? other.getSupportUrl() == null : this.getSupportUrl().equals(other.getSupportUrl()))
            && (this.getUpdateUrl() == null ? other.getUpdateUrl() == null : this.getUpdateUrl().equals(other.getUpdateUrl()))
            && (this.getFirmware() == null ? other.getFirmware() == null : this.getFirmware().equals(other.getFirmware()))
            && (this.getLocalSettings() == null ? other.getLocalSettings() == null : this.getLocalSettings().equals(other.getLocalSettings()))
            && (this.getSemacticState() == null ? other.getSemacticState() == null : this.getSemacticState().equals(other.getSemacticState()))
            && (this.getUserCode() == null ? other.getUserCode() == null : this.getUserCode().equals(other.getUserCode()))
            && (this.getCapabilites() == null ? other.getCapabilites() == null : this.getCapabilites().equals(other.getCapabilites()))
            && (this.getDefaults() == null ? other.getDefaults() == null : this.getDefaults().equals(other.getDefaults()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTechnianId() == null ? other.getTechnianId() == null : this.getTechnianId().equals(other.getTechnianId()))
            && (this.getQrUrl() == null ? other.getQrUrl() == null : this.getQrUrl().equals(other.getQrUrl()))
            && (this.getExpireDate() == null ? other.getExpireDate() == null : this.getExpireDate().equals(other.getExpireDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getProxy() == null) ? 0 : getProxy().hashCode());
        result = prime * result + ((getSn() == null) ? 0 : getSn().hashCode());
        result = prime * result + ((getPrinterId() == null) ? 0 : getPrinterId().hashCode());
        result = prime * result + ((getManufacture() == null) ? 0 : getManufacture().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getSetupUrl() == null) ? 0 : getSetupUrl().hashCode());
        result = prime * result + ((getSupportUrl() == null) ? 0 : getSupportUrl().hashCode());
        result = prime * result + ((getUpdateUrl() == null) ? 0 : getUpdateUrl().hashCode());
        result = prime * result + ((getFirmware() == null) ? 0 : getFirmware().hashCode());
        result = prime * result + ((getLocalSettings() == null) ? 0 : getLocalSettings().hashCode());
        result = prime * result + ((getSemacticState() == null) ? 0 : getSemacticState().hashCode());
        result = prime * result + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        result = prime * result + ((getCapabilites() == null) ? 0 : getCapabilites().hashCode());
        result = prime * result + ((getDefaults() == null) ? 0 : getDefaults().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTechnianId() == null) ? 0 : getTechnianId().hashCode());
        result = prime * result + ((getQrUrl() == null) ? 0 : getQrUrl().hashCode());
        result = prime * result + ((getExpireDate() == null) ? 0 : getExpireDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", displayName=").append(displayName);
        sb.append(", proxy=").append(proxy);
        sb.append(", sn=").append(sn);
        sb.append(", printerId=").append(printerId);
        sb.append(", manufacture=").append(manufacture);
        sb.append(", model=").append(model);
        sb.append(", setupUrl=").append(setupUrl);
        sb.append(", supportUrl=").append(supportUrl);
        sb.append(", updateUrl=").append(updateUrl);
        sb.append(", firmware=").append(firmware);
        sb.append(", localSettings=").append(localSettings);
        sb.append(", semacticState=").append(semacticState);
        sb.append(", userCode=").append(userCode);
        sb.append(", capabilites=").append(capabilites);
        sb.append(", defaults=").append(defaults);
        sb.append(", signature=").append(signature);
        sb.append(", status=").append(status);
        sb.append(", address=").append(address);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", userId=").append(userId);
        sb.append(", technianId=").append(technianId);
        sb.append(", qrUrl=").append(qrUrl);
        sb.append(", expireDate=").append(expireDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}