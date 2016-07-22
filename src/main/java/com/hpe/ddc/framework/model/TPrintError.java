package com.hpe.ddc.framework.model;

import com.hpe.ddc.framework.dto.IReqDTO;
import com.hpe.ddc.framework.dto.IRespDTO;
import java.io.Serializable;

public class TPrintError implements IRespDTO, Serializable, IReqDTO {
    private Integer errorCode;

    private String errorMessage;

    private String errorHelpUrl;

    private String errorTitle;

    private String errorCoverUrl;

    private static final long serialVersionUID = 1L;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorHelpUrl() {
        return errorHelpUrl;
    }

    public void setErrorHelpUrl(String errorHelpUrl) {
        this.errorHelpUrl = errorHelpUrl;
    }

    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }

    public String getErrorCoverUrl() {
        return errorCoverUrl;
    }

    public void setErrorCoverUrl(String errorCoverUrl) {
        this.errorCoverUrl = errorCoverUrl;
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
        TPrintError other = (TPrintError) that;
        return (this.getErrorCode() == null ? other.getErrorCode() == null : this.getErrorCode().equals(other.getErrorCode()))
            && (this.getErrorMessage() == null ? other.getErrorMessage() == null : this.getErrorMessage().equals(other.getErrorMessage()))
            && (this.getErrorHelpUrl() == null ? other.getErrorHelpUrl() == null : this.getErrorHelpUrl().equals(other.getErrorHelpUrl()))
            && (this.getErrorTitle() == null ? other.getErrorTitle() == null : this.getErrorTitle().equals(other.getErrorTitle()))
            && (this.getErrorCoverUrl() == null ? other.getErrorCoverUrl() == null : this.getErrorCoverUrl().equals(other.getErrorCoverUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        result = prime * result + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        result = prime * result + ((getErrorHelpUrl() == null) ? 0 : getErrorHelpUrl().hashCode());
        result = prime * result + ((getErrorTitle() == null) ? 0 : getErrorTitle().hashCode());
        result = prime * result + ((getErrorCoverUrl() == null) ? 0 : getErrorCoverUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", errorCode=").append(errorCode);
        sb.append(", errorMessage=").append(errorMessage);
        sb.append(", errorHelpUrl=").append(errorHelpUrl);
        sb.append(", errorTitle=").append(errorTitle);
        sb.append(", errorCoverUrl=").append(errorCoverUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}