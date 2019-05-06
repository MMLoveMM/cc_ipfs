package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectEvaluateExample {
    /**
     * PROJECT_EVALUATE
     */
    protected String orderByClause;

    /**
     * PROJECT_EVALUATE
     */
    protected boolean distinct;

    /**
     * PROJECT_EVALUATE
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public ProjectEvaluateExample() {
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
     * PROJECT_EVALUATE 2017-09-15
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

        public Criteria andIndustryfuturevalIsNull() {
            addCriterion("INDUSTRYFUTUREVAL is null");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalIsNotNull() {
            addCriterion("INDUSTRYFUTUREVAL is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalEqualTo(String value) {
            addCriterion("INDUSTRYFUTUREVAL =", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalNotEqualTo(String value) {
            addCriterion("INDUSTRYFUTUREVAL <>", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalGreaterThan(String value) {
            addCriterion("INDUSTRYFUTUREVAL >", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYFUTUREVAL >=", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalLessThan(String value) {
            addCriterion("INDUSTRYFUTUREVAL <", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYFUTUREVAL <=", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalLike(String value) {
            addCriterion("INDUSTRYFUTUREVAL like", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalNotLike(String value) {
            addCriterion("INDUSTRYFUTUREVAL not like", value, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalIn(List<String> values) {
            addCriterion("INDUSTRYFUTUREVAL in", values, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalNotIn(List<String> values) {
            addCriterion("INDUSTRYFUTUREVAL not in", values, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalBetween(String value1, String value2) {
            addCriterion("INDUSTRYFUTUREVAL between", value1, value2, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andIndustryfuturevalNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYFUTUREVAL not between", value1, value2, "industryfutureval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalIsNull() {
            addCriterion("MANAGEMENTTEAMSVAL is null");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalIsNotNull() {
            addCriterion("MANAGEMENTTEAMSVAL is not null");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalEqualTo(String value) {
            addCriterion("MANAGEMENTTEAMSVAL =", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalNotEqualTo(String value) {
            addCriterion("MANAGEMENTTEAMSVAL <>", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalGreaterThan(String value) {
            addCriterion("MANAGEMENTTEAMSVAL >", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGEMENTTEAMSVAL >=", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalLessThan(String value) {
            addCriterion("MANAGEMENTTEAMSVAL <", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalLessThanOrEqualTo(String value) {
            addCriterion("MANAGEMENTTEAMSVAL <=", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalLike(String value) {
            addCriterion("MANAGEMENTTEAMSVAL like", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalNotLike(String value) {
            addCriterion("MANAGEMENTTEAMSVAL not like", value, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalIn(List<String> values) {
            addCriterion("MANAGEMENTTEAMSVAL in", values, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalNotIn(List<String> values) {
            addCriterion("MANAGEMENTTEAMSVAL not in", values, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalBetween(String value1, String value2) {
            addCriterion("MANAGEMENTTEAMSVAL between", value1, value2, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andManagementteamsvalNotBetween(String value1, String value2) {
            addCriterion("MANAGEMENTTEAMSVAL not between", value1, value2, "managementteamsval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalIsNull() {
            addCriterion("TECHNOLOGICALLEVELVAL is null");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalIsNotNull() {
            addCriterion("TECHNOLOGICALLEVELVAL is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalEqualTo(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL =", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalNotEqualTo(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL <>", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalGreaterThan(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL >", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL >=", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalLessThan(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL <", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalLessThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL <=", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalLike(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL like", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalNotLike(String value) {
            addCriterion("TECHNOLOGICALLEVELVAL not like", value, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalIn(List<String> values) {
            addCriterion("TECHNOLOGICALLEVELVAL in", values, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalNotIn(List<String> values) {
            addCriterion("TECHNOLOGICALLEVELVAL not in", values, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalBetween(String value1, String value2) {
            addCriterion("TECHNOLOGICALLEVELVAL between", value1, value2, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andTechnologicallevelvalNotBetween(String value1, String value2) {
            addCriterion("TECHNOLOGICALLEVELVAL not between", value1, value2, "technologicallevelval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalIsNull() {
            addCriterion("OPERATIONPATTERNVAL is null");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalIsNotNull() {
            addCriterion("OPERATIONPATTERNVAL is not null");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalEqualTo(String value) {
            addCriterion("OPERATIONPATTERNVAL =", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalNotEqualTo(String value) {
            addCriterion("OPERATIONPATTERNVAL <>", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalGreaterThan(String value) {
            addCriterion("OPERATIONPATTERNVAL >", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATIONPATTERNVAL >=", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalLessThan(String value) {
            addCriterion("OPERATIONPATTERNVAL <", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalLessThanOrEqualTo(String value) {
            addCriterion("OPERATIONPATTERNVAL <=", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalLike(String value) {
            addCriterion("OPERATIONPATTERNVAL like", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalNotLike(String value) {
            addCriterion("OPERATIONPATTERNVAL not like", value, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalIn(List<String> values) {
            addCriterion("OPERATIONPATTERNVAL in", values, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalNotIn(List<String> values) {
            addCriterion("OPERATIONPATTERNVAL not in", values, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalBetween(String value1, String value2) {
            addCriterion("OPERATIONPATTERNVAL between", value1, value2, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andOperationpatternvalNotBetween(String value1, String value2) {
            addCriterion("OPERATIONPATTERNVAL not between", value1, value2, "operationpatternval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalIsNull() {
            addCriterion("FINANCIALPOSITIONVAL is null");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalIsNotNull() {
            addCriterion("FINANCIALPOSITIONVAL is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalEqualTo(String value) {
            addCriterion("FINANCIALPOSITIONVAL =", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalNotEqualTo(String value) {
            addCriterion("FINANCIALPOSITIONVAL <>", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalGreaterThan(String value) {
            addCriterion("FINANCIALPOSITIONVAL >", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCIALPOSITIONVAL >=", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalLessThan(String value) {
            addCriterion("FINANCIALPOSITIONVAL <", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalLessThanOrEqualTo(String value) {
            addCriterion("FINANCIALPOSITIONVAL <=", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalLike(String value) {
            addCriterion("FINANCIALPOSITIONVAL like", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalNotLike(String value) {
            addCriterion("FINANCIALPOSITIONVAL not like", value, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalIn(List<String> values) {
            addCriterion("FINANCIALPOSITIONVAL in", values, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalNotIn(List<String> values) {
            addCriterion("FINANCIALPOSITIONVAL not in", values, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalBetween(String value1, String value2) {
            addCriterion("FINANCIALPOSITIONVAL between", value1, value2, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andFinancialpositionvalNotBetween(String value1, String value2) {
            addCriterion("FINANCIALPOSITIONVAL not between", value1, value2, "financialpositionval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalIsNull() {
            addCriterion("APPRAISEMENTVAL is null");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalIsNotNull() {
            addCriterion("APPRAISEMENTVAL is not null");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalEqualTo(String value) {
            addCriterion("APPRAISEMENTVAL =", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalNotEqualTo(String value) {
            addCriterion("APPRAISEMENTVAL <>", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalGreaterThan(String value) {
            addCriterion("APPRAISEMENTVAL >", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalGreaterThanOrEqualTo(String value) {
            addCriterion("APPRAISEMENTVAL >=", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalLessThan(String value) {
            addCriterion("APPRAISEMENTVAL <", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalLessThanOrEqualTo(String value) {
            addCriterion("APPRAISEMENTVAL <=", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalLike(String value) {
            addCriterion("APPRAISEMENTVAL like", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalNotLike(String value) {
            addCriterion("APPRAISEMENTVAL not like", value, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalIn(List<String> values) {
            addCriterion("APPRAISEMENTVAL in", values, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalNotIn(List<String> values) {
            addCriterion("APPRAISEMENTVAL not in", values, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalBetween(String value1, String value2) {
            addCriterion("APPRAISEMENTVAL between", value1, value2, "appraisementval");
            return (Criteria) this;
        }

        public Criteria andAppraisementvalNotBetween(String value1, String value2) {
            addCriterion("APPRAISEMENTVAL not between", value1, value2, "appraisementval");
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

        public Criteria andAveragevalIsNull() {
            addCriterion("AVERAGEVAL is null");
            return (Criteria) this;
        }

        public Criteria andAveragevalIsNotNull() {
            addCriterion("AVERAGEVAL is not null");
            return (Criteria) this;
        }

        public Criteria andAveragevalEqualTo(String value) {
            addCriterion("AVERAGEVAL =", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalNotEqualTo(String value) {
            addCriterion("AVERAGEVAL <>", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalGreaterThan(String value) {
            addCriterion("AVERAGEVAL >", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalGreaterThanOrEqualTo(String value) {
            addCriterion("AVERAGEVAL >=", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalLessThan(String value) {
            addCriterion("AVERAGEVAL <", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalLessThanOrEqualTo(String value) {
            addCriterion("AVERAGEVAL <=", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalLike(String value) {
            addCriterion("AVERAGEVAL like", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalNotLike(String value) {
            addCriterion("AVERAGEVAL not like", value, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalIn(List<String> values) {
            addCriterion("AVERAGEVAL in", values, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalNotIn(List<String> values) {
            addCriterion("AVERAGEVAL not in", values, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalBetween(String value1, String value2) {
            addCriterion("AVERAGEVAL between", value1, value2, "averageval");
            return (Criteria) this;
        }

        public Criteria andAveragevalNotBetween(String value1, String value2) {
            addCriterion("AVERAGEVAL not between", value1, value2, "averageval");
            return (Criteria) this;
        }
    }

    /**
     * PROJECT_EVALUATE
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PROJECT_EVALUATE 2017-09-15
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