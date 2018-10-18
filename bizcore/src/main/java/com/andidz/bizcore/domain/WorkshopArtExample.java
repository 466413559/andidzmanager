package com.andidz.bizcore.domain;

import java.util.ArrayList;
import java.util.List;

public class WorkshopArtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkshopArtExample() {
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

        public Criteria andArtnameIsNull() {
            addCriterion("artName is null");
            return (Criteria) this;
        }

        public Criteria andArtnameIsNotNull() {
            addCriterion("artName is not null");
            return (Criteria) this;
        }

        public Criteria andArtnameEqualTo(String value) {
            addCriterion("artName =", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameNotEqualTo(String value) {
            addCriterion("artName <>", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameGreaterThan(String value) {
            addCriterion("artName >", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameGreaterThanOrEqualTo(String value) {
            addCriterion("artName >=", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameLessThan(String value) {
            addCriterion("artName <", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameLessThanOrEqualTo(String value) {
            addCriterion("artName <=", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameLike(String value) {
            addCriterion("artName like", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameNotLike(String value) {
            addCriterion("artName not like", value, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameIn(List<String> values) {
            addCriterion("artName in", values, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameNotIn(List<String> values) {
            addCriterion("artName not in", values, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameBetween(String value1, String value2) {
            addCriterion("artName between", value1, value2, "artname");
            return (Criteria) this;
        }

        public Criteria andArtnameNotBetween(String value1, String value2) {
            addCriterion("artName not between", value1, value2, "artname");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbIsNull() {
            addCriterion("workShopNumb is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbIsNotNull() {
            addCriterion("workShopNumb is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbEqualTo(Integer value) {
            addCriterion("workShopNumb =", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbNotEqualTo(Integer value) {
            addCriterion("workShopNumb <>", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbGreaterThan(Integer value) {
            addCriterion("workShopNumb >", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbGreaterThanOrEqualTo(Integer value) {
            addCriterion("workShopNumb >=", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbLessThan(Integer value) {
            addCriterion("workShopNumb <", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbLessThanOrEqualTo(Integer value) {
            addCriterion("workShopNumb <=", value, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbIn(List<Integer> values) {
            addCriterion("workShopNumb in", values, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbNotIn(List<Integer> values) {
            addCriterion("workShopNumb not in", values, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbBetween(Integer value1, Integer value2) {
            addCriterion("workShopNumb between", value1, value2, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andWorkshopnumbNotBetween(Integer value1, Integer value2) {
            addCriterion("workShopNumb not between", value1, value2, "workshopnumb");
            return (Criteria) this;
        }

        public Criteria andArtcodeIsNull() {
            addCriterion("artCode is null");
            return (Criteria) this;
        }

        public Criteria andArtcodeIsNotNull() {
            addCriterion("artCode is not null");
            return (Criteria) this;
        }

        public Criteria andArtcodeEqualTo(String value) {
            addCriterion("artCode =", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeNotEqualTo(String value) {
            addCriterion("artCode <>", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeGreaterThan(String value) {
            addCriterion("artCode >", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeGreaterThanOrEqualTo(String value) {
            addCriterion("artCode >=", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeLessThan(String value) {
            addCriterion("artCode <", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeLessThanOrEqualTo(String value) {
            addCriterion("artCode <=", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeLike(String value) {
            addCriterion("artCode like", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeNotLike(String value) {
            addCriterion("artCode not like", value, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeIn(List<String> values) {
            addCriterion("artCode in", values, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeNotIn(List<String> values) {
            addCriterion("artCode not in", values, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeBetween(String value1, String value2) {
            addCriterion("artCode between", value1, value2, "artcode");
            return (Criteria) this;
        }

        public Criteria andArtcodeNotBetween(String value1, String value2) {
            addCriterion("artCode not between", value1, value2, "artcode");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyIsNull() {
            addCriterion("avgQualify is null");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyIsNotNull() {
            addCriterion("avgQualify is not null");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyEqualTo(Double value) {
            addCriterion("avgQualify =", value, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyNotEqualTo(Double value) {
            addCriterion("avgQualify <>", value, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyGreaterThan(Double value) {
            addCriterion("avgQualify >", value, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyGreaterThanOrEqualTo(Double value) {
            addCriterion("avgQualify >=", value, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyLessThan(Double value) {
            addCriterion("avgQualify <", value, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyLessThanOrEqualTo(Double value) {
            addCriterion("avgQualify <=", value, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyIn(List<Double> values) {
            addCriterion("avgQualify in", values, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyNotIn(List<Double> values) {
            addCriterion("avgQualify not in", values, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyBetween(Double value1, Double value2) {
            addCriterion("avgQualify between", value1, value2, "avgqualify");
            return (Criteria) this;
        }

        public Criteria andAvgqualifyNotBetween(Double value1, Double value2) {
            addCriterion("avgQualify not between", value1, value2, "avgqualify");
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