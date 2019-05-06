package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class LoanRepaymentExample {
    /**
     * LOAN_REPAYMENT
     */
    protected String orderByClause;

    /**
     * LOAN_REPAYMENT
     */
    protected boolean distinct;

    /**
     * LOAN_REPAYMENT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public LoanRepaymentExample() {
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
     * LOAN_REPAYMENT 2017-11-16
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

        public Criteria andCoopbankIsNull() {
            addCriterion("COOPBANK is null");
            return (Criteria) this;
        }

        public Criteria andCoopbankIsNotNull() {
            addCriterion("COOPBANK is not null");
            return (Criteria) this;
        }

        public Criteria andCoopbankEqualTo(String value) {
            addCriterion("COOPBANK =", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankNotEqualTo(String value) {
            addCriterion("COOPBANK <>", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankGreaterThan(String value) {
            addCriterion("COOPBANK >", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankGreaterThanOrEqualTo(String value) {
            addCriterion("COOPBANK >=", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankLessThan(String value) {
            addCriterion("COOPBANK <", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankLessThanOrEqualTo(String value) {
            addCriterion("COOPBANK <=", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankLike(String value) {
            addCriterion("COOPBANK like", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankNotLike(String value) {
            addCriterion("COOPBANK not like", value, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankIn(List<String> values) {
            addCriterion("COOPBANK in", values, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankNotIn(List<String> values) {
            addCriterion("COOPBANK not in", values, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankBetween(String value1, String value2) {
            addCriterion("COOPBANK between", value1, value2, "coopbank");
            return (Criteria) this;
        }

        public Criteria andCoopbankNotBetween(String value1, String value2) {
            addCriterion("COOPBANK not between", value1, value2, "coopbank");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("LOANAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("LOANAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(String value) {
            addCriterion("LOANAMOUNT =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(String value) {
            addCriterion("LOANAMOUNT <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(String value) {
            addCriterion("LOANAMOUNT >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(String value) {
            addCriterion("LOANAMOUNT >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(String value) {
            addCriterion("LOANAMOUNT <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(String value) {
            addCriterion("LOANAMOUNT <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLike(String value) {
            addCriterion("LOANAMOUNT like", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotLike(String value) {
            addCriterion("LOANAMOUNT not like", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<String> values) {
            addCriterion("LOANAMOUNT in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<String> values) {
            addCriterion("LOANAMOUNT not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(String value1, String value2) {
            addCriterion("LOANAMOUNT between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(String value1, String value2) {
            addCriterion("LOANAMOUNT not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("BANKACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("BANKACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("BANKACCOUNT =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("BANKACCOUNT <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("BANKACCOUNT >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNT >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("BANKACCOUNT <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("BANKACCOUNT <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("BANKACCOUNT like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("BANKACCOUNT not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("BANKACCOUNT in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("BANKACCOUNT not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("BANKACCOUNT between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("BANKACCOUNT not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andLoanlimitIsNull() {
            addCriterion("LOANLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitIsNotNull() {
            addCriterion("LOANLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitEqualTo(String value) {
            addCriterion("LOANLIMIT =", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitNotEqualTo(String value) {
            addCriterion("LOANLIMIT <>", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitGreaterThan(String value) {
            addCriterion("LOANLIMIT >", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitGreaterThanOrEqualTo(String value) {
            addCriterion("LOANLIMIT >=", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitLessThan(String value) {
            addCriterion("LOANLIMIT <", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitLessThanOrEqualTo(String value) {
            addCriterion("LOANLIMIT <=", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitLike(String value) {
            addCriterion("LOANLIMIT like", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitNotLike(String value) {
            addCriterion("LOANLIMIT not like", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitIn(List<String> values) {
            addCriterion("LOANLIMIT in", values, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitNotIn(List<String> values) {
            addCriterion("LOANLIMIT not in", values, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitBetween(String value1, String value2) {
            addCriterion("LOANLIMIT between", value1, value2, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitNotBetween(String value1, String value2) {
            addCriterion("LOANLIMIT not between", value1, value2, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNull() {
            addCriterion("LOANDATE is null");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNotNull() {
            addCriterion("LOANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoandateEqualTo(String value) {
            addCriterion("LOANDATE =", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotEqualTo(String value) {
            addCriterion("LOANDATE <>", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThan(String value) {
            addCriterion("LOANDATE >", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThanOrEqualTo(String value) {
            addCriterion("LOANDATE >=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThan(String value) {
            addCriterion("LOANDATE <", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThanOrEqualTo(String value) {
            addCriterion("LOANDATE <=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLike(String value) {
            addCriterion("LOANDATE like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotLike(String value) {
            addCriterion("LOANDATE not like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateIn(List<String> values) {
            addCriterion("LOANDATE in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotIn(List<String> values) {
            addCriterion("LOANDATE not in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateBetween(String value1, String value2) {
            addCriterion("LOANDATE between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotBetween(String value1, String value2) {
            addCriterion("LOANDATE not between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNull() {
            addCriterion("LOANRATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNotNull() {
            addCriterion("LOANRATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrateEqualTo(String value) {
            addCriterion("LOANRATE =", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotEqualTo(String value) {
            addCriterion("LOANRATE <>", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThan(String value) {
            addCriterion("LOANRATE >", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThanOrEqualTo(String value) {
            addCriterion("LOANRATE >=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThan(String value) {
            addCriterion("LOANRATE <", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThanOrEqualTo(String value) {
            addCriterion("LOANRATE <=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLike(String value) {
            addCriterion("LOANRATE like", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotLike(String value) {
            addCriterion("LOANRATE not like", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIn(List<String> values) {
            addCriterion("LOANRATE in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotIn(List<String> values) {
            addCriterion("LOANRATE not in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateBetween(String value1, String value2) {
            addCriterion("LOANRATE between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotBetween(String value1, String value2) {
            addCriterion("LOANRATE not between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanconditionIsNull() {
            addCriterion("LOANCONDITION is null");
            return (Criteria) this;
        }

        public Criteria andLoanconditionIsNotNull() {
            addCriterion("LOANCONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andLoanconditionEqualTo(String value) {
            addCriterion("LOANCONDITION =", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionNotEqualTo(String value) {
            addCriterion("LOANCONDITION <>", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionGreaterThan(String value) {
            addCriterion("LOANCONDITION >", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionGreaterThanOrEqualTo(String value) {
            addCriterion("LOANCONDITION >=", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionLessThan(String value) {
            addCriterion("LOANCONDITION <", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionLessThanOrEqualTo(String value) {
            addCriterion("LOANCONDITION <=", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionLike(String value) {
            addCriterion("LOANCONDITION like", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionNotLike(String value) {
            addCriterion("LOANCONDITION not like", value, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionIn(List<String> values) {
            addCriterion("LOANCONDITION in", values, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionNotIn(List<String> values) {
            addCriterion("LOANCONDITION not in", values, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionBetween(String value1, String value2) {
            addCriterion("LOANCONDITION between", value1, value2, "loancondition");
            return (Criteria) this;
        }

        public Criteria andLoanconditionNotBetween(String value1, String value2) {
            addCriterion("LOANCONDITION not between", value1, value2, "loancondition");
            return (Criteria) this;
        }

        public Criteria andAlnidIsNull() {
            addCriterion("ALNID is null");
            return (Criteria) this;
        }

        public Criteria andAlnidIsNotNull() {
            addCriterion("ALNID is not null");
            return (Criteria) this;
        }

        public Criteria andAlnidEqualTo(String value) {
            addCriterion("ALNID =", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidNotEqualTo(String value) {
            addCriterion("ALNID <>", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidGreaterThan(String value) {
            addCriterion("ALNID >", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidGreaterThanOrEqualTo(String value) {
            addCriterion("ALNID >=", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidLessThan(String value) {
            addCriterion("ALNID <", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidLessThanOrEqualTo(String value) {
            addCriterion("ALNID <=", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidLike(String value) {
            addCriterion("ALNID like", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidNotLike(String value) {
            addCriterion("ALNID not like", value, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidIn(List<String> values) {
            addCriterion("ALNID in", values, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidNotIn(List<String> values) {
            addCriterion("ALNID not in", values, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidBetween(String value1, String value2) {
            addCriterion("ALNID between", value1, value2, "alnid");
            return (Criteria) this;
        }

        public Criteria andAlnidNotBetween(String value1, String value2) {
            addCriterion("ALNID not between", value1, value2, "alnid");
            return (Criteria) this;
        }
    }

    /**
     * LOAN_REPAYMENT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * LOAN_REPAYMENT 2017-11-16
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