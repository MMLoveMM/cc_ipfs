package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectReviewExample {
    /**
     * PROJECT_REVIEW
     */
    protected String orderByClause;

    /**
     * PROJECT_REVIEW
     */
    protected boolean distinct;

    /**
     * PROJECT_REVIEW
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public ProjectReviewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-11-20
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
     * @mbggenerated 2017-11-20
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * PROJECT_REVIEW 2017-11-20
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

        public Criteria andProjectreviewIsNull() {
            addCriterion("PROJECTREVIEW is null");
            return (Criteria) this;
        }

        public Criteria andProjectreviewIsNotNull() {
            addCriterion("PROJECTREVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andProjectreviewEqualTo(String value) {
            addCriterion("PROJECTREVIEW =", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewNotEqualTo(String value) {
            addCriterion("PROJECTREVIEW <>", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewGreaterThan(String value) {
            addCriterion("PROJECTREVIEW >", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTREVIEW >=", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewLessThan(String value) {
            addCriterion("PROJECTREVIEW <", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewLessThanOrEqualTo(String value) {
            addCriterion("PROJECTREVIEW <=", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewLike(String value) {
            addCriterion("PROJECTREVIEW like", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewNotLike(String value) {
            addCriterion("PROJECTREVIEW not like", value, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewIn(List<String> values) {
            addCriterion("PROJECTREVIEW in", values, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewNotIn(List<String> values) {
            addCriterion("PROJECTREVIEW not in", values, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewBetween(String value1, String value2) {
            addCriterion("PROJECTREVIEW between", value1, value2, "projectreview");
            return (Criteria) this;
        }

        public Criteria andProjectreviewNotBetween(String value1, String value2) {
            addCriterion("PROJECTREVIEW not between", value1, value2, "projectreview");
            return (Criteria) this;
        }

        public Criteria andAppraiseridIsNull() {
            addCriterion("APPRAISERID is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseridIsNotNull() {
            addCriterion("APPRAISERID is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseridEqualTo(String value) {
            addCriterion("APPRAISERID =", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridNotEqualTo(String value) {
            addCriterion("APPRAISERID <>", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridGreaterThan(String value) {
            addCriterion("APPRAISERID >", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridGreaterThanOrEqualTo(String value) {
            addCriterion("APPRAISERID >=", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridLessThan(String value) {
            addCriterion("APPRAISERID <", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridLessThanOrEqualTo(String value) {
            addCriterion("APPRAISERID <=", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridLike(String value) {
            addCriterion("APPRAISERID like", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridNotLike(String value) {
            addCriterion("APPRAISERID not like", value, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridIn(List<String> values) {
            addCriterion("APPRAISERID in", values, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridNotIn(List<String> values) {
            addCriterion("APPRAISERID not in", values, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridBetween(String value1, String value2) {
            addCriterion("APPRAISERID between", value1, value2, "appraiserid");
            return (Criteria) this;
        }

        public Criteria andAppraiseridNotBetween(String value1, String value2) {
            addCriterion("APPRAISERID not between", value1, value2, "appraiserid");
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

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    /**
     * PROJECT_REVIEW
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PROJECT_REVIEW 2017-11-20
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