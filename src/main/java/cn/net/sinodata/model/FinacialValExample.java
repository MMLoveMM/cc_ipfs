package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class FinacialValExample {
    /**
     * FINACIAL_VAL
     */
    protected String orderByClause;

    /**
     * FINACIAL_VAL
     */
    protected boolean distinct;

    /**
     * FINACIAL_VAL
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public FinacialValExample() {
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
     * FINACIAL_VAL 2017-09-15
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

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("NUM like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("NUM not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andValIsNull() {
            addCriterion("VAL is null");
            return (Criteria) this;
        }

        public Criteria andValIsNotNull() {
            addCriterion("VAL is not null");
            return (Criteria) this;
        }

        public Criteria andValEqualTo(String value) {
            addCriterion("VAL =", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotEqualTo(String value) {
            addCriterion("VAL <>", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThan(String value) {
            addCriterion("VAL >", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThanOrEqualTo(String value) {
            addCriterion("VAL >=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThan(String value) {
            addCriterion("VAL <", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThanOrEqualTo(String value) {
            addCriterion("VAL <=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLike(String value) {
            addCriterion("VAL like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotLike(String value) {
            addCriterion("VAL not like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValIn(List<String> values) {
            addCriterion("VAL in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValNotIn(List<String> values) {
            addCriterion("VAL not in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValBetween(String value1, String value2) {
            addCriterion("VAL between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andValNotBetween(String value1, String value2) {
            addCriterion("VAL not between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andAuditdtIsNull() {
            addCriterion("AUDITDT is null");
            return (Criteria) this;
        }

        public Criteria andAuditdtIsNotNull() {
            addCriterion("AUDITDT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdtEqualTo(String value) {
            addCriterion("AUDITDT =", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtNotEqualTo(String value) {
            addCriterion("AUDITDT <>", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtGreaterThan(String value) {
            addCriterion("AUDITDT >", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITDT >=", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtLessThan(String value) {
            addCriterion("AUDITDT <", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtLessThanOrEqualTo(String value) {
            addCriterion("AUDITDT <=", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtLike(String value) {
            addCriterion("AUDITDT like", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtNotLike(String value) {
            addCriterion("AUDITDT not like", value, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtIn(List<String> values) {
            addCriterion("AUDITDT in", values, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtNotIn(List<String> values) {
            addCriterion("AUDITDT not in", values, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtBetween(String value1, String value2) {
            addCriterion("AUDITDT between", value1, value2, "auditdt");
            return (Criteria) this;
        }

        public Criteria andAuditdtNotBetween(String value1, String value2) {
            addCriterion("AUDITDT not between", value1, value2, "auditdt");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNull() {
            addCriterion("CUSTOMID is null");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNotNull() {
            addCriterion("CUSTOMID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomidEqualTo(String value) {
            addCriterion("CUSTOMID =", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotEqualTo(String value) {
            addCriterion("CUSTOMID <>", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThan(String value) {
            addCriterion("CUSTOMID >", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMID >=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThan(String value) {
            addCriterion("CUSTOMID <", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMID <=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLike(String value) {
            addCriterion("CUSTOMID like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotLike(String value) {
            addCriterion("CUSTOMID not like", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidIn(List<String> values) {
            addCriterion("CUSTOMID in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotIn(List<String> values) {
            addCriterion("CUSTOMID not in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidBetween(String value1, String value2) {
            addCriterion("CUSTOMID between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotBetween(String value1, String value2) {
            addCriterion("CUSTOMID not between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andInputdtIsNull() {
            addCriterion("INPUTDT is null");
            return (Criteria) this;
        }

        public Criteria andInputdtIsNotNull() {
            addCriterion("INPUTDT is not null");
            return (Criteria) this;
        }

        public Criteria andInputdtEqualTo(String value) {
            addCriterion("INPUTDT =", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtNotEqualTo(String value) {
            addCriterion("INPUTDT <>", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtGreaterThan(String value) {
            addCriterion("INPUTDT >", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTDT >=", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtLessThan(String value) {
            addCriterion("INPUTDT <", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtLessThanOrEqualTo(String value) {
            addCriterion("INPUTDT <=", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtLike(String value) {
            addCriterion("INPUTDT like", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtNotLike(String value) {
            addCriterion("INPUTDT not like", value, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtIn(List<String> values) {
            addCriterion("INPUTDT in", values, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtNotIn(List<String> values) {
            addCriterion("INPUTDT not in", values, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtBetween(String value1, String value2) {
            addCriterion("INPUTDT between", value1, value2, "inputdt");
            return (Criteria) this;
        }

        public Criteria andInputdtNotBetween(String value1, String value2) {
            addCriterion("INPUTDT not between", value1, value2, "inputdt");
            return (Criteria) this;
        }
    }

    /**
     * FINACIAL_VAL
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * FINACIAL_VAL 2017-09-15
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