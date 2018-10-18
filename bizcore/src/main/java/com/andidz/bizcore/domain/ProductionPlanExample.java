package com.andidz.bizcore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductionPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionPlanExample() {
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

        public Criteria andPlanidIsNull() {
            addCriterion("planId is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("planId is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("planId =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("planId <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("planId >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planId >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("planId <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("planId <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("planId in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("planId not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("planId between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("planId not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andOrdernumbIsNull() {
            addCriterion("orderNumb is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumbIsNotNull() {
            addCriterion("orderNumb is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumbEqualTo(String value) {
            addCriterion("orderNumb =", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbNotEqualTo(String value) {
            addCriterion("orderNumb <>", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbGreaterThan(String value) {
            addCriterion("orderNumb >", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumb >=", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbLessThan(String value) {
            addCriterion("orderNumb <", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbLessThanOrEqualTo(String value) {
            addCriterion("orderNumb <=", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbLike(String value) {
            addCriterion("orderNumb like", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbNotLike(String value) {
            addCriterion("orderNumb not like", value, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbIn(List<String> values) {
            addCriterion("orderNumb in", values, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbNotIn(List<String> values) {
            addCriterion("orderNumb not in", values, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbBetween(String value1, String value2) {
            addCriterion("orderNumb between", value1, value2, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andOrdernumbNotBetween(String value1, String value2) {
            addCriterion("orderNumb not between", value1, value2, "ordernumb");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(Date value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(Date value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(Date value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(Date value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(Date value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(Date value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<Date> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<Date> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(Date value1, Date value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(Date value1, Date value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceIsNull() {
            addCriterion("planningProduce is null");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceIsNotNull() {
            addCriterion("planningProduce is not null");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceEqualTo(Integer value) {
            addCriterion("planningProduce =", value, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceNotEqualTo(Integer value) {
            addCriterion("planningProduce <>", value, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceGreaterThan(Integer value) {
            addCriterion("planningProduce >", value, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceGreaterThanOrEqualTo(Integer value) {
            addCriterion("planningProduce >=", value, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceLessThan(Integer value) {
            addCriterion("planningProduce <", value, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceLessThanOrEqualTo(Integer value) {
            addCriterion("planningProduce <=", value, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceIn(List<Integer> values) {
            addCriterion("planningProduce in", values, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceNotIn(List<Integer> values) {
            addCriterion("planningProduce not in", values, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceBetween(Integer value1, Integer value2) {
            addCriterion("planningProduce between", value1, value2, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningproduceNotBetween(Integer value1, Integer value2) {
            addCriterion("planningProduce not between", value1, value2, "planningproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceIsNull() {
            addCriterion("completedProduce is null");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceIsNotNull() {
            addCriterion("completedProduce is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceEqualTo(Integer value) {
            addCriterion("completedProduce =", value, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceNotEqualTo(Integer value) {
            addCriterion("completedProduce <>", value, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceGreaterThan(Integer value) {
            addCriterion("completedProduce >", value, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceGreaterThanOrEqualTo(Integer value) {
            addCriterion("completedProduce >=", value, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceLessThan(Integer value) {
            addCriterion("completedProduce <", value, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceLessThanOrEqualTo(Integer value) {
            addCriterion("completedProduce <=", value, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceIn(List<Integer> values) {
            addCriterion("completedProduce in", values, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceNotIn(List<Integer> values) {
            addCriterion("completedProduce not in", values, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceBetween(Integer value1, Integer value2) {
            addCriterion("completedProduce between", value1, value2, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andCompletedproduceNotBetween(Integer value1, Integer value2) {
            addCriterion("completedProduce not between", value1, value2, "completedproduce");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionIsNull() {
            addCriterion("targetCompletion is null");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionIsNotNull() {
            addCriterion("targetCompletion is not null");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionEqualTo(Double value) {
            addCriterion("targetCompletion =", value, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionNotEqualTo(Double value) {
            addCriterion("targetCompletion <>", value, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionGreaterThan(Double value) {
            addCriterion("targetCompletion >", value, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionGreaterThanOrEqualTo(Double value) {
            addCriterion("targetCompletion >=", value, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionLessThan(Double value) {
            addCriterion("targetCompletion <", value, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionLessThanOrEqualTo(Double value) {
            addCriterion("targetCompletion <=", value, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionIn(List<Double> values) {
            addCriterion("targetCompletion in", values, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionNotIn(List<Double> values) {
            addCriterion("targetCompletion not in", values, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionBetween(Double value1, Double value2) {
            addCriterion("targetCompletion between", value1, value2, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andTargetcompletionNotBetween(Double value1, Double value2) {
            addCriterion("targetCompletion not between", value1, value2, "targetcompletion");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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