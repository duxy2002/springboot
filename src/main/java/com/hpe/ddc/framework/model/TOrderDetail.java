package com.hpe.ddc.framework.model;

import com.hpe.ddc.framework.dto.IReqDTO;
import com.hpe.ddc.framework.dto.IRespDTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TOrderDetail implements IRespDTO, Serializable, IReqDTO {
    private Long id;

    private Long orderId;

    private String fileType;

    private Long pictureId;

    private Long printerId;

    private String status;

    private Date printEndDate;

    private Integer printErrorCode;

    private BigDecimal fee;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPrinterId() {
        return printerId;
    }

    public void setPrinterId(Long printerId) {
        this.printerId = printerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPrintEndDate() {
        return printEndDate;
    }

    public void setPrintEndDate(Date printEndDate) {
        this.printEndDate = printEndDate;
    }

    public Integer getPrintErrorCode() {
        return printErrorCode;
    }

    public void setPrintErrorCode(Integer printErrorCode) {
        this.printErrorCode = printErrorCode;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
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
        TOrderDetail other = (TOrderDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getPictureId() == null ? other.getPictureId() == null : this.getPictureId().equals(other.getPictureId()))
            && (this.getPrinterId() == null ? other.getPrinterId() == null : this.getPrinterId().equals(other.getPrinterId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPrintEndDate() == null ? other.getPrintEndDate() == null : this.getPrintEndDate().equals(other.getPrintEndDate()))
            && (this.getPrintErrorCode() == null ? other.getPrintErrorCode() == null : this.getPrintErrorCode().equals(other.getPrintErrorCode()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getPictureId() == null) ? 0 : getPictureId().hashCode());
        result = prime * result + ((getPrinterId() == null) ? 0 : getPrinterId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPrintEndDate() == null) ? 0 : getPrintEndDate().hashCode());
        result = prime * result + ((getPrintErrorCode() == null) ? 0 : getPrintErrorCode().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
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
        sb.append(", orderId=").append(orderId);
        sb.append(", fileType=").append(fileType);
        sb.append(", pictureId=").append(pictureId);
        sb.append(", printerId=").append(printerId);
        sb.append(", status=").append(status);
        sb.append(", printEndDate=").append(printEndDate);
        sb.append(", printErrorCode=").append(printErrorCode);
        sb.append(", fee=").append(fee);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}