package com.hpe.ddc.framework.model;

import com.hpe.ddc.framework.dto.IReqDTO;
import com.hpe.ddc.framework.dto.IRespDTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TOrder implements IRespDTO, Serializable, IReqDTO {
    private Long orderId;

    private Long companyId;

    private Date prepayEndTime;

    private Date payNotifyTime;

    private Date payEndTime;

    private String status;

    private BigDecimal totalFee;

    private String pickupCode;

    private String wechatAccount;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getPrepayEndTime() {
        return prepayEndTime;
    }

    public void setPrepayEndTime(Date prepayEndTime) {
        this.prepayEndTime = prepayEndTime;
    }

    public Date getPayNotifyTime() {
        return payNotifyTime;
    }

    public void setPayNotifyTime(Date payNotifyTime) {
        this.payNotifyTime = payNotifyTime;
    }

    public Date getPayEndTime() {
        return payEndTime;
    }

    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public String getPickupCode() {
        return pickupCode;
    }

    public void setPickupCode(String pickupCode) {
        this.pickupCode = pickupCode;
    }

    public String getWechatAccount() {
        return wechatAccount;
    }

    public void setWechatAccount(String wechatAccount) {
        this.wechatAccount = wechatAccount;
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
        TOrder other = (TOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getPrepayEndTime() == null ? other.getPrepayEndTime() == null : this.getPrepayEndTime().equals(other.getPrepayEndTime()))
            && (this.getPayNotifyTime() == null ? other.getPayNotifyTime() == null : this.getPayNotifyTime().equals(other.getPayNotifyTime()))
            && (this.getPayEndTime() == null ? other.getPayEndTime() == null : this.getPayEndTime().equals(other.getPayEndTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getPickupCode() == null ? other.getPickupCode() == null : this.getPickupCode().equals(other.getPickupCode()))
            && (this.getWechatAccount() == null ? other.getWechatAccount() == null : this.getWechatAccount().equals(other.getWechatAccount()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getPrepayEndTime() == null) ? 0 : getPrepayEndTime().hashCode());
        result = prime * result + ((getPayNotifyTime() == null) ? 0 : getPayNotifyTime().hashCode());
        result = prime * result + ((getPayEndTime() == null) ? 0 : getPayEndTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getPickupCode() == null) ? 0 : getPickupCode().hashCode());
        result = prime * result + ((getWechatAccount() == null) ? 0 : getWechatAccount().hashCode());
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
        sb.append(", orderId=").append(orderId);
        sb.append(", companyId=").append(companyId);
        sb.append(", prepayEndTime=").append(prepayEndTime);
        sb.append(", payNotifyTime=").append(payNotifyTime);
        sb.append(", payEndTime=").append(payEndTime);
        sb.append(", status=").append(status);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", pickupCode=").append(pickupCode);
        sb.append(", wechatAccount=").append(wechatAccount);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}