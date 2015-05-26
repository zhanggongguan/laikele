package com.laikele.dao.entity;

public class CommodityPromotionItem extends CommodityPromotionItemKey {
    private Long discount;

    private Long discountPrice;

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Long discountPrice) {
        this.discountPrice = discountPrice;
    }
}