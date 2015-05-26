package com.laikele.dao.entity;

import java.util.Date;

public class PromotionItem {
    private Long promotionItemId;

    private Long promotionId;

    private Long placeId;

    private String promotionItem;

    private String promotionInfo;

    private String promotionImage;

    private Byte active;

    private Date createDate;

    private Date lastUpdate;

    public Long getPromotionItemId() {
        return promotionItemId;
    }

    public void setPromotionItemId(Long promotionItemId) {
        this.promotionItemId = promotionItemId;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public String getPromotionItem() {
        return promotionItem;
    }

    public void setPromotionItem(String promotionItem) {
        this.promotionItem = promotionItem == null ? null : promotionItem.trim();
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    public String getPromotionImage() {
        return promotionImage;
    }

    public void setPromotionImage(String promotionImage) {
        this.promotionImage = promotionImage == null ? null : promotionImage.trim();
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