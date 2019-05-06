package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDataDictExample {
    /**
     * T_DATA_DICT
     */
    protected String orderByClause;

    /**
     * T_DATA_DICT
     */
    protected boolean distinct;

    /**
     * T_DATA_DICT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public TDataDictExample() {
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
     * T_DATA_DICT 2017-09-15
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

        public Criteria andDcodeIsNull() {
            addCriterion("DCODE is null");
            return (Criteria) this;
        }

        public Criteria andDcodeIsNotNull() {
            addCriterion("DCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDcodeEqualTo(String value) {
            addCriterion("DCODE =", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeNotEqualTo(String value) {
            addCriterion("DCODE <>", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeGreaterThan(String value) {
            addCriterion("DCODE >", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DCODE >=", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeLessThan(String value) {
            addCriterion("DCODE <", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeLessThanOrEqualTo(String value) {
            addCriterion("DCODE <=", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeLike(String value) {
            addCriterion("DCODE like", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeNotLike(String value) {
            addCriterion("DCODE not like", value, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeIn(List<String> values) {
            addCriterion("DCODE in", values, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeNotIn(List<String> values) {
            addCriterion("DCODE not in", values, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeBetween(String value1, String value2) {
            addCriterion("DCODE between", value1, value2, "dcode");
            return (Criteria) this;
        }

        public Criteria andDcodeNotBetween(String value1, String value2) {
            addCriterion("DCODE not between", value1, value2, "dcode");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("DNAME is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("DNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("DNAME =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("DNAME <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("DNAME >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("DNAME >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("DNAME <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("DNAME <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("DNAME like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("DNAME not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("DNAME in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("DNAME not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("DNAME between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("DNAME not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNull() {
            addCriterion("DICT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNotNull() {
            addCriterion("DICT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeEqualTo(String value) {
            addCriterion("DICT_TYPE =", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotEqualTo(String value) {
            addCriterion("DICT_TYPE <>", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThan(String value) {
            addCriterion("DICT_TYPE >", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE >=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThan(String value) {
            addCriterion("DICT_TYPE <", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE <=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLike(String value) {
            addCriterion("DICT_TYPE like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotLike(String value) {
            addCriterion("DICT_TYPE not like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeIn(List<String> values) {
            addCriterion("DICT_TYPE in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotIn(List<String> values) {
            addCriterion("DICT_TYPE not in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeBetween(String value1, String value2) {
            addCriterion("DICT_TYPE between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotBetween(String value1, String value2) {
            addCriterion("DICT_TYPE not between", value1, value2, "dictType");
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

        public Criteria andCnameIsNull() {
            addCriterion("CNAME is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("CNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("CNAME =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("CNAME <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("CNAME >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("CNAME >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("CNAME <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("CNAME <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("CNAME like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("CNAME not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("CNAME in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("CNAME not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("CNAME between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("CNAME not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("CDATE is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("CDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("CDATE =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("CDATE <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("CDATE >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CDATE >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("CDATE <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("CDATE <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("CDATE in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("CDATE not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("CDATE between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("CDATE not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("UNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("UNAME =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("UNAME <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("UNAME >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNAME >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("UNAME <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("UNAME <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("UNAME like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("UNAME not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("UNAME in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("UNAME not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("UNAME between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("UNAME not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUdateIsNull() {
            addCriterion("UDATE is null");
            return (Criteria) this;
        }

        public Criteria andUdateIsNotNull() {
            addCriterion("UDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUdateEqualTo(Date value) {
            addCriterion("UDATE =", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotEqualTo(Date value) {
            addCriterion("UDATE <>", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThan(Date value) {
            addCriterion("UDATE >", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThanOrEqualTo(Date value) {
            addCriterion("UDATE >=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThan(Date value) {
            addCriterion("UDATE <", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThanOrEqualTo(Date value) {
            addCriterion("UDATE <=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateIn(List<Date> values) {
            addCriterion("UDATE in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotIn(List<Date> values) {
            addCriterion("UDATE not in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateBetween(Date value1, Date value2) {
            addCriterion("UDATE between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotBetween(Date value1, Date value2) {
            addCriterion("UDATE not between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }
    }

    /**
     * T_DATA_DICT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_DATA_DICT 2017-09-15
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