package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCustAcctExample {
    /**
     * T_CUST_ACCT
     */
    protected String orderByClause;

    /**
     * T_CUST_ACCT
     */
    protected boolean distinct;

    /**
     * T_CUST_ACCT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public TCustAcctExample() {
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
     * T_CUST_ACCT 2017-09-15
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

        public Criteria andCustomeridIsNull() {
            addCriterion("CUSTOMERID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CUSTOMERID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("CUSTOMERID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("CUSTOMERID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("CUSTOMERID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("CUSTOMERID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("CUSTOMERID like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("CUSTOMERID not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("CUSTOMERID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("CUSTOMERID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("CUSTOMERID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andAcctnameIsNull() {
            addCriterion("ACCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAcctnameIsNotNull() {
            addCriterion("ACCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctnameEqualTo(String value) {
            addCriterion("ACCTNAME =", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotEqualTo(String value) {
            addCriterion("ACCTNAME <>", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameGreaterThan(String value) {
            addCriterion("ACCTNAME >", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCTNAME >=", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLessThan(String value) {
            addCriterion("ACCTNAME <", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLessThanOrEqualTo(String value) {
            addCriterion("ACCTNAME <=", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameLike(String value) {
            addCriterion("ACCTNAME like", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotLike(String value) {
            addCriterion("ACCTNAME not like", value, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameIn(List<String> values) {
            addCriterion("ACCTNAME in", values, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotIn(List<String> values) {
            addCriterion("ACCTNAME not in", values, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameBetween(String value1, String value2) {
            addCriterion("ACCTNAME between", value1, value2, "acctname");
            return (Criteria) this;
        }

        public Criteria andAcctnameNotBetween(String value1, String value2) {
            addCriterion("ACCTNAME not between", value1, value2, "acctname");
            return (Criteria) this;
        }

        public Criteria andBankacctIsNull() {
            addCriterion("BANKACCT is null");
            return (Criteria) this;
        }

        public Criteria andBankacctIsNotNull() {
            addCriterion("BANKACCT is not null");
            return (Criteria) this;
        }

        public Criteria andBankacctEqualTo(String value) {
            addCriterion("BANKACCT =", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotEqualTo(String value) {
            addCriterion("BANKACCT <>", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctGreaterThan(String value) {
            addCriterion("BANKACCT >", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctGreaterThanOrEqualTo(String value) {
            addCriterion("BANKACCT >=", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctLessThan(String value) {
            addCriterion("BANKACCT <", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctLessThanOrEqualTo(String value) {
            addCriterion("BANKACCT <=", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctLike(String value) {
            addCriterion("BANKACCT like", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotLike(String value) {
            addCriterion("BANKACCT not like", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctIn(List<String> values) {
            addCriterion("BANKACCT in", values, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotIn(List<String> values) {
            addCriterion("BANKACCT not in", values, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctBetween(String value1, String value2) {
            addCriterion("BANKACCT between", value1, value2, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotBetween(String value1, String value2) {
            addCriterion("BANKACCT not between", value1, value2, "bankacct");
            return (Criteria) this;
        }

        public Criteria andOpenbankIsNull() {
            addCriterion("OPENBANK is null");
            return (Criteria) this;
        }

        public Criteria andOpenbankIsNotNull() {
            addCriterion("OPENBANK is not null");
            return (Criteria) this;
        }

        public Criteria andOpenbankEqualTo(String value) {
            addCriterion("OPENBANK =", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotEqualTo(String value) {
            addCriterion("OPENBANK <>", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankGreaterThan(String value) {
            addCriterion("OPENBANK >", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankGreaterThanOrEqualTo(String value) {
            addCriterion("OPENBANK >=", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLessThan(String value) {
            addCriterion("OPENBANK <", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLessThanOrEqualTo(String value) {
            addCriterion("OPENBANK <=", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankLike(String value) {
            addCriterion("OPENBANK like", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotLike(String value) {
            addCriterion("OPENBANK not like", value, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankIn(List<String> values) {
            addCriterion("OPENBANK in", values, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotIn(List<String> values) {
            addCriterion("OPENBANK not in", values, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankBetween(String value1, String value2) {
            addCriterion("OPENBANK between", value1, value2, "openbank");
            return (Criteria) this;
        }

        public Criteria andOpenbankNotBetween(String value1, String value2) {
            addCriterion("OPENBANK not between", value1, value2, "openbank");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("CTIME is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("CTIME =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("CTIME <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("CTIME >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CTIME >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("CTIME <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("CTIME <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("CTIME in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("CTIME not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("CTIME between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("CTIME not between", value1, value2, "ctime");
            return (Criteria) this;
        }
    }

    /**
     * T_CUST_ACCT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CUST_ACCT 2017-09-15
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