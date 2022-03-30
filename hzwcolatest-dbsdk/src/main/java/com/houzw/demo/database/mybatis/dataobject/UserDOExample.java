package com.houzw.demo.database.mybatis.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andFcdIsNull() {
            addCriterion("fcd is null");
            return (Criteria) this;
        }

        public Criteria andFcdIsNotNull() {
            addCriterion("fcd is not null");
            return (Criteria) this;
        }

        public Criteria andFcdEqualTo(Date value) {
            addCriterion("fcd =", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdNotEqualTo(Date value) {
            addCriterion("fcd <>", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdGreaterThan(Date value) {
            addCriterion("fcd >", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdGreaterThanOrEqualTo(Date value) {
            addCriterion("fcd >=", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdLessThan(Date value) {
            addCriterion("fcd <", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdLessThanOrEqualTo(Date value) {
            addCriterion("fcd <=", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdIn(List<Date> values) {
            addCriterion("fcd in", values, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdNotIn(List<Date> values) {
            addCriterion("fcd not in", values, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdBetween(Date value1, Date value2) {
            addCriterion("fcd between", value1, value2, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdNotBetween(Date value1, Date value2) {
            addCriterion("fcd not between", value1, value2, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcuIsNull() {
            addCriterion("fcu is null");
            return (Criteria) this;
        }

        public Criteria andFcuIsNotNull() {
            addCriterion("fcu is not null");
            return (Criteria) this;
        }

        public Criteria andFcuEqualTo(String value) {
            addCriterion("fcu =", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotEqualTo(String value) {
            addCriterion("fcu <>", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuGreaterThan(String value) {
            addCriterion("fcu >", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuGreaterThanOrEqualTo(String value) {
            addCriterion("fcu >=", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuLessThan(String value) {
            addCriterion("fcu <", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuLessThanOrEqualTo(String value) {
            addCriterion("fcu <=", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuLike(String value) {
            addCriterion("fcu like", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotLike(String value) {
            addCriterion("fcu not like", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuIn(List<String> values) {
            addCriterion("fcu in", values, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotIn(List<String> values) {
            addCriterion("fcu not in", values, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuBetween(String value1, String value2) {
            addCriterion("fcu between", value1, value2, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotBetween(String value1, String value2) {
            addCriterion("fcu not between", value1, value2, "fcu");
            return (Criteria) this;
        }

        public Criteria andLcdIsNull() {
            addCriterion("lcd is null");
            return (Criteria) this;
        }

        public Criteria andLcdIsNotNull() {
            addCriterion("lcd is not null");
            return (Criteria) this;
        }

        public Criteria andLcdEqualTo(Date value) {
            addCriterion("lcd =", value, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdNotEqualTo(Date value) {
            addCriterion("lcd <>", value, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdGreaterThan(Date value) {
            addCriterion("lcd >", value, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdGreaterThanOrEqualTo(Date value) {
            addCriterion("lcd >=", value, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdLessThan(Date value) {
            addCriterion("lcd <", value, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdLessThanOrEqualTo(Date value) {
            addCriterion("lcd <=", value, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdIn(List<Date> values) {
            addCriterion("lcd in", values, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdNotIn(List<Date> values) {
            addCriterion("lcd not in", values, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdBetween(Date value1, Date value2) {
            addCriterion("lcd between", value1, value2, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcdNotBetween(Date value1, Date value2) {
            addCriterion("lcd not between", value1, value2, "lcd");
            return (Criteria) this;
        }

        public Criteria andLcuIsNull() {
            addCriterion("lcu is null");
            return (Criteria) this;
        }

        public Criteria andLcuIsNotNull() {
            addCriterion("lcu is not null");
            return (Criteria) this;
        }

        public Criteria andLcuEqualTo(String value) {
            addCriterion("lcu =", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuNotEqualTo(String value) {
            addCriterion("lcu <>", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuGreaterThan(String value) {
            addCriterion("lcu >", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuGreaterThanOrEqualTo(String value) {
            addCriterion("lcu >=", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuLessThan(String value) {
            addCriterion("lcu <", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuLessThanOrEqualTo(String value) {
            addCriterion("lcu <=", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuLike(String value) {
            addCriterion("lcu like", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuNotLike(String value) {
            addCriterion("lcu not like", value, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuIn(List<String> values) {
            addCriterion("lcu in", values, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuNotIn(List<String> values) {
            addCriterion("lcu not in", values, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuBetween(String value1, String value2) {
            addCriterion("lcu between", value1, value2, "lcu");
            return (Criteria) this;
        }

        public Criteria andLcuNotBetween(String value1, String value2) {
            addCriterion("lcu not between", value1, value2, "lcu");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
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