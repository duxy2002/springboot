package com.hpe.ddc.framework.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPrinterCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPrinterCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("DISPLAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("DISPLAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("DISPLAY_NAME =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("DISPLAY_NAME <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("DISPLAY_NAME >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAY_NAME >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("DISPLAY_NAME <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("DISPLAY_NAME <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("DISPLAY_NAME like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("DISPLAY_NAME not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("DISPLAY_NAME in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("DISPLAY_NAME not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("DISPLAY_NAME between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("DISPLAY_NAME not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andProxyIsNull() {
            addCriterion("PROXY is null");
            return (Criteria) this;
        }

        public Criteria andProxyIsNotNull() {
            addCriterion("PROXY is not null");
            return (Criteria) this;
        }

        public Criteria andProxyEqualTo(String value) {
            addCriterion("PROXY =", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyNotEqualTo(String value) {
            addCriterion("PROXY <>", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyGreaterThan(String value) {
            addCriterion("PROXY >", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyGreaterThanOrEqualTo(String value) {
            addCriterion("PROXY >=", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyLessThan(String value) {
            addCriterion("PROXY <", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyLessThanOrEqualTo(String value) {
            addCriterion("PROXY <=", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyLike(String value) {
            addCriterion("PROXY like", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyNotLike(String value) {
            addCriterion("PROXY not like", value, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyIn(List<String> values) {
            addCriterion("PROXY in", values, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyNotIn(List<String> values) {
            addCriterion("PROXY not in", values, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyBetween(String value1, String value2) {
            addCriterion("PROXY between", value1, value2, "proxy");
            return (Criteria) this;
        }

        public Criteria andProxyNotBetween(String value1, String value2) {
            addCriterion("PROXY not between", value1, value2, "proxy");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("SN is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("SN is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("SN =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("SN <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("SN >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("SN >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("SN <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("SN <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("SN like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("SN not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("SN in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("SN not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("SN between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("SN not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andPrinterIdIsNull() {
            addCriterion("PRINTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrinterIdIsNotNull() {
            addCriterion("PRINTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterIdEqualTo(Long value) {
            addCriterion("PRINTER_ID =", value, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdNotEqualTo(Long value) {
            addCriterion("PRINTER_ID <>", value, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdGreaterThan(Long value) {
            addCriterion("PRINTER_ID >", value, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRINTER_ID >=", value, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdLessThan(Long value) {
            addCriterion("PRINTER_ID <", value, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdLessThanOrEqualTo(Long value) {
            addCriterion("PRINTER_ID <=", value, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdIn(List<Long> values) {
            addCriterion("PRINTER_ID in", values, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdNotIn(List<Long> values) {
            addCriterion("PRINTER_ID not in", values, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdBetween(Long value1, Long value2) {
            addCriterion("PRINTER_ID between", value1, value2, "printerId");
            return (Criteria) this;
        }

        public Criteria andPrinterIdNotBetween(Long value1, Long value2) {
            addCriterion("PRINTER_ID not between", value1, value2, "printerId");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNull() {
            addCriterion("MANUFACTURE is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNotNull() {
            addCriterion("MANUFACTURE is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureEqualTo(String value) {
            addCriterion("MANUFACTURE =", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotEqualTo(String value) {
            addCriterion("MANUFACTURE <>", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThan(String value) {
            addCriterion("MANUFACTURE >", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURE >=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThan(String value) {
            addCriterion("MANUFACTURE <", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURE <=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLike(String value) {
            addCriterion("MANUFACTURE like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotLike(String value) {
            addCriterion("MANUFACTURE not like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureIn(List<String> values) {
            addCriterion("MANUFACTURE in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotIn(List<String> values) {
            addCriterion("MANUFACTURE not in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureBetween(String value1, String value2) {
            addCriterion("MANUFACTURE between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURE not between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andSetupUrlIsNull() {
            addCriterion("SETUP_URL is null");
            return (Criteria) this;
        }

        public Criteria andSetupUrlIsNotNull() {
            addCriterion("SETUP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSetupUrlEqualTo(String value) {
            addCriterion("SETUP_URL =", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlNotEqualTo(String value) {
            addCriterion("SETUP_URL <>", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlGreaterThan(String value) {
            addCriterion("SETUP_URL >", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SETUP_URL >=", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlLessThan(String value) {
            addCriterion("SETUP_URL <", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlLessThanOrEqualTo(String value) {
            addCriterion("SETUP_URL <=", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlLike(String value) {
            addCriterion("SETUP_URL like", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlNotLike(String value) {
            addCriterion("SETUP_URL not like", value, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlIn(List<String> values) {
            addCriterion("SETUP_URL in", values, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlNotIn(List<String> values) {
            addCriterion("SETUP_URL not in", values, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlBetween(String value1, String value2) {
            addCriterion("SETUP_URL between", value1, value2, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSetupUrlNotBetween(String value1, String value2) {
            addCriterion("SETUP_URL not between", value1, value2, "setupUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlIsNull() {
            addCriterion("SUPPORT_URL is null");
            return (Criteria) this;
        }

        public Criteria andSupportUrlIsNotNull() {
            addCriterion("SUPPORT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSupportUrlEqualTo(String value) {
            addCriterion("SUPPORT_URL =", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlNotEqualTo(String value) {
            addCriterion("SUPPORT_URL <>", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlGreaterThan(String value) {
            addCriterion("SUPPORT_URL >", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_URL >=", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlLessThan(String value) {
            addCriterion("SUPPORT_URL <", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_URL <=", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlLike(String value) {
            addCriterion("SUPPORT_URL like", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlNotLike(String value) {
            addCriterion("SUPPORT_URL not like", value, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlIn(List<String> values) {
            addCriterion("SUPPORT_URL in", values, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlNotIn(List<String> values) {
            addCriterion("SUPPORT_URL not in", values, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlBetween(String value1, String value2) {
            addCriterion("SUPPORT_URL between", value1, value2, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andSupportUrlNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_URL not between", value1, value2, "supportUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlIsNull() {
            addCriterion("UPDATE_URL is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlIsNotNull() {
            addCriterion("UPDATE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlEqualTo(String value) {
            addCriterion("UPDATE_URL =", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotEqualTo(String value) {
            addCriterion("UPDATE_URL <>", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlGreaterThan(String value) {
            addCriterion("UPDATE_URL >", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_URL >=", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlLessThan(String value) {
            addCriterion("UPDATE_URL <", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_URL <=", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlLike(String value) {
            addCriterion("UPDATE_URL like", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotLike(String value) {
            addCriterion("UPDATE_URL not like", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlIn(List<String> values) {
            addCriterion("UPDATE_URL in", values, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotIn(List<String> values) {
            addCriterion("UPDATE_URL not in", values, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlBetween(String value1, String value2) {
            addCriterion("UPDATE_URL between", value1, value2, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotBetween(String value1, String value2) {
            addCriterion("UPDATE_URL not between", value1, value2, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andFirmwareIsNull() {
            addCriterion("FIRMWARE is null");
            return (Criteria) this;
        }

        public Criteria andFirmwareIsNotNull() {
            addCriterion("FIRMWARE is not null");
            return (Criteria) this;
        }

        public Criteria andFirmwareEqualTo(String value) {
            addCriterion("FIRMWARE =", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotEqualTo(String value) {
            addCriterion("FIRMWARE <>", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareGreaterThan(String value) {
            addCriterion("FIRMWARE >", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareGreaterThanOrEqualTo(String value) {
            addCriterion("FIRMWARE >=", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareLessThan(String value) {
            addCriterion("FIRMWARE <", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareLessThanOrEqualTo(String value) {
            addCriterion("FIRMWARE <=", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareLike(String value) {
            addCriterion("FIRMWARE like", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotLike(String value) {
            addCriterion("FIRMWARE not like", value, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareIn(List<String> values) {
            addCriterion("FIRMWARE in", values, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotIn(List<String> values) {
            addCriterion("FIRMWARE not in", values, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareBetween(String value1, String value2) {
            addCriterion("FIRMWARE between", value1, value2, "firmware");
            return (Criteria) this;
        }

        public Criteria andFirmwareNotBetween(String value1, String value2) {
            addCriterion("FIRMWARE not between", value1, value2, "firmware");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsIsNull() {
            addCriterion("LOCAL_SETTINGS is null");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsIsNotNull() {
            addCriterion("LOCAL_SETTINGS is not null");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsEqualTo(String value) {
            addCriterion("LOCAL_SETTINGS =", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsNotEqualTo(String value) {
            addCriterion("LOCAL_SETTINGS <>", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsGreaterThan(String value) {
            addCriterion("LOCAL_SETTINGS >", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsGreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_SETTINGS >=", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsLessThan(String value) {
            addCriterion("LOCAL_SETTINGS <", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsLessThanOrEqualTo(String value) {
            addCriterion("LOCAL_SETTINGS <=", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsLike(String value) {
            addCriterion("LOCAL_SETTINGS like", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsNotLike(String value) {
            addCriterion("LOCAL_SETTINGS not like", value, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsIn(List<String> values) {
            addCriterion("LOCAL_SETTINGS in", values, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsNotIn(List<String> values) {
            addCriterion("LOCAL_SETTINGS not in", values, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsBetween(String value1, String value2) {
            addCriterion("LOCAL_SETTINGS between", value1, value2, "localSettings");
            return (Criteria) this;
        }

        public Criteria andLocalSettingsNotBetween(String value1, String value2) {
            addCriterion("LOCAL_SETTINGS not between", value1, value2, "localSettings");
            return (Criteria) this;
        }

        public Criteria andSemacticStateIsNull() {
            addCriterion("SEMACTIC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSemacticStateIsNotNull() {
            addCriterion("SEMACTIC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSemacticStateEqualTo(String value) {
            addCriterion("SEMACTIC_STATE =", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateNotEqualTo(String value) {
            addCriterion("SEMACTIC_STATE <>", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateGreaterThan(String value) {
            addCriterion("SEMACTIC_STATE >", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateGreaterThanOrEqualTo(String value) {
            addCriterion("SEMACTIC_STATE >=", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateLessThan(String value) {
            addCriterion("SEMACTIC_STATE <", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateLessThanOrEqualTo(String value) {
            addCriterion("SEMACTIC_STATE <=", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateLike(String value) {
            addCriterion("SEMACTIC_STATE like", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateNotLike(String value) {
            addCriterion("SEMACTIC_STATE not like", value, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateIn(List<String> values) {
            addCriterion("SEMACTIC_STATE in", values, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateNotIn(List<String> values) {
            addCriterion("SEMACTIC_STATE not in", values, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateBetween(String value1, String value2) {
            addCriterion("SEMACTIC_STATE between", value1, value2, "semacticState");
            return (Criteria) this;
        }

        public Criteria andSemacticStateNotBetween(String value1, String value2) {
            addCriterion("SEMACTIC_STATE not between", value1, value2, "semacticState");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andCapabilitesIsNull() {
            addCriterion("CAPABILITES is null");
            return (Criteria) this;
        }

        public Criteria andCapabilitesIsNotNull() {
            addCriterion("CAPABILITES is not null");
            return (Criteria) this;
        }

        public Criteria andCapabilitesEqualTo(String value) {
            addCriterion("CAPABILITES =", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesNotEqualTo(String value) {
            addCriterion("CAPABILITES <>", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesGreaterThan(String value) {
            addCriterion("CAPABILITES >", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesGreaterThanOrEqualTo(String value) {
            addCriterion("CAPABILITES >=", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesLessThan(String value) {
            addCriterion("CAPABILITES <", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesLessThanOrEqualTo(String value) {
            addCriterion("CAPABILITES <=", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesLike(String value) {
            addCriterion("CAPABILITES like", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesNotLike(String value) {
            addCriterion("CAPABILITES not like", value, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesIn(List<String> values) {
            addCriterion("CAPABILITES in", values, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesNotIn(List<String> values) {
            addCriterion("CAPABILITES not in", values, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesBetween(String value1, String value2) {
            addCriterion("CAPABILITES between", value1, value2, "capabilites");
            return (Criteria) this;
        }

        public Criteria andCapabilitesNotBetween(String value1, String value2) {
            addCriterion("CAPABILITES not between", value1, value2, "capabilites");
            return (Criteria) this;
        }

        public Criteria andDefaultsIsNull() {
            addCriterion("DEFAULTS is null");
            return (Criteria) this;
        }

        public Criteria andDefaultsIsNotNull() {
            addCriterion("DEFAULTS is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultsEqualTo(String value) {
            addCriterion("DEFAULTS =", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsNotEqualTo(String value) {
            addCriterion("DEFAULTS <>", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsGreaterThan(String value) {
            addCriterion("DEFAULTS >", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULTS >=", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsLessThan(String value) {
            addCriterion("DEFAULTS <", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsLessThanOrEqualTo(String value) {
            addCriterion("DEFAULTS <=", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsLike(String value) {
            addCriterion("DEFAULTS like", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsNotLike(String value) {
            addCriterion("DEFAULTS not like", value, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsIn(List<String> values) {
            addCriterion("DEFAULTS in", values, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsNotIn(List<String> values) {
            addCriterion("DEFAULTS not in", values, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsBetween(String value1, String value2) {
            addCriterion("DEFAULTS between", value1, value2, "defaults");
            return (Criteria) this;
        }

        public Criteria andDefaultsNotBetween(String value1, String value2) {
            addCriterion("DEFAULTS not between", value1, value2, "defaults");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("SIGNATURE is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("SIGNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("SIGNATURE =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("SIGNATURE <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("SIGNATURE >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("SIGNATURE <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("SIGNATURE like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("SIGNATURE not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("SIGNATURE in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("SIGNATURE not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("SIGNATURE between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Long value) {
            addCriterion("OWNER_ID =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Long value) {
            addCriterion("OWNER_ID <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Long value) {
            addCriterion("OWNER_ID >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OWNER_ID >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Long value) {
            addCriterion("OWNER_ID <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("OWNER_ID <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Long> values) {
            addCriterion("OWNER_ID in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Long> values) {
            addCriterion("OWNER_ID not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Long value1, Long value2) {
            addCriterion("OWNER_ID between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("OWNER_ID not between", value1, value2, "ownerId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdIsNull() {
            addCriterion("TECHNIAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTechnianIdIsNotNull() {
            addCriterion("TECHNIAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTechnianIdEqualTo(Long value) {
            addCriterion("TECHNIAN_ID =", value, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdNotEqualTo(Long value) {
            addCriterion("TECHNIAN_ID <>", value, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdGreaterThan(Long value) {
            addCriterion("TECHNIAN_ID >", value, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TECHNIAN_ID >=", value, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdLessThan(Long value) {
            addCriterion("TECHNIAN_ID <", value, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdLessThanOrEqualTo(Long value) {
            addCriterion("TECHNIAN_ID <=", value, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdIn(List<Long> values) {
            addCriterion("TECHNIAN_ID in", values, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdNotIn(List<Long> values) {
            addCriterion("TECHNIAN_ID not in", values, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdBetween(Long value1, Long value2) {
            addCriterion("TECHNIAN_ID between", value1, value2, "technianId");
            return (Criteria) this;
        }

        public Criteria andTechnianIdNotBetween(Long value1, Long value2) {
            addCriterion("TECHNIAN_ID not between", value1, value2, "technianId");
            return (Criteria) this;
        }

        public Criteria andQrUrlIsNull() {
            addCriterion("QR_URL is null");
            return (Criteria) this;
        }

        public Criteria andQrUrlIsNotNull() {
            addCriterion("QR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andQrUrlEqualTo(String value) {
            addCriterion("QR_URL =", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotEqualTo(String value) {
            addCriterion("QR_URL <>", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlGreaterThan(String value) {
            addCriterion("QR_URL >", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("QR_URL >=", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlLessThan(String value) {
            addCriterion("QR_URL <", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlLessThanOrEqualTo(String value) {
            addCriterion("QR_URL <=", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlLike(String value) {
            addCriterion("QR_URL like", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotLike(String value) {
            addCriterion("QR_URL not like", value, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlIn(List<String> values) {
            addCriterion("QR_URL in", values, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotIn(List<String> values) {
            addCriterion("QR_URL not in", values, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlBetween(String value1, String value2) {
            addCriterion("QR_URL between", value1, value2, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andQrUrlNotBetween(String value1, String value2) {
            addCriterion("QR_URL not between", value1, value2, "qrUrl");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("EXPIRE_DATE =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("EXPIRE_DATE >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("EXPIRE_DATE <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("EXPIRE_DATE in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("EXPIRE_DATE not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
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