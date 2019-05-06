package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class RepayplanDetailExample {
    /**
     * REPAYPLAN_DETAIL
     */
    protected String orderByClause;

    /**
     * REPAYPLAN_DETAIL
     */
    protected boolean distinct;

    /**
     * REPAYPLAN_DETAIL
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public RepayplanDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-11-16
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
     * @mbggenerated 2017-11-16
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * REPAYPLAN_DETAIL 2017-11-16
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

        public Criteria andRpypidIsNull() {
            addCriterion("RPYPID is null");
            return (Criteria) this;
        }

        public Criteria andRpypidIsNotNull() {
            addCriterion("RPYPID is not null");
            return (Criteria) this;
        }

        public Criteria andRpypidEqualTo(String value) {
            addCriterion("RPYPID =", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidNotEqualTo(String value) {
            addCriterion("RPYPID <>", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidGreaterThan(String value) {
            addCriterion("RPYPID >", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidGreaterThanOrEqualTo(String value) {
            addCriterion("RPYPID >=", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidLessThan(String value) {
            addCriterion("RPYPID <", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidLessThanOrEqualTo(String value) {
            addCriterion("RPYPID <=", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidLike(String value) {
            addCriterion("RPYPID like", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidNotLike(String value) {
            addCriterion("RPYPID not like", value, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidIn(List<String> values) {
            addCriterion("RPYPID in", values, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidNotIn(List<String> values) {
            addCriterion("RPYPID not in", values, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidBetween(String value1, String value2) {
            addCriterion("RPYPID between", value1, value2, "rpypid");
            return (Criteria) this;
        }

        public Criteria andRpypidNotBetween(String value1, String value2) {
            addCriterion("RPYPID not between", value1, value2, "rpypid");
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

        public Criteria andCurstageEqualTo(Short value) {
            addCriterion("CURSTAGE =", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageNotEqualTo(Short value) {
            addCriterion("CURSTAGE <>", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageGreaterThan(Short value) {
            addCriterion("CURSTAGE >", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageGreaterThanOrEqualTo(Short value) {
            addCriterion("CURSTAGE >=", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageLessThan(Short value) {
            addCriterion("CURSTAGE <", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageLessThanOrEqualTo(Short value) {
            addCriterion("CURSTAGE <=", value, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageIn(List<Short> values) {
            addCriterion("CURSTAGE in", values, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageNotIn(List<Short> values) {
            addCriterion("CURSTAGE not in", values, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageBetween(Short value1, Short value2) {
            addCriterion("CURSTAGE between", value1, value2, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurstageNotBetween(Short value1, Short value2) {
            addCriterion("CURSTAGE not between", value1, value2, "curstage");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtIsNull() {
            addCriterion("CURRPYAMT is null");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtIsNotNull() {
            addCriterion("CURRPYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtEqualTo(Double value) {
            addCriterion("CURRPYAMT =", value, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtNotEqualTo(Double value) {
            addCriterion("CURRPYAMT <>", value, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtGreaterThan(Double value) {
            addCriterion("CURRPYAMT >", value, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtGreaterThanOrEqualTo(Double value) {
            addCriterion("CURRPYAMT >=", value, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtLessThan(Double value) {
            addCriterion("CURRPYAMT <", value, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtLessThanOrEqualTo(Double value) {
            addCriterion("CURRPYAMT <=", value, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtIn(List<Double> values) {
            addCriterion("CURRPYAMT in", values, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtNotIn(List<Double> values) {
            addCriterion("CURRPYAMT not in", values, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtBetween(Double value1, Double value2) {
            addCriterion("CURRPYAMT between", value1, value2, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyamtNotBetween(Double value1, Double value2) {
            addCriterion("CURRPYAMT not between", value1, value2, "currpyamt");
            return (Criteria) this;
        }

        public Criteria andCurrpyintIsNull() {
            addCriterion("CURRPYINT is null");
            return (Criteria) this;
        }

        public Criteria andCurrpyintIsNotNull() {
            addCriterion("CURRPYINT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrpyintEqualTo(Double value) {
            addCriterion("CURRPYINT =", value, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintNotEqualTo(Double value) {
            addCriterion("CURRPYINT <>", value, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintGreaterThan(Double value) {
            addCriterion("CURRPYINT >", value, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintGreaterThanOrEqualTo(Double value) {
            addCriterion("CURRPYINT >=", value, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintLessThan(Double value) {
            addCriterion("CURRPYINT <", value, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintLessThanOrEqualTo(Double value) {
            addCriterion("CURRPYINT <=", value, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintIn(List<Double> values) {
            addCriterion("CURRPYINT in", values, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintNotIn(List<Double> values) {
            addCriterion("CURRPYINT not in", values, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintBetween(Double value1, Double value2) {
            addCriterion("CURRPYINT between", value1, value2, "currpyint");
            return (Criteria) this;
        }

        public Criteria andCurrpyintNotBetween(Double value1, Double value2) {
            addCriterion("CURRPYINT not between", value1, value2, "currpyint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintIsNull() {
            addCriterion("KEEPPRININT is null");
            return (Criteria) this;
        }

        public Criteria andKeepprinintIsNotNull() {
            addCriterion("KEEPPRININT is not null");
            return (Criteria) this;
        }

        public Criteria andKeepprinintEqualTo(Double value) {
            addCriterion("KEEPPRININT =", value, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintNotEqualTo(Double value) {
            addCriterion("KEEPPRININT <>", value, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintGreaterThan(Double value) {
            addCriterion("KEEPPRININT >", value, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintGreaterThanOrEqualTo(Double value) {
            addCriterion("KEEPPRININT >=", value, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintLessThan(Double value) {
            addCriterion("KEEPPRININT <", value, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintLessThanOrEqualTo(Double value) {
            addCriterion("KEEPPRININT <=", value, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintIn(List<Double> values) {
            addCriterion("KEEPPRININT in", values, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintNotIn(List<Double> values) {
            addCriterion("KEEPPRININT not in", values, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintBetween(Double value1, Double value2) {
            addCriterion("KEEPPRININT between", value1, value2, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andKeepprinintNotBetween(Double value1, Double value2) {
            addCriterion("KEEPPRININT not between", value1, value2, "keepprinint");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtIsNull() {
            addCriterion("PLANRPYDT is null");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtIsNotNull() {
            addCriterion("PLANRPYDT is not null");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtEqualTo(String value) {
            addCriterion("PLANRPYDT =", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtNotEqualTo(String value) {
            addCriterion("PLANRPYDT <>", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtGreaterThan(String value) {
            addCriterion("PLANRPYDT >", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtGreaterThanOrEqualTo(String value) {
            addCriterion("PLANRPYDT >=", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtLessThan(String value) {
            addCriterion("PLANRPYDT <", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtLessThanOrEqualTo(String value) {
            addCriterion("PLANRPYDT <=", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtLike(String value) {
            addCriterion("PLANRPYDT like", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtNotLike(String value) {
            addCriterion("PLANRPYDT not like", value, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtIn(List<String> values) {
            addCriterion("PLANRPYDT in", values, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtNotIn(List<String> values) {
            addCriterion("PLANRPYDT not in", values, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtBetween(String value1, String value2) {
            addCriterion("PLANRPYDT between", value1, value2, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andPlanrpydtNotBetween(String value1, String value2) {
            addCriterion("PLANRPYDT not between", value1, value2, "planrpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtIsNull() {
            addCriterion("CURRPYDT is null");
            return (Criteria) this;
        }

        public Criteria andCurrpydtIsNotNull() {
            addCriterion("CURRPYDT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrpydtEqualTo(String value) {
            addCriterion("CURRPYDT =", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtNotEqualTo(String value) {
            addCriterion("CURRPYDT <>", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtGreaterThan(String value) {
            addCriterion("CURRPYDT >", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtGreaterThanOrEqualTo(String value) {
            addCriterion("CURRPYDT >=", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtLessThan(String value) {
            addCriterion("CURRPYDT <", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtLessThanOrEqualTo(String value) {
            addCriterion("CURRPYDT <=", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtLike(String value) {
            addCriterion("CURRPYDT like", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtNotLike(String value) {
            addCriterion("CURRPYDT not like", value, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtIn(List<String> values) {
            addCriterion("CURRPYDT in", values, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtNotIn(List<String> values) {
            addCriterion("CURRPYDT not in", values, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtBetween(String value1, String value2) {
            addCriterion("CURRPYDT between", value1, value2, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpydtNotBetween(String value1, String value2) {
            addCriterion("CURRPYDT not between", value1, value2, "currpydt");
            return (Criteria) this;
        }

        public Criteria andCurrpystateIsNull() {
            addCriterion("CURRPYSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCurrpystateIsNotNull() {
            addCriterion("CURRPYSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrpystateEqualTo(String value) {
            addCriterion("CURRPYSTATE =", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateNotEqualTo(String value) {
            addCriterion("CURRPYSTATE <>", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateGreaterThan(String value) {
            addCriterion("CURRPYSTATE >", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateGreaterThanOrEqualTo(String value) {
            addCriterion("CURRPYSTATE >=", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateLessThan(String value) {
            addCriterion("CURRPYSTATE <", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateLessThanOrEqualTo(String value) {
            addCriterion("CURRPYSTATE <=", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateLike(String value) {
            addCriterion("CURRPYSTATE like", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateNotLike(String value) {
            addCriterion("CURRPYSTATE not like", value, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateIn(List<String> values) {
            addCriterion("CURRPYSTATE in", values, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateNotIn(List<String> values) {
            addCriterion("CURRPYSTATE not in", values, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateBetween(String value1, String value2) {
            addCriterion("CURRPYSTATE between", value1, value2, "currpystate");
            return (Criteria) this;
        }

        public Criteria andCurrpystateNotBetween(String value1, String value2) {
            addCriterion("CURRPYSTATE not between", value1, value2, "currpystate");
            return (Criteria) this;
        }

        public Criteria andKeepintIsNull() {
            addCriterion("KEEPINT is null");
            return (Criteria) this;
        }

        public Criteria andKeepintIsNotNull() {
            addCriterion("KEEPINT is not null");
            return (Criteria) this;
        }

        public Criteria andKeepintEqualTo(Double value) {
            addCriterion("KEEPINT =", value, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintNotEqualTo(Double value) {
            addCriterion("KEEPINT <>", value, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintGreaterThan(Double value) {
            addCriterion("KEEPINT >", value, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintGreaterThanOrEqualTo(Double value) {
            addCriterion("KEEPINT >=", value, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintLessThan(Double value) {
            addCriterion("KEEPINT <", value, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintLessThanOrEqualTo(Double value) {
            addCriterion("KEEPINT <=", value, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintIn(List<Double> values) {
            addCriterion("KEEPINT in", values, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintNotIn(List<Double> values) {
            addCriterion("KEEPINT not in", values, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintBetween(Double value1, Double value2) {
            addCriterion("KEEPINT between", value1, value2, "keepint");
            return (Criteria) this;
        }

        public Criteria andKeepintNotBetween(Double value1, Double value2) {
            addCriterion("KEEPINT not between", value1, value2, "keepint");
            return (Criteria) this;
        }
    }

    /**
     * REPAYPLAN_DETAIL
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * REPAYPLAN_DETAIL 2017-11-16
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