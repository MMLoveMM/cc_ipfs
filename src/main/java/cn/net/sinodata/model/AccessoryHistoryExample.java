package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class AccessoryHistoryExample {
    /**
     * ACCESSORY_HISTORY
     */
    protected String orderByClause;

    /**
     * ACCESSORY_HISTORY
     */
    protected boolean distinct;

    /**
     * ACCESSORY_HISTORY
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public AccessoryHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-10-24
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
     * @mbggenerated 2017-10-24
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ACCESSORY_HISTORY 2017-10-24
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

        public Criteria andAccessoryidIsNull() {
            addCriterion("ACCESSORYID is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryidIsNotNull() {
            addCriterion("ACCESSORYID is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryidEqualTo(Long value) {
            addCriterion("ACCESSORYID =", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotEqualTo(Long value) {
            addCriterion("ACCESSORYID <>", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidGreaterThan(Long value) {
            addCriterion("ACCESSORYID >", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCESSORYID >=", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidLessThan(Long value) {
            addCriterion("ACCESSORYID <", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidLessThanOrEqualTo(Long value) {
            addCriterion("ACCESSORYID <=", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidIn(List<Long> values) {
            addCriterion("ACCESSORYID in", values, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotIn(List<Long> values) {
            addCriterion("ACCESSORYID not in", values, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidBetween(Long value1, Long value2) {
            addCriterion("ACCESSORYID between", value1, value2, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotBetween(Long value1, Long value2) {
            addCriterion("ACCESSORYID not between", value1, value2, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIsNull() {
            addCriterion("ACCESSORYNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIsNotNull() {
            addCriterion("ACCESSORYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorynameEqualTo(String value) {
            addCriterion("ACCESSORYNAME =", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotEqualTo(String value) {
            addCriterion("ACCESSORYNAME <>", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameGreaterThan(String value) {
            addCriterion("ACCESSORYNAME >", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESSORYNAME >=", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLessThan(String value) {
            addCriterion("ACCESSORYNAME <", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLessThanOrEqualTo(String value) {
            addCriterion("ACCESSORYNAME <=", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLike(String value) {
            addCriterion("ACCESSORYNAME like", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotLike(String value) {
            addCriterion("ACCESSORYNAME not like", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIn(List<String> values) {
            addCriterion("ACCESSORYNAME in", values, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotIn(List<String> values) {
            addCriterion("ACCESSORYNAME not in", values, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameBetween(String value1, String value2) {
            addCriterion("ACCESSORYNAME between", value1, value2, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotBetween(String value1, String value2) {
            addCriterion("ACCESSORYNAME not between", value1, value2, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andTableidIsNull() {
            addCriterion("TABLEID is null");
            return (Criteria) this;
        }

        public Criteria andTableidIsNotNull() {
            addCriterion("TABLEID is not null");
            return (Criteria) this;
        }

        public Criteria andTableidEqualTo(String value) {
            addCriterion("TABLEID =", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotEqualTo(String value) {
            addCriterion("TABLEID <>", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThan(String value) {
            addCriterion("TABLEID >", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEID >=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThan(String value) {
            addCriterion("TABLEID <", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThanOrEqualTo(String value) {
            addCriterion("TABLEID <=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLike(String value) {
            addCriterion("TABLEID like", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotLike(String value) {
            addCriterion("TABLEID not like", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidIn(List<String> values) {
            addCriterion("TABLEID in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotIn(List<String> values) {
            addCriterion("TABLEID not in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidBetween(String value1, String value2) {
            addCriterion("TABLEID between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotBetween(String value1, String value2) {
            addCriterion("TABLEID not between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIsNull() {
            addCriterion("ACCESSORYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIsNotNull() {
            addCriterion("ACCESSORYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE =", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE <>", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeGreaterThan(Short value) {
            addCriterion("ACCESSORYTYPE >", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE >=", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeLessThan(Short value) {
            addCriterion("ACCESSORYTYPE <", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeLessThanOrEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE <=", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIn(List<Short> values) {
            addCriterion("ACCESSORYTYPE in", values, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotIn(List<Short> values) {
            addCriterion("ACCESSORYTYPE not in", values, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeBetween(Short value1, Short value2) {
            addCriterion("ACCESSORYTYPE between", value1, value2, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotBetween(Short value1, Short value2) {
            addCriterion("ACCESSORYTYPE not between", value1, value2, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNull() {
            addCriterion("OPERATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNotNull() {
            addCriterion("OPERATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeEqualTo(Short value) {
            addCriterion("OPERATETYPE =", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotEqualTo(Short value) {
            addCriterion("OPERATETYPE <>", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThan(Short value) {
            addCriterion("OPERATETYPE >", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThanOrEqualTo(Short value) {
            addCriterion("OPERATETYPE >=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThan(Short value) {
            addCriterion("OPERATETYPE <", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThanOrEqualTo(Short value) {
            addCriterion("OPERATETYPE <=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIn(List<Short> values) {
            addCriterion("OPERATETYPE in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotIn(List<Short> values) {
            addCriterion("OPERATETYPE not in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeBetween(Short value1, Short value2) {
            addCriterion("OPERATETYPE between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotBetween(Short value1, Short value2) {
            addCriterion("OPERATETYPE not between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andNodeIsNull() {
            addCriterion("NODE is null");
            return (Criteria) this;
        }

        public Criteria andNodeIsNotNull() {
            addCriterion("NODE is not null");
            return (Criteria) this;
        }

        public Criteria andNodeEqualTo(String value) {
            addCriterion("NODE =", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotEqualTo(String value) {
            addCriterion("NODE <>", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThan(String value) {
            addCriterion("NODE >", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThanOrEqualTo(String value) {
            addCriterion("NODE >=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThan(String value) {
            addCriterion("NODE <", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThanOrEqualTo(String value) {
            addCriterion("NODE <=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLike(String value) {
            addCriterion("NODE like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotLike(String value) {
            addCriterion("NODE not like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeIn(List<String> values) {
            addCriterion("NODE in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotIn(List<String> values) {
            addCriterion("NODE not in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeBetween(String value1, String value2) {
            addCriterion("NODE between", value1, value2, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotBetween(String value1, String value2) {
            addCriterion("NODE not between", value1, value2, "node");
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

        public Criteria andDealdtIsNull() {
            addCriterion("DEALDT is null");
            return (Criteria) this;
        }

        public Criteria andDealdtIsNotNull() {
            addCriterion("DEALDT is not null");
            return (Criteria) this;
        }

        public Criteria andDealdtEqualTo(String value) {
            addCriterion("DEALDT =", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtNotEqualTo(String value) {
            addCriterion("DEALDT <>", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtGreaterThan(String value) {
            addCriterion("DEALDT >", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtGreaterThanOrEqualTo(String value) {
            addCriterion("DEALDT >=", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtLessThan(String value) {
            addCriterion("DEALDT <", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtLessThanOrEqualTo(String value) {
            addCriterion("DEALDT <=", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtLike(String value) {
            addCriterion("DEALDT like", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtNotLike(String value) {
            addCriterion("DEALDT not like", value, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtIn(List<String> values) {
            addCriterion("DEALDT in", values, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtNotIn(List<String> values) {
            addCriterion("DEALDT not in", values, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtBetween(String value1, String value2) {
            addCriterion("DEALDT between", value1, value2, "dealdt");
            return (Criteria) this;
        }

        public Criteria andDealdtNotBetween(String value1, String value2) {
            addCriterion("DEALDT not between", value1, value2, "dealdt");
            return (Criteria) this;
        }
    }

    /**
     * ACCESSORY_HISTORY
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ACCESSORY_HISTORY 2017-10-24
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