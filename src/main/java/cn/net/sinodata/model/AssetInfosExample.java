package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class AssetInfosExample {
    /**
     * ASSET_INFOS
     */
    protected String orderByClause;

    /**
     * ASSET_INFOS
     */
    protected boolean distinct;

    /**
     * ASSET_INFOS
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public AssetInfosExample() {
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
     * ASSET_INFOS 2017-09-15
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

        public Criteria andHousingtypeIsNull() {
            addCriterion("HOUSINGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andHousingtypeIsNotNull() {
            addCriterion("HOUSINGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHousingtypeEqualTo(String value) {
            addCriterion("HOUSINGTYPE =", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeNotEqualTo(String value) {
            addCriterion("HOUSINGTYPE <>", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeGreaterThan(String value) {
            addCriterion("HOUSINGTYPE >", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSINGTYPE >=", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeLessThan(String value) {
            addCriterion("HOUSINGTYPE <", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeLessThanOrEqualTo(String value) {
            addCriterion("HOUSINGTYPE <=", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeLike(String value) {
            addCriterion("HOUSINGTYPE like", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeNotLike(String value) {
            addCriterion("HOUSINGTYPE not like", value, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeIn(List<String> values) {
            addCriterion("HOUSINGTYPE in", values, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeNotIn(List<String> values) {
            addCriterion("HOUSINGTYPE not in", values, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeBetween(String value1, String value2) {
            addCriterion("HOUSINGTYPE between", value1, value2, "housingtype");
            return (Criteria) this;
        }

        public Criteria andHousingtypeNotBetween(String value1, String value2) {
            addCriterion("HOUSINGTYPE not between", value1, value2, "housingtype");
            return (Criteria) this;
        }

        public Criteria andAddornumIsNull() {
            addCriterion("ADDORNUM is null");
            return (Criteria) this;
        }

        public Criteria andAddornumIsNotNull() {
            addCriterion("ADDORNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAddornumEqualTo(String value) {
            addCriterion("ADDORNUM =", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumNotEqualTo(String value) {
            addCriterion("ADDORNUM <>", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumGreaterThan(String value) {
            addCriterion("ADDORNUM >", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumGreaterThanOrEqualTo(String value) {
            addCriterion("ADDORNUM >=", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumLessThan(String value) {
            addCriterion("ADDORNUM <", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumLessThanOrEqualTo(String value) {
            addCriterion("ADDORNUM <=", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumLike(String value) {
            addCriterion("ADDORNUM like", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumNotLike(String value) {
            addCriterion("ADDORNUM not like", value, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumIn(List<String> values) {
            addCriterion("ADDORNUM in", values, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumNotIn(List<String> values) {
            addCriterion("ADDORNUM not in", values, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumBetween(String value1, String value2) {
            addCriterion("ADDORNUM between", value1, value2, "addornum");
            return (Criteria) this;
        }

        public Criteria andAddornumNotBetween(String value1, String value2) {
            addCriterion("ADDORNUM not between", value1, value2, "addornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumIsNull() {
            addCriterion("AREAORNUM is null");
            return (Criteria) this;
        }

        public Criteria andAreaornumIsNotNull() {
            addCriterion("AREAORNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAreaornumEqualTo(String value) {
            addCriterion("AREAORNUM =", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumNotEqualTo(String value) {
            addCriterion("AREAORNUM <>", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumGreaterThan(String value) {
            addCriterion("AREAORNUM >", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumGreaterThanOrEqualTo(String value) {
            addCriterion("AREAORNUM >=", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumLessThan(String value) {
            addCriterion("AREAORNUM <", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumLessThanOrEqualTo(String value) {
            addCriterion("AREAORNUM <=", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumLike(String value) {
            addCriterion("AREAORNUM like", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumNotLike(String value) {
            addCriterion("AREAORNUM not like", value, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumIn(List<String> values) {
            addCriterion("AREAORNUM in", values, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumNotIn(List<String> values) {
            addCriterion("AREAORNUM not in", values, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumBetween(String value1, String value2) {
            addCriterion("AREAORNUM between", value1, value2, "areaornum");
            return (Criteria) this;
        }

        public Criteria andAreaornumNotBetween(String value1, String value2) {
            addCriterion("AREAORNUM not between", value1, value2, "areaornum");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNull() {
            addCriterion("BUYTIME is null");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNotNull() {
            addCriterion("BUYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBuytimeEqualTo(String value) {
            addCriterion("BUYTIME =", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotEqualTo(String value) {
            addCriterion("BUYTIME <>", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThan(String value) {
            addCriterion("BUYTIME >", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYTIME >=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThan(String value) {
            addCriterion("BUYTIME <", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThanOrEqualTo(String value) {
            addCriterion("BUYTIME <=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLike(String value) {
            addCriterion("BUYTIME like", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotLike(String value) {
            addCriterion("BUYTIME not like", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeIn(List<String> values) {
            addCriterion("BUYTIME in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotIn(List<String> values) {
            addCriterion("BUYTIME not in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeBetween(String value1, String value2) {
            addCriterion("BUYTIME between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotBetween(String value1, String value2) {
            addCriterion("BUYTIME not between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueIsNull() {
            addCriterion("PURCHASEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueIsNotNull() {
            addCriterion("PURCHASEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueEqualTo(String value) {
            addCriterion("PURCHASEVALUE =", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueNotEqualTo(String value) {
            addCriterion("PURCHASEVALUE <>", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueGreaterThan(String value) {
            addCriterion("PURCHASEVALUE >", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASEVALUE >=", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueLessThan(String value) {
            addCriterion("PURCHASEVALUE <", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueLessThanOrEqualTo(String value) {
            addCriterion("PURCHASEVALUE <=", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueLike(String value) {
            addCriterion("PURCHASEVALUE like", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueNotLike(String value) {
            addCriterion("PURCHASEVALUE not like", value, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueIn(List<String> values) {
            addCriterion("PURCHASEVALUE in", values, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueNotIn(List<String> values) {
            addCriterion("PURCHASEVALUE not in", values, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueBetween(String value1, String value2) {
            addCriterion("PURCHASEVALUE between", value1, value2, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andPurchasevalueNotBetween(String value1, String value2) {
            addCriterion("PURCHASEVALUE not between", value1, value2, "purchasevalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueIsNull() {
            addCriterion("VALUATIONVALUE is null");
            return (Criteria) this;
        }

        public Criteria andValuationvalueIsNotNull() {
            addCriterion("VALUATIONVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValuationvalueEqualTo(String value) {
            addCriterion("VALUATIONVALUE =", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueNotEqualTo(String value) {
            addCriterion("VALUATIONVALUE <>", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueGreaterThan(String value) {
            addCriterion("VALUATIONVALUE >", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueGreaterThanOrEqualTo(String value) {
            addCriterion("VALUATIONVALUE >=", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueLessThan(String value) {
            addCriterion("VALUATIONVALUE <", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueLessThanOrEqualTo(String value) {
            addCriterion("VALUATIONVALUE <=", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueLike(String value) {
            addCriterion("VALUATIONVALUE like", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueNotLike(String value) {
            addCriterion("VALUATIONVALUE not like", value, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueIn(List<String> values) {
            addCriterion("VALUATIONVALUE in", values, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueNotIn(List<String> values) {
            addCriterion("VALUATIONVALUE not in", values, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueBetween(String value1, String value2) {
            addCriterion("VALUATIONVALUE between", value1, value2, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andValuationvalueNotBetween(String value1, String value2) {
            addCriterion("VALUATIONVALUE not between", value1, value2, "valuationvalue");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumIsNull() {
            addCriterion("WARRANTSNUM is null");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumIsNotNull() {
            addCriterion("WARRANTSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumEqualTo(String value) {
            addCriterion("WARRANTSNUM =", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumNotEqualTo(String value) {
            addCriterion("WARRANTSNUM <>", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumGreaterThan(String value) {
            addCriterion("WARRANTSNUM >", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumGreaterThanOrEqualTo(String value) {
            addCriterion("WARRANTSNUM >=", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumLessThan(String value) {
            addCriterion("WARRANTSNUM <", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumLessThanOrEqualTo(String value) {
            addCriterion("WARRANTSNUM <=", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumLike(String value) {
            addCriterion("WARRANTSNUM like", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumNotLike(String value) {
            addCriterion("WARRANTSNUM not like", value, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumIn(List<String> values) {
            addCriterion("WARRANTSNUM in", values, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumNotIn(List<String> values) {
            addCriterion("WARRANTSNUM not in", values, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumBetween(String value1, String value2) {
            addCriterion("WARRANTSNUM between", value1, value2, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andWarrantsnumNotBetween(String value1, String value2) {
            addCriterion("WARRANTSNUM not between", value1, value2, "warrantsnum");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageIsNull() {
            addCriterion("OWNERANDUSAGE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageIsNotNull() {
            addCriterion("OWNERANDUSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageEqualTo(String value) {
            addCriterion("OWNERANDUSAGE =", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageNotEqualTo(String value) {
            addCriterion("OWNERANDUSAGE <>", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageGreaterThan(String value) {
            addCriterion("OWNERANDUSAGE >", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageGreaterThanOrEqualTo(String value) {
            addCriterion("OWNERANDUSAGE >=", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageLessThan(String value) {
            addCriterion("OWNERANDUSAGE <", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageLessThanOrEqualTo(String value) {
            addCriterion("OWNERANDUSAGE <=", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageLike(String value) {
            addCriterion("OWNERANDUSAGE like", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageNotLike(String value) {
            addCriterion("OWNERANDUSAGE not like", value, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageIn(List<String> values) {
            addCriterion("OWNERANDUSAGE in", values, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageNotIn(List<String> values) {
            addCriterion("OWNERANDUSAGE not in", values, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageBetween(String value1, String value2) {
            addCriterion("OWNERANDUSAGE between", value1, value2, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andOwnerandusageNotBetween(String value1, String value2) {
            addCriterion("OWNERANDUSAGE not between", value1, value2, "ownerandusage");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * ASSET_INFOS
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ASSET_INFOS 2017-09-15
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