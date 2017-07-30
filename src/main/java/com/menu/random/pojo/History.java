package com.menu.random.pojo;

import java.io.Serializable;
import java.util.Date;

public class History implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String hisrotyData;

    private String createdBy;

    private Date createdDt;

    private String updatedBy;

    private Date updatedDt;

    private Long version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHisrotyData() {
        return hisrotyData;
    }

    public void setHisrotyData(String hisrotyData) {
        this.hisrotyData = hisrotyData;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}