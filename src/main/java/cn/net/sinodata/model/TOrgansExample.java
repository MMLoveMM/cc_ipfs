package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrgansExample {
    /**
     * T_ORGANS
     */
    protected String orderByClause;

    /**
     * T_ORGANS
     */
    protected boolean distinct;

    /**
     * T_ORGANS
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public TOrgansExample() {
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
     * T_ORGANS 2017-09-15
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

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("ORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("ORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("ORGNAME =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("ORGNAME <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("ORGNAME >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGNAME >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("ORGNAME <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("ORGNAME <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("ORGNAME like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("ORGNAME not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("ORGNAME in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("ORGNAME not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("ORGNAME between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("ORGNAME not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andConnameIsNull() {
            addCriterion("CONNAME is null");
            return (Criteria) this;
        }

        public Criteria andConnameIsNotNull() {
            addCriterion("CONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andConnameEqualTo(String value) {
            addCriterion("CONNAME =", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotEqualTo(String value) {
            addCriterion("CONNAME <>", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameGreaterThan(String value) {
            addCriterion("CONNAME >", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameGreaterThanOrEqualTo(String value) {
            addCriterion("CONNAME >=", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLessThan(String value) {
            addCriterion("CONNAME <", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLessThanOrEqualTo(String value) {
            addCriterion("CONNAME <=", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLike(String value) {
            addCriterion("CONNAME like", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotLike(String value) {
            addCriterion("CONNAME not like", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameIn(List<String> values) {
            addCriterion("CONNAME in", values, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotIn(List<String> values) {
            addCriterion("CONNAME not in", values, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameBetween(String value1, String value2) {
            addCriterion("CONNAME between", value1, value2, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotBetween(String value1, String value2) {
            addCriterion("CONNAME not between", value1, value2, "conname");
            return (Criteria) this;
        }

        public Criteria andConmobileIsNull() {
            addCriterion("CONMOBILE is null");
            return (Criteria) this;
        }

        public Criteria andConmobileIsNotNull() {
            addCriterion("CONMOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andConmobileEqualTo(String value) {
            addCriterion("CONMOBILE =", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileNotEqualTo(String value) {
            addCriterion("CONMOBILE <>", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileGreaterThan(String value) {
            addCriterion("CONMOBILE >", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileGreaterThanOrEqualTo(String value) {
            addCriterion("CONMOBILE >=", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileLessThan(String value) {
            addCriterion("CONMOBILE <", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileLessThanOrEqualTo(String value) {
            addCriterion("CONMOBILE <=", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileLike(String value) {
            addCriterion("CONMOBILE like", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileNotLike(String value) {
            addCriterion("CONMOBILE not like", value, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileIn(List<String> values) {
            addCriterion("CONMOBILE in", values, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileNotIn(List<String> values) {
            addCriterion("CONMOBILE not in", values, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileBetween(String value1, String value2) {
            addCriterion("CONMOBILE between", value1, value2, "conmobile");
            return (Criteria) this;
        }

        public Criteria andConmobileNotBetween(String value1, String value2) {
            addCriterion("CONMOBILE not between", value1, value2, "conmobile");
            return (Criteria) this;
        }

        public Criteria andContelIsNull() {
            addCriterion("CONTEL is null");
            return (Criteria) this;
        }

        public Criteria andContelIsNotNull() {
            addCriterion("CONTEL is not null");
            return (Criteria) this;
        }

        public Criteria andContelEqualTo(String value) {
            addCriterion("CONTEL =", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotEqualTo(String value) {
            addCriterion("CONTEL <>", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelGreaterThan(String value) {
            addCriterion("CONTEL >", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelGreaterThanOrEqualTo(String value) {
            addCriterion("CONTEL >=", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelLessThan(String value) {
            addCriterion("CONTEL <", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelLessThanOrEqualTo(String value) {
            addCriterion("CONTEL <=", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelLike(String value) {
            addCriterion("CONTEL like", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotLike(String value) {
            addCriterion("CONTEL not like", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelIn(List<String> values) {
            addCriterion("CONTEL in", values, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotIn(List<String> values) {
            addCriterion("CONTEL not in", values, "contel");
            return (Criteria) this;
        }

        public Criteria andContelBetween(String value1, String value2) {
            addCriterion("CONTEL between", value1, value2, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotBetween(String value1, String value2) {
            addCriterion("CONTEL not between", value1, value2, "contel");
            return (Criteria) this;
        }

        public Criteria andConfaxIsNull() {
            addCriterion("CONFAX is null");
            return (Criteria) this;
        }

        public Criteria andConfaxIsNotNull() {
            addCriterion("CONFAX is not null");
            return (Criteria) this;
        }

        public Criteria andConfaxEqualTo(String value) {
            addCriterion("CONFAX =", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxNotEqualTo(String value) {
            addCriterion("CONFAX <>", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxGreaterThan(String value) {
            addCriterion("CONFAX >", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxGreaterThanOrEqualTo(String value) {
            addCriterion("CONFAX >=", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxLessThan(String value) {
            addCriterion("CONFAX <", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxLessThanOrEqualTo(String value) {
            addCriterion("CONFAX <=", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxLike(String value) {
            addCriterion("CONFAX like", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxNotLike(String value) {
            addCriterion("CONFAX not like", value, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxIn(List<String> values) {
            addCriterion("CONFAX in", values, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxNotIn(List<String> values) {
            addCriterion("CONFAX not in", values, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxBetween(String value1, String value2) {
            addCriterion("CONFAX between", value1, value2, "confax");
            return (Criteria) this;
        }

        public Criteria andConfaxNotBetween(String value1, String value2) {
            addCriterion("CONFAX not between", value1, value2, "confax");
            return (Criteria) this;
        }

        public Criteria andConmailIsNull() {
            addCriterion("CONMAIL is null");
            return (Criteria) this;
        }

        public Criteria andConmailIsNotNull() {
            addCriterion("CONMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andConmailEqualTo(String value) {
            addCriterion("CONMAIL =", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailNotEqualTo(String value) {
            addCriterion("CONMAIL <>", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailGreaterThan(String value) {
            addCriterion("CONMAIL >", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailGreaterThanOrEqualTo(String value) {
            addCriterion("CONMAIL >=", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailLessThan(String value) {
            addCriterion("CONMAIL <", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailLessThanOrEqualTo(String value) {
            addCriterion("CONMAIL <=", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailLike(String value) {
            addCriterion("CONMAIL like", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailNotLike(String value) {
            addCriterion("CONMAIL not like", value, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailIn(List<String> values) {
            addCriterion("CONMAIL in", values, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailNotIn(List<String> values) {
            addCriterion("CONMAIL not in", values, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailBetween(String value1, String value2) {
            addCriterion("CONMAIL between", value1, value2, "conmail");
            return (Criteria) this;
        }

        public Criteria andConmailNotBetween(String value1, String value2) {
            addCriterion("CONMAIL not between", value1, value2, "conmail");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIsNull() {
            addCriterion("ORGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIsNotNull() {
            addCriterion("ORGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtypeEqualTo(String value) {
            addCriterion("ORGTYPE =", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotEqualTo(String value) {
            addCriterion("ORGTYPE <>", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeGreaterThan(String value) {
            addCriterion("ORGTYPE >", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE >=", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLessThan(String value) {
            addCriterion("ORGTYPE <", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE <=", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeLike(String value) {
            addCriterion("ORGTYPE like", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotLike(String value) {
            addCriterion("ORGTYPE not like", value, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeIn(List<String> values) {
            addCriterion("ORGTYPE in", values, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotIn(List<String> values) {
            addCriterion("ORGTYPE not in", values, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeBetween(String value1, String value2) {
            addCriterion("ORGTYPE between", value1, value2, "orgtype");
            return (Criteria) this;
        }

        public Criteria andOrgtypeNotBetween(String value1, String value2) {
            addCriterion("ORGTYPE not between", value1, value2, "orgtype");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
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

        public Criteria andOrgLevelIsNull() {
            addCriterion("ORG_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNotNull() {
            addCriterion("ORG_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEqualTo(String value) {
            addCriterion("ORG_LEVEL =", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotEqualTo(String value) {
            addCriterion("ORG_LEVEL <>", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThan(String value) {
            addCriterion("ORG_LEVEL >", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_LEVEL >=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThan(String value) {
            addCriterion("ORG_LEVEL <", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThanOrEqualTo(String value) {
            addCriterion("ORG_LEVEL <=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLike(String value) {
            addCriterion("ORG_LEVEL like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotLike(String value) {
            addCriterion("ORG_LEVEL not like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIn(List<String> values) {
            addCriterion("ORG_LEVEL in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotIn(List<String> values) {
            addCriterion("ORG_LEVEL not in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelBetween(String value1, String value2) {
            addCriterion("ORG_LEVEL between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotBetween(String value1, String value2) {
            addCriterion("ORG_LEVEL not between", value1, value2, "orgLevel");
            return (Criteria) this;
        }
    }

    /**
     * T_ORGANS
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_ORGANS 2017-09-15
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