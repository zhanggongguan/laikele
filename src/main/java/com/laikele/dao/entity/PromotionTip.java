package com.laikele.dao.entity;

import java.util.Date;

public class PromotionTip {
    private Long tipId;

    private String tip;

    private String tipDesc;

    private String tipImage;

    private Byte active;

    private Date createDate;

    private Date lastUpdate;

    public Long getTipId() {
        return tipId;
    }

    public void setTipId(Long tipId) {
        this.tipId = tipId;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public String getTipDesc() {
        return tipDesc;
    }

    public void setTipDesc(String tipDesc) {
        this.tipDesc = tipDesc == null ? null : tipDesc.trim();
    }

    public String getTipImage() {
        return tipImage;
    }

    public void setTipImage(String tipImage) {
        this.tipImage = tipImage == null ? null : tipImage.trim();
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}