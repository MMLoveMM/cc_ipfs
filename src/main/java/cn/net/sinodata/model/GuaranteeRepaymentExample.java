package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class GuaranteeRepaymentExample {
    /**
     * GUARANTEE_REPAYMENT
     */
    protected String orderByClause;

    /**
     * GUARANTEE_REPAYMENT
     */
    protected boolean distinct;

    /**
     * GUARANTEE_REPAYMENT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-20
     */
    public GuaranteeRepaymentExample() {
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
     * GUARANTEE_REPAYMENT 2017-11-20
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

        public Criteria andCurstageIsNull() {
            addCriterion("CURSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andCurstageIsNotNull() {
            addCriterion("CURSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCurstageEqualTo(String value) {
            addCriterion("CURSTAGE =", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageNotEqualTo(String value) {
            addCriterion("CURSTAGE <>", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageGreaterThan(String value) {
            addCriterion("CURSTAGE >", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageGreaterThanOrEqualTo(String value) {
            addCriterion("CURSTAGE >=", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageLessThan(String value) {
            addCriterion("CURSTAGE <", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageLessThanOrEqualTo(String value) {
            addCriterion("CURSTAGE <=", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageLike(String value) {
            addCriterion("CURSTAGE like", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageNotLike(String value) {
            addCriterion("CURSTAGE not like", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageIn(List<String> values) {
            addCriterion("CURSTAGE in", values, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageNotIn(List<String> values) {
            addCriterion("CURSTAGE not in", values, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageBetween(String value1, String value2) {
            addCriterion("CURSTAGE between", value1, value2, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageNotBetween(String value1, String value2) {
            addCriterion("CURSTAGE not between", value1, value2, "curstage");
            return (Criteria) this;
        }

        public Criteria andCuramountIsNull() {
            addCriterion("CURAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCuramountIsNotNull() {
            addCriterion("CURAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCuramountEqualTo(String value) {
            addCriterion("CURAMOUNT =", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountNotEqualTo(String value) {
            addCriterion("CURAMOUNT <>", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountGreaterThan(String value) {
            addCriterion("CURAMOUNT >", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountGreaterThanOrEqualTo(String value) {
            addCriterion("CURAMOUNT >=", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountLessThan(String value) {
            addCriterion("CURAMOUNT <", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountLessThanOrEqualTo(String value) {
            addCriterion("CURAMOUNT <=", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountLike(String value) {
            addCriterion("CURAMOUNT like", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountNotLike(String value) {
            addCriterion("CURAMOUNT not like", value, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountIn(List<String> values) {
            addCriterion("CURAMOUNT in", values, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountNotIn(List<String> values) {
            addCriterion("CURAMOUNT not in", values, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountBetween(String value1, String value2) {
            addCriterion("CURAMOUNT between", value1, value2, "curamount");
            return (Criteria) this;
        }

        public Criteria andCuramountNotBetween(String value1, String value2) {
            addCriterion("CURAMOUNT not between", value1, value2, "curamount");
            return (Criteria) this;
        }

        public Criteria andCurplandtIsNull() {
            addCriterion("CURPLANDT is null");
            return (Criteria) this;
        }

        public Criteria andCurplandtIsNotNull() {
            addCriterion("CURPLANDT is not null");
            return (Criteria) this;
        }

        public Criteria andCurplandtEqualTo(String value) {
            addCriterion("CURPLANDT =", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtNotEqualTo(String value) {
            addCriterion("CURPLANDT <>", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtGreaterThan(String value) {
            addCriterion("CURPLANDT >", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtGreaterThanOrEqualTo(String value) {
            addCriterion("CURPLANDT >=", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtLessThan(String value) {
            addCriterion("CURPLANDT <", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtLessThanOrEqualTo(String value) {
            addCriterion("CURPLANDT <=", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtLike(String value) {
            addCriterion("CURPLANDT like", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtNotLike(String value) {
            addCriterion("CURPLANDT not like", value, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtIn(List<String> values) {
            addCriterion("CURPLANDT in", values, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtNotIn(List<String> values) {
            addCriterion("CURPLANDT not in", values, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtBetween(String value1, String value2) {
            addCriterion("CURPLANDT between", value1, value2, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurplandtNotBetween(String value1, String value2) {
            addCriterion("CURPLANDT not between", value1, value2, "curplandt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtIsNull() {
            addCriterion("CURREPAYDT is null");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtIsNotNull() {
            addCriterion("CURREPAYDT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtEqualTo(String value) {
            addCriterion("CURREPAYDT =", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtNotEqualTo(String value) {
            addCriterion("CURREPAYDT <>", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtGreaterThan(String value) {
            addCriterion("CURREPAYDT >", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtGreaterThanOrEqualTo(String value) {
            addCriterion("CURREPAYDT >=", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtLessThan(String value) {
            addCriterion("CURREPAYDT <", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtLessThanOrEqualTo(String value) {
            addCriterion("CURREPAYDT <=", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtLike(String value) {
            addCriterion("CURREPAYDT like", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtNotLike(String value) {
            addCriterion("CURREPAYDT not like", value, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtIn(List<String> values) {
            addCriterion("CURREPAYDT in", values, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtNotIn(List<String> values) {
            addCriterion("CURREPAYDT not in", values, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtBetween(String value1, String value2) {
            addCriterion("CURREPAYDT between", value1, value2, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurrepaydtNotBetween(String value1, String value2) {
            addCriterion("CURREPAYDT not between", value1, value2, "currepaydt");
            return (Criteria) this;
        }

        public Criteria andCurstatusIsNull() {
            addCriterion("CURSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCurstatusIsNotNull() {
            addCriterion("CURSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCurstatusEqualTo(String value) {
            addCriterion("CURSTATUS =", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusNotEqualTo(String value) {
            addCriterion("CURSTATUS <>", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusGreaterThan(String value) {
            addCriterion("CURSTATUS >", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CURSTATUS >=", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusLessThan(String value) {
            addCriterion("CURSTATUS <", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusLessThanOrEqualTo(String value) {
            addCriterion("CURSTATUS <=", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusLike(String value) {
            addCriterion("CURSTATUS like", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusNotLike(String value) {
            addCriterion("CURSTATUS not like", value, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusIn(List<String> values) {
            addCriterion("CURSTATUS in", values, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusNotIn(List<String> values) {
            addCriterion("CURSTATUS not in", values, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusBetween(String value1, String value2) {
            addCriterion("CURSTATUS between", value1, value2, "curstatus");
            return (Criteria) this;
        }

        public Criteria andCurstatusNotBetween(String value1, String value2) {
            addCriterion("CURSTATUS not between", value1, value2, "curstatus");
            return (Criteria) this;
        }

        public Criteria andGrridIsNull() {
            addCriterion("GRRID is null");
            return (Criteria) this;
        }

        public Criteria andGrridIsNotNull() {
            addCriterion("GRRID is not null");
            return (Criteria) this;
        }

        public Criteria andGrridEqualTo(String value) {
            addCriterion("GRRID =", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridNotEqualTo(String value) {
            addCriterion("GRRID <>", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridGreaterThan(String value) {
            addCriterion("GRRID >", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridGreaterThanOrEqualTo(String value) {
            addCriterion("GRRID >=", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridLessThan(String value) {
            addCriterion("GRRID <", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridLessThanOrEqualTo(String value) {
            addCriterion("GRRID <=", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridLike(String value) {
            addCriterion("GRRID like", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridNotLike(String value) {
            addCriterion("GRRID not like", value, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridIn(List<String> values) {
            addCriterion("GRRID in", values, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridNotIn(List<String> values) {
            addCriterion("GRRID not in", values, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridBetween(String value1, String value2) {
            addCriterion("GRRID between", value1, value2, "grrid");
            return (Criteria) this;
        }

        public Criteria andGrridNotBetween(String value1, String value2) {
            addCriterion("GRRID not between", value1, value2, "grrid");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalIsNull() {
            addCriterion("REMAINPRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalIsNotNull() {
            addCriterion("REMAINPRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalEqualTo(String value) {
            addCriterion("REMAINPRINCIPAL =", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalNotEqualTo(String value) {
            addCriterion("REMAINPRINCIPAL <>", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalGreaterThan(String value) {
            addCriterion("REMAINPRINCIPAL >", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("REMAINPRINCIPAL >=", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalLessThan(String value) {
            addCriterion("REMAINPRINCIPAL <", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalLessThanOrEqualTo(String value) {
            addCriterion("REMAINPRINCIPAL <=", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalLike(String value) {
            addCriterion("REMAINPRINCIPAL like", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalNotLike(String value) {
            addCriterion("REMAINPRINCIPAL not like", value, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalIn(List<String> values) {
            addCriterion("REMAINPRINCIPAL in", values, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalNotIn(List<String> values) {
            addCriterion("REMAINPRINCIPAL not in", values, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalBetween(String value1, String value2) {
            addCriterion("REMAINPRINCIPAL between", value1, value2, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRemainprincipalNotBetween(String value1, String value2) {
            addCriterion("REMAINPRINCIPAL not between", value1, value2, "remainprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalIsNull() {
            addCriterion("REPAYPRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalIsNotNull() {
            addCriterion("REPAYPRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalEqualTo(String value) {
            addCriterion("REPAYPRINCIPAL =", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalNotEqualTo(String value) {
            addCriterion("REPAYPRINCIPAL <>", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalGreaterThan(String value) {
            addCriterion("REPAYPRINCIPAL >", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYPRINCIPAL >=", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalLessThan(String value) {
            addCriterion("REPAYPRINCIPAL <", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalLessThanOrEqualTo(String value) {
            addCriterion("REPAYPRINCIPAL <=", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalLike(String value) {
            addCriterion("REPAYPRINCIPAL like", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalNotLike(String value) {
            addCriterion("REPAYPRINCIPAL not like", value, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalIn(List<String> values) {
            addCriterion("REPAYPRINCIPAL in", values, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalNotIn(List<String> values) {
            addCriterion("REPAYPRINCIPAL not in", values, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalBetween(String value1, String value2) {
            addCriterion("REPAYPRINCIPAL between", value1, value2, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayprincipalNotBetween(String value1, String value2) {
            addCriterion("REPAYPRINCIPAL not between", value1, value2, "repayprincipal");
            return (Criteria) this;
        }

        public Criteria andRepayinterestIsNull() {
            addCriterion("REPAYINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andRepayinterestIsNotNull() {
            addCriterion("REPAYINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andRepayinterestEqualTo(String value) {
            addCriterion("REPAYINTEREST =", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestNotEqualTo(String value) {
            addCriterion("REPAYINTEREST <>", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestGreaterThan(String value) {
            addCriterion("REPAYINTEREST >", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYINTEREST >=", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestLessThan(String value) {
            addCriterion("REPAYINTEREST <", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestLessThanOrEqualTo(String value) {
            addCriterion("REPAYINTEREST <=", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestLike(String value) {
            addCriterion("REPAYINTEREST like", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestNotLike(String value) {
            addCriterion("REPAYINTEREST not like", value, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestIn(List<String> values) {
            addCriterion("REPAYINTEREST in", values, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestNotIn(List<String> values) {
            addCriterion("REPAYINTEREST not in", values, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestBetween(String value1, String value2) {
            addCriterion("REPAYINTEREST between", value1, value2, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andRepayinterestNotBetween(String value1, String value2) {
            addCriterion("REPAYINTEREST not between", value1, value2, "repayinterest");
            return (Criteria) this;
        }

        public Criteria andActualamountIsNull() {
            addCriterion("ACTUALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andActualamountIsNotNull() {
            addCriterion("ACTUALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andActualamountEqualTo(String value) {
            addCriterion("ACTUALAMOUNT =", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotEqualTo(String value) {
            addCriterion("ACTUALAMOUNT <>", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountGreaterThan(String value) {
            addCriterion("ACTUALAMOUNT >", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALAMOUNT >=", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLessThan(String value) {
            addCriterion("ACTUALAMOUNT <", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLessThanOrEqualTo(String value) {
            addCriterion("ACTUALAMOUNT <=", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLike(String value) {
            addCriterion("ACTUALAMOUNT like", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotLike(String value) {
            addCriterion("ACTUALAMOUNT not like", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountIn(List<String> values) {
            addCriterion("ACTUALAMOUNT in", values, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotIn(List<String> values) {
            addCriterion("ACTUALAMOUNT not in", values, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountBetween(String value1, String value2) {
            addCriterion("ACTUALAMOUNT between", value1, value2, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotBetween(String value1, String value2) {
            addCriterion("ACTUALAMOUNT not between", value1, value2, "actualamount");
            return (Criteria) this;
        }
    }

    /**
     * GUARANTEE_REPAYMENT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * GUARANTEE_REPAYMENT 2017-11-20
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