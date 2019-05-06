package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class ReminderInfoExample {
    /**
     * REMINDER_INFO
     */
    protected String orderByClause;

    /**
     * REMINDER_INFO
     */
    protected boolean distinct;

    /**
     * REMINDER_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public ReminderInfoExample() {
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
     * REMINDER_INFO 2017-09-15
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

        public Criteria andPropertyIsNull() {
            addCriterion("PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("PROPERTY =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("PROPERTY <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("PROPERTY >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("PROPERTY <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("PROPERTY like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("PROPERTY not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("PROPERTY in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("PROPERTY not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("PROPERTY between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("PROPERTY not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertynameIsNull() {
            addCriterion("PROPERTYNAME is null");
            return (Criteria) this;
        }

        public Criteria andPropertynameIsNotNull() {
            addCriterion("PROPERTYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPropertynameEqualTo(String value) {
            addCriterion("PROPERTYNAME =", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotEqualTo(String value) {
            addCriterion("PROPERTYNAME <>", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameGreaterThan(String value) {
            addCriterion("PROPERTYNAME >", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTYNAME >=", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameLessThan(String value) {
            addCriterion("PROPERTYNAME <", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameLessThanOrEqualTo(String value) {
            addCriterion("PROPERTYNAME <=", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameLike(String value) {
            addCriterion("PROPERTYNAME like", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotLike(String value) {
            addCriterion("PROPERTYNAME not like", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameIn(List<String> values) {
            addCriterion("PROPERTYNAME in", values, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotIn(List<String> values) {
            addCriterion("PROPERTYNAME not in", values, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameBetween(String value1, String value2) {
            addCriterion("PROPERTYNAME between", value1, value2, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotBetween(String value1, String value2) {
            addCriterion("PROPERTYNAME not between", value1, value2, "propertyname");
            return (Criteria) this;
        }

        public Criteria andDaynumIsNull() {
            addCriterion("DAYNUM is null");
            return (Criteria) this;
        }

        public Criteria andDaynumIsNotNull() {
            addCriterion("DAYNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDaynumEqualTo(String value) {
            addCriterion("DAYNUM =", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumNotEqualTo(String value) {
            addCriterion("DAYNUM <>", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumGreaterThan(String value) {
            addCriterion("DAYNUM >", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumGreaterThanOrEqualTo(String value) {
            addCriterion("DAYNUM >=", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumLessThan(String value) {
            addCriterion("DAYNUM <", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumLessThanOrEqualTo(String value) {
            addCriterion("DAYNUM <=", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumLike(String value) {
            addCriterion("DAYNUM like", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumNotLike(String value) {
            addCriterion("DAYNUM not like", value, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumIn(List<String> values) {
            addCriterion("DAYNUM in", values, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumNotIn(List<String> values) {
            addCriterion("DAYNUM not in", values, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumBetween(String value1, String value2) {
            addCriterion("DAYNUM between", value1, value2, "daynum");
            return (Criteria) this;
        }

        public Criteria andDaynumNotBetween(String value1, String value2) {
            addCriterion("DAYNUM not between", value1, value2, "daynum");
            return (Criteria) this;
        }
    }

    /**
     * REMINDER_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * REMINDER_INFO 2017-09-15
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