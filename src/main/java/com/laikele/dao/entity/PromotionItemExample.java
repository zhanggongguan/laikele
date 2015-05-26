package com.laikele.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromotionItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionItemExample() {
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

        public Criteria andPromotionIdIsNull() {
            addCriterion("promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIsNotNull() {
            addCriterion("promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionIdEqualTo(Long value) {
            addCriterion("promotion_id =", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotEqualTo(Long value) {
            addCriterion("promotion_id <>", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThan(Long value) {
            addCriterion("promotion_id >", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("promotion_id >=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThan(Long value) {
            addCriterion("promotion_id <", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdLessThanOrEqualTo(Long value) {
            addCriterion("promotion_id <=", value, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdIn(List<Long> values) {
            addCriterion("promotion_id in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotIn(List<Long> values) {
            addCriterion("promotion_id not in", values, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdBetween(Long value1, Long value2) {
            addCriterion("promotion_id between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPromotionIdNotBetween(Long value1, Long value2) {
            addCriterion("promotion_id not between", value1, value2, "promotionId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(Long value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(Long value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(Long value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(Long value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(Long value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<Long> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<Long> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(Long value1, Long value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(Long value1, Long value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIsNull() {
            addCriterion("promotion_item is null");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIsNotNull() {
            addCriterion("promotion_item is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionItemEqualTo(String value) {
            addCriterion("promotion_item =", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemNotEqualTo(String value) {
            addCriterion("promotion_item <>", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemGreaterThan(String value) {
            addCriterion("promotion_item >", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_item >=", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemLessThan(String value) {
            addCriterion("promotion_item <", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemLessThanOrEqualTo(String value) {
            addCriterion("promotion_item <=", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemLike(String value) {
            addCriterion("promotion_item like", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemNotLike(String value) {
            addCriterion("promotion_item not like", value, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemIn(List<String> values) {
            addCriterion("promotion_item in", values, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemNotIn(List<String> values) {
            addCriterion("promotion_item not in", values, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemBetween(String value1, String value2) {
            addCriterion("promotion_item between", value1, value2, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionItemNotBetween(String value1, String value2) {
            addCriterion("promotion_item not between", value1, value2, "promotionItem");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNull() {
            addCriterion("promotion_info is null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNotNull() {
            addCriterion("promotion_info is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoEqualTo(String value) {
            addCriterion("promotion_info =", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotEqualTo(String value) {
            addCriterion("promotion_info <>", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThan(String value) {
            addCriterion("promotion_info >", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_info >=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThan(String value) {
            addCriterion("promotion_info <", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThanOrEqualTo(String value) {
            addCriterion("promotion_info <=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLike(String value) {
            addCriterion("promotion_info like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotLike(String value) {
            addCriterion("promotion_info not like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIn(List<String> values) {
            addCriterion("promotion_info in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotIn(List<String> values) {
            addCriterion("promotion_info not in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoBetween(String value1, String value2) {
            addCriterion("promotion_info between", value1, value2, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotBetween(String value1, String value2) {
            addCriterion("promotion_info not between", value1, value2, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionImageIsNull() {
            addCriterion("promotion_image is null");
            return (Criteria) this;
        }

        public Criteria andPromotionImageIsNotNull() {
            addCriterion("promotion_image is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionImageEqualTo(String value) {
            addCriterion("promotion_image =", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotEqualTo(String value) {
            addCriterion("promotion_image <>", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageGreaterThan(String value) {
            addCriterion("promotion_image >", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_image >=", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageLessThan(String value) {
            addCriterion("promotion_image <", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageLessThanOrEqualTo(String value) {
            addCriterion("promotion_image <=", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageLike(String value) {
            addCriterion("promotion_image like", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotLike(String value) {
            addCriterion("promotion_image not like", value, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageIn(List<String> values) {
            addCriterion("promotion_image in", values, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotIn(List<String> values) {
            addCriterion("promotion_image not in", values, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageBetween(String value1, String value2) {
            addCriterion("promotion_image between", value1, value2, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andPromotionImageNotBetween(String value1, String value2) {
            addCriterion("promotion_image not between", value1, value2, "promotionImage");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
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