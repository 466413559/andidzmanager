package com.andidz.bizcore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductionTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionTaskExample() {
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
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

        public Criteria andWorkshopnumbIsNull() {
            addCriterion("workshopNumb is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbIsNotNull() {
            addCriterion("workshopNumb is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbEqualTo(Integer value) {
            addCriterion("workshopNumb =", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbNotEqualTo(Integer value) {
            addCriterion("workshopNumb <>", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbGreaterThan(Integer value) {
            addCriterion("workshopNumb >", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("workshopNumb >=", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbLessThan(Integer value) {
            addCriterion("workshopNumb <", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbLessThanOrEqualTo(Integer value) {
            addCriterion("workshopNumb <=", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbIn(List<Integer> values) {
            addCriterion("workshopNumb in", values, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbNotIn(List<Integer> values) {
            addCriterion("workshopNumb not in", values, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbBetween(Integer value1, Integer value2) {
            addCriterion("workshopNumb between", value1, value2, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("workshopNumb not between", value1, value2, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceIsNull() {
            addCriterion("planningTotalProduce is null");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceIsNotNull() {
            addCriterion("planningTotalProduce is not null");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceEqualTo(Integer value) {
            addCriterion("planningTotalProduce =", value, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceNotEqualTo(Integer value) {
            addCriterion("planningTotalProduce <>", value, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceGreaterThan(Integer value) {
            addCriterion("planningTotalProduce >", value, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceGreaterThanOrEqualTo(Integer value) {
            addCriterion("planningTotalProduce >=", value, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceLessThan(Integer value) {
            addCriterion("planningTotalProduce <", value, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceLessThanOrEqualTo(Integer value) {
            addCriterion("planningTotalProduce <=", value, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceIn(List<Integer> values) {
            addCriterion("planningTotalProduce in", values, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceNotIn(List<Integer> values) {
            addCriterion("planningTotalProduce not in", values, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceBetween(Integer value1, Integer value2) {
            addCriterion("planningTotalProduce between", value1, value2, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andPlanningtotalproduceNotBetween(Integer value1, Integer value2) {
            addCriterion("planningTotalProduce not between", value1, value2, "planningtotalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceIsNull() {
            addCriterion("totalProduce is null");
            return (Criteria) this;
        }

        public Criteria andTotalproduceIsNotNull() {
            addCriterion("totalProduce is not null");
            return (Criteria) this;
        }

        public Criteria andTotalproduceEqualTo(Integer value) {
            addCriterion("totalProduce =", value, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceNotEqualTo(Integer value) {
            addCriterion("totalProduce <>", value, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceGreaterThan(Integer value) {
            addCriterion("totalProduce >", value, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalProduce >=", value, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceLessThan(Integer value) {
            addCriterion("totalProduce <", value, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceLessThanOrEqualTo(Integer value) {
            addCriterion("totalProduce <=", value, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceIn(List<Integer> values) {
            addCriterion("totalProduce in", values, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceNotIn(List<Integer> values) {
            addCriterion("totalProduce not in", values, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceBetween(Integer value1, Integer value2) {
            addCriterion("totalProduce between", value1, value2, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalproduceNotBetween(Integer value1, Integer value2) {
            addCriterion("totalProduce not between", value1, value2, "totalproduce");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyIsNull() {
            addCriterion("totalQualify is null");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyIsNotNull() {
            addCriterion("totalQualify is not null");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyEqualTo(Integer value) {
            addCriterion("totalQualify =", value, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyNotEqualTo(Integer value) {
            addCriterion("totalQualify <>", value, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyGreaterThan(Integer value) {
            addCriterion("totalQualify >", value, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalQualify >=", value, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyLessThan(Integer value) {
            addCriterion("totalQualify <", value, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyLessThanOrEqualTo(Integer value) {
            addCriterion("totalQualify <=", value, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyIn(List<Integer> values) {
            addCriterion("totalQualify in", values, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyNotIn(List<Integer> values) {
            addCriterion("totalQualify not in", values, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyBetween(Integer value1, Integer value2) {
            addCriterion("totalQualify between", value1, value2, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotalqualifyNotBetween(Integer value1, Integer value2) {
            addCriterion("totalQualify not between", value1, value2, "totalqualify");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverIsNull() {
            addCriterion("totalDeliver is null");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverIsNotNull() {
            addCriterion("totalDeliver is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverEqualTo(Integer value) {
            addCriterion("totalDeliver =", value, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverNotEqualTo(Integer value) {
            addCriterion("totalDeliver <>", value, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverGreaterThan(Integer value) {
            addCriterion("totalDeliver >", value, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalDeliver >=", value, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverLessThan(Integer value) {
            addCriterion("totalDeliver <", value, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverLessThanOrEqualTo(Integer value) {
            addCriterion("totalDeliver <=", value, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverIn(List<Integer> values) {
            addCriterion("totalDeliver in", values, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverNotIn(List<Integer> values) {
            addCriterion("totalDeliver not in", values, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverBetween(Integer value1, Integer value2) {
            addCriterion("totalDeliver between", value1, value2, "totaldeliver");
            return (Criteria) this;
        }

        public Criteria andTotaldeliverNotBetween(Integer value1, Integer value2) {
            addCriterion("totalDeliver not between", value1, value2, "totaldeliver");
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