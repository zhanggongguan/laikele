package com.laikele.dao.entity;

import java.util.Date;

public class PromotionEffect {
    private Long promotionEffectId;

    private Long pv;

    private Long uv;

    private Long click;

    private Date createDate;

    private Date lastUpdate;

    private Long promotionItemId;

    public Long getPromotionEffectId() {
        return promotionEffectId;
    }

    public void setPromotionEffectId(Long promotionEffectId) {
        this.promotionEffectId = promotionEffectId;
    }

    public Long getPv() {
        return pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public Long getUv() {
        return uv;
    }

    public void setUv(Long uv) {
        this.uv = uv;
    }

    public Long getClick() {
        return click;
    }

    public void setClick(Long click) {
        this.click = click;
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

    public Long getPromotionItemId() {
        return promotionItemId;
    }

    public void setPromotionItemId(Long promotionItemId) {
        this.promotionItemId = promotionItemId;
    }
}