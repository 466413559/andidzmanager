package com.andidz.authorithy.domain;

import java.util.ArrayList;
import java.util.List;

public class RightResourceExample {
    protected String orderByClause;

    protected boolean distinct;


    protected Integer start;

    protected Integer pageSize;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    protected List<Criteria> oredCriteria;

    public RightResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andResourcepathIsNull() {
            addCriterion("resourcePath is null");
            return (Criteria) this;
        }

        public Criteria andResourcepathIsNotNull() {
            addCriterion("resourcePath is not null");
            return (Criteria) this;
        }

        public Criteria andResourcepathEqualTo(String value) {
            addCriterion("resourcePath =", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathNotEqualTo(String value) {
            addCriterion("resourcePath <>", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathGreaterThan(String value) {
            addCriterion("resourcePath >", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathGreaterThanOrEqualTo(String value) {
            addCriterion("resourcePath >=", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathLessThan(String value) {
            addCriterion("resourcePath <", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathLessThanOrEqualTo(String value) {
            addCriterion("resourcePath <=", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathLike(String value) {
            addCriterion("resourcePath like", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathNotLike(String value) {
            addCriterion("resourcePath not like", value, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathIn(List<String> values) {
            addCriterion("resourcePath in", values, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathNotIn(List<String> values) {
            addCriterion("resourcePath not in", values, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathBetween(String value1, String value2) {
            addCriterion("resourcePath between", value1, value2, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcepathNotBetween(String value1, String value2) {
            addCriterion("resourcePath not between", value1, value2, "resourcepath");
            return (Criteria) this;
        }

        public Criteria andResourcenameIsNull() {
            addCriterion("resourceName is null");
            return (Criteria) this;
        }

        public Criteria andResourcenameIsNotNull() {
            addCriterion("resourceName is not null");
            return (Criteria) this;
        }

        public Criteria andResourcenameEqualTo(String value) {
            addCriterion("resourceName =", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotEqualTo(String value) {
            addCriterion("resourceName <>", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameGreaterThan(String value) {
            addCriterion("resourceName >", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("resourceName >=", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLessThan(String value) {
            addCriterion("resourceName <", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLessThanOrEqualTo(String value) {
            addCriterion("resourceName <=", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLike(String value) {
            addCriterion("resourceName like", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotLike(String value) {
            addCriterion("resourceName not like", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameIn(List<String> values) {
            addCriterion("resourceName in", values, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotIn(List<String> values) {
            addCriterion("resourceName not in", values, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameBetween(String value1, String value2) {
            addCriterion("resourceName between", value1, value2, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotBetween(String value1, String value2) {
            addCriterion("resourceName not between", value1, value2, "resourcename");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("feature not between", value1, value2, "feature");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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