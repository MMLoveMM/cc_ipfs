package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceCompanyInfoExample {
    /**
     * SERVICE_COMPANY_INFO
     */
    protected String orderByClause;

    /**
     * SERVICE_COMPANY_INFO
     */
    protected boolean distinct;

    /**
     * SERVICE_COMPANY_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public ServiceCompanyInfoExample() {
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
     * SERVICE_COMPANY_INFO 2017-09-15
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

        public Criteria andProjectInfoIdIsNull() {
            addCriterion("PROJECT_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdIsNotNull() {
            addCriterion("PROJECT_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdEqualTo(String value) {
            addCriterion("PROJECT_INFO_ID =", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdNotEqualTo(String value) {
            addCriterion("PROJECT_INFO_ID <>", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdGreaterThan(String value) {
            addCriterion("PROJECT_INFO_ID >", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_INFO_ID >=", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdLessThan(String value) {
            addCriterion("PROJECT_INFO_ID <", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_INFO_ID <=", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdLike(String value) {
            addCriterion("PROJECT_INFO_ID like", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdNotLike(String value) {
            addCriterion("PROJECT_INFO_ID not like", value, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdIn(List<String> values) {
            addCriterion("PROJECT_INFO_ID in", values, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdNotIn(List<String> values) {
            addCriterion("PROJECT_INFO_ID not in", values, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdBetween(String value1, String value2) {
            addCriterion("PROJECT_INFO_ID between", value1, value2, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andProjectInfoIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_INFO_ID not between", value1, value2, "projectInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("MOD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("MOD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("MOD_TIME =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("MOD_TIME <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("MOD_TIME >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("MOD_TIME <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("MOD_TIME in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("MOD_TIME not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationIsNull() {
            addCriterion("REASON_FOR_CANCELLATION is null");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationIsNotNull() {
            addCriterion("REASON_FOR_CANCELLATION is not null");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationEqualTo(String value) {
            addCriterion("REASON_FOR_CANCELLATION =", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationNotEqualTo(String value) {
            addCriterion("REASON_FOR_CANCELLATION <>", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationGreaterThan(String value) {
            addCriterion("REASON_FOR_CANCELLATION >", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationGreaterThanOrEqualTo(String value) {
            addCriterion("REASON_FOR_CANCELLATION >=", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationLessThan(String value) {
            addCriterion("REASON_FOR_CANCELLATION <", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationLessThanOrEqualTo(String value) {
            addCriterion("REASON_FOR_CANCELLATION <=", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationLike(String value) {
            addCriterion("REASON_FOR_CANCELLATION like", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationNotLike(String value) {
            addCriterion("REASON_FOR_CANCELLATION not like", value, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationIn(List<String> values) {
            addCriterion("REASON_FOR_CANCELLATION in", values, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationNotIn(List<String> values) {
            addCriterion("REASON_FOR_CANCELLATION not in", values, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationBetween(String value1, String value2) {
            addCriterion("REASON_FOR_CANCELLATION between", value1, value2, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andReasonForCancellationNotBetween(String value1, String value2) {
            addCriterion("REASON_FOR_CANCELLATION not between", value1, value2, "reasonForCancellation");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNull() {
            addCriterion("EVALUATION is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNotNull() {
            addCriterion("EVALUATION is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationEqualTo(String value) {
            addCriterion("EVALUATION =", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotEqualTo(String value) {
            addCriterion("EVALUATION <>", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThan(String value) {
            addCriterion("EVALUATION >", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATION >=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThan(String value) {
            addCriterion("EVALUATION <", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThanOrEqualTo(String value) {
            addCriterion("EVALUATION <=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLike(String value) {
            addCriterion("EVALUATION like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotLike(String value) {
            addCriterion("EVALUATION not like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationIn(List<String> values) {
            addCriterion("EVALUATION in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotIn(List<String> values) {
            addCriterion("EVALUATION not in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationBetween(String value1, String value2) {
            addCriterion("EVALUATION between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotBetween(String value1, String value2) {
            addCriterion("EVALUATION not between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyIsNull() {
            addCriterion("LOANS_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyIsNotNull() {
            addCriterion("LOANS_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyEqualTo(String value) {
            addCriterion("LOANS_MONEY =", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyNotEqualTo(String value) {
            addCriterion("LOANS_MONEY <>", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyGreaterThan(String value) {
            addCriterion("LOANS_MONEY >", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("LOANS_MONEY >=", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyLessThan(String value) {
            addCriterion("LOANS_MONEY <", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyLessThanOrEqualTo(String value) {
            addCriterion("LOANS_MONEY <=", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyLike(String value) {
            addCriterion("LOANS_MONEY like", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyNotLike(String value) {
            addCriterion("LOANS_MONEY not like", value, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyIn(List<String> values) {
            addCriterion("LOANS_MONEY in", values, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyNotIn(List<String> values) {
            addCriterion("LOANS_MONEY not in", values, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyBetween(String value1, String value2) {
            addCriterion("LOANS_MONEY between", value1, value2, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andLoansMoneyNotBetween(String value1, String value2) {
            addCriterion("LOANS_MONEY not between", value1, value2, "loansMoney");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioIsNull() {
            addCriterion("SHAREHOLDING_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioIsNotNull() {
            addCriterion("SHAREHOLDING_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioEqualTo(String value) {
            addCriterion("SHAREHOLDING_RATIO =", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioNotEqualTo(String value) {
            addCriterion("SHAREHOLDING_RATIO <>", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioGreaterThan(String value) {
            addCriterion("SHAREHOLDING_RATIO >", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioGreaterThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDING_RATIO >=", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioLessThan(String value) {
            addCriterion("SHAREHOLDING_RATIO <", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioLessThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDING_RATIO <=", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioLike(String value) {
            addCriterion("SHAREHOLDING_RATIO like", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioNotLike(String value) {
            addCriterion("SHAREHOLDING_RATIO not like", value, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioIn(List<String> values) {
            addCriterion("SHAREHOLDING_RATIO in", values, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioNotIn(List<String> values) {
            addCriterion("SHAREHOLDING_RATIO not in", values, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioBetween(String value1, String value2) {
            addCriterion("SHAREHOLDING_RATIO between", value1, value2, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdingRatioNotBetween(String value1, String value2) {
            addCriterion("SHAREHOLDING_RATIO not between", value1, value2, "shareholdingRatio");
            return (Criteria) this;
        }

        public Criteria andPawnIsNull() {
            addCriterion("PAWN is null");
            return (Criteria) this;
        }

        public Criteria andPawnIsNotNull() {
            addCriterion("PAWN is not null");
            return (Criteria) this;
        }

        public Criteria andPawnEqualTo(String value) {
            addCriterion("PAWN =", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotEqualTo(String value) {
            addCriterion("PAWN <>", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnGreaterThan(String value) {
            addCriterion("PAWN >", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnGreaterThanOrEqualTo(String value) {
            addCriterion("PAWN >=", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnLessThan(String value) {
            addCriterion("PAWN <", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnLessThanOrEqualTo(String value) {
            addCriterion("PAWN <=", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnLike(String value) {
            addCriterion("PAWN like", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotLike(String value) {
            addCriterion("PAWN not like", value, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnIn(List<String> values) {
            addCriterion("PAWN in", values, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotIn(List<String> values) {
            addCriterion("PAWN not in", values, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnBetween(String value1, String value2) {
            addCriterion("PAWN between", value1, value2, "pawn");
            return (Criteria) this;
        }

        public Criteria andPawnNotBetween(String value1, String value2) {
            addCriterion("PAWN not between", value1, value2, "pawn");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountIsNull() {
            addCriterion("ASSESS_THE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountIsNotNull() {
            addCriterion("ASSESS_THE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountEqualTo(String value) {
            addCriterion("ASSESS_THE_AMOUNT =", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountNotEqualTo(String value) {
            addCriterion("ASSESS_THE_AMOUNT <>", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountGreaterThan(String value) {
            addCriterion("ASSESS_THE_AMOUNT >", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_THE_AMOUNT >=", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountLessThan(String value) {
            addCriterion("ASSESS_THE_AMOUNT <", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_THE_AMOUNT <=", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountLike(String value) {
            addCriterion("ASSESS_THE_AMOUNT like", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountNotLike(String value) {
            addCriterion("ASSESS_THE_AMOUNT not like", value, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountIn(List<String> values) {
            addCriterion("ASSESS_THE_AMOUNT in", values, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountNotIn(List<String> values) {
            addCriterion("ASSESS_THE_AMOUNT not in", values, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountBetween(String value1, String value2) {
            addCriterion("ASSESS_THE_AMOUNT between", value1, value2, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andAssessTheAmountNotBetween(String value1, String value2) {
            addCriterion("ASSESS_THE_AMOUNT not between", value1, value2, "assessTheAmount");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNull() {
            addCriterion("EVALUATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIsNotNull() {
            addCriterion("EVALUATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeEqualTo(Date value) {
            addCriterion("EVALUATION_TIME =", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotEqualTo(Date value) {
            addCriterion("EVALUATION_TIME <>", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThan(Date value) {
            addCriterion("EVALUATION_TIME >", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EVALUATION_TIME >=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThan(Date value) {
            addCriterion("EVALUATION_TIME <", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeLessThanOrEqualTo(Date value) {
            addCriterion("EVALUATION_TIME <=", value, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeIn(List<Date> values) {
            addCriterion("EVALUATION_TIME in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotIn(List<Date> values) {
            addCriterion("EVALUATION_TIME not in", values, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeBetween(Date value1, Date value2) {
            addCriterion("EVALUATION_TIME between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationTimeNotBetween(Date value1, Date value2) {
            addCriterion("EVALUATION_TIME not between", value1, value2, "evaluationTime");
            return (Criteria) this;
        }
    }

    /**
     * SERVICE_COMPANY_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SERVICE_COMPANY_INFO 2017-09-15
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