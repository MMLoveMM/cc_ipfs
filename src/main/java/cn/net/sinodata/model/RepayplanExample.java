package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class RepayplanExample {
    /**
     * REPAYPLAN
     */
    protected String orderByClause;

    /**
     * REPAYPLAN
     */
    protected boolean distinct;

    /**
     * REPAYPLAN
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-16
     */
    public RepayplanExample() {
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
     * REPAYPLAN 2017-11-16
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

        public Criteria andLoanamtIsNull() {
            addCriterion("LOANAMT is null");
            return (Criteria) this;
        }

        public Criteria andLoanamtIsNotNull() {
            addCriterion("LOANAMT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamtEqualTo(Double value) {
            addCriterion("LOANAMT =", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtNotEqualTo(Double value) {
            addCriterion("LOANAMT <>", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtGreaterThan(Double value) {
            addCriterion("LOANAMT >", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtGreaterThanOrEqualTo(Double value) {
            addCriterion("LOANAMT >=", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtLessThan(Double value) {
            addCriterion("LOANAMT <", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtLessThanOrEqualTo(Double value) {
            addCriterion("LOANAMT <=", value, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtIn(List<Double> values) {
            addCriterion("LOANAMT in", values, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtNotIn(List<Double> values) {
            addCriterion("LOANAMT not in", values, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtBetween(Double value1, Double value2) {
            addCriterion("LOANAMT between", value1, value2, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoanamtNotBetween(Double value1, Double value2) {
            addCriterion("LOANAMT not between", value1, value2, "loanamt");
            return (Criteria) this;
        }

        public Criteria andLoandlIsNull() {
            addCriterion("LOANDL is null");
            return (Criteria) this;
        }

        public Criteria andLoandlIsNotNull() {
            addCriterion("LOANDL is not null");
            return (Criteria) this;
        }

        public Criteria andLoandlEqualTo(Short value) {
            addCriterion("LOANDL =", value, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlNotEqualTo(Short value) {
            addCriterion("LOANDL <>", value, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlGreaterThan(Short value) {
            addCriterion("LOANDL >", value, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlGreaterThanOrEqualTo(Short value) {
            addCriterion("LOANDL >=", value, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlLessThan(Short value) {
            addCriterion("LOANDL <", value, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlLessThanOrEqualTo(Short value) {
            addCriterion("LOANDL <=", value, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlIn(List<Short> values) {
            addCriterion("LOANDL in", values, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlNotIn(List<Short> values) {
            addCriterion("LOANDL not in", values, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlBetween(Short value1, Short value2) {
            addCriterion("LOANDL between", value1, value2, "loandl");
            return (Criteria) this;
        }

        public Criteria andLoandlNotBetween(Short value1, Short value2) {
            addCriterion("LOANDL not between", value1, value2, "loandl");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentIsNull() {
            addCriterion("ISINSTALMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentIsNotNull() {
            addCriterion("ISINSTALMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentEqualTo(String value) {
            addCriterion("ISINSTALMENT =", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentNotEqualTo(String value) {
            addCriterion("ISINSTALMENT <>", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentGreaterThan(String value) {
            addCriterion("ISINSTALMENT >", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentGreaterThanOrEqualTo(String value) {
            addCriterion("ISINSTALMENT >=", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentLessThan(String value) {
            addCriterion("ISINSTALMENT <", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentLessThanOrEqualTo(String value) {
            addCriterion("ISINSTALMENT <=", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentLike(String value) {
            addCriterion("ISINSTALMENT like", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentNotLike(String value) {
            addCriterion("ISINSTALMENT not like", value, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentIn(List<String> values) {
            addCriterion("ISINSTALMENT in", values, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentNotIn(List<String> values) {
            addCriterion("ISINSTALMENT not in", values, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentBetween(String value1, String value2) {
            addCriterion("ISINSTALMENT between", value1, value2, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andIsinstalmentNotBetween(String value1, String value2) {
            addCriterion("ISINSTALMENT not between", value1, value2, "isinstalment");
            return (Criteria) this;
        }

        public Criteria andRepaymodeIsNull() {
            addCriterion("REPAYMODE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymodeIsNotNull() {
            addCriterion("REPAYMODE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymodeEqualTo(String value) {
            addCriterion("REPAYMODE =", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeNotEqualTo(String value) {
            addCriterion("REPAYMODE <>", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeGreaterThan(String value) {
            addCriterion("REPAYMODE >", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMODE >=", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeLessThan(String value) {
            addCriterion("REPAYMODE <", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeLessThanOrEqualTo(String value) {
            addCriterion("REPAYMODE <=", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeLike(String value) {
            addCriterion("REPAYMODE like", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeNotLike(String value) {
            addCriterion("REPAYMODE not like", value, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeIn(List<String> values) {
            addCriterion("REPAYMODE in", values, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeNotIn(List<String> values) {
            addCriterion("REPAYMODE not in", values, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeBetween(String value1, String value2) {
            addCriterion("REPAYMODE between", value1, value2, "repaymode");
            return (Criteria) this;
        }

        public Criteria andRepaymodeNotBetween(String value1, String value2) {
            addCriterion("REPAYMODE not between", value1, value2, "repaymode");
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

        public Criteria andLoanrateEqualTo(Double value) {
            addCriterion("LOANRATE =", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotEqualTo(Double value) {
            addCriterion("LOANRATE <>", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThan(Double value) {
            addCriterion("LOANRATE >", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThanOrEqualTo(Double value) {
            addCriterion("LOANRATE >=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThan(Double value) {
            addCriterion("LOANRATE <", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThanOrEqualTo(Double value) {
            addCriterion("LOANRATE <=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIn(List<Double> values) {
            addCriterion("LOANRATE in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotIn(List<Double> values) {
            addCriterion("LOANRATE not in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateBetween(Double value1, Double value2) {
            addCriterion("LOANRATE between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotBetween(Double value1, Double value2) {
            addCriterion("LOANRATE not between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andInterestwayIsNull() {
            addCriterion("INTERESTWAY is null");
            return (Criteria) this;
        }

        public Criteria andInterestwayIsNotNull() {
            addCriterion("INTERESTWAY is not null");
            return (Criteria) this;
        }

        public Criteria andInterestwayEqualTo(String value) {
            addCriterion("INTERESTWAY =", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayNotEqualTo(String value) {
            addCriterion("INTERESTWAY <>", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayGreaterThan(String value) {
            addCriterion("INTERESTWAY >", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayGreaterThanOrEqualTo(String value) {
            addCriterion("INTERESTWAY >=", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayLessThan(String value) {
            addCriterion("INTERESTWAY <", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayLessThanOrEqualTo(String value) {
            addCriterion("INTERESTWAY <=", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayLike(String value) {
            addCriterion("INTERESTWAY like", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayNotLike(String value) {
            addCriterion("INTERESTWAY not like", value, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayIn(List<String> values) {
            addCriterion("INTERESTWAY in", values, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayNotIn(List<String> values) {
            addCriterion("INTERESTWAY not in", values, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayBetween(String value1, String value2) {
            addCriterion("INTERESTWAY between", value1, value2, "interestway");
            return (Criteria) this;
        }

        public Criteria andInterestwayNotBetween(String value1, String value2) {
            addCriterion("INTERESTWAY not between", value1, value2, "interestway");
            return (Criteria) this;
        }

        public Criteria andLoantimesIsNull() {
            addCriterion("LOANTIMES is null");
            return (Criteria) this;
        }

        public Criteria andLoantimesIsNotNull() {
            addCriterion("LOANTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andLoantimesEqualTo(Short value) {
            addCriterion("LOANTIMES =", value, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesNotEqualTo(Short value) {
            addCriterion("LOANTIMES <>", value, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesGreaterThan(Short value) {
            addCriterion("LOANTIMES >", value, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesGreaterThanOrEqualTo(Short value) {
            addCriterion("LOANTIMES >=", value, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesLessThan(Short value) {
            addCriterion("LOANTIMES <", value, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesLessThanOrEqualTo(Short value) {
            addCriterion("LOANTIMES <=", value, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesIn(List<Short> values) {
            addCriterion("LOANTIMES in", values, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesNotIn(List<Short> values) {
            addCriterion("LOANTIMES not in", values, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesBetween(Short value1, Short value2) {
            addCriterion("LOANTIMES between", value1, value2, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoantimesNotBetween(Short value1, Short value2) {
            addCriterion("LOANTIMES not between", value1, value2, "loantimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesIsNull() {
            addCriterion("LOANCTIMES is null");
            return (Criteria) this;
        }

        public Criteria andLoanctimesIsNotNull() {
            addCriterion("LOANCTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andLoanctimesEqualTo(Short value) {
            addCriterion("LOANCTIMES =", value, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesNotEqualTo(Short value) {
            addCriterion("LOANCTIMES <>", value, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesGreaterThan(Short value) {
            addCriterion("LOANCTIMES >", value, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesGreaterThanOrEqualTo(Short value) {
            addCriterion("LOANCTIMES >=", value, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesLessThan(Short value) {
            addCriterion("LOANCTIMES <", value, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesLessThanOrEqualTo(Short value) {
            addCriterion("LOANCTIMES <=", value, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesIn(List<Short> values) {
            addCriterion("LOANCTIMES in", values, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesNotIn(List<Short> values) {
            addCriterion("LOANCTIMES not in", values, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesBetween(Short value1, Short value2) {
            addCriterion("LOANCTIMES between", value1, value2, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andLoanctimesNotBetween(Short value1, Short value2) {
            addCriterion("LOANCTIMES not between", value1, value2, "loanctimes");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtIsNull() {
            addCriterion("PLANCREATEDT is null");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtIsNotNull() {
            addCriterion("PLANCREATEDT is not null");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtEqualTo(String value) {
            addCriterion("PLANCREATEDT =", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtNotEqualTo(String value) {
            addCriterion("PLANCREATEDT <>", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtGreaterThan(String value) {
            addCriterion("PLANCREATEDT >", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtGreaterThanOrEqualTo(String value) {
            addCriterion("PLANCREATEDT >=", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtLessThan(String value) {
            addCriterion("PLANCREATEDT <", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtLessThanOrEqualTo(String value) {
            addCriterion("PLANCREATEDT <=", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtLike(String value) {
            addCriterion("PLANCREATEDT like", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtNotLike(String value) {
            addCriterion("PLANCREATEDT not like", value, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtIn(List<String> values) {
            addCriterion("PLANCREATEDT in", values, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtNotIn(List<String> values) {
            addCriterion("PLANCREATEDT not in", values, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtBetween(String value1, String value2) {
            addCriterion("PLANCREATEDT between", value1, value2, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andPlancreatedtNotBetween(String value1, String value2) {
            addCriterion("PLANCREATEDT not between", value1, value2, "plancreatedt");
            return (Criteria) this;
        }

        public Criteria andIntsumIsNull() {
            addCriterion("INTSUM is null");
            return (Criteria) this;
        }

        public Criteria andIntsumIsNotNull() {
            addCriterion("INTSUM is not null");
            return (Criteria) this;
        }

        public Criteria andIntsumEqualTo(Double value) {
            addCriterion("INTSUM =", value, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumNotEqualTo(Double value) {
            addCriterion("INTSUM <>", value, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumGreaterThan(Double value) {
            addCriterion("INTSUM >", value, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumGreaterThanOrEqualTo(Double value) {
            addCriterion("INTSUM >=", value, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumLessThan(Double value) {
            addCriterion("INTSUM <", value, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumLessThanOrEqualTo(Double value) {
            addCriterion("INTSUM <=", value, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumIn(List<Double> values) {
            addCriterion("INTSUM in", values, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumNotIn(List<Double> values) {
            addCriterion("INTSUM not in", values, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumBetween(Double value1, Double value2) {
            addCriterion("INTSUM between", value1, value2, "intsum");
            return (Criteria) this;
        }

        public Criteria andIntsumNotBetween(Double value1, Double value2) {
            addCriterion("INTSUM not between", value1, value2, "intsum");
            return (Criteria) this;
        }

        public Criteria andRpyprinintIsNull() {
            addCriterion("RPYPRININT is null");
            return (Criteria) this;
        }

        public Criteria andRpyprinintIsNotNull() {
            addCriterion("RPYPRININT is not null");
            return (Criteria) this;
        }

        public Criteria andRpyprinintEqualTo(Double value) {
            addCriterion("RPYPRININT =", value, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintNotEqualTo(Double value) {
            addCriterion("RPYPRININT <>", value, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintGreaterThan(Double value) {
            addCriterion("RPYPRININT >", value, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintGreaterThanOrEqualTo(Double value) {
            addCriterion("RPYPRININT >=", value, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintLessThan(Double value) {
            addCriterion("RPYPRININT <", value, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintLessThanOrEqualTo(Double value) {
            addCriterion("RPYPRININT <=", value, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintIn(List<Double> values) {
            addCriterion("RPYPRININT in", values, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintNotIn(List<Double> values) {
            addCriterion("RPYPRININT not in", values, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintBetween(Double value1, Double value2) {
            addCriterion("RPYPRININT between", value1, value2, "rpyprinint");
            return (Criteria) this;
        }

        public Criteria andRpyprinintNotBetween(Double value1, Double value2) {
            addCriterion("RPYPRININT not between", value1, value2, "rpyprinint");
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

        public Criteria andRepaywayIsNull() {
            addCriterion("REPAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andRepaywayIsNotNull() {
            addCriterion("REPAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andRepaywayEqualTo(String value) {
            addCriterion("REPAYWAY =", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayNotEqualTo(String value) {
            addCriterion("REPAYWAY <>", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayGreaterThan(String value) {
            addCriterion("REPAYWAY >", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYWAY >=", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayLessThan(String value) {
            addCriterion("REPAYWAY <", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayLessThanOrEqualTo(String value) {
            addCriterion("REPAYWAY <=", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayLike(String value) {
            addCriterion("REPAYWAY like", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayNotLike(String value) {
            addCriterion("REPAYWAY not like", value, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayIn(List<String> values) {
            addCriterion("REPAYWAY in", values, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayNotIn(List<String> values) {
            addCriterion("REPAYWAY not in", values, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayBetween(String value1, String value2) {
            addCriterion("REPAYWAY between", value1, value2, "repayway");
            return (Criteria) this;
        }

        public Criteria andRepaywayNotBetween(String value1, String value2) {
            addCriterion("REPAYWAY not between", value1, value2, "repayway");
            return (Criteria) this;
        }

        public Criteria andRpyintIsNull() {
            addCriterion("RPYINT is null");
            return (Criteria) this;
        }

        public Criteria andRpyintIsNotNull() {
            addCriterion("RPYINT is not null");
            return (Criteria) this;
        }

        public Criteria andRpyintEqualTo(Double value) {
            addCriterion("RPYINT =", value, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintNotEqualTo(Double value) {
            addCriterion("RPYINT <>", value, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintGreaterThan(Double value) {
            addCriterion("RPYINT >", value, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintGreaterThanOrEqualTo(Double value) {
            addCriterion("RPYINT >=", value, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintLessThan(Double value) {
            addCriterion("RPYINT <", value, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintLessThanOrEqualTo(Double value) {
            addCriterion("RPYINT <=", value, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintIn(List<Double> values) {
            addCriterion("RPYINT in", values, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintNotIn(List<Double> values) {
            addCriterion("RPYINT not in", values, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintBetween(Double value1, Double value2) {
            addCriterion("RPYINT between", value1, value2, "rpyint");
            return (Criteria) this;
        }

        public Criteria andRpyintNotBetween(Double value1, Double value2) {
            addCriterion("RPYINT not between", value1, value2, "rpyint");
            return (Criteria) this;
        }
    }

    /**
     * REPAYPLAN
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * REPAYPLAN 2017-11-16
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