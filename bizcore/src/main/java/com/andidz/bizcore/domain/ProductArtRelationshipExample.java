package com.andidz.bizcore.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductArtRelationshipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductArtRelationshipExample() {
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