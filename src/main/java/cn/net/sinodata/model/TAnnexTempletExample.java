package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAnnexTempletExample {
    /**
     * T_ANNEX_TEMPLET
     */
    protected String orderByClause;

    /**
     * T_ANNEX_TEMPLET
     */
    protected boolean distinct;

    /**
     * T_ANNEX_TEMPLET
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public TAnnexTempletExample() {
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
     * T_ANNEX_TEMPLET 2017-09-15
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

        public Criteria andAccessoryidEqualTo(String value) {
            addCriterion("ACCESSORYID =", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotEqualTo(String value) {
            addCriterion("ACCESSORYID <>", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidGreaterThan(String value) {
            addCriterion("ACCESSORYID >", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESSORYID >=", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidLessThan(String value) {
            addCriterion("ACCESSORYID <", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidLessThanOrEqualTo(String value) {
            addCriterion("ACCESSORYID <=", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidLike(String value) {
            addCriterion("ACCESSORYID like", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotLike(String value) {
            addCriterion("ACCESSORYID not like", value, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidIn(List<String> values) {
            addCriterion("ACCESSORYID in", values, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotIn(List<String> values) {
            addCriterion("ACCESSORYID not in", values, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidBetween(String value1, String value2) {
            addCriterion("ACCESSORYID between", value1, value2, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andAccessoryidNotBetween(String value1, String value2) {
            addCriterion("ACCESSORYID not between", value1, value2, "accessoryid");
            return (Criteria) this;
        }

        public Criteria andTempletnameIsNull() {
            addCriterion("TEMPLETNAME is null");
            return (Criteria) this;
        }

        public Criteria andTempletnameIsNotNull() {
            addCriterion("TEMPLETNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTempletnameEqualTo(String value) {
            addCriterion("TEMPLETNAME =", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameNotEqualTo(String value) {
            addCriterion("TEMPLETNAME <>", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameGreaterThan(String value) {
            addCriterion("TEMPLETNAME >", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLETNAME >=", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameLessThan(String value) {
            addCriterion("TEMPLETNAME <", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLETNAME <=", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameLike(String value) {
            addCriterion("TEMPLETNAME like", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameNotLike(String value) {
            addCriterion("TEMPLETNAME not like", value, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameIn(List<String> values) {
            addCriterion("TEMPLETNAME in", values, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameNotIn(List<String> values) {
            addCriterion("TEMPLETNAME not in", values, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameBetween(String value1, String value2) {
            addCriterion("TEMPLETNAME between", value1, value2, "templetname");
            return (Criteria) this;
        }

        public Criteria andTempletnameNotBetween(String value1, String value2) {
            addCriterion("TEMPLETNAME not between", value1, value2, "templetname");
            return (Criteria) this;
        }

        public Criteria andOrgansidIsNull() {
            addCriterion("ORGANSID is null");
            return (Criteria) this;
        }

        public Criteria andOrgansidIsNotNull() {
            addCriterion("ORGANSID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgansidEqualTo(String value) {
            addCriterion("ORGANSID =", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidNotEqualTo(String value) {
            addCriterion("ORGANSID <>", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidGreaterThan(String value) {
            addCriterion("ORGANSID >", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANSID >=", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidLessThan(String value) {
            addCriterion("ORGANSID <", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidLessThanOrEqualTo(String value) {
            addCriterion("ORGANSID <=", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidLike(String value) {
            addCriterion("ORGANSID like", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidNotLike(String value) {
            addCriterion("ORGANSID not like", value, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidIn(List<String> values) {
            addCriterion("ORGANSID in", values, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidNotIn(List<String> values) {
            addCriterion("ORGANSID not in", values, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidBetween(String value1, String value2) {
            addCriterion("ORGANSID between", value1, value2, "organsid");
            return (Criteria) this;
        }

        public Criteria andOrgansidNotBetween(String value1, String value2) {
            addCriterion("ORGANSID not between", value1, value2, "organsid");
            return (Criteria) this;
        }

        public Criteria andUploaderIsNull() {
            addCriterion("UPLOADER is null");
            return (Criteria) this;
        }

        public Criteria andUploaderIsNotNull() {
            addCriterion("UPLOADER is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderEqualTo(String value) {
            addCriterion("UPLOADER =", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotEqualTo(String value) {
            addCriterion("UPLOADER <>", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThan(String value) {
            addCriterion("UPLOADER >", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOADER >=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThan(String value) {
            addCriterion("UPLOADER <", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThanOrEqualTo(String value) {
            addCriterion("UPLOADER <=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLike(String value) {
            addCriterion("UPLOADER like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotLike(String value) {
            addCriterion("UPLOADER not like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderIn(List<String> values) {
            addCriterion("UPLOADER in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotIn(List<String> values) {
            addCriterion("UPLOADER not in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderBetween(String value1, String value2) {
            addCriterion("UPLOADER between", value1, value2, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotBetween(String value1, String value2) {
            addCriterion("UPLOADER not between", value1, value2, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("UPLOADTIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("UPLOADTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("UPLOADTIME =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("UPLOADTIME <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("UPLOADTIME >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPLOADTIME >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("UPLOADTIME <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("UPLOADTIME <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("UPLOADTIME in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("UPLOADTIME not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("UPLOADTIME between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("UPLOADTIME not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andTempletnumIsNull() {
            addCriterion("TEMPLETNUM is null");
            return (Criteria) this;
        }

        public Criteria andTempletnumIsNotNull() {
            addCriterion("TEMPLETNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTempletnumEqualTo(String value) {
            addCriterion("TEMPLETNUM =", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumNotEqualTo(String value) {
            addCriterion("TEMPLETNUM <>", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumGreaterThan(String value) {
            addCriterion("TEMPLETNUM >", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLETNUM >=", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumLessThan(String value) {
            addCriterion("TEMPLETNUM <", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumLessThanOrEqualTo(String value) {
            addCriterion("TEMPLETNUM <=", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumLike(String value) {
            addCriterion("TEMPLETNUM like", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumNotLike(String value) {
            addCriterion("TEMPLETNUM not like", value, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumIn(List<String> values) {
            addCriterion("TEMPLETNUM in", values, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumNotIn(List<String> values) {
            addCriterion("TEMPLETNUM not in", values, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumBetween(String value1, String value2) {
            addCriterion("TEMPLETNUM between", value1, value2, "templetnum");
            return (Criteria) this;
        }

        public Criteria andTempletnumNotBetween(String value1, String value2) {
            addCriterion("TEMPLETNUM not between", value1, value2, "templetnum");
            return (Criteria) this;
        }
    }

    /**
     * T_ANNEX_TEMPLET
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_ANNEX_TEMPLET 2017-09-15
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