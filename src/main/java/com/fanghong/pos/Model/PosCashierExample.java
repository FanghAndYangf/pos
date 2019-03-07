package com.fanghong.pos.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PosCashierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PosCashierExample() {
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

        public Criteria andCashierKeyIsNull() {
            addCriterion("CASHIER_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCashierKeyIsNotNull() {
            addCriterion("CASHIER_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCashierKeyEqualTo(Integer value) {
            addCriterion("CASHIER_KEY =", value, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyNotEqualTo(Integer value) {
            addCriterion("CASHIER_KEY <>", value, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyGreaterThan(Integer value) {
            addCriterion("CASHIER_KEY >", value, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASHIER_KEY >=", value, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyLessThan(Integer value) {
            addCriterion("CASHIER_KEY <", value, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyLessThanOrEqualTo(Integer value) {
            addCriterion("CASHIER_KEY <=", value, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyIn(List<Integer> values) {
            addCriterion("CASHIER_KEY in", values, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyNotIn(List<Integer> values) {
            addCriterion("CASHIER_KEY not in", values, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyBetween(Integer value1, Integer value2) {
            addCriterion("CASHIER_KEY between", value1, value2, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("CASHIER_KEY not between", value1, value2, "cashierKey");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordIsNull() {
            addCriterion("CASHIER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordIsNotNull() {
            addCriterion("CASHIER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordEqualTo(String value) {
            addCriterion("CASHIER_PASSWORD =", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotEqualTo(String value) {
            addCriterion("CASHIER_PASSWORD <>", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordGreaterThan(String value) {
            addCriterion("CASHIER_PASSWORD >", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CASHIER_PASSWORD >=", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordLessThan(String value) {
            addCriterion("CASHIER_PASSWORD <", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordLessThanOrEqualTo(String value) {
            addCriterion("CASHIER_PASSWORD <=", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordLike(String value) {
            addCriterion("CASHIER_PASSWORD like", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotLike(String value) {
            addCriterion("CASHIER_PASSWORD not like", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordIn(List<String> values) {
            addCriterion("CASHIER_PASSWORD in", values, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotIn(List<String> values) {
            addCriterion("CASHIER_PASSWORD not in", values, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordBetween(String value1, String value2) {
            addCriterion("CASHIER_PASSWORD between", value1, value2, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotBetween(String value1, String value2) {
            addCriterion("CASHIER_PASSWORD not between", value1, value2, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("USER_MOBILE =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("USER_MOBILE <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("USER_MOBILE >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("USER_MOBILE <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("USER_MOBILE like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("USER_MOBILE not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("USER_MOBILE in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("USER_MOBILE not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("USER_MOBILE between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("USER_MOBILE not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andCashierStatusIsNull() {
            addCriterion("CASHIER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCashierStatusIsNotNull() {
            addCriterion("CASHIER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCashierStatusEqualTo(String value) {
            addCriterion("CASHIER_STATUS =", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusNotEqualTo(String value) {
            addCriterion("CASHIER_STATUS <>", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusGreaterThan(String value) {
            addCriterion("CASHIER_STATUS >", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CASHIER_STATUS >=", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusLessThan(String value) {
            addCriterion("CASHIER_STATUS <", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusLessThanOrEqualTo(String value) {
            addCriterion("CASHIER_STATUS <=", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusLike(String value) {
            addCriterion("CASHIER_STATUS like", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusNotLike(String value) {
            addCriterion("CASHIER_STATUS not like", value, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusIn(List<String> values) {
            addCriterion("CASHIER_STATUS in", values, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusNotIn(List<String> values) {
            addCriterion("CASHIER_STATUS not in", values, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusBetween(String value1, String value2) {
            addCriterion("CASHIER_STATUS between", value1, value2, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andCashierStatusNotBetween(String value1, String value2) {
            addCriterion("CASHIER_STATUS not between", value1, value2, "cashierStatus");
            return (Criteria) this;
        }

        public Criteria andRegistTypeIsNull() {
            addCriterion("REGIST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRegistTypeIsNotNull() {
            addCriterion("REGIST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTypeEqualTo(String value) {
            addCriterion("REGIST_TYPE =", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeNotEqualTo(String value) {
            addCriterion("REGIST_TYPE <>", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeGreaterThan(String value) {
            addCriterion("REGIST_TYPE >", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REGIST_TYPE >=", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeLessThan(String value) {
            addCriterion("REGIST_TYPE <", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeLessThanOrEqualTo(String value) {
            addCriterion("REGIST_TYPE <=", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeLike(String value) {
            addCriterion("REGIST_TYPE like", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeNotLike(String value) {
            addCriterion("REGIST_TYPE not like", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeIn(List<String> values) {
            addCriterion("REGIST_TYPE in", values, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeNotIn(List<String> values) {
            addCriterion("REGIST_TYPE not in", values, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeBetween(String value1, String value2) {
            addCriterion("REGIST_TYPE between", value1, value2, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeNotBetween(String value1, String value2) {
            addCriterion("REGIST_TYPE not between", value1, value2, "registType");
            return (Criteria) this;
        }

        public Criteria andResourceFromIsNull() {
            addCriterion("RESOURCE_FROM is null");
            return (Criteria) this;
        }

        public Criteria andResourceFromIsNotNull() {
            addCriterion("RESOURCE_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andResourceFromEqualTo(String value) {
            addCriterion("RESOURCE_FROM =", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromNotEqualTo(String value) {
            addCriterion("RESOURCE_FROM <>", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromGreaterThan(String value) {
            addCriterion("RESOURCE_FROM >", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_FROM >=", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromLessThan(String value) {
            addCriterion("RESOURCE_FROM <", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_FROM <=", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromLike(String value) {
            addCriterion("RESOURCE_FROM like", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromNotLike(String value) {
            addCriterion("RESOURCE_FROM not like", value, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromIn(List<String> values) {
            addCriterion("RESOURCE_FROM in", values, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromNotIn(List<String> values) {
            addCriterion("RESOURCE_FROM not in", values, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromBetween(String value1, String value2) {
            addCriterion("RESOURCE_FROM between", value1, value2, "resourceFrom");
            return (Criteria) this;
        }

        public Criteria andResourceFromNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_FROM not between", value1, value2, "resourceFrom");
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