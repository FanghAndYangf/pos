package com.fanghong.pos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PosExample() {
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

        public Criteria andPosKeyIsNull() {
            addCriterion("POS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPosKeyIsNotNull() {
            addCriterion("POS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPosKeyEqualTo(Integer value) {
            addCriterion("POS_KEY =", value, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyNotEqualTo(Integer value) {
            addCriterion("POS_KEY <>", value, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyGreaterThan(Integer value) {
            addCriterion("POS_KEY >", value, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("POS_KEY >=", value, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyLessThan(Integer value) {
            addCriterion("POS_KEY <", value, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyLessThanOrEqualTo(Integer value) {
            addCriterion("POS_KEY <=", value, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyIn(List<Integer> values) {
            addCriterion("POS_KEY in", values, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyNotIn(List<Integer> values) {
            addCriterion("POS_KEY not in", values, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyBetween(Integer value1, Integer value2) {
            addCriterion("POS_KEY between", value1, value2, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("POS_KEY not between", value1, value2, "posKey");
            return (Criteria) this;
        }

        public Criteria andPosMacIsNull() {
            addCriterion("POS_MAC is null");
            return (Criteria) this;
        }

        public Criteria andPosMacIsNotNull() {
            addCriterion("POS_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andPosMacEqualTo(String value) {
            addCriterion("POS_MAC =", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacNotEqualTo(String value) {
            addCriterion("POS_MAC <>", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacGreaterThan(String value) {
            addCriterion("POS_MAC >", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacGreaterThanOrEqualTo(String value) {
            addCriterion("POS_MAC >=", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacLessThan(String value) {
            addCriterion("POS_MAC <", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacLessThanOrEqualTo(String value) {
            addCriterion("POS_MAC <=", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacLike(String value) {
            addCriterion("POS_MAC like", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacNotLike(String value) {
            addCriterion("POS_MAC not like", value, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacIn(List<String> values) {
            addCriterion("POS_MAC in", values, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacNotIn(List<String> values) {
            addCriterion("POS_MAC not in", values, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacBetween(String value1, String value2) {
            addCriterion("POS_MAC between", value1, value2, "posMac");
            return (Criteria) this;
        }

        public Criteria andPosMacNotBetween(String value1, String value2) {
            addCriterion("POS_MAC not between", value1, value2, "posMac");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNull() {
            addCriterion("HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("HOST_NAME =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("HOST_NAME <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("HOST_NAME >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_NAME >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("HOST_NAME <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("HOST_NAME <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("HOST_NAME like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("HOST_NAME not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("HOST_NAME in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("HOST_NAME not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("HOST_NAME between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("HOST_NAME not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNull() {
            addCriterion("POS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNotNull() {
            addCriterion("POS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPosNameEqualTo(String value) {
            addCriterion("POS_NAME =", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotEqualTo(String value) {
            addCriterion("POS_NAME <>", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThan(String value) {
            addCriterion("POS_NAME >", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThanOrEqualTo(String value) {
            addCriterion("POS_NAME >=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThan(String value) {
            addCriterion("POS_NAME <", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThanOrEqualTo(String value) {
            addCriterion("POS_NAME <=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLike(String value) {
            addCriterion("POS_NAME like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotLike(String value) {
            addCriterion("POS_NAME not like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameIn(List<String> values) {
            addCriterion("POS_NAME in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotIn(List<String> values) {
            addCriterion("POS_NAME not in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameBetween(String value1, String value2) {
            addCriterion("POS_NAME between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotBetween(String value1, String value2) {
            addCriterion("POS_NAME not between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andPosTypeIsNull() {
            addCriterion("POS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPosTypeIsNotNull() {
            addCriterion("POS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPosTypeEqualTo(String value) {
            addCriterion("POS_TYPE =", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotEqualTo(String value) {
            addCriterion("POS_TYPE <>", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeGreaterThan(String value) {
            addCriterion("POS_TYPE >", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POS_TYPE >=", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeLessThan(String value) {
            addCriterion("POS_TYPE <", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeLessThanOrEqualTo(String value) {
            addCriterion("POS_TYPE <=", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeLike(String value) {
            addCriterion("POS_TYPE like", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotLike(String value) {
            addCriterion("POS_TYPE not like", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeIn(List<String> values) {
            addCriterion("POS_TYPE in", values, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotIn(List<String> values) {
            addCriterion("POS_TYPE not in", values, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeBetween(String value1, String value2) {
            addCriterion("POS_TYPE between", value1, value2, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotBetween(String value1, String value2) {
            addCriterion("POS_TYPE not between", value1, value2, "posType");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("STORE_ID like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("STORE_ID not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andPosStatusIsNull() {
            addCriterion("POS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPosStatusIsNotNull() {
            addCriterion("POS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPosStatusEqualTo(String value) {
            addCriterion("POS_STATUS =", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotEqualTo(String value) {
            addCriterion("POS_STATUS <>", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusGreaterThan(String value) {
            addCriterion("POS_STATUS >", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusGreaterThanOrEqualTo(String value) {
            addCriterion("POS_STATUS >=", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLessThan(String value) {
            addCriterion("POS_STATUS <", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLessThanOrEqualTo(String value) {
            addCriterion("POS_STATUS <=", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLike(String value) {
            addCriterion("POS_STATUS like", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotLike(String value) {
            addCriterion("POS_STATUS not like", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusIn(List<String> values) {
            addCriterion("POS_STATUS in", values, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotIn(List<String> values) {
            addCriterion("POS_STATUS not in", values, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusBetween(String value1, String value2) {
            addCriterion("POS_STATUS between", value1, value2, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotBetween(String value1, String value2) {
            addCriterion("POS_STATUS not between", value1, value2, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeIsNull() {
            addCriterion("POS_ORGANIZATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeIsNotNull() {
            addCriterion("POS_ORGANIZATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeEqualTo(String value) {
            addCriterion("POS_ORGANIZATION_CODE =", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeNotEqualTo(String value) {
            addCriterion("POS_ORGANIZATION_CODE <>", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeGreaterThan(String value) {
            addCriterion("POS_ORGANIZATION_CODE >", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POS_ORGANIZATION_CODE >=", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeLessThan(String value) {
            addCriterion("POS_ORGANIZATION_CODE <", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("POS_ORGANIZATION_CODE <=", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeLike(String value) {
            addCriterion("POS_ORGANIZATION_CODE like", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeNotLike(String value) {
            addCriterion("POS_ORGANIZATION_CODE not like", value, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeIn(List<String> values) {
            addCriterion("POS_ORGANIZATION_CODE in", values, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeNotIn(List<String> values) {
            addCriterion("POS_ORGANIZATION_CODE not in", values, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeBetween(String value1, String value2) {
            addCriterion("POS_ORGANIZATION_CODE between", value1, value2, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPosOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("POS_ORGANIZATION_CODE not between", value1, value2, "posOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagIsNull() {
            addCriterion("PRE_PAID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagIsNotNull() {
            addCriterion("PRE_PAID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagEqualTo(String value) {
            addCriterion("PRE_PAID_FLAG =", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagNotEqualTo(String value) {
            addCriterion("PRE_PAID_FLAG <>", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagGreaterThan(String value) {
            addCriterion("PRE_PAID_FLAG >", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_PAID_FLAG >=", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagLessThan(String value) {
            addCriterion("PRE_PAID_FLAG <", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagLessThanOrEqualTo(String value) {
            addCriterion("PRE_PAID_FLAG <=", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagLike(String value) {
            addCriterion("PRE_PAID_FLAG like", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagNotLike(String value) {
            addCriterion("PRE_PAID_FLAG not like", value, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagIn(List<String> values) {
            addCriterion("PRE_PAID_FLAG in", values, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagNotIn(List<String> values) {
            addCriterion("PRE_PAID_FLAG not in", values, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagBetween(String value1, String value2) {
            addCriterion("PRE_PAID_FLAG between", value1, value2, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andPrePaidFlagNotBetween(String value1, String value2) {
            addCriterion("PRE_PAID_FLAG not between", value1, value2, "prePaidFlag");
            return (Criteria) this;
        }

        public Criteria andCreatetsIsNull() {
            addCriterion("CREATETS is null");
            return (Criteria) this;
        }

        public Criteria andCreatetsIsNotNull() {
            addCriterion("CREATETS is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetsEqualTo(Date value) {
            addCriterion("CREATETS =", value, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsNotEqualTo(Date value) {
            addCriterion("CREATETS <>", value, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsGreaterThan(Date value) {
            addCriterion("CREATETS >", value, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETS >=", value, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsLessThan(Date value) {
            addCriterion("CREATETS <", value, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsLessThanOrEqualTo(Date value) {
            addCriterion("CREATETS <=", value, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsIn(List<Date> values) {
            addCriterion("CREATETS in", values, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsNotIn(List<Date> values) {
            addCriterion("CREATETS not in", values, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsBetween(Date value1, Date value2) {
            addCriterion("CREATETS between", value1, value2, "createts");
            return (Criteria) this;
        }

        public Criteria andCreatetsNotBetween(Date value1, Date value2) {
            addCriterion("CREATETS not between", value1, value2, "createts");
            return (Criteria) this;
        }

        public Criteria andModifiytsIsNull() {
            addCriterion("MODIFIYTS is null");
            return (Criteria) this;
        }

        public Criteria andModifiytsIsNotNull() {
            addCriterion("MODIFIYTS is not null");
            return (Criteria) this;
        }

        public Criteria andModifiytsEqualTo(Date value) {
            addCriterion("MODIFIYTS =", value, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsNotEqualTo(Date value) {
            addCriterion("MODIFIYTS <>", value, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsGreaterThan(Date value) {
            addCriterion("MODIFIYTS >", value, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIYTS >=", value, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsLessThan(Date value) {
            addCriterion("MODIFIYTS <", value, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIYTS <=", value, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsIn(List<Date> values) {
            addCriterion("MODIFIYTS in", values, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsNotIn(List<Date> values) {
            addCriterion("MODIFIYTS not in", values, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsBetween(Date value1, Date value2) {
            addCriterion("MODIFIYTS between", value1, value2, "modifiyts");
            return (Criteria) this;
        }

        public Criteria andModifiytsNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIYTS not between", value1, value2, "modifiyts");
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