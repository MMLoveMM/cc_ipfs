package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInfoExample {
    /**
     * PROJECT_INFO
     */
    protected String orderByClause;

    /**
     * PROJECT_INFO
     */
    protected boolean distinct;

    /**
     * PROJECT_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public ProjectInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * PROJECT_INFO 2017-09-15
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnumIsNull() {
            addCriterion("projectNum is null");
            return (Criteria) this;
        }

        public Criteria andProjectnumIsNotNull() {
            addCriterion("projectNum is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnumEqualTo(String value) {
            addCriterion("projectNum =", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumNotEqualTo(String value) {
            addCriterion("projectNum <>", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumGreaterThan(String value) {
            addCriterion("projectNum >", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumGreaterThanOrEqualTo(String value) {
            addCriterion("projectNum >=", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumLessThan(String value) {
            addCriterion("projectNum <", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumLessThanOrEqualTo(String value) {
            addCriterion("projectNum <=", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumLike(String value) {
            addCriterion("projectNum like", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumNotLike(String value) {
            addCriterion("projectNum not like", value, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumIn(List<String> values) {
            addCriterion("projectNum in", values, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumNotIn(List<String> values) {
            addCriterion("projectNum not in", values, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumBetween(String value1, String value2) {
            addCriterion("projectNum between", value1, value2, "projectnum");
            return (Criteria) this;
        }

        public Criteria andProjectnumNotBetween(String value1, String value2) {
            addCriterion("projectNum not between", value1, value2, "projectnum");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonIsNull() {
            addCriterion("recommendPerson is null");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonIsNotNull() {
            addCriterion("recommendPerson is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonEqualTo(String value) {
            addCriterion("recommendPerson =", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonNotEqualTo(String value) {
            addCriterion("recommendPerson <>", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonGreaterThan(String value) {
            addCriterion("recommendPerson >", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonGreaterThanOrEqualTo(String value) {
            addCriterion("recommendPerson >=", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonLessThan(String value) {
            addCriterion("recommendPerson <", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonLessThanOrEqualTo(String value) {
            addCriterion("recommendPerson <=", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonLike(String value) {
            addCriterion("recommendPerson like", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonNotLike(String value) {
            addCriterion("recommendPerson not like", value, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonIn(List<String> values) {
            addCriterion("recommendPerson in", values, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonNotIn(List<String> values) {
            addCriterion("recommendPerson not in", values, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonBetween(String value1, String value2) {
            addCriterion("recommendPerson between", value1, value2, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andRecommendpersonNotBetween(String value1, String value2) {
            addCriterion("recommendPerson not between", value1, value2, "recommendperson");
            return (Criteria) this;
        }

        public Criteria andBusitypeIsNull() {
            addCriterion("busiType is null");
            return (Criteria) this;
        }

        public Criteria andBusitypeIsNotNull() {
            addCriterion("busiType is not null");
            return (Criteria) this;
        }

        public Criteria andBusitypeEqualTo(String value) {
            addCriterion("busiType =", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotEqualTo(String value) {
            addCriterion("busiType <>", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThan(String value) {
            addCriterion("busiType >", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThanOrEqualTo(String value) {
            addCriterion("busiType >=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThan(String value) {
            addCriterion("busiType <", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThanOrEqualTo(String value) {
            addCriterion("busiType <=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLike(String value) {
            addCriterion("busiType like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotLike(String value) {
            addCriterion("busiType not like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeIn(List<String> values) {
            addCriterion("busiType in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotIn(List<String> values) {
            addCriterion("busiType not in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeBetween(String value1, String value2) {
            addCriterion("busiType between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotBetween(String value1, String value2) {
            addCriterion("busiType not between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNull() {
            addCriterion("businessChannel is null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIsNotNull() {
            addCriterion("businessChannel is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelEqualTo(String value) {
            addCriterion("businessChannel =", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotEqualTo(String value) {
            addCriterion("businessChannel <>", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThan(String value) {
            addCriterion("businessChannel >", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelGreaterThanOrEqualTo(String value) {
            addCriterion("businessChannel >=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThan(String value) {
            addCriterion("businessChannel <", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLessThanOrEqualTo(String value) {
            addCriterion("businessChannel <=", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelLike(String value) {
            addCriterion("businessChannel like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotLike(String value) {
            addCriterion("businessChannel not like", value, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelIn(List<String> values) {
            addCriterion("businessChannel in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotIn(List<String> values) {
            addCriterion("businessChannel not in", values, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelBetween(String value1, String value2) {
            addCriterion("businessChannel between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andBusinesschannelNotBetween(String value1, String value2) {
            addCriterion("businessChannel not between", value1, value2, "businesschannel");
            return (Criteria) this;
        }

        public Criteria andIs1stevaIsNull() {
            addCriterion("is1STEva is null");
            return (Criteria) this;
        }

        public Criteria andIs1stevaIsNotNull() {
            addCriterion("is1STEva is not null");
            return (Criteria) this;
        }

        public Criteria andIs1stevaEqualTo(String value) {
            addCriterion("is1STEva =", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaNotEqualTo(String value) {
            addCriterion("is1STEva <>", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaGreaterThan(String value) {
            addCriterion("is1STEva >", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaGreaterThanOrEqualTo(String value) {
            addCriterion("is1STEva >=", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaLessThan(String value) {
            addCriterion("is1STEva <", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaLessThanOrEqualTo(String value) {
            addCriterion("is1STEva <=", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaLike(String value) {
            addCriterion("is1STEva like", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaNotLike(String value) {
            addCriterion("is1STEva not like", value, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaIn(List<String> values) {
            addCriterion("is1STEva in", values, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaNotIn(List<String> values) {
            addCriterion("is1STEva not in", values, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaBetween(String value1, String value2) {
            addCriterion("is1STEva between", value1, value2, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIs1stevaNotBetween(String value1, String value2) {
            addCriterion("is1STEva not between", value1, value2, "is1steva");
            return (Criteria) this;
        }

        public Criteria andIsipprojectIsNull() {
            addCriterion("isIpProject is null");
            return (Criteria) this;
        }

        public Criteria andIsipprojectIsNotNull() {
            addCriterion("isIpProject is not null");
            return (Criteria) this;
        }

        public Criteria andIsipprojectEqualTo(String value) {
            addCriterion("isIpProject =", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectNotEqualTo(String value) {
            addCriterion("isIpProject <>", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectGreaterThan(String value) {
            addCriterion("isIpProject >", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectGreaterThanOrEqualTo(String value) {
            addCriterion("isIpProject >=", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectLessThan(String value) {
            addCriterion("isIpProject <", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectLessThanOrEqualTo(String value) {
            addCriterion("isIpProject <=", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectLike(String value) {
            addCriterion("isIpProject like", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectNotLike(String value) {
            addCriterion("isIpProject not like", value, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectIn(List<String> values) {
            addCriterion("isIpProject in", values, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectNotIn(List<String> values) {
            addCriterion("isIpProject not in", values, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectBetween(String value1, String value2) {
            addCriterion("isIpProject between", value1, value2, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIsipprojectNotBetween(String value1, String value2) {
            addCriterion("isIpProject not between", value1, value2, "isipproject");
            return (Criteria) this;
        }

        public Criteria andIssurenessIsNull() {
            addCriterion("isSureness is null");
            return (Criteria) this;
        }

        public Criteria andIssurenessIsNotNull() {
            addCriterion("isSureness is not null");
            return (Criteria) this;
        }

        public Criteria andIssurenessEqualTo(String value) {
            addCriterion("isSureness =", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessNotEqualTo(String value) {
            addCriterion("isSureness <>", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessGreaterThan(String value) {
            addCriterion("isSureness >", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessGreaterThanOrEqualTo(String value) {
            addCriterion("isSureness >=", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessLessThan(String value) {
            addCriterion("isSureness <", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessLessThanOrEqualTo(String value) {
            addCriterion("isSureness <=", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessLike(String value) {
            addCriterion("isSureness like", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessNotLike(String value) {
            addCriterion("isSureness not like", value, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessIn(List<String> values) {
            addCriterion("isSureness in", values, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessNotIn(List<String> values) {
            addCriterion("isSureness not in", values, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessBetween(String value1, String value2) {
            addCriterion("isSureness between", value1, value2, "issureness");
            return (Criteria) this;
        }

        public Criteria andIssurenessNotBetween(String value1, String value2) {
            addCriterion("isSureness not between", value1, value2, "issureness");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameIsNull() {
            addCriterion("underpinOrgName is null");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameIsNotNull() {
            addCriterion("underpinOrgName is not null");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameEqualTo(String value) {
            addCriterion("underpinOrgName =", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameNotEqualTo(String value) {
            addCriterion("underpinOrgName <>", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameGreaterThan(String value) {
            addCriterion("underpinOrgName >", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("underpinOrgName >=", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameLessThan(String value) {
            addCriterion("underpinOrgName <", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameLessThanOrEqualTo(String value) {
            addCriterion("underpinOrgName <=", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameLike(String value) {
            addCriterion("underpinOrgName like", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameNotLike(String value) {
            addCriterion("underpinOrgName not like", value, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameIn(List<String> values) {
            addCriterion("underpinOrgName in", values, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameNotIn(List<String> values) {
            addCriterion("underpinOrgName not in", values, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameBetween(String value1, String value2) {
            addCriterion("underpinOrgName between", value1, value2, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andUnderpinorgnameNotBetween(String value1, String value2) {
            addCriterion("underpinOrgName not between", value1, value2, "underpinorgname");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeIsNull() {
            addCriterion("visitorVolume is null");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeIsNotNull() {
            addCriterion("visitorVolume is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeEqualTo(String value) {
            addCriterion("visitorVolume =", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeNotEqualTo(String value) {
            addCriterion("visitorVolume <>", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeGreaterThan(String value) {
            addCriterion("visitorVolume >", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeGreaterThanOrEqualTo(String value) {
            addCriterion("visitorVolume >=", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeLessThan(String value) {
            addCriterion("visitorVolume <", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeLessThanOrEqualTo(String value) {
            addCriterion("visitorVolume <=", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeLike(String value) {
            addCriterion("visitorVolume like", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeNotLike(String value) {
            addCriterion("visitorVolume not like", value, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeIn(List<String> values) {
            addCriterion("visitorVolume in", values, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeNotIn(List<String> values) {
            addCriterion("visitorVolume not in", values, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeBetween(String value1, String value2) {
            addCriterion("visitorVolume between", value1, value2, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andVisitorvolumeNotBetween(String value1, String value2) {
            addCriterion("visitorVolume not between", value1, value2, "visitorvolume");
            return (Criteria) this;
        }

        public Criteria andLoanamtIsNull() {
            addCriterion("loanAmt is null");
            return (Criteria) this;
        }

        public Criteria andLoanamtIsNotNull() {
            addCriterion("loanAmt is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamtEqualTo(String value) {
            addCriterion("loanAmt =", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtNotEqualTo(String value) {
            addCriterion("loanAmt <>", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtGreaterThan(String value) {
            addCriterion("loanAmt >", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtGreaterThanOrEqualTo(String value) {
            addCriterion("loanAmt >=", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtLessThan(String value) {
            addCriterion("loanAmt <", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtLessThanOrEqualTo(String value) {
            addCriterion("loanAmt <=", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtLike(String value) {
            addCriterion("loanAmt like", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtNotLike(String value) {
            addCriterion("loanAmt not like", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtIn(List<String> values) {
            addCriterion("loanAmt in", values, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtNotIn(List<String> values) {
            addCriterion("loanAmt not in", values, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtBetween(String value1, String value2) {
            addCriterion("loanAmt between", value1, value2, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtNotBetween(String value1, String value2) {
            addCriterion("loanAmt not between", value1, value2, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineIsNull() {
            addCriterion("loanDeadline is null");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineIsNotNull() {
            addCriterion("loanDeadline is not null");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineEqualTo(String value) {
            addCriterion("loanDeadline =", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineNotEqualTo(String value) {
            addCriterion("loanDeadline <>", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineGreaterThan(String value) {
            addCriterion("loanDeadline >", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("loanDeadline >=", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineLessThan(String value) {
            addCriterion("loanDeadline <", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineLessThanOrEqualTo(String value) {
            addCriterion("loanDeadline <=", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineLike(String value) {
            addCriterion("loanDeadline like", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineNotLike(String value) {
            addCriterion("loanDeadline not like", value, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineIn(List<String> values) {
            addCriterion("loanDeadline in", values, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineNotIn(List<String> values) {
            addCriterion("loanDeadline not in", values, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineBetween(String value1, String value2) {
            addCriterion("loanDeadline between", value1, value2, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoandeadlineNotBetween(String value1, String value2) {
            addCriterion("loanDeadline not between", value1, value2, "loandeadline");
            return (Criteria) this;
        }

        public Criteria andLoantypeIsNull() {
            addCriterion("loanType is null");
            return (Criteria) this;
        }

        public Criteria andLoantypeIsNotNull() {
            addCriterion("loanType is not null");
            return (Criteria) this;
        }

        public Criteria andLoantypeEqualTo(String value) {
            addCriterion("loanType =", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotEqualTo(String value) {
            addCriterion("loanType <>", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThan(String value) {
            addCriterion("loanType >", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThanOrEqualTo(String value) {
            addCriterion("loanType >=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThan(String value) {
            addCriterion("loanType <", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThanOrEqualTo(String value) {
            addCriterion("loanType <=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLike(String value) {
            addCriterion("loanType like", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotLike(String value) {
            addCriterion("loanType not like", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeIn(List<String> values) {
            addCriterion("loanType in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotIn(List<String> values) {
            addCriterion("loanType not in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeBetween(String value1, String value2) {
            addCriterion("loanType between", value1, value2, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotBetween(String value1, String value2) {
            addCriterion("loanType not between", value1, value2, "loantype");
            return (Criteria) this;
        }

        public Criteria andHasloanamtIsNull() {
            addCriterion("hasLoanAmt is null");
            return (Criteria) this;
        }

        public Criteria andHasloanamtIsNotNull() {
            addCriterion("hasLoanAmt is not null");
            return (Criteria) this;
        }

        public Criteria andHasloanamtEqualTo(String value) {
            addCriterion("hasLoanAmt =", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtNotEqualTo(String value) {
            addCriterion("hasLoanAmt <>", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtGreaterThan(String value) {
            addCriterion("hasLoanAmt >", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtGreaterThanOrEqualTo(String value) {
            addCriterion("hasLoanAmt >=", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtLessThan(String value) {
            addCriterion("hasLoanAmt <", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtLessThanOrEqualTo(String value) {
            addCriterion("hasLoanAmt <=", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtLike(String value) {
            addCriterion("hasLoanAmt like", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtNotLike(String value) {
            addCriterion("hasLoanAmt not like", value, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtIn(List<String> values) {
            addCriterion("hasLoanAmt in", values, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtNotIn(List<String> values) {
            addCriterion("hasLoanAmt not in", values, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtBetween(String value1, String value2) {
            addCriterion("hasLoanAmt between", value1, value2, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andHasloanamtNotBetween(String value1, String value2) {
            addCriterion("hasLoanAmt not between", value1, value2, "hasloanamt");
            return (Criteria) this;
        }

        public Criteria andLoanuseIsNull() {
            addCriterion("loanUse is null");
            return (Criteria) this;
        }

        public Criteria andLoanuseIsNotNull() {
            addCriterion("loanUse is not null");
            return (Criteria) this;
        }

        public Criteria andLoanuseEqualTo(String value) {
            addCriterion("loanUse =", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotEqualTo(String value) {
            addCriterion("loanUse <>", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseGreaterThan(String value) {
            addCriterion("loanUse >", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseGreaterThanOrEqualTo(String value) {
            addCriterion("loanUse >=", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseLessThan(String value) {
            addCriterion("loanUse <", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseLessThanOrEqualTo(String value) {
            addCriterion("loanUse <=", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseLike(String value) {
            addCriterion("loanUse like", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotLike(String value) {
            addCriterion("loanUse not like", value, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseIn(List<String> values) {
            addCriterion("loanUse in", values, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotIn(List<String> values) {
            addCriterion("loanUse not in", values, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseBetween(String value1, String value2) {
            addCriterion("loanUse between", value1, value2, "loanuse");
            return (Criteria) this;
        }

        public Criteria andLoanuseNotBetween(String value1, String value2) {
            addCriterion("loanUse not between", value1, value2, "loanuse");
            return (Criteria) this;
        }

        public Criteria andInteprotypeIsNull() {
            addCriterion("inteProType is null");
            return (Criteria) this;
        }

        public Criteria andInteprotypeIsNotNull() {
            addCriterion("inteProType is not null");
            return (Criteria) this;
        }

        public Criteria andInteprotypeEqualTo(String value) {
            addCriterion("inteProType =", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeNotEqualTo(String value) {
            addCriterion("inteProType <>", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeGreaterThan(String value) {
            addCriterion("inteProType >", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeGreaterThanOrEqualTo(String value) {
            addCriterion("inteProType >=", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeLessThan(String value) {
            addCriterion("inteProType <", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeLessThanOrEqualTo(String value) {
            addCriterion("inteProType <=", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeLike(String value) {
            addCriterion("inteProType like", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeNotLike(String value) {
            addCriterion("inteProType not like", value, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeIn(List<String> values) {
            addCriterion("inteProType in", values, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeNotIn(List<String> values) {
            addCriterion("inteProType not in", values, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeBetween(String value1, String value2) {
            addCriterion("inteProType between", value1, value2, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andInteprotypeNotBetween(String value1, String value2) {
            addCriterion("inteProType not between", value1, value2, "inteprotype");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andIsminsillIsNull() {
            addCriterion("isMinSill is null");
            return (Criteria) this;
        }

        public Criteria andIsminsillIsNotNull() {
            addCriterion("isMinSill is not null");
            return (Criteria) this;
        }

        public Criteria andIsminsillEqualTo(String value) {
            addCriterion("isMinSill =", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillNotEqualTo(String value) {
            addCriterion("isMinSill <>", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillGreaterThan(String value) {
            addCriterion("isMinSill >", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillGreaterThanOrEqualTo(String value) {
            addCriterion("isMinSill >=", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillLessThan(String value) {
            addCriterion("isMinSill <", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillLessThanOrEqualTo(String value) {
            addCriterion("isMinSill <=", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillLike(String value) {
            addCriterion("isMinSill like", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillNotLike(String value) {
            addCriterion("isMinSill not like", value, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillIn(List<String> values) {
            addCriterion("isMinSill in", values, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillNotIn(List<String> values) {
            addCriterion("isMinSill not in", values, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillBetween(String value1, String value2) {
            addCriterion("isMinSill between", value1, value2, "isminsill");
            return (Criteria) this;
        }

        public Criteria andIsminsillNotBetween(String value1, String value2) {
            addCriterion("isMinSill not between", value1, value2, "isminsill");
            return (Criteria) this;
        }

        public Criteria andInputeridIsNull() {
            addCriterion("inputerId is null");
            return (Criteria) this;
        }

        public Criteria andInputeridIsNotNull() {
            addCriterion("inputerId is not null");
            return (Criteria) this;
        }

        public Criteria andInputeridEqualTo(String value) {
            addCriterion("inputerId =", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridNotEqualTo(String value) {
            addCriterion("inputerId <>", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridGreaterThan(String value) {
            addCriterion("inputerId >", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridGreaterThanOrEqualTo(String value) {
            addCriterion("inputerId >=", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridLessThan(String value) {
            addCriterion("inputerId <", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridLessThanOrEqualTo(String value) {
            addCriterion("inputerId <=", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridLike(String value) {
            addCriterion("inputerId like", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridNotLike(String value) {
            addCriterion("inputerId not like", value, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridIn(List<String> values) {
            addCriterion("inputerId in", values, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridNotIn(List<String> values) {
            addCriterion("inputerId not in", values, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridBetween(String value1, String value2) {
            addCriterion("inputerId between", value1, value2, "inputerid");
            return (Criteria) this;
        }

        public Criteria andInputeridNotBetween(String value1, String value2) {
            addCriterion("inputerId not between", value1, value2, "inputerid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andComefromIsNull() {
            addCriterion("comeFrom is null");
            return (Criteria) this;
        }

        public Criteria andComefromIsNotNull() {
            addCriterion("comeFrom is not null");
            return (Criteria) this;
        }

        public Criteria andComefromEqualTo(String value) {
            addCriterion("comeFrom =", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromNotEqualTo(String value) {
            addCriterion("comeFrom <>", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromGreaterThan(String value) {
            addCriterion("comeFrom >", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromGreaterThanOrEqualTo(String value) {
            addCriterion("comeFrom >=", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromLessThan(String value) {
            addCriterion("comeFrom <", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromLessThanOrEqualTo(String value) {
            addCriterion("comeFrom <=", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromLike(String value) {
            addCriterion("comeFrom like", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromNotLike(String value) {
            addCriterion("comeFrom not like", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromIn(List<String> values) {
            addCriterion("comeFrom in", values, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromNotIn(List<String> values) {
            addCriterion("comeFrom not in", values, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromBetween(String value1, String value2) {
            addCriterion("comeFrom between", value1, value2, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromNotBetween(String value1, String value2) {
            addCriterion("comeFrom not between", value1, value2, "comefrom");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerId like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerId not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andProprogressIsNull() {
            addCriterion("PROPROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andProprogressIsNotNull() {
            addCriterion("PROPROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andProprogressEqualTo(String value) {
            addCriterion("PROPROGRESS =", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressNotEqualTo(String value) {
            addCriterion("PROPROGRESS <>", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressGreaterThan(String value) {
            addCriterion("PROPROGRESS >", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressGreaterThanOrEqualTo(String value) {
            addCriterion("PROPROGRESS >=", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressLessThan(String value) {
            addCriterion("PROPROGRESS <", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressLessThanOrEqualTo(String value) {
            addCriterion("PROPROGRESS <=", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressLike(String value) {
            addCriterion("PROPROGRESS like", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressNotLike(String value) {
            addCriterion("PROPROGRESS not like", value, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressIn(List<String> values) {
            addCriterion("PROPROGRESS in", values, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressNotIn(List<String> values) {
            addCriterion("PROPROGRESS not in", values, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressBetween(String value1, String value2) {
            addCriterion("PROPROGRESS between", value1, value2, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProprogressNotBetween(String value1, String value2) {
            addCriterion("PROPROGRESS not between", value1, value2, "proprogress");
            return (Criteria) this;
        }

        public Criteria andProgressdescIsNull() {
            addCriterion("PROGRESSDESC is null");
            return (Criteria) this;
        }

        public Criteria andProgressdescIsNotNull() {
            addCriterion("PROGRESSDESC is not null");
            return (Criteria) this;
        }

        public Criteria andProgressdescEqualTo(String value) {
            addCriterion("PROGRESSDESC =", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotEqualTo(String value) {
            addCriterion("PROGRESSDESC <>", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescGreaterThan(String value) {
            addCriterion("PROGRESSDESC >", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescGreaterThanOrEqualTo(String value) {
            addCriterion("PROGRESSDESC >=", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescLessThan(String value) {
            addCriterion("PROGRESSDESC <", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescLessThanOrEqualTo(String value) {
            addCriterion("PROGRESSDESC <=", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescLike(String value) {
            addCriterion("PROGRESSDESC like", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotLike(String value) {
            addCriterion("PROGRESSDESC not like", value, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescIn(List<String> values) {
            addCriterion("PROGRESSDESC in", values, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotIn(List<String> values) {
            addCriterion("PROGRESSDESC not in", values, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescBetween(String value1, String value2) {
            addCriterion("PROGRESSDESC between", value1, value2, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andProgressdescNotBetween(String value1, String value2) {
            addCriterion("PROGRESSDESC not between", value1, value2, "progressdesc");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelIsNull() {
            addCriterion("PRIORITYLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelIsNotNull() {
            addCriterion("PRIORITYLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelEqualTo(String value) {
            addCriterion("PRIORITYLEVEL =", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelNotEqualTo(String value) {
            addCriterion("PRIORITYLEVEL <>", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelGreaterThan(String value) {
            addCriterion("PRIORITYLEVEL >", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITYLEVEL >=", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelLessThan(String value) {
            addCriterion("PRIORITYLEVEL <", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelLessThanOrEqualTo(String value) {
            addCriterion("PRIORITYLEVEL <=", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelLike(String value) {
            addCriterion("PRIORITYLEVEL like", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelNotLike(String value) {
            addCriterion("PRIORITYLEVEL not like", value, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelIn(List<String> values) {
            addCriterion("PRIORITYLEVEL in", values, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelNotIn(List<String> values) {
            addCriterion("PRIORITYLEVEL not in", values, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelBetween(String value1, String value2) {
            addCriterion("PRIORITYLEVEL between", value1, value2, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andPrioritylevelNotBetween(String value1, String value2) {
            addCriterion("PRIORITYLEVEL not between", value1, value2, "prioritylevel");
            return (Criteria) this;
        }

        public Criteria andCustypeIsNull() {
            addCriterion("CUSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustypeIsNotNull() {
            addCriterion("CUSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustypeEqualTo(String value) {
            addCriterion("CUSTYPE =", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeNotEqualTo(String value) {
            addCriterion("CUSTYPE <>", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeGreaterThan(String value) {
            addCriterion("CUSTYPE >", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTYPE >=", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeLessThan(String value) {
            addCriterion("CUSTYPE <", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTYPE <=", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeLike(String value) {
            addCriterion("CUSTYPE like", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeNotLike(String value) {
            addCriterion("CUSTYPE not like", value, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeIn(List<String> values) {
            addCriterion("CUSTYPE in", values, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeNotIn(List<String> values) {
            addCriterion("CUSTYPE not in", values, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeBetween(String value1, String value2) {
            addCriterion("CUSTYPE between", value1, value2, "custype");
            return (Criteria) this;
        }

        public Criteria andCustypeNotBetween(String value1, String value2) {
            addCriterion("CUSTYPE not between", value1, value2, "custype");
            return (Criteria) this;
        }

        public Criteria andSubprocessIsNull() {
            addCriterion("SUBPROCESS is null");
            return (Criteria) this;
        }

        public Criteria andSubprocessIsNotNull() {
            addCriterion("SUBPROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andSubprocessEqualTo(String value) {
            addCriterion("SUBPROCESS =", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessNotEqualTo(String value) {
            addCriterion("SUBPROCESS <>", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessGreaterThan(String value) {
            addCriterion("SUBPROCESS >", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessGreaterThanOrEqualTo(String value) {
            addCriterion("SUBPROCESS >=", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessLessThan(String value) {
            addCriterion("SUBPROCESS <", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessLessThanOrEqualTo(String value) {
            addCriterion("SUBPROCESS <=", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessLike(String value) {
            addCriterion("SUBPROCESS like", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessNotLike(String value) {
            addCriterion("SUBPROCESS not like", value, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessIn(List<String> values) {
            addCriterion("SUBPROCESS in", values, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessNotIn(List<String> values) {
            addCriterion("SUBPROCESS not in", values, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessBetween(String value1, String value2) {
            addCriterion("SUBPROCESS between", value1, value2, "subprocess");
            return (Criteria) this;
        }

        public Criteria andSubprocessNotBetween(String value1, String value2) {
            addCriterion("SUBPROCESS not between", value1, value2, "subprocess");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNull() {
            addCriterion("CONTRACTNO is null");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNotNull() {
            addCriterion("CONTRACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andContractnoEqualTo(String value) {
            addCriterion("CONTRACTNO =", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotEqualTo(String value) {
            addCriterion("CONTRACTNO <>", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThan(String value) {
            addCriterion("CONTRACTNO >", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTNO >=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThan(String value) {
            addCriterion("CONTRACTNO <", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTNO <=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLike(String value) {
            addCriterion("CONTRACTNO like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotLike(String value) {
            addCriterion("CONTRACTNO not like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoIn(List<String> values) {
            addCriterion("CONTRACTNO in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotIn(List<String> values) {
            addCriterion("CONTRACTNO not in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoBetween(String value1, String value2) {
            addCriterion("CONTRACTNO between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotBetween(String value1, String value2) {
            addCriterion("CONTRACTNO not between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceIsNull() {
            addCriterion("COUNTLENDBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceIsNotNull() {
            addCriterion("COUNTLENDBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceEqualTo(String value) {
            addCriterion("COUNTLENDBALANCE =", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceNotEqualTo(String value) {
            addCriterion("COUNTLENDBALANCE <>", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceGreaterThan(String value) {
            addCriterion("COUNTLENDBALANCE >", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTLENDBALANCE >=", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceLessThan(String value) {
            addCriterion("COUNTLENDBALANCE <", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceLessThanOrEqualTo(String value) {
            addCriterion("COUNTLENDBALANCE <=", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceLike(String value) {
            addCriterion("COUNTLENDBALANCE like", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceNotLike(String value) {
            addCriterion("COUNTLENDBALANCE not like", value, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceIn(List<String> values) {
            addCriterion("COUNTLENDBALANCE in", values, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceNotIn(List<String> values) {
            addCriterion("COUNTLENDBALANCE not in", values, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceBetween(String value1, String value2) {
            addCriterion("COUNTLENDBALANCE between", value1, value2, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andCountlendbalanceNotBetween(String value1, String value2) {
            addCriterion("COUNTLENDBALANCE not between", value1, value2, "countlendbalance");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusIsNull() {
            addCriterion("GUARANTEESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusIsNotNull() {
            addCriterion("GUARANTEESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusEqualTo(String value) {
            addCriterion("GUARANTEESTATUS =", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusNotEqualTo(String value) {
            addCriterion("GUARANTEESTATUS <>", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusGreaterThan(String value) {
            addCriterion("GUARANTEESTATUS >", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEESTATUS >=", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusLessThan(String value) {
            addCriterion("GUARANTEESTATUS <", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEESTATUS <=", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusLike(String value) {
            addCriterion("GUARANTEESTATUS like", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusNotLike(String value) {
            addCriterion("GUARANTEESTATUS not like", value, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusIn(List<String> values) {
            addCriterion("GUARANTEESTATUS in", values, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusNotIn(List<String> values) {
            addCriterion("GUARANTEESTATUS not in", values, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusBetween(String value1, String value2) {
            addCriterion("GUARANTEESTATUS between", value1, value2, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andGuaranteestatusNotBetween(String value1, String value2) {
            addCriterion("GUARANTEESTATUS not between", value1, value2, "guaranteestatus");
            return (Criteria) this;
        }

        public Criteria andRiskratingIsNull() {
            addCriterion("RISKRATING is null");
            return (Criteria) this;
        }

        public Criteria andRiskratingIsNotNull() {
            addCriterion("RISKRATING is not null");
            return (Criteria) this;
        }

        public Criteria andRiskratingEqualTo(String value) {
            addCriterion("RISKRATING =", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingNotEqualTo(String value) {
            addCriterion("RISKRATING <>", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingGreaterThan(String value) {
            addCriterion("RISKRATING >", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingGreaterThanOrEqualTo(String value) {
            addCriterion("RISKRATING >=", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingLessThan(String value) {
            addCriterion("RISKRATING <", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingLessThanOrEqualTo(String value) {
            addCriterion("RISKRATING <=", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingLike(String value) {
            addCriterion("RISKRATING like", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingNotLike(String value) {
            addCriterion("RISKRATING not like", value, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingIn(List<String> values) {
            addCriterion("RISKRATING in", values, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingNotIn(List<String> values) {
            addCriterion("RISKRATING not in", values, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingBetween(String value1, String value2) {
            addCriterion("RISKRATING between", value1, value2, "riskrating");
            return (Criteria) this;
        }

        public Criteria andRiskratingNotBetween(String value1, String value2) {
            addCriterion("RISKRATING not between", value1, value2, "riskrating");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusIsNull() {
            addCriterion("FACTORINGSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusIsNotNull() {
            addCriterion("FACTORINGSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusEqualTo(String value) {
            addCriterion("FACTORINGSTATUS =", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusNotEqualTo(String value) {
            addCriterion("FACTORINGSTATUS <>", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusGreaterThan(String value) {
            addCriterion("FACTORINGSTATUS >", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORINGSTATUS >=", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusLessThan(String value) {
            addCriterion("FACTORINGSTATUS <", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusLessThanOrEqualTo(String value) {
            addCriterion("FACTORINGSTATUS <=", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusLike(String value) {
            addCriterion("FACTORINGSTATUS like", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusNotLike(String value) {
            addCriterion("FACTORINGSTATUS not like", value, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusIn(List<String> values) {
            addCriterion("FACTORINGSTATUS in", values, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusNotIn(List<String> values) {
            addCriterion("FACTORINGSTATUS not in", values, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusBetween(String value1, String value2) {
            addCriterion("FACTORINGSTATUS between", value1, value2, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFactoringstatusNotBetween(String value1, String value2) {
            addCriterion("FACTORINGSTATUS not between", value1, value2, "factoringstatus");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsIsNull() {
            addCriterion("FINANCINGNEEDS is null");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsIsNotNull() {
            addCriterion("FINANCINGNEEDS is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsEqualTo(String value) {
            addCriterion("FINANCINGNEEDS =", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsNotEqualTo(String value) {
            addCriterion("FINANCINGNEEDS <>", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsGreaterThan(String value) {
            addCriterion("FINANCINGNEEDS >", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCINGNEEDS >=", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsLessThan(String value) {
            addCriterion("FINANCINGNEEDS <", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsLessThanOrEqualTo(String value) {
            addCriterion("FINANCINGNEEDS <=", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsLike(String value) {
            addCriterion("FINANCINGNEEDS like", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsNotLike(String value) {
            addCriterion("FINANCINGNEEDS not like", value, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsIn(List<String> values) {
            addCriterion("FINANCINGNEEDS in", values, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsNotIn(List<String> values) {
            addCriterion("FINANCINGNEEDS not in", values, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsBetween(String value1, String value2) {
            addCriterion("FINANCINGNEEDS between", value1, value2, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andFinancingneedsNotBetween(String value1, String value2) {
            addCriterion("FINANCINGNEEDS not between", value1, value2, "financingneeds");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyIsNull() {
            addCriterion("USEMONEYCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyIsNotNull() {
            addCriterion("USEMONEYCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyEqualTo(String value) {
            addCriterion("USEMONEYCOMPANY =", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyNotEqualTo(String value) {
            addCriterion("USEMONEYCOMPANY <>", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyGreaterThan(String value) {
            addCriterion("USEMONEYCOMPANY >", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyGreaterThanOrEqualTo(String value) {
            addCriterion("USEMONEYCOMPANY >=", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyLessThan(String value) {
            addCriterion("USEMONEYCOMPANY <", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyLessThanOrEqualTo(String value) {
            addCriterion("USEMONEYCOMPANY <=", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyLike(String value) {
            addCriterion("USEMONEYCOMPANY like", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyNotLike(String value) {
            addCriterion("USEMONEYCOMPANY not like", value, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyIn(List<String> values) {
            addCriterion("USEMONEYCOMPANY in", values, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyNotIn(List<String> values) {
            addCriterion("USEMONEYCOMPANY not in", values, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyBetween(String value1, String value2) {
            addCriterion("USEMONEYCOMPANY between", value1, value2, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andUsemoneycompanyNotBetween(String value1, String value2) {
            addCriterion("USEMONEYCOMPANY not between", value1, value2, "usemoneycompany");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNull() {
            addCriterion("TOTAL_ASSETS is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNotNull() {
            addCriterion("TOTAL_ASSETS is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsEqualTo(String value) {
            addCriterion("TOTAL_ASSETS =", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotEqualTo(String value) {
            addCriterion("TOTAL_ASSETS <>", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThan(String value) {
            addCriterion("TOTAL_ASSETS >", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_ASSETS >=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThan(String value) {
            addCriterion("TOTAL_ASSETS <", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_ASSETS <=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLike(String value) {
            addCriterion("TOTAL_ASSETS like", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotLike(String value) {
            addCriterion("TOTAL_ASSETS not like", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIn(List<String> values) {
            addCriterion("TOTAL_ASSETS in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotIn(List<String> values) {
            addCriterion("TOTAL_ASSETS not in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsBetween(String value1, String value2) {
            addCriterion("TOTAL_ASSETS between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotBetween(String value1, String value2) {
            addCriterion("TOTAL_ASSETS not between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityIsNull() {
            addCriterion("TOTAL_LIABILITY is null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityIsNotNull() {
            addCriterion("TOTAL_LIABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityEqualTo(String value) {
            addCriterion("TOTAL_LIABILITY =", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityNotEqualTo(String value) {
            addCriterion("TOTAL_LIABILITY <>", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityGreaterThan(String value) {
            addCriterion("TOTAL_LIABILITY >", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_LIABILITY >=", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityLessThan(String value) {
            addCriterion("TOTAL_LIABILITY <", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_LIABILITY <=", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityLike(String value) {
            addCriterion("TOTAL_LIABILITY like", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityNotLike(String value) {
            addCriterion("TOTAL_LIABILITY not like", value, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityIn(List<String> values) {
            addCriterion("TOTAL_LIABILITY in", values, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityNotIn(List<String> values) {
            addCriterion("TOTAL_LIABILITY not in", values, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityBetween(String value1, String value2) {
            addCriterion("TOTAL_LIABILITY between", value1, value2, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilityNotBetween(String value1, String value2) {
            addCriterion("TOTAL_LIABILITY not between", value1, value2, "totalLiability");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeIsNull() {
            addCriterion("LAST_YEAR_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeIsNotNull() {
            addCriterion("LAST_YEAR_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeEqualTo(String value) {
            addCriterion("LAST_YEAR_INCOME =", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeNotEqualTo(String value) {
            addCriterion("LAST_YEAR_INCOME <>", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeGreaterThan(String value) {
            addCriterion("LAST_YEAR_INCOME >", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_YEAR_INCOME >=", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeLessThan(String value) {
            addCriterion("LAST_YEAR_INCOME <", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeLessThanOrEqualTo(String value) {
            addCriterion("LAST_YEAR_INCOME <=", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeLike(String value) {
            addCriterion("LAST_YEAR_INCOME like", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeNotLike(String value) {
            addCriterion("LAST_YEAR_INCOME not like", value, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeIn(List<String> values) {
            addCriterion("LAST_YEAR_INCOME in", values, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeNotIn(List<String> values) {
            addCriterion("LAST_YEAR_INCOME not in", values, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeBetween(String value1, String value2) {
            addCriterion("LAST_YEAR_INCOME between", value1, value2, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andLastYearIncomeNotBetween(String value1, String value2) {
            addCriterion("LAST_YEAR_INCOME not between", value1, value2, "lastYearIncome");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationIsNull() {
            addCriterion("CURRENT_LOAN_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationIsNotNull() {
            addCriterion("CURRENT_LOAN_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationEqualTo(String value) {
            addCriterion("CURRENT_LOAN_SITUATION =", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationNotEqualTo(String value) {
            addCriterion("CURRENT_LOAN_SITUATION <>", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationGreaterThan(String value) {
            addCriterion("CURRENT_LOAN_SITUATION >", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_LOAN_SITUATION >=", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationLessThan(String value) {
            addCriterion("CURRENT_LOAN_SITUATION <", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_LOAN_SITUATION <=", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationLike(String value) {
            addCriterion("CURRENT_LOAN_SITUATION like", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationNotLike(String value) {
            addCriterion("CURRENT_LOAN_SITUATION not like", value, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationIn(List<String> values) {
            addCriterion("CURRENT_LOAN_SITUATION in", values, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationNotIn(List<String> values) {
            addCriterion("CURRENT_LOAN_SITUATION not in", values, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationBetween(String value1, String value2) {
            addCriterion("CURRENT_LOAN_SITUATION between", value1, value2, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentLoanSituationNotBetween(String value1, String value2) {
            addCriterion("CURRENT_LOAN_SITUATION not between", value1, value2, "currentLoanSituation");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("LOAN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("LOAN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(String value) {
            addCriterion("LOAN_AMOUNT =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(String value) {
            addCriterion("LOAN_AMOUNT <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(String value) {
            addCriterion("LOAN_AMOUNT >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_AMOUNT >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(String value) {
            addCriterion("LOAN_AMOUNT <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(String value) {
            addCriterion("LOAN_AMOUNT <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLike(String value) {
            addCriterion("LOAN_AMOUNT like", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotLike(String value) {
            addCriterion("LOAN_AMOUNT not like", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<String> values) {
            addCriterion("LOAN_AMOUNT in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<String> values) {
            addCriterion("LOAN_AMOUNT not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(String value1, String value2) {
            addCriterion("LOAN_AMOUNT between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(String value1, String value2) {
            addCriterion("LOAN_AMOUNT not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountIsNull() {
            addCriterion("EQUITY_FINANCING_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountIsNotNull() {
            addCriterion("EQUITY_FINANCING_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountEqualTo(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT =", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountNotEqualTo(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT <>", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountGreaterThan(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT >", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountGreaterThanOrEqualTo(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT >=", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountLessThan(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT <", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountLessThanOrEqualTo(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT <=", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountLike(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT like", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountNotLike(String value) {
            addCriterion("EQUITY_FINANCING_AMOUNT not like", value, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountIn(List<String> values) {
            addCriterion("EQUITY_FINANCING_AMOUNT in", values, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountNotIn(List<String> values) {
            addCriterion("EQUITY_FINANCING_AMOUNT not in", values, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountBetween(String value1, String value2) {
            addCriterion("EQUITY_FINANCING_AMOUNT between", value1, value2, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andEquityFinancingAmountNotBetween(String value1, String value2) {
            addCriterion("EQUITY_FINANCING_AMOUNT not between", value1, value2, "equityFinancingAmount");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeIsNull() {
            addCriterion("TO_BE_LISTED_FINANCING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeIsNotNull() {
            addCriterion("TO_BE_LISTED_FINANCING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeEqualTo(Date value) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME =", value, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeNotEqualTo(Date value) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME <>", value, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeGreaterThan(Date value) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME >", value, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME >=", value, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeLessThan(Date value) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME <", value, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeLessThanOrEqualTo(Date value) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME <=", value, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeIn(List<Date> values) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME in", values, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeNotIn(List<Date> values) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME not in", values, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeBetween(Date value1, Date value2) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME between", value1, value2, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andToBeListedFinancingTimeNotBetween(Date value1, Date value2) {
            addCriterion("TO_BE_LISTED_FINANCING_TIME not between", value1, value2, "toBeListedFinancingTime");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewIsNull() {
            addCriterion("COMPANY_OVERVIEW is null");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewIsNotNull() {
            addCriterion("COMPANY_OVERVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewEqualTo(String value) {
            addCriterion("COMPANY_OVERVIEW =", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewNotEqualTo(String value) {
            addCriterion("COMPANY_OVERVIEW <>", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewGreaterThan(String value) {
            addCriterion("COMPANY_OVERVIEW >", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_OVERVIEW >=", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewLessThan(String value) {
            addCriterion("COMPANY_OVERVIEW <", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_OVERVIEW <=", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewLike(String value) {
            addCriterion("COMPANY_OVERVIEW like", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewNotLike(String value) {
            addCriterion("COMPANY_OVERVIEW not like", value, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewIn(List<String> values) {
            addCriterion("COMPANY_OVERVIEW in", values, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewNotIn(List<String> values) {
            addCriterion("COMPANY_OVERVIEW not in", values, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewBetween(String value1, String value2) {
            addCriterion("COMPANY_OVERVIEW between", value1, value2, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andCompanyOverviewNotBetween(String value1, String value2) {
            addCriterion("COMPANY_OVERVIEW not between", value1, value2, "companyOverview");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNull() {
            addCriterion("MAIN_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNotNull() {
            addCriterion("MAIN_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessEqualTo(String value) {
            addCriterion("MAIN_BUSINESS =", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotEqualTo(String value) {
            addCriterion("MAIN_BUSINESS <>", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThan(String value) {
            addCriterion("MAIN_BUSINESS >", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_BUSINESS >=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThan(String value) {
            addCriterion("MAIN_BUSINESS <", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("MAIN_BUSINESS <=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLike(String value) {
            addCriterion("MAIN_BUSINESS like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotLike(String value) {
            addCriterion("MAIN_BUSINESS not like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIn(List<String> values) {
            addCriterion("MAIN_BUSINESS in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotIn(List<String> values) {
            addCriterion("MAIN_BUSINESS not in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessBetween(String value1, String value2) {
            addCriterion("MAIN_BUSINESS between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotBetween(String value1, String value2) {
            addCriterion("MAIN_BUSINESS not between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("PRODUCT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("PRODUCT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("PRODUCT_DESCRIPTION >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("PRODUCT_DESCRIPTION <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("PRODUCT_DESCRIPTION like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("PRODUCT_DESCRIPTION not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("PRODUCT_DESCRIPTION in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("PRODUCT_DESCRIPTION not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESCRIPTION between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESCRIPTION not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeIsNull() {
            addCriterion("SOURCE_OF_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeIsNotNull() {
            addCriterion("SOURCE_OF_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeEqualTo(String value) {
            addCriterion("SOURCE_OF_INCOME =", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeNotEqualTo(String value) {
            addCriterion("SOURCE_OF_INCOME <>", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeGreaterThan(String value) {
            addCriterion("SOURCE_OF_INCOME >", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_OF_INCOME >=", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeLessThan(String value) {
            addCriterion("SOURCE_OF_INCOME <", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_OF_INCOME <=", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeLike(String value) {
            addCriterion("SOURCE_OF_INCOME like", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeNotLike(String value) {
            addCriterion("SOURCE_OF_INCOME not like", value, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeIn(List<String> values) {
            addCriterion("SOURCE_OF_INCOME in", values, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeNotIn(List<String> values) {
            addCriterion("SOURCE_OF_INCOME not in", values, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeBetween(String value1, String value2) {
            addCriterion("SOURCE_OF_INCOME between", value1, value2, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andSourceOfIncomeNotBetween(String value1, String value2) {
            addCriterion("SOURCE_OF_INCOME not between", value1, value2, "sourceOfIncome");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("FILE_PATH =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("FILE_PATH <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("FILE_PATH >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_PATH >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("FILE_PATH <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("FILE_PATH <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("FILE_PATH like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("FILE_PATH not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("FILE_PATH in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("FILE_PATH not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("FILE_PATH between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("FILE_PATH not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyIsNull() {
            addCriterion("CORE_TECHNOLOGY is null");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyIsNotNull() {
            addCriterion("CORE_TECHNOLOGY is not null");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyEqualTo(String value) {
            addCriterion("CORE_TECHNOLOGY =", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyNotEqualTo(String value) {
            addCriterion("CORE_TECHNOLOGY <>", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyGreaterThan(String value) {
            addCriterion("CORE_TECHNOLOGY >", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("CORE_TECHNOLOGY >=", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyLessThan(String value) {
            addCriterion("CORE_TECHNOLOGY <", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyLessThanOrEqualTo(String value) {
            addCriterion("CORE_TECHNOLOGY <=", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyLike(String value) {
            addCriterion("CORE_TECHNOLOGY like", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyNotLike(String value) {
            addCriterion("CORE_TECHNOLOGY not like", value, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyIn(List<String> values) {
            addCriterion("CORE_TECHNOLOGY in", values, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyNotIn(List<String> values) {
            addCriterion("CORE_TECHNOLOGY not in", values, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyBetween(String value1, String value2) {
            addCriterion("CORE_TECHNOLOGY between", value1, value2, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCoreTechnologyNotBetween(String value1, String value2) {
            addCriterion("CORE_TECHNOLOGY not between", value1, value2, "coreTechnology");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameIsNull() {
            addCriterion("COMPETITROR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameIsNotNull() {
            addCriterion("COMPETITROR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameEqualTo(String value) {
            addCriterion("COMPETITROR_NAME =", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameNotEqualTo(String value) {
            addCriterion("COMPETITROR_NAME <>", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameGreaterThan(String value) {
            addCriterion("COMPETITROR_NAME >", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPETITROR_NAME >=", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameLessThan(String value) {
            addCriterion("COMPETITROR_NAME <", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameLessThanOrEqualTo(String value) {
            addCriterion("COMPETITROR_NAME <=", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameLike(String value) {
            addCriterion("COMPETITROR_NAME like", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameNotLike(String value) {
            addCriterion("COMPETITROR_NAME not like", value, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameIn(List<String> values) {
            addCriterion("COMPETITROR_NAME in", values, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameNotIn(List<String> values) {
            addCriterion("COMPETITROR_NAME not in", values, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameBetween(String value1, String value2) {
            addCriterion("COMPETITROR_NAME between", value1, value2, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andCompetitrorNameNotBetween(String value1, String value2) {
            addCriterion("COMPETITROR_NAME not between", value1, value2, "competitrorName");
            return (Criteria) this;
        }

        public Criteria andPatentIsNull() {
            addCriterion("PATENT is null");
            return (Criteria) this;
        }

        public Criteria andPatentIsNotNull() {
            addCriterion("PATENT is not null");
            return (Criteria) this;
        }

        public Criteria andPatentEqualTo(String value) {
            addCriterion("PATENT =", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentNotEqualTo(String value) {
            addCriterion("PATENT <>", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentGreaterThan(String value) {
            addCriterion("PATENT >", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentGreaterThanOrEqualTo(String value) {
            addCriterion("PATENT >=", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentLessThan(String value) {
            addCriterion("PATENT <", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentLessThanOrEqualTo(String value) {
            addCriterion("PATENT <=", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentLike(String value) {
            addCriterion("PATENT like", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentNotLike(String value) {
            addCriterion("PATENT not like", value, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentIn(List<String> values) {
            addCriterion("PATENT in", values, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentNotIn(List<String> values) {
            addCriterion("PATENT not in", values, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentBetween(String value1, String value2) {
            addCriterion("PATENT between", value1, value2, "patent");
            return (Criteria) this;
        }

        public Criteria andPatentNotBetween(String value1, String value2) {
            addCriterion("PATENT not between", value1, value2, "patent");
            return (Criteria) this;
        }

        public Criteria andSoftIsNull() {
            addCriterion("SOFT is null");
            return (Criteria) this;
        }

        public Criteria andSoftIsNotNull() {
            addCriterion("SOFT is not null");
            return (Criteria) this;
        }

        public Criteria andSoftEqualTo(String value) {
            addCriterion("SOFT =", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotEqualTo(String value) {
            addCriterion("SOFT <>", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftGreaterThan(String value) {
            addCriterion("SOFT >", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftGreaterThanOrEqualTo(String value) {
            addCriterion("SOFT >=", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftLessThan(String value) {
            addCriterion("SOFT <", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftLessThanOrEqualTo(String value) {
            addCriterion("SOFT <=", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftLike(String value) {
            addCriterion("SOFT like", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotLike(String value) {
            addCriterion("SOFT not like", value, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftIn(List<String> values) {
            addCriterion("SOFT in", values, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotIn(List<String> values) {
            addCriterion("SOFT not in", values, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftBetween(String value1, String value2) {
            addCriterion("SOFT between", value1, value2, "soft");
            return (Criteria) this;
        }

        public Criteria andSoftNotBetween(String value1, String value2) {
            addCriterion("SOFT not between", value1, value2, "soft");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNull() {
            addCriterion("TRADEMARK is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNotNull() {
            addCriterion("TRADEMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkEqualTo(String value) {
            addCriterion("TRADEMARK =", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotEqualTo(String value) {
            addCriterion("TRADEMARK <>", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThan(String value) {
            addCriterion("TRADEMARK >", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("TRADEMARK >=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThan(String value) {
            addCriterion("TRADEMARK <", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThanOrEqualTo(String value) {
            addCriterion("TRADEMARK <=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLike(String value) {
            addCriterion("TRADEMARK like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotLike(String value) {
            addCriterion("TRADEMARK not like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkIn(List<String> values) {
            addCriterion("TRADEMARK in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotIn(List<String> values) {
            addCriterion("TRADEMARK not in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkBetween(String value1, String value2) {
            addCriterion("TRADEMARK between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotBetween(String value1, String value2) {
            addCriterion("TRADEMARK not between", value1, value2, "trademark");
            return (Criteria) this;
        }
    }

    /**
     * PROJECT_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PROJECT_INFO 2017-09-15
     */
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