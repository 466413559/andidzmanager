package com.andidz.bizcore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductionOrderExample {
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

    public ProductionOrderExample() {
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

        public Criteria andProductiontypeIsNull() {
            addCriterion("productionType is null");
            return (Criteria) this;
        }

        public Criteria andProductiontypeIsNotNull() {
            addCriterion("productionType is not null");
            return (Criteria) this;
        }

        public Criteria andProductiontypeEqualTo(Integer value) {
            addCriterion("productionType =", value, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeNotEqualTo(Integer value) {
            addCriterion("productionType <>", value, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeGreaterThan(Integer value) {
            addCriterion("productionType >", value, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("productionType >=", value, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeLessThan(Integer value) {
            addCriterion("productionType <", value, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("productionType <=", value, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeIn(List<Integer> values) {
            addCriterion("productionType in", values, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeNotIn(List<Integer> values) {
            addCriterion("productionType not in", values, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeBetween(Integer value1, Integer value2) {
            addCriterion("productionType between", value1, value2, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("productionType not between", value1, value2, "productiontype");
            return (Criteria) this;
        }

        public Criteria andProductnumbIsNull() {
            addCriterion("productNumb is null");
            return (Criteria) this;
        }

        public Criteria andProductnumbIsNotNull() {
            addCriterion("productNumb is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumbEqualTo(String value) {
            addCriterion("productNumb =", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbNotEqualTo(String value) {
            addCriterion("productNumb <>", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbGreaterThan(String value) {
            addCriterion("productNumb >", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbGreaterThanOrEqualTo(String value) {
            addCriterion("productNumb >=", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbLessThan(String value) {
            addCriterion("productNumb <", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbLessThanOrEqualTo(String value) {
            addCriterion("productNumb <=", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbLike(String value) {
            addCriterion("productNumb like", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbNotLike(String value) {
            addCriterion("productNumb not like", value, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbIn(List<String> values) {
            addCriterion("productNumb in", values, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbNotIn(List<String> values) {
            addCriterion("productNumb not in", values, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbBetween(String value1, String value2) {
            addCriterion("productNumb between", value1, value2, "productnumb");
            return (Criteria) this;
        }

        public Criteria andProductnumbNotBetween(String value1, String value2) {
            addCriterion("productNumb not between", value1, value2, "productnumb");
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

        public Criteria andExpctstarttimeIsNull() {
            addCriterion("expctStartTime is null");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeIsNotNull() {
            addCriterion("expctStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeEqualTo(Date value) {
            addCriterion("expctStartTime =", value, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeNotEqualTo(Date value) {
            addCriterion("expctStartTime <>", value, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeGreaterThan(Date value) {
            addCriterion("expctStartTime >", value, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expctStartTime >=", value, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeLessThan(Date value) {
            addCriterion("expctStartTime <", value, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("expctStartTime <=", value, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeIn(List<Date> values) {
            addCriterion("expctStartTime in", values, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeNotIn(List<Date> values) {
            addCriterion("expctStartTime not in", values, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeBetween(Date value1, Date value2) {
            addCriterion("expctStartTime between", value1, value2, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("expctStartTime not between", value1, value2, "expctstarttime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeIsNull() {
            addCriterion("expctEndTime is null");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeIsNotNull() {
            addCriterion("expctEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeEqualTo(Date value) {
            addCriterion("expctEndTime =", value, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeNotEqualTo(Date value) {
            addCriterion("expctEndTime <>", value, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeGreaterThan(Date value) {
            addCriterion("expctEndTime >", value, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expctEndTime >=", value, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeLessThan(Date value) {
            addCriterion("expctEndTime <", value, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeLessThanOrEqualTo(Date value) {
            addCriterion("expctEndTime <=", value, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeIn(List<Date> values) {
            addCriterion("expctEndTime in", values, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeNotIn(List<Date> values) {
            addCriterion("expctEndTime not in", values, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeBetween(Date value1, Date value2) {
            addCriterion("expctEndTime between", value1, value2, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andExpctendtimeNotBetween(Date value1, Date value2) {
            addCriterion("expctEndTime not between", value1, value2, "expctendtime");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountIsNull() {
            addCriterion("planningProduceCount is null");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountIsNotNull() {
            addCriterion("planningProduceCount is not null");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountEqualTo(Integer value) {
            addCriterion("planningProduceCount =", value, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountNotEqualTo(Integer value) {
            addCriterion("planningProduceCount <>", value, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountGreaterThan(Integer value) {
            addCriterion("planningProduceCount >", value, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("planningProduceCount >=", value, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountLessThan(Integer value) {
            addCriterion("planningProduceCount <", value, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountLessThanOrEqualTo(Integer value) {
            addCriterion("planningProduceCount <=", value, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountIn(List<Integer> values) {
            addCriterion("planningProduceCount in", values, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountNotIn(List<Integer> values) {
            addCriterion("planningProduceCount not in", values, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountBetween(Integer value1, Integer value2) {
            addCriterion("planningProduceCount between", value1, value2, "planningproducecount");
            return (Criteria) this;
        }

        public Criteria andPlanningproducecountNotBetween(Integer value1, Integer value2) {
            addCriterion("planningProduceCount not between", value1, value2, "planningproducecount");
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