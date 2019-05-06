package cn.net.sinodata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TApplicationLogExample {
    /**
     * T_APPLICATION_LOG
     */
    protected String orderByClause;

    /**
     * T_APPLICATION_LOG
     */
    protected boolean distinct;

    /**
     * T_APPLICATION_LOG
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-09-15
     */
    public TApplicationLogExample() {
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
     * T_APPLICATION_LOG 2017-09-15
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

        public Criteria andModuleIsNull() {
            addCriterion("MODULE is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("MODULE =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("MODULE <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("MODULE >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("MODULE <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("MODULE <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("MODULE like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("MODULE not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("MODULE in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("MODULE not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("MODULE between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("MODULE not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andOpetypeIsNull() {
            addCriterion("OPETYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpetypeIsNotNull() {
            addCriterion("OPETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpetypeEqualTo(String value) {
            addCriterion("OPETYPE =", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotEqualTo(String value) {
            addCriterion("OPETYPE <>", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeGreaterThan(String value) {
            addCriterion("OPETYPE >", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPETYPE >=", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeLessThan(String value) {
            addCriterion("OPETYPE <", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeLessThanOrEqualTo(String value) {
            addCriterion("OPETYPE <=", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeLike(String value) {
            addCriterion("OPETYPE like", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotLike(String value) {
            addCriterion("OPETYPE not like", value, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeIn(List<String> values) {
            addCriterion("OPETYPE in", values, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotIn(List<String> values) {
            addCriterion("OPETYPE not in", values, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeBetween(String value1, String value2) {
            addCriterion("OPETYPE between", value1, value2, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpetypeNotBetween(String value1, String value2) {
            addCriterion("OPETYPE not between", value1, value2, "opetype");
            return (Criteria) this;
        }

        public Criteria andOpecontentIsNull() {
            addCriterion("OPECONTENT is null");
            return (Criteria) this;
        }

        public Criteria andOpecontentIsNotNull() {
            addCriterion("OPECONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andOpecontentEqualTo(String value) {
            addCriterion("OPECONTENT =", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentNotEqualTo(String value) {
            addCriterion("OPECONTENT <>", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentGreaterThan(String value) {
            addCriterion("OPECONTENT >", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentGreaterThanOrEqualTo(String value) {
            addCriterion("OPECONTENT >=", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentLessThan(String value) {
            addCriterion("OPECONTENT <", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentLessThanOrEqualTo(String value) {
            addCriterion("OPECONTENT <=", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentLike(String value) {
            addCriterion("OPECONTENT like", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentNotLike(String value) {
            addCriterion("OPECONTENT not like", value, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentIn(List<String> values) {
            addCriterion("OPECONTENT in", values, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentNotIn(List<String> values) {
            addCriterion("OPECONTENT not in", values, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentBetween(String value1, String value2) {
            addCriterion("OPECONTENT between", value1, value2, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpecontentNotBetween(String value1, String value2) {
            addCriterion("OPECONTENT not between", value1, value2, "opecontent");
            return (Criteria) this;
        }

        public Criteria andOpepersonIsNull() {
            addCriterion("OPEPERSON is null");
            return (Criteria) this;
        }

        public Criteria andOpepersonIsNotNull() {
            addCriterion("OPEPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andOpepersonEqualTo(String value) {
            addCriterion("OPEPERSON =", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonNotEqualTo(String value) {
            addCriterion("OPEPERSON <>", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonGreaterThan(String value) {
            addCriterion("OPEPERSON >", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonGreaterThanOrEqualTo(String value) {
            addCriterion("OPEPERSON >=", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonLessThan(String value) {
            addCriterion("OPEPERSON <", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonLessThanOrEqualTo(String value) {
            addCriterion("OPEPERSON <=", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonLike(String value) {
            addCriterion("OPEPERSON like", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonNotLike(String value) {
            addCriterion("OPEPERSON not like", value, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonIn(List<String> values) {
            addCriterion("OPEPERSON in", values, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonNotIn(List<String> values) {
            addCriterion("OPEPERSON not in", values, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonBetween(String value1, String value2) {
            addCriterion("OPEPERSON between", value1, value2, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpepersonNotBetween(String value1, String value2) {
            addCriterion("OPEPERSON not between", value1, value2, "opeperson");
            return (Criteria) this;
        }

        public Criteria andOpenameIsNull() {
            addCriterion("OPENAME is null");
            return (Criteria) this;
        }

        public Criteria andOpenameIsNotNull() {
            addCriterion("OPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenameEqualTo(String value) {
            addCriterion("OPENAME =", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameNotEqualTo(String value) {
            addCriterion("OPENAME <>", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameGreaterThan(String value) {
            addCriterion("OPENAME >", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameGreaterThanOrEqualTo(String value) {
            addCriterion("OPENAME >=", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameLessThan(String value) {
            addCriterion("OPENAME <", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameLessThanOrEqualTo(String value) {
            addCriterion("OPENAME <=", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameLike(String value) {
            addCriterion("OPENAME like", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameNotLike(String value) {
            addCriterion("OPENAME not like", value, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameIn(List<String> values) {
            addCriterion("OPENAME in", values, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameNotIn(List<String> values) {
            addCriterion("OPENAME not in", values, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameBetween(String value1, String value2) {
            addCriterion("OPENAME between", value1, value2, "opename");
            return (Criteria) this;
        }

        public Criteria andOpenameNotBetween(String value1, String value2) {
            addCriterion("OPENAME not between", value1, value2, "opename");
            return (Criteria) this;
        }

        public Criteria andOpedateIsNull() {
            addCriterion("OPEDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpedateIsNotNull() {
            addCriterion("OPEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpedateEqualTo(Date value) {
            addCriterion("OPEDATE =", value, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateNotEqualTo(Date value) {
            addCriterion("OPEDATE <>", value, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateGreaterThan(Date value) {
            addCriterion("OPEDATE >", value, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPEDATE >=", value, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateLessThan(Date value) {
            addCriterion("OPEDATE <", value, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateLessThanOrEqualTo(Date value) {
            addCriterion("OPEDATE <=", value, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateIn(List<Date> values) {
            addCriterion("OPEDATE in", values, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateNotIn(List<Date> values) {
            addCriterion("OPEDATE not in", values, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateBetween(Date value1, Date value2) {
            addCriterion("OPEDATE between", value1, value2, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpedateNotBetween(Date value1, Date value2) {
            addCriterion("OPEDATE not between", value1, value2, "opedate");
            return (Criteria) this;
        }

        public Criteria andOpeorgIsNull() {
            addCriterion("OPEORG is null");
            return (Criteria) this;
        }

        public Criteria andOpeorgIsNotNull() {
            addCriterion("OPEORG is not null");
            return (Criteria) this;
        }

        public Criteria andOpeorgEqualTo(String value) {
            addCriterion("OPEORG =", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotEqualTo(String value) {
            addCriterion("OPEORG <>", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgGreaterThan(String value) {
            addCriterion("OPEORG >", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgGreaterThanOrEqualTo(String value) {
            addCriterion("OPEORG >=", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgLessThan(String value) {
            addCriterion("OPEORG <", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgLessThanOrEqualTo(String value) {
            addCriterion("OPEORG <=", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgLike(String value) {
            addCriterion("OPEORG like", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotLike(String value) {
            addCriterion("OPEORG not like", value, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgIn(List<String> values) {
            addCriterion("OPEORG in", values, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotIn(List<String> values) {
            addCriterion("OPEORG not in", values, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgBetween(String value1, String value2) {
            addCriterion("OPEORG between", value1, value2, "opeorg");
            return (Criteria) this;
        }

        public Criteria andOpeorgNotBetween(String value1, String value2) {
            addCriterion("OPEORG not between", value1, value2, "opeorg");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("ROLE is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("ROLE =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("ROLE <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("ROLE >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("ROLE <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("ROLE <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("ROLE like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("ROLE not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("ROLE in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("ROLE not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("ROLE between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("ROLE not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }
    }

    /**
     * T_APPLICATION_LOG
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_APPLICATION_LOG 2017-09-15
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