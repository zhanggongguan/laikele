package com.laikele.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Long value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Long value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Long value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Long value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Long> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Long> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Long value1, Long value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("store is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("store is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(String value) {
            addCriterion("store =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(String value) {
            addCriterion("store <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(String value) {
            addCriterion("store >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(String value) {
            addCriterion("store >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(String value) {
            addCriterion("store <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(String value) {
            addCriterion("store <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLike(String value) {
            addCriterion("store like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotLike(String value) {
            addCriterion("store not like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<String> values) {
            addCriterion("store in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<String> values) {
            addCriterion("store not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(String value1, String value2) {
            addCriterion("store between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(String value1, String value2) {
            addCriterion("store not between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andLogoImageIsNull() {
            addCriterion("logo_image is null");
            return (Criteria) this;
        }

        public Criteria andLogoImageIsNotNull() {
            addCriterion("logo_image is not null");
            return (Criteria) this;
        }

        public Criteria andLogoImageEqualTo(String value) {
            addCriterion("logo_image =", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotEqualTo(String value) {
            addCriterion("logo_image <>", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageGreaterThan(String value) {
            addCriterion("logo_image >", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageGreaterThanOrEqualTo(String value) {
            addCriterion("logo_image >=", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageLessThan(String value) {
            addCriterion("logo_image <", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageLessThanOrEqualTo(String value) {
            addCriterion("logo_image <=", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageLike(String value) {
            addCriterion("logo_image like", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotLike(String value) {
            addCriterion("logo_image not like", value, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageIn(List<String> values) {
            addCriterion("logo_image in", values, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotIn(List<String> values) {
            addCriterion("logo_image not in", values, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageBetween(String value1, String value2) {
            addCriterion("logo_image between", value1, value2, "logoImage");
            return (Criteria) this;
        }

        public Criteria andLogoImageNotBetween(String value1, String value2) {
            addCriterion("logo_image not between", value1, value2, "logoImage");
            return (Criteria) this;
        }

        public Criteria andStoreDescIsNull() {
            addCriterion("store_desc is null");
            return (Criteria) this;
        }

        public Criteria andStoreDescIsNotNull() {
            addCriterion("store_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDescEqualTo(String value) {
            addCriterion("store_desc =", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotEqualTo(String value) {
            addCriterion("store_desc <>", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescGreaterThan(String value) {
            addCriterion("store_desc >", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescGreaterThanOrEqualTo(String value) {
            addCriterion("store_desc >=", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescLessThan(String value) {
            addCriterion("store_desc <", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescLessThanOrEqualTo(String value) {
            addCriterion("store_desc <=", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescLike(String value) {
            addCriterion("store_desc like", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotLike(String value) {
            addCriterion("store_desc not like", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescIn(List<String> values) {
            addCriterion("store_desc in", values, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotIn(List<String> values) {
            addCriterion("store_desc not in", values, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescBetween(String value1, String value2) {
            addCriterion("store_desc between", value1, value2, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotBetween(String value1, String value2) {
            addCriterion("store_desc not between", value1, value2, "storeDesc");
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
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