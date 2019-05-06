package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerInfoExample {
    /**
     * CUSTOMER_INFO
     */
    protected String orderByClause;

    /**
     * CUSTOMER_INFO
     */
    protected boolean distinct;

    /**
     * CUSTOMER_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public CustomerInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-10-23
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
     * @mbggenerated 2017-10-23
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * CUSTOMER_INFO 2017-10-23
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

        public Criteria andCompanynumIsNull() {
            addCriterion("COMPANYNUM is null");
            return (Criteria) this;
        }

        public Criteria andCompanynumIsNotNull() {
            addCriterion("COMPANYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynumEqualTo(String value) {
            addCriterion("COMPANYNUM =", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumNotEqualTo(String value) {
            addCriterion("COMPANYNUM <>", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumGreaterThan(String value) {
            addCriterion("COMPANYNUM >", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNUM >=", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumLessThan(String value) {
            addCriterion("COMPANYNUM <", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNUM <=", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumLike(String value) {
            addCriterion("COMPANYNUM like", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumNotLike(String value) {
            addCriterion("COMPANYNUM not like", value, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumIn(List<String> values) {
            addCriterion("COMPANYNUM in", values, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumNotIn(List<String> values) {
            addCriterion("COMPANYNUM not in", values, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumBetween(String value1, String value2) {
            addCriterion("COMPANYNUM between", value1, value2, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynumNotBetween(String value1, String value2) {
            addCriterion("COMPANYNUM not between", value1, value2, "companynum");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("COMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("COMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("COMPANYNAME =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("COMPANYNAME <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("COMPANYNAME >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("COMPANYNAME <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("COMPANYNAME like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("COMPANYNAME not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("COMPANYNAME in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("COMPANYNAME not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("COMPANYNAME between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("COMPANYNAME not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonIsNull() {
            addCriterion("COMANYLEGALPERSON is null");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonIsNotNull() {
            addCriterion("COMANYLEGALPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonEqualTo(String value) {
            addCriterion("COMANYLEGALPERSON =", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonNotEqualTo(String value) {
            addCriterion("COMANYLEGALPERSON <>", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonGreaterThan(String value) {
            addCriterion("COMANYLEGALPERSON >", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonGreaterThanOrEqualTo(String value) {
            addCriterion("COMANYLEGALPERSON >=", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonLessThan(String value) {
            addCriterion("COMANYLEGALPERSON <", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonLessThanOrEqualTo(String value) {
            addCriterion("COMANYLEGALPERSON <=", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonLike(String value) {
            addCriterion("COMANYLEGALPERSON like", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonNotLike(String value) {
            addCriterion("COMANYLEGALPERSON not like", value, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonIn(List<String> values) {
            addCriterion("COMANYLEGALPERSON in", values, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonNotIn(List<String> values) {
            addCriterion("COMANYLEGALPERSON not in", values, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonBetween(String value1, String value2) {
            addCriterion("COMANYLEGALPERSON between", value1, value2, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andComanylegalpersonNotBetween(String value1, String value2) {
            addCriterion("COMANYLEGALPERSON not between", value1, value2, "comanylegalperson");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNull() {
            addCriterion("REGISTEREDCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNotNull() {
            addCriterion("REGISTEREDCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalEqualTo(String value) {
            addCriterion("REGISTEREDCAPITAL =", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotEqualTo(String value) {
            addCriterion("REGISTEREDCAPITAL <>", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThan(String value) {
            addCriterion("REGISTEREDCAPITAL >", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTEREDCAPITAL >=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThan(String value) {
            addCriterion("REGISTEREDCAPITAL <", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThanOrEqualTo(String value) {
            addCriterion("REGISTEREDCAPITAL <=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLike(String value) {
            addCriterion("REGISTEREDCAPITAL like", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotLike(String value) {
            addCriterion("REGISTEREDCAPITAL not like", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIn(List<String> values) {
            addCriterion("REGISTEREDCAPITAL in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotIn(List<String> values) {
            addCriterion("REGISTEREDCAPITAL not in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalBetween(String value1, String value2) {
            addCriterion("REGISTEREDCAPITAL between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotBetween(String value1, String value2) {
            addCriterion("REGISTEREDCAPITAL not between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andMainbusinessIsNull() {
            addCriterion("MAINBUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andMainbusinessIsNotNull() {
            addCriterion("MAINBUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andMainbusinessEqualTo(String value) {
            addCriterion("MAINBUSINESS =", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotEqualTo(String value) {
            addCriterion("MAINBUSINESS <>", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessGreaterThan(String value) {
            addCriterion("MAINBUSINESS >", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("MAINBUSINESS >=", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessLessThan(String value) {
            addCriterion("MAINBUSINESS <", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessLessThanOrEqualTo(String value) {
            addCriterion("MAINBUSINESS <=", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessLike(String value) {
            addCriterion("MAINBUSINESS like", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotLike(String value) {
            addCriterion("MAINBUSINESS not like", value, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessIn(List<String> values) {
            addCriterion("MAINBUSINESS in", values, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotIn(List<String> values) {
            addCriterion("MAINBUSINESS not in", values, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessBetween(String value1, String value2) {
            addCriterion("MAINBUSINESS between", value1, value2, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andMainbusinessNotBetween(String value1, String value2) {
            addCriterion("MAINBUSINESS not between", value1, value2, "mainbusiness");
            return (Criteria) this;
        }

        public Criteria andEmployeesIsNull() {
            addCriterion("EMPLOYEES is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesIsNotNull() {
            addCriterion("EMPLOYEES is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesEqualTo(String value) {
            addCriterion("EMPLOYEES =", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotEqualTo(String value) {
            addCriterion("EMPLOYEES <>", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesGreaterThan(String value) {
            addCriterion("EMPLOYEES >", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEES >=", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesLessThan(String value) {
            addCriterion("EMPLOYEES <", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEES <=", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesLike(String value) {
            addCriterion("EMPLOYEES like", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotLike(String value) {
            addCriterion("EMPLOYEES not like", value, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesIn(List<String> values) {
            addCriterion("EMPLOYEES in", values, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotIn(List<String> values) {
            addCriterion("EMPLOYEES not in", values, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesBetween(String value1, String value2) {
            addCriterion("EMPLOYEES between", value1, value2, "employees");
            return (Criteria) this;
        }

        public Criteria andEmployeesNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEES not between", value1, value2, "employees");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNull() {
            addCriterion("COMPANYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIsNotNull() {
            addCriterion("COMPANYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanytypeEqualTo(String value) {
            addCriterion("COMPANYTYPE =", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotEqualTo(String value) {
            addCriterion("COMPANYTYPE <>", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThan(String value) {
            addCriterion("COMPANYTYPE >", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYTYPE >=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThan(String value) {
            addCriterion("COMPANYTYPE <", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLessThanOrEqualTo(String value) {
            addCriterion("COMPANYTYPE <=", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeLike(String value) {
            addCriterion("COMPANYTYPE like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotLike(String value) {
            addCriterion("COMPANYTYPE not like", value, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeIn(List<String> values) {
            addCriterion("COMPANYTYPE in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotIn(List<String> values) {
            addCriterion("COMPANYTYPE not in", values, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeBetween(String value1, String value2) {
            addCriterion("COMPANYTYPE between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanytypeNotBetween(String value1, String value2) {
            addCriterion("COMPANYTYPE not between", value1, value2, "companytype");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddIsNull() {
            addCriterion("COMPANYREGISTERADD is null");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddIsNotNull() {
            addCriterion("COMPANYREGISTERADD is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddEqualTo(String value) {
            addCriterion("COMPANYREGISTERADD =", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddNotEqualTo(String value) {
            addCriterion("COMPANYREGISTERADD <>", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddGreaterThan(String value) {
            addCriterion("COMPANYREGISTERADD >", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYREGISTERADD >=", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddLessThan(String value) {
            addCriterion("COMPANYREGISTERADD <", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddLessThanOrEqualTo(String value) {
            addCriterion("COMPANYREGISTERADD <=", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddLike(String value) {
            addCriterion("COMPANYREGISTERADD like", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddNotLike(String value) {
            addCriterion("COMPANYREGISTERADD not like", value, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddIn(List<String> values) {
            addCriterion("COMPANYREGISTERADD in", values, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddNotIn(List<String> values) {
            addCriterion("COMPANYREGISTERADD not in", values, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddBetween(String value1, String value2) {
            addCriterion("COMPANYREGISTERADD between", value1, value2, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyregisteraddNotBetween(String value1, String value2) {
            addCriterion("COMPANYREGISTERADD not between", value1, value2, "companyregisteradd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddIsNull() {
            addCriterion("COMPANYOFFICEADD is null");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddIsNotNull() {
            addCriterion("COMPANYOFFICEADD is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddEqualTo(String value) {
            addCriterion("COMPANYOFFICEADD =", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddNotEqualTo(String value) {
            addCriterion("COMPANYOFFICEADD <>", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddGreaterThan(String value) {
            addCriterion("COMPANYOFFICEADD >", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYOFFICEADD >=", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddLessThan(String value) {
            addCriterion("COMPANYOFFICEADD <", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddLessThanOrEqualTo(String value) {
            addCriterion("COMPANYOFFICEADD <=", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddLike(String value) {
            addCriterion("COMPANYOFFICEADD like", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddNotLike(String value) {
            addCriterion("COMPANYOFFICEADD not like", value, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddIn(List<String> values) {
            addCriterion("COMPANYOFFICEADD in", values, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddNotIn(List<String> values) {
            addCriterion("COMPANYOFFICEADD not in", values, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddBetween(String value1, String value2) {
            addCriterion("COMPANYOFFICEADD between", value1, value2, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andCompanyofficeaddNotBetween(String value1, String value2) {
            addCriterion("COMPANYOFFICEADD not between", value1, value2, "companyofficeadd");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("CONTACTS =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("CONTACTS <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("CONTACTS >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("CONTACTS <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("CONTACTS like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("CONTACTS not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("CONTACTS in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("CONTACTS not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("CONTACTS between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("CONTACTS not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("CONTACTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("CONTACTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("CONTACTNUMBER =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("CONTACTNUMBER <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("CONTACTNUMBER >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTNUMBER >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("CONTACTNUMBER <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("CONTACTNUMBER <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("CONTACTNUMBER like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("CONTACTNUMBER not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("CONTACTNUMBER in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("CONTACTNUMBER not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("CONTACTNUMBER between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("CONTACTNUMBER not between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("PHONENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("PHONENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("PHONENUMBER =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("PHONENUMBER <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("PHONENUMBER >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONENUMBER >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("PHONENUMBER <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("PHONENUMBER <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("PHONENUMBER like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("PHONENUMBER not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("PHONENUMBER in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("PHONENUMBER not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("PHONENUMBER between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("PHONENUMBER not between", value1, value2, "phonenumber");
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

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNull() {
            addCriterion("ENGLISHNAME is null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNotNull() {
            addCriterion("ENGLISHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameEqualTo(String value) {
            addCriterion("ENGLISHNAME =", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotEqualTo(String value) {
            addCriterion("ENGLISHNAME <>", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThan(String value) {
            addCriterion("ENGLISHNAME >", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISHNAME >=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThan(String value) {
            addCriterion("ENGLISHNAME <", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("ENGLISHNAME <=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLike(String value) {
            addCriterion("ENGLISHNAME like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotLike(String value) {
            addCriterion("ENGLISHNAME not like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIn(List<String> values) {
            addCriterion("ENGLISHNAME in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotIn(List<String> values) {
            addCriterion("ENGLISHNAME not in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameBetween(String value1, String value2) {
            addCriterion("ENGLISHNAME between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotBetween(String value1, String value2) {
            addCriterion("ENGLISHNAME not between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalIsNull() {
            addCriterion("PRACTICALCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalIsNotNull() {
            addCriterion("PRACTICALCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalEqualTo(String value) {
            addCriterion("PRACTICALCAPITAL =", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalNotEqualTo(String value) {
            addCriterion("PRACTICALCAPITAL <>", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalGreaterThan(String value) {
            addCriterion("PRACTICALCAPITAL >", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("PRACTICALCAPITAL >=", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalLessThan(String value) {
            addCriterion("PRACTICALCAPITAL <", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalLessThanOrEqualTo(String value) {
            addCriterion("PRACTICALCAPITAL <=", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalLike(String value) {
            addCriterion("PRACTICALCAPITAL like", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalNotLike(String value) {
            addCriterion("PRACTICALCAPITAL not like", value, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalIn(List<String> values) {
            addCriterion("PRACTICALCAPITAL in", values, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalNotIn(List<String> values) {
            addCriterion("PRACTICALCAPITAL not in", values, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalBetween(String value1, String value2) {
            addCriterion("PRACTICALCAPITAL between", value1, value2, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andPracticalcapitalNotBetween(String value1, String value2) {
            addCriterion("PRACTICALCAPITAL not between", value1, value2, "practicalcapital");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("BUSINESSTYPE like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("BUSINESSTYPE not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andIshighindustryIsNull() {
            addCriterion("ISHIGHINDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIshighindustryIsNotNull() {
            addCriterion("ISHIGHINDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIshighindustryEqualTo(String value) {
            addCriterion("ISHIGHINDUSTRY =", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryNotEqualTo(String value) {
            addCriterion("ISHIGHINDUSTRY <>", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryGreaterThan(String value) {
            addCriterion("ISHIGHINDUSTRY >", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryGreaterThanOrEqualTo(String value) {
            addCriterion("ISHIGHINDUSTRY >=", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryLessThan(String value) {
            addCriterion("ISHIGHINDUSTRY <", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryLessThanOrEqualTo(String value) {
            addCriterion("ISHIGHINDUSTRY <=", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryLike(String value) {
            addCriterion("ISHIGHINDUSTRY like", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryNotLike(String value) {
            addCriterion("ISHIGHINDUSTRY not like", value, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryIn(List<String> values) {
            addCriterion("ISHIGHINDUSTRY in", values, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryNotIn(List<String> values) {
            addCriterion("ISHIGHINDUSTRY not in", values, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryBetween(String value1, String value2) {
            addCriterion("ISHIGHINDUSTRY between", value1, value2, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andIshighindustryNotBetween(String value1, String value2) {
            addCriterion("ISHIGHINDUSTRY not between", value1, value2, "ishighindustry");
            return (Criteria) this;
        }

        public Criteria andCustomersizeIsNull() {
            addCriterion("CUSTOMERSIZE is null");
            return (Criteria) this;
        }

        public Criteria andCustomersizeIsNotNull() {
            addCriterion("CUSTOMERSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersizeEqualTo(String value) {
            addCriterion("CUSTOMERSIZE =", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeNotEqualTo(String value) {
            addCriterion("CUSTOMERSIZE <>", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeGreaterThan(String value) {
            addCriterion("CUSTOMERSIZE >", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSIZE >=", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeLessThan(String value) {
            addCriterion("CUSTOMERSIZE <", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSIZE <=", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeLike(String value) {
            addCriterion("CUSTOMERSIZE like", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeNotLike(String value) {
            addCriterion("CUSTOMERSIZE not like", value, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeIn(List<String> values) {
            addCriterion("CUSTOMERSIZE in", values, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeNotIn(List<String> values) {
            addCriterion("CUSTOMERSIZE not in", values, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeBetween(String value1, String value2) {
            addCriterion("CUSTOMERSIZE between", value1, value2, "customersize");
            return (Criteria) this;
        }

        public Criteria andCustomersizeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSIZE not between", value1, value2, "customersize");
            return (Criteria) this;
        }

        public Criteria andShareholderIsNull() {
            addCriterion("SHAREHOLDER is null");
            return (Criteria) this;
        }

        public Criteria andShareholderIsNotNull() {
            addCriterion("SHAREHOLDER is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderEqualTo(String value) {
            addCriterion("SHAREHOLDER =", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotEqualTo(String value) {
            addCriterion("SHAREHOLDER <>", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThan(String value) {
            addCriterion("SHAREHOLDER >", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderGreaterThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDER >=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThan(String value) {
            addCriterion("SHAREHOLDER <", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLessThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDER <=", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderLike(String value) {
            addCriterion("SHAREHOLDER like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotLike(String value) {
            addCriterion("SHAREHOLDER not like", value, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderIn(List<String> values) {
            addCriterion("SHAREHOLDER in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotIn(List<String> values) {
            addCriterion("SHAREHOLDER not in", values, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderBetween(String value1, String value2) {
            addCriterion("SHAREHOLDER between", value1, value2, "shareholder");
            return (Criteria) this;
        }

        public Criteria andShareholderNotBetween(String value1, String value2) {
            addCriterion("SHAREHOLDER not between", value1, value2, "shareholder");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("DIRECTOR is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("DIRECTOR is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("DIRECTOR =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("DIRECTOR <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("DIRECTOR >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTOR >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("DIRECTOR <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("DIRECTOR <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("DIRECTOR like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("DIRECTOR not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("DIRECTOR in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("DIRECTOR not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("DIRECTOR between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("DIRECTOR not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andManagersIsNull() {
            addCriterion("MANAGERS is null");
            return (Criteria) this;
        }

        public Criteria andManagersIsNotNull() {
            addCriterion("MANAGERS is not null");
            return (Criteria) this;
        }

        public Criteria andManagersEqualTo(String value) {
            addCriterion("MANAGERS =", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotEqualTo(String value) {
            addCriterion("MANAGERS <>", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersGreaterThan(String value) {
            addCriterion("MANAGERS >", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGERS >=", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersLessThan(String value) {
            addCriterion("MANAGERS <", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersLessThanOrEqualTo(String value) {
            addCriterion("MANAGERS <=", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersLike(String value) {
            addCriterion("MANAGERS like", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotLike(String value) {
            addCriterion("MANAGERS not like", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersIn(List<String> values) {
            addCriterion("MANAGERS in", values, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotIn(List<String> values) {
            addCriterion("MANAGERS not in", values, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersBetween(String value1, String value2) {
            addCriterion("MANAGERS between", value1, value2, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotBetween(String value1, String value2) {
            addCriterion("MANAGERS not between", value1, value2, "managers");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateIsNull() {
            addCriterion("ORGCODEVALIDITYDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateIsNotNull() {
            addCriterion("ORGCODEVALIDITYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateEqualTo(String value) {
            addCriterion("ORGCODEVALIDITYDATE =", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateNotEqualTo(String value) {
            addCriterion("ORGCODEVALIDITYDATE <>", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateGreaterThan(String value) {
            addCriterion("ORGCODEVALIDITYDATE >", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODEVALIDITYDATE >=", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateLessThan(String value) {
            addCriterion("ORGCODEVALIDITYDATE <", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateLessThanOrEqualTo(String value) {
            addCriterion("ORGCODEVALIDITYDATE <=", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateLike(String value) {
            addCriterion("ORGCODEVALIDITYDATE like", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateNotLike(String value) {
            addCriterion("ORGCODEVALIDITYDATE not like", value, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateIn(List<String> values) {
            addCriterion("ORGCODEVALIDITYDATE in", values, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateNotIn(List<String> values) {
            addCriterion("ORGCODEVALIDITYDATE not in", values, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateBetween(String value1, String value2) {
            addCriterion("ORGCODEVALIDITYDATE between", value1, value2, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andOrgcodevaliditydateNotBetween(String value1, String value2) {
            addCriterion("ORGCODEVALIDITYDATE not between", value1, value2, "orgcodevaliditydate");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNull() {
            addCriterion("BUSINESSLICENSE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNotNull() {
            addCriterion("BUSINESSLICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseEqualTo(String value) {
            addCriterion("BUSINESSLICENSE =", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotEqualTo(String value) {
            addCriterion("BUSINESSLICENSE <>", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThan(String value) {
            addCriterion("BUSINESSLICENSE >", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSLICENSE >=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThan(String value) {
            addCriterion("BUSINESSLICENSE <", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSLICENSE <=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLike(String value) {
            addCriterion("BUSINESSLICENSE like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotLike(String value) {
            addCriterion("BUSINESSLICENSE not like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIn(List<String> values) {
            addCriterion("BUSINESSLICENSE in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotIn(List<String> values) {
            addCriterion("BUSINESSLICENSE not in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseBetween(String value1, String value2) {
            addCriterion("BUSINESSLICENSE between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotBetween(String value1, String value2) {
            addCriterion("BUSINESSLICENSE not between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateIsNull() {
            addCriterion("BUSLICENSEVALDATE is null");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateIsNotNull() {
            addCriterion("BUSLICENSEVALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateEqualTo(String value) {
            addCriterion("BUSLICENSEVALDATE =", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateNotEqualTo(String value) {
            addCriterion("BUSLICENSEVALDATE <>", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateGreaterThan(String value) {
            addCriterion("BUSLICENSEVALDATE >", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSLICENSEVALDATE >=", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateLessThan(String value) {
            addCriterion("BUSLICENSEVALDATE <", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateLessThanOrEqualTo(String value) {
            addCriterion("BUSLICENSEVALDATE <=", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateLike(String value) {
            addCriterion("BUSLICENSEVALDATE like", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateNotLike(String value) {
            addCriterion("BUSLICENSEVALDATE not like", value, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateIn(List<String> values) {
            addCriterion("BUSLICENSEVALDATE in", values, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateNotIn(List<String> values) {
            addCriterion("BUSLICENSEVALDATE not in", values, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateBetween(String value1, String value2) {
            addCriterion("BUSLICENSEVALDATE between", value1, value2, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensevaldateNotBetween(String value1, String value2) {
            addCriterion("BUSLICENSEVALDATE not between", value1, value2, "buslicensevaldate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateIsNull() {
            addCriterion("BUSLICENSECHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateIsNotNull() {
            addCriterion("BUSLICENSECHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateEqualTo(String value) {
            addCriterion("BUSLICENSECHECKDATE =", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateNotEqualTo(String value) {
            addCriterion("BUSLICENSECHECKDATE <>", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateGreaterThan(String value) {
            addCriterion("BUSLICENSECHECKDATE >", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSLICENSECHECKDATE >=", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateLessThan(String value) {
            addCriterion("BUSLICENSECHECKDATE <", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateLessThanOrEqualTo(String value) {
            addCriterion("BUSLICENSECHECKDATE <=", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateLike(String value) {
            addCriterion("BUSLICENSECHECKDATE like", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateNotLike(String value) {
            addCriterion("BUSLICENSECHECKDATE not like", value, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateIn(List<String> values) {
            addCriterion("BUSLICENSECHECKDATE in", values, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateNotIn(List<String> values) {
            addCriterion("BUSLICENSECHECKDATE not in", values, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateBetween(String value1, String value2) {
            addCriterion("BUSLICENSECHECKDATE between", value1, value2, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andBuslicensecheckdateNotBetween(String value1, String value2) {
            addCriterion("BUSLICENSECHECKDATE not between", value1, value2, "buslicensecheckdate");
            return (Criteria) this;
        }

        public Criteria andCustomerbankIsNull() {
            addCriterion("CUSTOMERBANK is null");
            return (Criteria) this;
        }

        public Criteria andCustomerbankIsNotNull() {
            addCriterion("CUSTOMERBANK is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerbankEqualTo(String value) {
            addCriterion("CUSTOMERBANK =", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankNotEqualTo(String value) {
            addCriterion("CUSTOMERBANK <>", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankGreaterThan(String value) {
            addCriterion("CUSTOMERBANK >", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERBANK >=", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankLessThan(String value) {
            addCriterion("CUSTOMERBANK <", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERBANK <=", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankLike(String value) {
            addCriterion("CUSTOMERBANK like", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankNotLike(String value) {
            addCriterion("CUSTOMERBANK not like", value, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankIn(List<String> values) {
            addCriterion("CUSTOMERBANK in", values, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankNotIn(List<String> values) {
            addCriterion("CUSTOMERBANK not in", values, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankBetween(String value1, String value2) {
            addCriterion("CUSTOMERBANK between", value1, value2, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomerbankNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERBANK not between", value1, value2, "customerbank");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountIsNull() {
            addCriterion("CUSTOMERACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountIsNotNull() {
            addCriterion("CUSTOMERACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountEqualTo(String value) {
            addCriterion("CUSTOMERACCOUNT =", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountNotEqualTo(String value) {
            addCriterion("CUSTOMERACCOUNT <>", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountGreaterThan(String value) {
            addCriterion("CUSTOMERACCOUNT >", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERACCOUNT >=", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountLessThan(String value) {
            addCriterion("CUSTOMERACCOUNT <", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERACCOUNT <=", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountLike(String value) {
            addCriterion("CUSTOMERACCOUNT like", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountNotLike(String value) {
            addCriterion("CUSTOMERACCOUNT not like", value, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountIn(List<String> values) {
            addCriterion("CUSTOMERACCOUNT in", values, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountNotIn(List<String> values) {
            addCriterion("CUSTOMERACCOUNT not in", values, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountBetween(String value1, String value2) {
            addCriterion("CUSTOMERACCOUNT between", value1, value2, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andCustomeraccountNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERACCOUNT not between", value1, value2, "customeraccount");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonIsNull() {
            addCriterion("BUICONTROLPERSON is null");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonIsNotNull() {
            addCriterion("BUICONTROLPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonEqualTo(String value) {
            addCriterion("BUICONTROLPERSON =", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonNotEqualTo(String value) {
            addCriterion("BUICONTROLPERSON <>", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonGreaterThan(String value) {
            addCriterion("BUICONTROLPERSON >", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonGreaterThanOrEqualTo(String value) {
            addCriterion("BUICONTROLPERSON >=", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonLessThan(String value) {
            addCriterion("BUICONTROLPERSON <", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonLessThanOrEqualTo(String value) {
            addCriterion("BUICONTROLPERSON <=", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonLike(String value) {
            addCriterion("BUICONTROLPERSON like", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonNotLike(String value) {
            addCriterion("BUICONTROLPERSON not like", value, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonIn(List<String> values) {
            addCriterion("BUICONTROLPERSON in", values, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonNotIn(List<String> values) {
            addCriterion("BUICONTROLPERSON not in", values, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonBetween(String value1, String value2) {
            addCriterion("BUICONTROLPERSON between", value1, value2, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andBuicontrolpersonNotBetween(String value1, String value2) {
            addCriterion("BUICONTROLPERSON not between", value1, value2, "buicontrolperson");
            return (Criteria) this;
        }

        public Criteria andOperateaddIsNull() {
            addCriterion("OPERATEADD is null");
            return (Criteria) this;
        }

        public Criteria andOperateaddIsNotNull() {
            addCriterion("OPERATEADD is not null");
            return (Criteria) this;
        }

        public Criteria andOperateaddEqualTo(String value) {
            addCriterion("OPERATEADD =", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddNotEqualTo(String value) {
            addCriterion("OPERATEADD <>", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddGreaterThan(String value) {
            addCriterion("OPERATEADD >", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATEADD >=", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddLessThan(String value) {
            addCriterion("OPERATEADD <", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddLessThanOrEqualTo(String value) {
            addCriterion("OPERATEADD <=", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddLike(String value) {
            addCriterion("OPERATEADD like", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddNotLike(String value) {
            addCriterion("OPERATEADD not like", value, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddIn(List<String> values) {
            addCriterion("OPERATEADD in", values, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddNotIn(List<String> values) {
            addCriterion("OPERATEADD not in", values, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddBetween(String value1, String value2) {
            addCriterion("OPERATEADD between", value1, value2, "operateadd");
            return (Criteria) this;
        }

        public Criteria andOperateaddNotBetween(String value1, String value2) {
            addCriterion("OPERATEADD not between", value1, value2, "operateadd");
            return (Criteria) this;
        }

        public Criteria andIntepronameIsNull() {
            addCriterion("INTEPRONAME is null");
            return (Criteria) this;
        }

        public Criteria andIntepronameIsNotNull() {
            addCriterion("INTEPRONAME is not null");
            return (Criteria) this;
        }

        public Criteria andIntepronameEqualTo(String value) {
            addCriterion("INTEPRONAME =", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameNotEqualTo(String value) {
            addCriterion("INTEPRONAME <>", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameGreaterThan(String value) {
            addCriterion("INTEPRONAME >", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameGreaterThanOrEqualTo(String value) {
            addCriterion("INTEPRONAME >=", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameLessThan(String value) {
            addCriterion("INTEPRONAME <", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameLessThanOrEqualTo(String value) {
            addCriterion("INTEPRONAME <=", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameLike(String value) {
            addCriterion("INTEPRONAME like", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameNotLike(String value) {
            addCriterion("INTEPRONAME not like", value, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameIn(List<String> values) {
            addCriterion("INTEPRONAME in", values, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameNotIn(List<String> values) {
            addCriterion("INTEPRONAME not in", values, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameBetween(String value1, String value2) {
            addCriterion("INTEPRONAME between", value1, value2, "inteproname");
            return (Criteria) this;
        }

        public Criteria andIntepronameNotBetween(String value1, String value2) {
            addCriterion("INTEPRONAME not between", value1, value2, "inteproname");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateIsNull() {
            addCriterion("AUDITFINANCEDATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateIsNotNull() {
            addCriterion("AUDITFINANCEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateEqualTo(String value) {
            addCriterion("AUDITFINANCEDATE =", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateNotEqualTo(String value) {
            addCriterion("AUDITFINANCEDATE <>", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateGreaterThan(String value) {
            addCriterion("AUDITFINANCEDATE >", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITFINANCEDATE >=", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateLessThan(String value) {
            addCriterion("AUDITFINANCEDATE <", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateLessThanOrEqualTo(String value) {
            addCriterion("AUDITFINANCEDATE <=", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateLike(String value) {
            addCriterion("AUDITFINANCEDATE like", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateNotLike(String value) {
            addCriterion("AUDITFINANCEDATE not like", value, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateIn(List<String> values) {
            addCriterion("AUDITFINANCEDATE in", values, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateNotIn(List<String> values) {
            addCriterion("AUDITFINANCEDATE not in", values, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateBetween(String value1, String value2) {
            addCriterion("AUDITFINANCEDATE between", value1, value2, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAuditfinancedateNotBetween(String value1, String value2) {
            addCriterion("AUDITFINANCEDATE not between", value1, value2, "auditfinancedate");
            return (Criteria) this;
        }

        public Criteria andAssetIsNull() {
            addCriterion("ASSET is null");
            return (Criteria) this;
        }

        public Criteria andAssetIsNotNull() {
            addCriterion("ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andAssetEqualTo(String value) {
            addCriterion("ASSET =", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotEqualTo(String value) {
            addCriterion("ASSET <>", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThan(String value) {
            addCriterion("ASSET >", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThanOrEqualTo(String value) {
            addCriterion("ASSET >=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThan(String value) {
            addCriterion("ASSET <", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThanOrEqualTo(String value) {
            addCriterion("ASSET <=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLike(String value) {
            addCriterion("ASSET like", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotLike(String value) {
            addCriterion("ASSET not like", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetIn(List<String> values) {
            addCriterion("ASSET in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotIn(List<String> values) {
            addCriterion("ASSET not in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetBetween(String value1, String value2) {
            addCriterion("ASSET between", value1, value2, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotBetween(String value1, String value2) {
            addCriterion("ASSET not between", value1, value2, "asset");
            return (Criteria) this;
        }

        public Criteria andNetassetIsNull() {
            addCriterion("NETASSET is null");
            return (Criteria) this;
        }

        public Criteria andNetassetIsNotNull() {
            addCriterion("NETASSET is not null");
            return (Criteria) this;
        }

        public Criteria andNetassetEqualTo(String value) {
            addCriterion("NETASSET =", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetNotEqualTo(String value) {
            addCriterion("NETASSET <>", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetGreaterThan(String value) {
            addCriterion("NETASSET >", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetGreaterThanOrEqualTo(String value) {
            addCriterion("NETASSET >=", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetLessThan(String value) {
            addCriterion("NETASSET <", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetLessThanOrEqualTo(String value) {
            addCriterion("NETASSET <=", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetLike(String value) {
            addCriterion("NETASSET like", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetNotLike(String value) {
            addCriterion("NETASSET not like", value, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetIn(List<String> values) {
            addCriterion("NETASSET in", values, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetNotIn(List<String> values) {
            addCriterion("NETASSET not in", values, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetBetween(String value1, String value2) {
            addCriterion("NETASSET between", value1, value2, "netasset");
            return (Criteria) this;
        }

        public Criteria andNetassetNotBetween(String value1, String value2) {
            addCriterion("NETASSET not between", value1, value2, "netasset");
            return (Criteria) this;
        }

        public Criteria andReceivableIsNull() {
            addCriterion("RECEIVABLE is null");
            return (Criteria) this;
        }

        public Criteria andReceivableIsNotNull() {
            addCriterion("RECEIVABLE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableEqualTo(String value) {
            addCriterion("RECEIVABLE =", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotEqualTo(String value) {
            addCriterion("RECEIVABLE <>", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableGreaterThan(String value) {
            addCriterion("RECEIVABLE >", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVABLE >=", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLessThan(String value) {
            addCriterion("RECEIVABLE <", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLessThanOrEqualTo(String value) {
            addCriterion("RECEIVABLE <=", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableLike(String value) {
            addCriterion("RECEIVABLE like", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotLike(String value) {
            addCriterion("RECEIVABLE not like", value, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableIn(List<String> values) {
            addCriterion("RECEIVABLE in", values, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotIn(List<String> values) {
            addCriterion("RECEIVABLE not in", values, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableBetween(String value1, String value2) {
            addCriterion("RECEIVABLE between", value1, value2, "receivable");
            return (Criteria) this;
        }

        public Criteria andReceivableNotBetween(String value1, String value2) {
            addCriterion("RECEIVABLE not between", value1, value2, "receivable");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(String value) {
            addCriterion("INVENTORY =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(String value) {
            addCriterion("INVENTORY <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(String value) {
            addCriterion("INVENTORY >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(String value) {
            addCriterion("INVENTORY <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLike(String value) {
            addCriterion("INVENTORY like", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotLike(String value) {
            addCriterion("INVENTORY not like", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<String> values) {
            addCriterion("INVENTORY in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<String> values) {
            addCriterion("INVENTORY not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(String value1, String value2) {
            addCriterion("INVENTORY between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(String value1, String value2) {
            addCriterion("INVENTORY not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andTotalincomeIsNull() {
            addCriterion("TOTALINCOME is null");
            return (Criteria) this;
        }

        public Criteria andTotalincomeIsNotNull() {
            addCriterion("TOTALINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andTotalincomeEqualTo(String value) {
            addCriterion("TOTALINCOME =", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeNotEqualTo(String value) {
            addCriterion("TOTALINCOME <>", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeGreaterThan(String value) {
            addCriterion("TOTALINCOME >", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALINCOME >=", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeLessThan(String value) {
            addCriterion("TOTALINCOME <", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeLessThanOrEqualTo(String value) {
            addCriterion("TOTALINCOME <=", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeLike(String value) {
            addCriterion("TOTALINCOME like", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeNotLike(String value) {
            addCriterion("TOTALINCOME not like", value, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeIn(List<String> values) {
            addCriterion("TOTALINCOME in", values, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeNotIn(List<String> values) {
            addCriterion("TOTALINCOME not in", values, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeBetween(String value1, String value2) {
            addCriterion("TOTALINCOME between", value1, value2, "totalincome");
            return (Criteria) this;
        }

        public Criteria andTotalincomeNotBetween(String value1, String value2) {
            addCriterion("TOTALINCOME not between", value1, value2, "totalincome");
            return (Criteria) this;
        }

        public Criteria andNetprofitIsNull() {
            addCriterion("NETPROFIT is null");
            return (Criteria) this;
        }

        public Criteria andNetprofitIsNotNull() {
            addCriterion("NETPROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andNetprofitEqualTo(String value) {
            addCriterion("NETPROFIT =", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotEqualTo(String value) {
            addCriterion("NETPROFIT <>", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitGreaterThan(String value) {
            addCriterion("NETPROFIT >", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitGreaterThanOrEqualTo(String value) {
            addCriterion("NETPROFIT >=", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitLessThan(String value) {
            addCriterion("NETPROFIT <", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitLessThanOrEqualTo(String value) {
            addCriterion("NETPROFIT <=", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitLike(String value) {
            addCriterion("NETPROFIT like", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotLike(String value) {
            addCriterion("NETPROFIT not like", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitIn(List<String> values) {
            addCriterion("NETPROFIT in", values, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotIn(List<String> values) {
            addCriterion("NETPROFIT not in", values, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitBetween(String value1, String value2) {
            addCriterion("NETPROFIT between", value1, value2, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotBetween(String value1, String value2) {
            addCriterion("NETPROFIT not between", value1, value2, "netprofit");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIsNull() {
            addCriterion("LIABILITIES is null");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIsNotNull() {
            addCriterion("LIABILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesEqualTo(String value) {
            addCriterion("LIABILITIES =", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotEqualTo(String value) {
            addCriterion("LIABILITIES <>", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesGreaterThan(String value) {
            addCriterion("LIABILITIES >", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("LIABILITIES >=", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesLessThan(String value) {
            addCriterion("LIABILITIES <", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesLessThanOrEqualTo(String value) {
            addCriterion("LIABILITIES <=", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesLike(String value) {
            addCriterion("LIABILITIES like", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotLike(String value) {
            addCriterion("LIABILITIES not like", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIn(List<String> values) {
            addCriterion("LIABILITIES in", values, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotIn(List<String> values) {
            addCriterion("LIABILITIES not in", values, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesBetween(String value1, String value2) {
            addCriterion("LIABILITIES between", value1, value2, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotBetween(String value1, String value2) {
            addCriterion("LIABILITIES not between", value1, value2, "liabilities");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("ADDTIME is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("ADDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(String value) {
            addCriterion("ADDTIME =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(String value) {
            addCriterion("ADDTIME <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(String value) {
            addCriterion("ADDTIME >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDTIME >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(String value) {
            addCriterion("ADDTIME <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(String value) {
            addCriterion("ADDTIME <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLike(String value) {
            addCriterion("ADDTIME like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotLike(String value) {
            addCriterion("ADDTIME not like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<String> values) {
            addCriterion("ADDTIME in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<String> values) {
            addCriterion("ADDTIME not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(String value1, String value2) {
            addCriterion("ADDTIME between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(String value1, String value2) {
            addCriterion("ADDTIME not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusIsNull() {
            addCriterion("CUSTOMERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusIsNotNull() {
            addCriterion("CUSTOMERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusEqualTo(String value) {
            addCriterion("CUSTOMERSTATUS =", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusNotEqualTo(String value) {
            addCriterion("CUSTOMERSTATUS <>", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusGreaterThan(String value) {
            addCriterion("CUSTOMERSTATUS >", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSTATUS >=", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusLessThan(String value) {
            addCriterion("CUSTOMERSTATUS <", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERSTATUS <=", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusLike(String value) {
            addCriterion("CUSTOMERSTATUS like", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusNotLike(String value) {
            addCriterion("CUSTOMERSTATUS not like", value, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusIn(List<String> values) {
            addCriterion("CUSTOMERSTATUS in", values, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusNotIn(List<String> values) {
            addCriterion("CUSTOMERSTATUS not in", values, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusBetween(String value1, String value2) {
            addCriterion("CUSTOMERSTATUS between", value1, value2, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andCustomerstatusNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERSTATUS not between", value1, value2, "customerstatus");
            return (Criteria) this;
        }

        public Criteria andSubordinationIsNull() {
            addCriterion("SUBORDINATION is null");
            return (Criteria) this;
        }

        public Criteria andSubordinationIsNotNull() {
            addCriterion("SUBORDINATION is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinationEqualTo(String value) {
            addCriterion("SUBORDINATION =", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationNotEqualTo(String value) {
            addCriterion("SUBORDINATION <>", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationGreaterThan(String value) {
            addCriterion("SUBORDINATION >", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationGreaterThanOrEqualTo(String value) {
            addCriterion("SUBORDINATION >=", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationLessThan(String value) {
            addCriterion("SUBORDINATION <", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationLessThanOrEqualTo(String value) {
            addCriterion("SUBORDINATION <=", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationLike(String value) {
            addCriterion("SUBORDINATION like", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationNotLike(String value) {
            addCriterion("SUBORDINATION not like", value, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationIn(List<String> values) {
            addCriterion("SUBORDINATION in", values, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationNotIn(List<String> values) {
            addCriterion("SUBORDINATION not in", values, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationBetween(String value1, String value2) {
            addCriterion("SUBORDINATION between", value1, value2, "subordination");
            return (Criteria) this;
        }

        public Criteria andSubordinationNotBetween(String value1, String value2) {
            addCriterion("SUBORDINATION not between", value1, value2, "subordination");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityIsNull() {
            addCriterion("CORPORATECAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityIsNotNull() {
            addCriterion("CORPORATECAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityEqualTo(String value) {
            addCriterion("CORPORATECAPACITY =", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityNotEqualTo(String value) {
            addCriterion("CORPORATECAPACITY <>", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityGreaterThan(String value) {
            addCriterion("CORPORATECAPACITY >", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityGreaterThanOrEqualTo(String value) {
            addCriterion("CORPORATECAPACITY >=", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityLessThan(String value) {
            addCriterion("CORPORATECAPACITY <", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityLessThanOrEqualTo(String value) {
            addCriterion("CORPORATECAPACITY <=", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityLike(String value) {
            addCriterion("CORPORATECAPACITY like", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityNotLike(String value) {
            addCriterion("CORPORATECAPACITY not like", value, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityIn(List<String> values) {
            addCriterion("CORPORATECAPACITY in", values, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityNotIn(List<String> values) {
            addCriterion("CORPORATECAPACITY not in", values, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityBetween(String value1, String value2) {
            addCriterion("CORPORATECAPACITY between", value1, value2, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCorporatecapacityNotBetween(String value1, String value2) {
            addCriterion("CORPORATECAPACITY not between", value1, value2, "corporatecapacity");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("CUSTOMERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CUSTOMERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("CUSTOMERTYPE =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("CUSTOMERTYPE >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("CUSTOMERTYPE <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("CUSTOMERTYPE like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("CUSTOMERTYPE not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("CUSTOMERTYPE in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("CUSTOMERTYPE not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE not between", value1, value2, "customertype");
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

        public Criteria andCustomenterprisetypeIsNull() {
            addCriterion("CUSTOMENTERPRISETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeIsNotNull() {
            addCriterion("CUSTOMENTERPRISETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeEqualTo(String value) {
            addCriterion("CUSTOMENTERPRISETYPE =", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeNotEqualTo(String value) {
            addCriterion("CUSTOMENTERPRISETYPE <>", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeGreaterThan(String value) {
            addCriterion("CUSTOMENTERPRISETYPE >", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMENTERPRISETYPE >=", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeLessThan(String value) {
            addCriterion("CUSTOMENTERPRISETYPE <", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMENTERPRISETYPE <=", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeLike(String value) {
            addCriterion("CUSTOMENTERPRISETYPE like", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeNotLike(String value) {
            addCriterion("CUSTOMENTERPRISETYPE not like", value, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeIn(List<String> values) {
            addCriterion("CUSTOMENTERPRISETYPE in", values, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeNotIn(List<String> values) {
            addCriterion("CUSTOMENTERPRISETYPE not in", values, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeBetween(String value1, String value2) {
            addCriterion("CUSTOMENTERPRISETYPE between", value1, value2, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andCustomenterprisetypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMENTERPRISETYPE not between", value1, value2, "customenterprisetype");
            return (Criteria) this;
        }

        public Criteria andComsizeIsNull() {
            addCriterion("COMSIZE is null");
            return (Criteria) this;
        }

        public Criteria andComsizeIsNotNull() {
            addCriterion("COMSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andComsizeEqualTo(String value) {
            addCriterion("COMSIZE =", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeNotEqualTo(String value) {
            addCriterion("COMSIZE <>", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeGreaterThan(String value) {
            addCriterion("COMSIZE >", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeGreaterThanOrEqualTo(String value) {
            addCriterion("COMSIZE >=", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeLessThan(String value) {
            addCriterion("COMSIZE <", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeLessThanOrEqualTo(String value) {
            addCriterion("COMSIZE <=", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeLike(String value) {
            addCriterion("COMSIZE like", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeNotLike(String value) {
            addCriterion("COMSIZE not like", value, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeIn(List<String> values) {
            addCriterion("COMSIZE in", values, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeNotIn(List<String> values) {
            addCriterion("COMSIZE not in", values, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeBetween(String value1, String value2) {
            addCriterion("COMSIZE between", value1, value2, "comsize");
            return (Criteria) this;
        }

        public Criteria andComsizeNotBetween(String value1, String value2) {
            addCriterion("COMSIZE not between", value1, value2, "comsize");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyIsNull() {
            addCriterion("ISZGCCOMPANY is null");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyIsNotNull() {
            addCriterion("ISZGCCOMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyEqualTo(String value) {
            addCriterion("ISZGCCOMPANY =", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyNotEqualTo(String value) {
            addCriterion("ISZGCCOMPANY <>", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyGreaterThan(String value) {
            addCriterion("ISZGCCOMPANY >", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ISZGCCOMPANY >=", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyLessThan(String value) {
            addCriterion("ISZGCCOMPANY <", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyLessThanOrEqualTo(String value) {
            addCriterion("ISZGCCOMPANY <=", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyLike(String value) {
            addCriterion("ISZGCCOMPANY like", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyNotLike(String value) {
            addCriterion("ISZGCCOMPANY not like", value, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyIn(List<String> values) {
            addCriterion("ISZGCCOMPANY in", values, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyNotIn(List<String> values) {
            addCriterion("ISZGCCOMPANY not in", values, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyBetween(String value1, String value2) {
            addCriterion("ISZGCCOMPANY between", value1, value2, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andIszgccompanyNotBetween(String value1, String value2) {
            addCriterion("ISZGCCOMPANY not between", value1, value2, "iszgccompany");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("COUNTY is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("COUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("COUNTY =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("COUNTY <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("COUNTY >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("COUNTY <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("COUNTY <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("COUNTY like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("COUNTY not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("COUNTY in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("COUNTY not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("COUNTY between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("COUNTY not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNull() {
            addCriterion("RECOMMEND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIsNotNull() {
            addCriterion("RECOMMEND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusEqualTo(String value) {
            addCriterion("RECOMMEND_STATUS =", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotEqualTo(String value) {
            addCriterion("RECOMMEND_STATUS <>", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThan(String value) {
            addCriterion("RECOMMEND_STATUS >", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_STATUS >=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThan(String value) {
            addCriterion("RECOMMEND_STATUS <", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_STATUS <=", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusLike(String value) {
            addCriterion("RECOMMEND_STATUS like", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotLike(String value) {
            addCriterion("RECOMMEND_STATUS not like", value, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusIn(List<String> values) {
            addCriterion("RECOMMEND_STATUS in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotIn(List<String> values) {
            addCriterion("RECOMMEND_STATUS not in", values, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusBetween(String value1, String value2) {
            addCriterion("RECOMMEND_STATUS between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendStatusNotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_STATUS not between", value1, value2, "recommendStatus");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationIsNull() {
            addCriterion("LDENTIFY_THE_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationIsNotNull() {
            addCriterion("LDENTIFY_THE_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationEqualTo(String value) {
            addCriterion("LDENTIFY_THE_SITUATION =", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationNotEqualTo(String value) {
            addCriterion("LDENTIFY_THE_SITUATION <>", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationGreaterThan(String value) {
            addCriterion("LDENTIFY_THE_SITUATION >", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationGreaterThanOrEqualTo(String value) {
            addCriterion("LDENTIFY_THE_SITUATION >=", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationLessThan(String value) {
            addCriterion("LDENTIFY_THE_SITUATION <", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationLessThanOrEqualTo(String value) {
            addCriterion("LDENTIFY_THE_SITUATION <=", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationLike(String value) {
            addCriterion("LDENTIFY_THE_SITUATION like", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationNotLike(String value) {
            addCriterion("LDENTIFY_THE_SITUATION not like", value, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationIn(List<String> values) {
            addCriterion("LDENTIFY_THE_SITUATION in", values, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationNotIn(List<String> values) {
            addCriterion("LDENTIFY_THE_SITUATION not in", values, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationBetween(String value1, String value2) {
            addCriterion("LDENTIFY_THE_SITUATION between", value1, value2, "ldentifyTheSituation");
            return (Criteria) this;
        }

        public Criteria andLdentifyTheSituationNotBetween(String value1, String value2) {
            addCriterion("LDENTIFY_THE_SITUATION not between", value1, value2, "ldentifyTheSituation");
            return (Criteria) this;
        }
    }

    /**
     * CUSTOMER_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * CUSTOMER_INFO 2017-10-23
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