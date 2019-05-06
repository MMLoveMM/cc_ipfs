package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiabilitiesInfosExample {
    /**
     * LIABILITIES_INFOS
     */
    protected String orderByClause;

    /**
     * LIABILITIES_INFOS
     */
    protected boolean distinct;

    /**
     * LIABILITIES_INFOS
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public LiabilitiesInfosExample() {
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
     * LIABILITIES_INFOS 2017-09-15
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

        public Criteria andPeridIsNull() {
            addCriterion("PERID is null");
            return (Criteria) this;
        }

        public Criteria andPeridIsNotNull() {
            addCriterion("PERID is not null");
            return (Criteria) this;
        }

        public Criteria andPeridEqualTo(String value) {
            addCriterion("PERID =", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotEqualTo(String value) {
            addCriterion("PERID <>", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThan(String value) {
            addCriterion("PERID >", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridGreaterThanOrEqualTo(String value) {
            addCriterion("PERID >=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThan(String value) {
            addCriterion("PERID <", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLessThanOrEqualTo(String value) {
            addCriterion("PERID <=", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridLike(String value) {
            addCriterion("PERID like", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotLike(String value) {
            addCriterion("PERID not like", value, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridIn(List<String> values) {
            addCriterion("PERID in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotIn(List<String> values) {
            addCriterion("PERID not in", values, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridBetween(String value1, String value2) {
            addCriterion("PERID between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andPeridNotBetween(String value1, String value2) {
            addCriterion("PERID not between", value1, value2, "perid");
            return (Criteria) this;
        }

        public Criteria andLiabtypeIsNull() {
            addCriterion("LIABTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLiabtypeIsNotNull() {
            addCriterion("LIABTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLiabtypeEqualTo(String value) {
            addCriterion("LIABTYPE =", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeNotEqualTo(String value) {
            addCriterion("LIABTYPE <>", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeGreaterThan(String value) {
            addCriterion("LIABTYPE >", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeGreaterThanOrEqualTo(String value) {
            addCriterion("LIABTYPE >=", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeLessThan(String value) {
            addCriterion("LIABTYPE <", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeLessThanOrEqualTo(String value) {
            addCriterion("LIABTYPE <=", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeLike(String value) {
            addCriterion("LIABTYPE like", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeNotLike(String value) {
            addCriterion("LIABTYPE not like", value, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeIn(List<String> values) {
            addCriterion("LIABTYPE in", values, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeNotIn(List<String> values) {
            addCriterion("LIABTYPE not in", values, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeBetween(String value1, String value2) {
            addCriterion("LIABTYPE between", value1, value2, "liabtype");
            return (Criteria) this;
        }

        public Criteria andLiabtypeNotBetween(String value1, String value2) {
            addCriterion("LIABTYPE not between", value1, value2, "liabtype");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("CREDIT =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("CREDIT <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("CREDIT >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("CREDIT <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("CREDIT <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("CREDIT like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("CREDIT not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("CREDIT in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("CREDIT not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("CREDIT between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("CREDIT not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andPaidIsNull() {
            addCriterion("PAID is null");
            return (Criteria) this;
        }

        public Criteria andPaidIsNotNull() {
            addCriterion("PAID is not null");
            return (Criteria) this;
        }

        public Criteria andPaidEqualTo(String value) {
            addCriterion("PAID =", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotEqualTo(String value) {
            addCriterion("PAID <>", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidGreaterThan(String value) {
            addCriterion("PAID >", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidGreaterThanOrEqualTo(String value) {
            addCriterion("PAID >=", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLessThan(String value) {
            addCriterion("PAID <", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLessThanOrEqualTo(String value) {
            addCriterion("PAID <=", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLike(String value) {
            addCriterion("PAID like", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotLike(String value) {
            addCriterion("PAID not like", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidIn(List<String> values) {
            addCriterion("PAID in", values, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotIn(List<String> values) {
            addCriterion("PAID not in", values, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidBetween(String value1, String value2) {
            addCriterion("PAID between", value1, value2, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotBetween(String value1, String value2) {
            addCriterion("PAID not between", value1, value2, "paid");
            return (Criteria) this;
        }

        public Criteria andNopayIsNull() {
            addCriterion("NOPAY is null");
            return (Criteria) this;
        }

        public Criteria andNopayIsNotNull() {
            addCriterion("NOPAY is not null");
            return (Criteria) this;
        }

        public Criteria andNopayEqualTo(String value) {
            addCriterion("NOPAY =", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayNotEqualTo(String value) {
            addCriterion("NOPAY <>", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayGreaterThan(String value) {
            addCriterion("NOPAY >", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayGreaterThanOrEqualTo(String value) {
            addCriterion("NOPAY >=", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayLessThan(String value) {
            addCriterion("NOPAY <", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayLessThanOrEqualTo(String value) {
            addCriterion("NOPAY <=", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayLike(String value) {
            addCriterion("NOPAY like", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayNotLike(String value) {
            addCriterion("NOPAY not like", value, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayIn(List<String> values) {
            addCriterion("NOPAY in", values, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayNotIn(List<String> values) {
            addCriterion("NOPAY not in", values, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayBetween(String value1, String value2) {
            addCriterion("NOPAY between", value1, value2, "nopay");
            return (Criteria) this;
        }

        public Criteria andNopayNotBetween(String value1, String value2) {
            addCriterion("NOPAY not between", value1, value2, "nopay");
            return (Criteria) this;
        }

        public Criteria andAveragepayIsNull() {
            addCriterion("AVERAGEPAY is null");
            return (Criteria) this;
        }

        public Criteria andAveragepayIsNotNull() {
            addCriterion("AVERAGEPAY is not null");
            return (Criteria) this;
        }

        public Criteria andAveragepayEqualTo(String value) {
            addCriterion("AVERAGEPAY =", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayNotEqualTo(String value) {
            addCriterion("AVERAGEPAY <>", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayGreaterThan(String value) {
            addCriterion("AVERAGEPAY >", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayGreaterThanOrEqualTo(String value) {
            addCriterion("AVERAGEPAY >=", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayLessThan(String value) {
            addCriterion("AVERAGEPAY <", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayLessThanOrEqualTo(String value) {
            addCriterion("AVERAGEPAY <=", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayLike(String value) {
            addCriterion("AVERAGEPAY like", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayNotLike(String value) {
            addCriterion("AVERAGEPAY not like", value, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayIn(List<String> values) {
            addCriterion("AVERAGEPAY in", values, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayNotIn(List<String> values) {
            addCriterion("AVERAGEPAY not in", values, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayBetween(String value1, String value2) {
            addCriterion("AVERAGEPAY between", value1, value2, "averagepay");
            return (Criteria) this;
        }

        public Criteria andAveragepayNotBetween(String value1, String value2) {
            addCriterion("AVERAGEPAY not between", value1, value2, "averagepay");
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
    }

    /**
     * LIABILITIES_INFOS
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * LIABILITIES_INFOS 2017-09-15
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