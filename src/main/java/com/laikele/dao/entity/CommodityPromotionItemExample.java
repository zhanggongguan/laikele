package com.laikele.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class CommodityPromotionItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityPromotionItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdIsNull() {
            addCriterion("promotion_item_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdIsNotNull() {
            addCriterion("promotion_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdEqualTo(Long value) {
            addCriterion("promotion_item_id =", value, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdNotEqualTo(Long value) {
            addCriterion("promotion_item_id <>", value, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdGreaterThan(Long value) {
            addCriterion("promotion_item_id >", value, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("promotion_item_id >=", value, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdLessThan(Long value) {
            addCriterion("promotion_item_id <", value, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdLessThanOrEqualTo(Long value) {
            addCriterion("promotion_item_id <=", value, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdIn(List<Long> values) {
            addCriterion("promotion_item_id in", values, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdNotIn(List<Long> values) {
            addCriterion("promotion_item_id not in", values, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdBetween(Long value1, Long value2) {
            addCriterion("promotion_item_id between", value1, value2, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIdNotBetween(Long value1, Long value2) {
            addCriterion("promotion_item_id not between", value1, value2, "promotionItemId");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Long value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Long value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Long value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Long value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Long value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Long value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Long> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Long> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Long value1, Long value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Long value1, Long value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(Long value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(Long value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(Long value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(Long value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(Long value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<Long> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<Long> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(Long value1, Long value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(Long value1, Long value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}