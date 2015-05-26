package com.laikele.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromotionTipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionTipExample() {
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

        public Criteria andTipIdIsNull() {
            addCriterion("tip_id is null");
            return (Criteria) this;
        }

        public Criteria andTipIdIsNotNull() {
            addCriterion("tip_id is not null");
            return (Criteria) this;
        }

        public Criteria andTipIdEqualTo(Long value) {
            addCriterion("tip_id =", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdNotEqualTo(Long value) {
            addCriterion("tip_id <>", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdGreaterThan(Long value) {
            addCriterion("tip_id >", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tip_id >=", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdLessThan(Long value) {
            addCriterion("tip_id <", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdLessThanOrEqualTo(Long value) {
            addCriterion("tip_id <=", value, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdIn(List<Long> values) {
            addCriterion("tip_id in", values, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdNotIn(List<Long> values) {
            addCriterion("tip_id not in", values, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdBetween(Long value1, Long value2) {
            addCriterion("tip_id between", value1, value2, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIdNotBetween(Long value1, Long value2) {
            addCriterion("tip_id not between", value1, value2, "tipId");
            return (Criteria) this;
        }

        public Criteria andTipIsNull() {
            addCriterion("tip is null");
            return (Criteria) this;
        }

        public Criteria andTipIsNotNull() {
            addCriterion("tip is not null");
            return (Criteria) this;
        }

        public Criteria andTipEqualTo(String value) {
            addCriterion("tip =", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotEqualTo(String value) {
            addCriterion("tip <>", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThan(String value) {
            addCriterion("tip >", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThanOrEqualTo(String value) {
            addCriterion("tip >=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThan(String value) {
            addCriterion("tip <", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThanOrEqualTo(String value) {
            addCriterion("tip <=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLike(String value) {
            addCriterion("tip like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotLike(String value) {
            addCriterion("tip not like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipIn(List<String> values) {
            addCriterion("tip in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotIn(List<String> values) {
            addCriterion("tip not in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipBetween(String value1, String value2) {
            addCriterion("tip between", value1, value2, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotBetween(String value1, String value2) {
            addCriterion("tip not between", value1, value2, "tip");
            return (Criteria) this;
        }

        public Criteria andTipDescIsNull() {
            addCriterion("tip_desc is null");
            return (Criteria) this;
        }

        public Criteria andTipDescIsNotNull() {
            addCriterion("tip_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTipDescEqualTo(String value) {
            addCriterion("tip_desc =", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescNotEqualTo(String value) {
            addCriterion("tip_desc <>", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescGreaterThan(String value) {
            addCriterion("tip_desc >", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescGreaterThanOrEqualTo(String value) {
            addCriterion("tip_desc >=", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescLessThan(String value) {
            addCriterion("tip_desc <", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescLessThanOrEqualTo(String value) {
            addCriterion("tip_desc <=", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescLike(String value) {
            addCriterion("tip_desc like", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescNotLike(String value) {
            addCriterion("tip_desc not like", value, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescIn(List<String> values) {
            addCriterion("tip_desc in", values, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescNotIn(List<String> values) {
            addCriterion("tip_desc not in", values, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescBetween(String value1, String value2) {
            addCriterion("tip_desc between", value1, value2, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipDescNotBetween(String value1, String value2) {
            addCriterion("tip_desc not between", value1, value2, "tipDesc");
            return (Criteria) this;
        }

        public Criteria andTipImageIsNull() {
            addCriterion("tip_image is null");
            return (Criteria) this;
        }

        public Criteria andTipImageIsNotNull() {
            addCriterion("tip_image is not null");
            return (Criteria) this;
        }

        public Criteria andTipImageEqualTo(String value) {
            addCriterion("tip_image =", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageNotEqualTo(String value) {
            addCriterion("tip_image <>", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageGreaterThan(String value) {
            addCriterion("tip_image >", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageGreaterThanOrEqualTo(String value) {
            addCriterion("tip_image >=", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageLessThan(String value) {
            addCriterion("tip_image <", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageLessThanOrEqualTo(String value) {
            addCriterion("tip_image <=", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageLike(String value) {
            addCriterion("tip_image like", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageNotLike(String value) {
            addCriterion("tip_image not like", value, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageIn(List<String> values) {
            addCriterion("tip_image in", values, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageNotIn(List<String> values) {
            addCriterion("tip_image not in", values, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageBetween(String value1, String value2) {
            addCriterion("tip_image between", value1, value2, "tipImage");
            return (Criteria) this;
        }

        public Criteria andTipImageNotBetween(String value1, String value2) {
            addCriterion("tip_image not between", value1, value2, "tipImage");
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