package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectAttentionExample {
    /**
     * PROJECT_ATTENTION
     */
    protected String orderByClause;

    /**
     * PROJECT_ATTENTION
     */
    protected boolean distinct;

    /**
     * PROJECT_ATTENTION
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public ProjectAttentionExample() {
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
     * PROJECT_ATTENTION 2017-09-15
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

        public Criteria andProjectidIsNull() {
            addCriterion("PROJECTID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("PROJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(String value) {
            addCriterion("PROJECTID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(String value) {
            addCriterion("PROJECTID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(String value) {
            addCriterion("PROJECTID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(String value) {
            addCriterion("PROJECTID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(String value) {
            addCriterion("PROJECTID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLike(String value) {
            addCriterion("PROJECTID like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotLike(String value) {
            addCriterion("PROJECTID not like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<String> values) {
            addCriterion("PROJECTID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<String> values) {
            addCriterion("PROJECTID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(String value1, String value2) {
            addCriterion("PROJECTID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(String value1, String value2) {
            addCriterion("PROJECTID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andAttentionidIsNull() {
            addCriterion("ATTENTIONID is null");
            return (Criteria) this;
        }

        public Criteria andAttentionidIsNotNull() {
            addCriterion("ATTENTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionidEqualTo(String value) {
            addCriterion("ATTENTIONID =", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidNotEqualTo(String value) {
            addCriterion("ATTENTIONID <>", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidGreaterThan(String value) {
            addCriterion("ATTENTIONID >", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENTIONID >=", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidLessThan(String value) {
            addCriterion("ATTENTIONID <", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidLessThanOrEqualTo(String value) {
            addCriterion("ATTENTIONID <=", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidLike(String value) {
            addCriterion("ATTENTIONID like", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidNotLike(String value) {
            addCriterion("ATTENTIONID not like", value, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidIn(List<String> values) {
            addCriterion("ATTENTIONID in", values, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidNotIn(List<String> values) {
            addCriterion("ATTENTIONID not in", values, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidBetween(String value1, String value2) {
            addCriterion("ATTENTIONID between", value1, value2, "attentionid");
            return (Criteria) this;
        }

        public Criteria andAttentionidNotBetween(String value1, String value2) {
            addCriterion("ATTENTIONID not between", value1, value2, "attentionid");
            return (Criteria) this;
        }
    }

    /**
     * PROJECT_ATTENTION
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PROJECT_ATTENTION 2017-09-15
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