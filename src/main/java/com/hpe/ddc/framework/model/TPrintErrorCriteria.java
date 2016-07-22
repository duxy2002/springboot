package com.hpe.ddc.framework.model;

import java.util.ArrayList;
import java.util.List;

public class TPrintErrorCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPrintErrorCriteria() {
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

        public Criteria andErrorCodeIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(Integer value) {
            addCriterion("ERROR_CODE =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(Integer value) {
            addCriterion("ERROR_CODE <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(Integer value) {
            addCriterion("ERROR_CODE >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERROR_CODE >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(Integer value) {
            addCriterion("ERROR_CODE <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(Integer value) {
            addCriterion("ERROR_CODE <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<Integer> values) {
            addCriterion("ERROR_CODE in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<Integer> values) {
            addCriterion("ERROR_CODE not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_CODE between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNull() {
            addCriterion("ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIsNotNull() {
            addCriterion("ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMessageEqualTo(String value) {
            addCriterion("ERROR_MESSAGE =", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("ERROR_MESSAGE <>", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("ERROR_MESSAGE >", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE >=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThan(String value) {
            addCriterion("ERROR_MESSAGE <", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("ERROR_MESSAGE <=", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageLike(String value) {
            addCriterion("ERROR_MESSAGE like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotLike(String value) {
            addCriterion("ERROR_MESSAGE not like", value, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageIn(List<String> values) {
            addCriterion("ERROR_MESSAGE in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("ERROR_MESSAGE not in", values, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("ERROR_MESSAGE not between", value1, value2, "errorMessage");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlIsNull() {
            addCriterion("ERROR_HELP_URL is null");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlIsNotNull() {
            addCriterion("ERROR_HELP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlEqualTo(String value) {
            addCriterion("ERROR_HELP_URL =", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlNotEqualTo(String value) {
            addCriterion("ERROR_HELP_URL <>", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlGreaterThan(String value) {
            addCriterion("ERROR_HELP_URL >", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_HELP_URL >=", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlLessThan(String value) {
            addCriterion("ERROR_HELP_URL <", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlLessThanOrEqualTo(String value) {
            addCriterion("ERROR_HELP_URL <=", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlLike(String value) {
            addCriterion("ERROR_HELP_URL like", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlNotLike(String value) {
            addCriterion("ERROR_HELP_URL not like", value, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlIn(List<String> values) {
            addCriterion("ERROR_HELP_URL in", values, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlNotIn(List<String> values) {
            addCriterion("ERROR_HELP_URL not in", values, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlBetween(String value1, String value2) {
            addCriterion("ERROR_HELP_URL between", value1, value2, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorHelpUrlNotBetween(String value1, String value2) {
            addCriterion("ERROR_HELP_URL not between", value1, value2, "errorHelpUrl");
            return (Criteria) this;
        }

        public Criteria andErrorTitleIsNull() {
            addCriterion("ERROR_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andErrorTitleIsNotNull() {
            addCriterion("ERROR_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTitleEqualTo(String value) {
            addCriterion("ERROR_TITLE =", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNotEqualTo(String value) {
            addCriterion("ERROR_TITLE <>", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleGreaterThan(String value) {
            addCriterion("ERROR_TITLE >", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_TITLE >=", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleLessThan(String value) {
            addCriterion("ERROR_TITLE <", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleLessThanOrEqualTo(String value) {
            addCriterion("ERROR_TITLE <=", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleLike(String value) {
            addCriterion("ERROR_TITLE like", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNotLike(String value) {
            addCriterion("ERROR_TITLE not like", value, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleIn(List<String> values) {
            addCriterion("ERROR_TITLE in", values, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNotIn(List<String> values) {
            addCriterion("ERROR_TITLE not in", values, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleBetween(String value1, String value2) {
            addCriterion("ERROR_TITLE between", value1, value2, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorTitleNotBetween(String value1, String value2) {
            addCriterion("ERROR_TITLE not between", value1, value2, "errorTitle");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlIsNull() {
            addCriterion("ERROR_COVER_URL is null");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlIsNotNull() {
            addCriterion("ERROR_COVER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlEqualTo(String value) {
            addCriterion("ERROR_COVER_URL =", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlNotEqualTo(String value) {
            addCriterion("ERROR_COVER_URL <>", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlGreaterThan(String value) {
            addCriterion("ERROR_COVER_URL >", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_COVER_URL >=", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlLessThan(String value) {
            addCriterion("ERROR_COVER_URL <", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlLessThanOrEqualTo(String value) {
            addCriterion("ERROR_COVER_URL <=", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlLike(String value) {
            addCriterion("ERROR_COVER_URL like", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlNotLike(String value) {
            addCriterion("ERROR_COVER_URL not like", value, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlIn(List<String> values) {
            addCriterion("ERROR_COVER_URL in", values, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlNotIn(List<String> values) {
            addCriterion("ERROR_COVER_URL not in", values, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlBetween(String value1, String value2) {
            addCriterion("ERROR_COVER_URL between", value1, value2, "errorCoverUrl");
            return (Criteria) this;
        }

        public Criteria andErrorCoverUrlNotBetween(String value1, String value2) {
            addCriterion("ERROR_COVER_URL not between", value1, value2, "errorCoverUrl");
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