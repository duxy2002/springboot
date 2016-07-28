package com.hpe.ddc.framework.model;

import com.hpe.ddc.framework.dto.IReqDTO;
import com.hpe.ddc.framework.dto.IRespDTO;
import java.io.Serializable;
import java.util.Date;

public class TPersistentLogins implements IRespDTO, Serializable, IReqDTO {
    private String series;

    private String username;

    private String token;

    private Date lastUsed;

    private static final long serialVersionUID = 1L;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
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
        TPersistentLogins other = (TPersistentLogins) that;
        return (this.getSeries() == null ? other.getSeries() == null : this.getSeries().equals(other.getSeries()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getLastUsed() == null ? other.getLastUsed() == null : this.getLastUsed().equals(other.getLastUsed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeries() == null) ? 0 : getSeries().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getLastUsed() == null) ? 0 : getLastUsed().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", series=").append(series);
        sb.append(", username=").append(username);
        sb.append(", token=").append(token);
        sb.append(", lastUsed=").append(lastUsed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}