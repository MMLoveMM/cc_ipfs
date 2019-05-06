package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.List;

public class AccessoryInfoExample {
    /**
     * ACCESSORY_INFO
     */
    protected String orderByClause;

    /**
     * ACCESSORY_INFO
     */
    protected boolean distinct;

    /**
     * ACCESSORY_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public AccessoryInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-10-24
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
     * @mbggenerated 2017-10-24
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-10-24
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ACCESSORY_INFO 2017-10-24
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTableidIsNull() {
            addCriterion("TABLEID is null");
            return (Criteria) this;
        }

        public Criteria andTableidIsNotNull() {
            addCriterion("TABLEID is not null");
            return (Criteria) this;
        }

        public Criteria andTableidEqualTo(String value) {
            addCriterion("TABLEID =", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotEqualTo(String value) {
            addCriterion("TABLEID <>", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThan(String value) {
            addCriterion("TABLEID >", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThanOrEqualTo(String value) {
            addCriterion("TABLEID >=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThan(String value) {
            addCriterion("TABLEID <", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThanOrEqualTo(String value) {
            addCriterion("TABLEID <=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLike(String value) {
            addCriterion("TABLEID like", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotLike(String value) {
            addCriterion("TABLEID not like", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidIn(List<String> values) {
            addCriterion("TABLEID in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotIn(List<String> values) {
            addCriterion("TABLEID not in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidBetween(String value1, String value2) {
            addCriterion("TABLEID between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotBetween(String value1, String value2) {
            addCriterion("TABLEID not between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIsNull() {
            addCriterion("ACCESSORYNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIsNotNull() {
            addCriterion("ACCESSORYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorynameEqualTo(String value) {
            addCriterion("ACCESSORYNAME =", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotEqualTo(String value) {
            addCriterion("ACCESSORYNAME <>", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameGreaterThan(String value) {
            addCriterion("ACCESSORYNAME >", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESSORYNAME >=", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLessThan(String value) {
            addCriterion("ACCESSORYNAME <", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLessThanOrEqualTo(String value) {
            addCriterion("ACCESSORYNAME <=", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameLike(String value) {
            addCriterion("ACCESSORYNAME like", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotLike(String value) {
            addCriterion("ACCESSORYNAME not like", value, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameIn(List<String> values) {
            addCriterion("ACCESSORYNAME in", values, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotIn(List<String> values) {
            addCriterion("ACCESSORYNAME not in", values, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameBetween(String value1, String value2) {
            addCriterion("ACCESSORYNAME between", value1, value2, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andAccessorynameNotBetween(String value1, String value2) {
            addCriterion("ACCESSORYNAME not between", value1, value2, "accessoryname");
            return (Criteria) this;
        }

        public Criteria andShownameIsNull() {
            addCriterion("SHOWNAME is null");
            return (Criteria) this;
        }

        public Criteria andShownameIsNotNull() {
            addCriterion("SHOWNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShownameEqualTo(String value) {
            addCriterion("SHOWNAME =", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotEqualTo(String value) {
            addCriterion("SHOWNAME <>", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThan(String value) {
            addCriterion("SHOWNAME >", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWNAME >=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThan(String value) {
            addCriterion("SHOWNAME <", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThanOrEqualTo(String value) {
            addCriterion("SHOWNAME <=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLike(String value) {
            addCriterion("SHOWNAME like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotLike(String value) {
            addCriterion("SHOWNAME not like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameIn(List<String> values) {
            addCriterion("SHOWNAME in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotIn(List<String> values) {
            addCriterion("SHOWNAME not in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameBetween(String value1, String value2) {
            addCriterion("SHOWNAME between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotBetween(String value1, String value2) {
            addCriterion("SHOWNAME not between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddIsNull() {
            addCriterion("ACCESSORYADD is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddIsNotNull() {
            addCriterion("ACCESSORYADD is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddEqualTo(String value) {
            addCriterion("ACCESSORYADD =", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddNotEqualTo(String value) {
            addCriterion("ACCESSORYADD <>", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddGreaterThan(String value) {
            addCriterion("ACCESSORYADD >", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESSORYADD >=", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddLessThan(String value) {
            addCriterion("ACCESSORYADD <", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddLessThanOrEqualTo(String value) {
            addCriterion("ACCESSORYADD <=", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddLike(String value) {
            addCriterion("ACCESSORYADD like", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddNotLike(String value) {
            addCriterion("ACCESSORYADD not like", value, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddIn(List<String> values) {
            addCriterion("ACCESSORYADD in", values, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddNotIn(List<String> values) {
            addCriterion("ACCESSORYADD not in", values, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddBetween(String value1, String value2) {
            addCriterion("ACCESSORYADD between", value1, value2, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessoryaddNotBetween(String value1, String value2) {
            addCriterion("ACCESSORYADD not between", value1, value2, "accessoryadd");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIsNull() {
            addCriterion("ACCESSORYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIsNotNull() {
            addCriterion("ACCESSORYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE =", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE <>", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeGreaterThan(Short value) {
            addCriterion("ACCESSORYTYPE >", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE >=", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeLessThan(Short value) {
            addCriterion("ACCESSORYTYPE <", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeLessThanOrEqualTo(Short value) {
            addCriterion("ACCESSORYTYPE <=", value, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeIn(List<Short> values) {
            addCriterion("ACCESSORYTYPE in", values, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotIn(List<Short> values) {
            addCriterion("ACCESSORYTYPE not in", values, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeBetween(Short value1, Short value2) {
            addCriterion("ACCESSORYTYPE between", value1, value2, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andAccessorytypeNotBetween(Short value1, Short value2) {
            addCriterion("ACCESSORYTYPE not between", value1, value2, "accessorytype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("FILETYPE is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("FILETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("FILETYPE =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("FILETYPE <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("FILETYPE >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILETYPE >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("FILETYPE <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("FILETYPE <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("FILETYPE like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("FILETYPE not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("FILETYPE in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("FILETYPE not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("FILETYPE between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("FILETYPE not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
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

        public Criteria andBusitypeIsNull() {
            addCriterion("BUSITYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusitypeIsNotNull() {
            addCriterion("BUSITYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusitypeEqualTo(String value) {
            addCriterion("BUSITYPE =", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotEqualTo(String value) {
            addCriterion("BUSITYPE <>", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThan(String value) {
            addCriterion("BUSITYPE >", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSITYPE >=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThan(String value) {
            addCriterion("BUSITYPE <", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThanOrEqualTo(String value) {
            addCriterion("BUSITYPE <=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLike(String value) {
            addCriterion("BUSITYPE like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotLike(String value) {
            addCriterion("BUSITYPE not like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeIn(List<String> values) {
            addCriterion("BUSITYPE in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotIn(List<String> values) {
            addCriterion("BUSITYPE not in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeBetween(String value1, String value2) {
            addCriterion("BUSITYPE between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotBetween(String value1, String value2) {
            addCriterion("BUSITYPE not between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("DELFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("DELFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(String value) {
            addCriterion("DELFLAG =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(String value) {
            addCriterion("DELFLAG <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(String value) {
            addCriterion("DELFLAG >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(String value) {
            addCriterion("DELFLAG >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(String value) {
            addCriterion("DELFLAG <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(String value) {
            addCriterion("DELFLAG <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLike(String value) {
            addCriterion("DELFLAG like", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotLike(String value) {
            addCriterion("DELFLAG not like", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<String> values) {
            addCriterion("DELFLAG in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<String> values) {
            addCriterion("DELFLAG not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(String value1, String value2) {
            addCriterion("DELFLAG between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(String value1, String value2) {
            addCriterion("DELFLAG not between", value1, value2, "delflag");
            return (Criteria) this;
        }
    }

    /**
     * ACCESSORY_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ACCESSORY_INFO 2017-10-24
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