package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class AnnexDocsExample {
    /**
     * ANNEX_DOCS
     */
    protected String orderByClause;

    /**
     * ANNEX_DOCS
     */
    protected boolean distinct;

    /**
     * ANNEX_DOCS
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-10-23
     */
    public AnnexDocsExample() {
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
     * ANNEX_DOCS 2017-10-23
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

        public Criteria andUploaddtIsNull() {
            addCriterion("UPLOADDT is null");
            return (Criteria) this;
        }

        public Criteria andUploaddtIsNotNull() {
            addCriterion("UPLOADDT is not null");
            return (Criteria) this;
        }

        public Criteria andUploaddtEqualTo(String value) {
            addCriterion("UPLOADDT =", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtNotEqualTo(String value) {
            addCriterion("UPLOADDT <>", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtGreaterThan(String value) {
            addCriterion("UPLOADDT >", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOADDT >=", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtLessThan(String value) {
            addCriterion("UPLOADDT <", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtLessThanOrEqualTo(String value) {
            addCriterion("UPLOADDT <=", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtLike(String value) {
            addCriterion("UPLOADDT like", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtNotLike(String value) {
            addCriterion("UPLOADDT not like", value, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtIn(List<String> values) {
            addCriterion("UPLOADDT in", values, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtNotIn(List<String> values) {
            addCriterion("UPLOADDT not in", values, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtBetween(String value1, String value2) {
            addCriterion("UPLOADDT between", value1, value2, "uploaddt");
            return (Criteria) this;
        }

        public Criteria andUploaddtNotBetween(String value1, String value2) {
            addCriterion("UPLOADDT not between", value1, value2, "uploaddt");
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

        public Criteria andCerttypesIsNull() {
            addCriterion("CERTTYPES is null");
            return (Criteria) this;
        }

        public Criteria andCerttypesIsNotNull() {
            addCriterion("CERTTYPES is not null");
            return (Criteria) this;
        }

        public Criteria andCerttypesEqualTo(String value) {
            addCriterion("CERTTYPES =", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesNotEqualTo(String value) {
            addCriterion("CERTTYPES <>", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesGreaterThan(String value) {
            addCriterion("CERTTYPES >", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesGreaterThanOrEqualTo(String value) {
            addCriterion("CERTTYPES >=", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesLessThan(String value) {
            addCriterion("CERTTYPES <", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesLessThanOrEqualTo(String value) {
            addCriterion("CERTTYPES <=", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesLike(String value) {
            addCriterion("CERTTYPES like", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesNotLike(String value) {
            addCriterion("CERTTYPES not like", value, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesIn(List<String> values) {
            addCriterion("CERTTYPES in", values, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesNotIn(List<String> values) {
            addCriterion("CERTTYPES not in", values, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesBetween(String value1, String value2) {
            addCriterion("CERTTYPES between", value1, value2, "certtypes");
            return (Criteria) this;
        }

        public Criteria andCerttypesNotBetween(String value1, String value2) {
            addCriterion("CERTTYPES not between", value1, value2, "certtypes");
            return (Criteria) this;
        }

        public Criteria andFileidIsNull() {
            addCriterion("FILEID is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("FILEID is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(String value) {
            addCriterion("FILEID =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(String value) {
            addCriterion("FILEID <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(String value) {
            addCriterion("FILEID >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(String value) {
            addCriterion("FILEID >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(String value) {
            addCriterion("FILEID <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(String value) {
            addCriterion("FILEID <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLike(String value) {
            addCriterion("FILEID like", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotLike(String value) {
            addCriterion("FILEID not like", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<String> values) {
            addCriterion("FILEID in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<String> values) {
            addCriterion("FILEID not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(String value1, String value2) {
            addCriterion("FILEID between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(String value1, String value2) {
            addCriterion("FILEID not between", value1, value2, "fileid");
            return (Criteria) this;
        }
    }

    /**
     * ANNEX_DOCS
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ANNEX_DOCS 2017-10-23
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