package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerCustomerInfoExample {
    /**
     * PER_CUSTOMER_INFO
     */
    protected String orderByClause;

    /**
     * PER_CUSTOMER_INFO
     */
    protected boolean distinct;

    /**
     * PER_CUSTOMER_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public PerCustomerInfoExample() {
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
     * PER_CUSTOMER_INFO 2017-09-15
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("PEOPLE =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("PEOPLE <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("PEOPLE >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("PEOPLE >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("PEOPLE <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("PEOPLE <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("PEOPLE like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("PEOPLE not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("PEOPLE in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("PEOPLE not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("PEOPLE between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("PEOPLE not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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

        public Criteria andWorkunitIsNull() {
            addCriterion("WORKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNotNull() {
            addCriterion("WORKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunitEqualTo(String value) {
            addCriterion("WORKUNIT =", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotEqualTo(String value) {
            addCriterion("WORKUNIT <>", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThan(String value) {
            addCriterion("WORKUNIT >", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThanOrEqualTo(String value) {
            addCriterion("WORKUNIT >=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThan(String value) {
            addCriterion("WORKUNIT <", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThanOrEqualTo(String value) {
            addCriterion("WORKUNIT <=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLike(String value) {
            addCriterion("WORKUNIT like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotLike(String value) {
            addCriterion("WORKUNIT not like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitIn(List<String> values) {
            addCriterion("WORKUNIT in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotIn(List<String> values) {
            addCriterion("WORKUNIT not in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitBetween(String value1, String value2) {
            addCriterion("WORKUNIT between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotBetween(String value1, String value2) {
            addCriterion("WORKUNIT not between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundIsNull() {
            addCriterion("FAMILYBACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundIsNotNull() {
            addCriterion("FAMILYBACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundEqualTo(String value) {
            addCriterion("FAMILYBACKGROUND =", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundNotEqualTo(String value) {
            addCriterion("FAMILYBACKGROUND <>", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundGreaterThan(String value) {
            addCriterion("FAMILYBACKGROUND >", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYBACKGROUND >=", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundLessThan(String value) {
            addCriterion("FAMILYBACKGROUND <", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundLessThanOrEqualTo(String value) {
            addCriterion("FAMILYBACKGROUND <=", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundLike(String value) {
            addCriterion("FAMILYBACKGROUND like", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundNotLike(String value) {
            addCriterion("FAMILYBACKGROUND not like", value, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundIn(List<String> values) {
            addCriterion("FAMILYBACKGROUND in", values, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundNotIn(List<String> values) {
            addCriterion("FAMILYBACKGROUND not in", values, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundBetween(String value1, String value2) {
            addCriterion("FAMILYBACKGROUND between", value1, value2, "familybackground");
            return (Criteria) this;
        }

        public Criteria andFamilybackgroundNotBetween(String value1, String value2) {
            addCriterion("FAMILYBACKGROUND not between", value1, value2, "familybackground");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("WORK is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("WORK is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(String value) {
            addCriterion("WORK =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(String value) {
            addCriterion("WORK <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(String value) {
            addCriterion("WORK >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(String value) {
            addCriterion("WORK >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(String value) {
            addCriterion("WORK <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(String value) {
            addCriterion("WORK <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLike(String value) {
            addCriterion("WORK like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotLike(String value) {
            addCriterion("WORK not like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<String> values) {
            addCriterion("WORK in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<String> values) {
            addCriterion("WORK not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(String value1, String value2) {
            addCriterion("WORK between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(String value1, String value2) {
            addCriterion("WORK not between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andSocialcontextIsNull() {
            addCriterion("SOCIALCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andSocialcontextIsNotNull() {
            addCriterion("SOCIALCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andSocialcontextEqualTo(String value) {
            addCriterion("SOCIALCONTEXT =", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextNotEqualTo(String value) {
            addCriterion("SOCIALCONTEXT <>", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextGreaterThan(String value) {
            addCriterion("SOCIALCONTEXT >", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIALCONTEXT >=", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextLessThan(String value) {
            addCriterion("SOCIALCONTEXT <", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextLessThanOrEqualTo(String value) {
            addCriterion("SOCIALCONTEXT <=", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextLike(String value) {
            addCriterion("SOCIALCONTEXT like", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextNotLike(String value) {
            addCriterion("SOCIALCONTEXT not like", value, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextIn(List<String> values) {
            addCriterion("SOCIALCONTEXT in", values, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextNotIn(List<String> values) {
            addCriterion("SOCIALCONTEXT not in", values, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextBetween(String value1, String value2) {
            addCriterion("SOCIALCONTEXT between", value1, value2, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andSocialcontextNotBetween(String value1, String value2) {
            addCriterion("SOCIALCONTEXT not between", value1, value2, "socialcontext");
            return (Criteria) this;
        }

        public Criteria andCreditstandingIsNull() {
            addCriterion("CREDITSTANDING is null");
            return (Criteria) this;
        }

        public Criteria andCreditstandingIsNotNull() {
            addCriterion("CREDITSTANDING is not null");
            return (Criteria) this;
        }

        public Criteria andCreditstandingEqualTo(String value) {
            addCriterion("CREDITSTANDING =", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingNotEqualTo(String value) {
            addCriterion("CREDITSTANDING <>", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingGreaterThan(String value) {
            addCriterion("CREDITSTANDING >", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITSTANDING >=", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingLessThan(String value) {
            addCriterion("CREDITSTANDING <", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingLessThanOrEqualTo(String value) {
            addCriterion("CREDITSTANDING <=", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingLike(String value) {
            addCriterion("CREDITSTANDING like", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingNotLike(String value) {
            addCriterion("CREDITSTANDING not like", value, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingIn(List<String> values) {
            addCriterion("CREDITSTANDING in", values, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingNotIn(List<String> values) {
            addCriterion("CREDITSTANDING not in", values, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingBetween(String value1, String value2) {
            addCriterion("CREDITSTANDING between", value1, value2, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andCreditstandingNotBetween(String value1, String value2) {
            addCriterion("CREDITSTANDING not between", value1, value2, "creditstanding");
            return (Criteria) this;
        }

        public Criteria andOtherinfosIsNull() {
            addCriterion("OTHERINFOS is null");
            return (Criteria) this;
        }

        public Criteria andOtherinfosIsNotNull() {
            addCriterion("OTHERINFOS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherinfosEqualTo(String value) {
            addCriterion("OTHERINFOS =", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosNotEqualTo(String value) {
            addCriterion("OTHERINFOS <>", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosGreaterThan(String value) {
            addCriterion("OTHERINFOS >", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERINFOS >=", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosLessThan(String value) {
            addCriterion("OTHERINFOS <", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosLessThanOrEqualTo(String value) {
            addCriterion("OTHERINFOS <=", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosLike(String value) {
            addCriterion("OTHERINFOS like", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosNotLike(String value) {
            addCriterion("OTHERINFOS not like", value, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosIn(List<String> values) {
            addCriterion("OTHERINFOS in", values, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosNotIn(List<String> values) {
            addCriterion("OTHERINFOS not in", values, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosBetween(String value1, String value2) {
            addCriterion("OTHERINFOS between", value1, value2, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andOtherinfosNotBetween(String value1, String value2) {
            addCriterion("OTHERINFOS not between", value1, value2, "otherinfos");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("COMPANYID like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("COMPANYID not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andInputuseridIsNull() {
            addCriterion("INPUTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andInputuseridIsNotNull() {
            addCriterion("INPUTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andInputuseridEqualTo(String value) {
            addCriterion("INPUTUSERID =", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotEqualTo(String value) {
            addCriterion("INPUTUSERID <>", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridGreaterThan(String value) {
            addCriterion("INPUTUSERID >", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTUSERID >=", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLessThan(String value) {
            addCriterion("INPUTUSERID <", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLessThanOrEqualTo(String value) {
            addCriterion("INPUTUSERID <=", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLike(String value) {
            addCriterion("INPUTUSERID like", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotLike(String value) {
            addCriterion("INPUTUSERID not like", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridIn(List<String> values) {
            addCriterion("INPUTUSERID in", values, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotIn(List<String> values) {
            addCriterion("INPUTUSERID not in", values, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridBetween(String value1, String value2) {
            addCriterion("INPUTUSERID between", value1, value2, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotBetween(String value1, String value2) {
            addCriterion("INPUTUSERID not between", value1, value2, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andPernumIsNull() {
            addCriterion("PERNUM is null");
            return (Criteria) this;
        }

        public Criteria andPernumIsNotNull() {
            addCriterion("PERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPernumEqualTo(String value) {
            addCriterion("PERNUM =", value, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumNotEqualTo(String value) {
            addCriterion("PERNUM <>", value, "pernum");
            return (Criteria) this;
        }
        
        public Criteria andPernumGreaterThan(String value) {
            addCriterion("PERNUM >", value, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumGreaterThanOrEqualTo(String value) {
            addCriterion("PERNUM >=", value, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumLessThan(String value) {
            addCriterion("PERNUM <", value, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumLessThanOrEqualTo(String value) {
            addCriterion("PERNUM <=", value, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumLike(String value) {
            addCriterion("PERNUM like", value, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumNotLike(String value) {
            addCriterion("PERNUM not like", value, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumIn(List<String> values) {
            addCriterion("PERNUM in", values, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumNotIn(List<String> values) {
            addCriterion("PERNUM not in", values, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumBetween(String value1, String value2) {
            addCriterion("PERNUM between", value1, value2, "pernum");
            return (Criteria) this;
        }

        public Criteria andPernumNotBetween(String value1, String value2) {
            addCriterion("PERNUM not between", value1, value2, "pernum");
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

        public Criteria andIsrelcusIsNull() {
            addCriterion("ISRELCUS is null");
            return (Criteria) this;
        }

        public Criteria andIsrelcusIsNotNull() {
            addCriterion("ISRELCUS is not null");
            return (Criteria) this;
        }

        public Criteria andIsrelcusEqualTo(String value) {
            addCriterion("ISRELCUS =", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusNotEqualTo(String value) {
            addCriterion("ISRELCUS <>", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusGreaterThan(String value) {
            addCriterion("ISRELCUS >", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusGreaterThanOrEqualTo(String value) {
            addCriterion("ISRELCUS >=", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusLessThan(String value) {
            addCriterion("ISRELCUS <", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusLessThanOrEqualTo(String value) {
            addCriterion("ISRELCUS <=", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusLike(String value) {
            addCriterion("ISRELCUS like", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusNotLike(String value) {
            addCriterion("ISRELCUS not like", value, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusIn(List<String> values) {
            addCriterion("ISRELCUS in", values, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusNotIn(List<String> values) {
            addCriterion("ISRELCUS not in", values, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusBetween(String value1, String value2) {
            addCriterion("ISRELCUS between", value1, value2, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andIsrelcusNotBetween(String value1, String value2) {
            addCriterion("ISRELCUS not between", value1, value2, "isrelcus");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNull() {
            addCriterion("REFEREE is null");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNotNull() {
            addCriterion("REFEREE is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeEqualTo(String value) {
            addCriterion("REFEREE =", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotEqualTo(String value) {
            addCriterion("REFEREE <>", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThan(String value) {
            addCriterion("REFEREE >", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThanOrEqualTo(String value) {
            addCriterion("REFEREE >=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThan(String value) {
            addCriterion("REFEREE <", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThanOrEqualTo(String value) {
            addCriterion("REFEREE <=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLike(String value) {
            addCriterion("REFEREE like", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotLike(String value) {
            addCriterion("REFEREE not like", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeIn(List<String> values) {
            addCriterion("REFEREE in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotIn(List<String> values) {
            addCriterion("REFEREE not in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeBetween(String value1, String value2) {
            addCriterion("REFEREE between", value1, value2, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotBetween(String value1, String value2) {
            addCriterion("REFEREE not between", value1, value2, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereenameIsNull() {
            addCriterion("REFEREENAME is null");
            return (Criteria) this;
        }

        public Criteria andRefereenameIsNotNull() {
            addCriterion("REFEREENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRefereenameEqualTo(String value) {
            addCriterion("REFEREENAME =", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameNotEqualTo(String value) {
            addCriterion("REFEREENAME <>", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameGreaterThan(String value) {
            addCriterion("REFEREENAME >", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameGreaterThanOrEqualTo(String value) {
            addCriterion("REFEREENAME >=", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameLessThan(String value) {
            addCriterion("REFEREENAME <", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameLessThanOrEqualTo(String value) {
            addCriterion("REFEREENAME <=", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameLike(String value) {
            addCriterion("REFEREENAME like", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameNotLike(String value) {
            addCriterion("REFEREENAME not like", value, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameIn(List<String> values) {
            addCriterion("REFEREENAME in", values, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameNotIn(List<String> values) {
            addCriterion("REFEREENAME not in", values, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameBetween(String value1, String value2) {
            addCriterion("REFEREENAME between", value1, value2, "refereename");
            return (Criteria) this;
        }

        public Criteria andRefereenameNotBetween(String value1, String value2) {
            addCriterion("REFEREENAME not between", value1, value2, "refereename");
            return (Criteria) this;
        }
        
     
    }

    /**
     * PER_CUSTOMER_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PER_CUSTOMER_INFO 2017-09-15
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