// 
// 
// 

package com.shop.po;

import java.util.ArrayList;
import java.util.List;

public class OrderitemExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public OrderitemExample() {
        this.oredCriteria = new ArrayList<Criteria>();
    }
    
    public void setOrderByClause(final String orderByClause) {
        this.orderByClause = orderByClause;
    }
    
    public String getOrderByClause() {
        return this.orderByClause;
    }
    
    public void setDistinct(final boolean distinct) {
        this.distinct = distinct;
    }
    
    public boolean isDistinct() {
        return this.distinct;
    }
    
    public List<Criteria> getOredCriteria() {
        return this.oredCriteria;
    }
    
    public void or(final Criteria criteria) {
        this.oredCriteria.add(criteria);
    }
    
    public Criteria or() {
        final Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }
    
    public Criteria createCriteria() {
        final Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }
        return criteria;
    }
    
    protected Criteria createCriteriaInternal() {
        final Criteria criteria = new Criteria();
        return criteria;
    }
    
    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }
    
    public static class Criteria extends GeneratedCriteria
    {
    }
    
    protected abstract static class GeneratedCriteria
    {
        protected List<Criterion> criteria;
        
        protected GeneratedCriteria() {
            this.criteria = new ArrayList<Criterion>();
        }
        
        public boolean isValid() {
            return this.criteria.size() > 0;
        }
        
        public List<Criterion> getAllCriteria() {
            return this.criteria;
        }
        
        public List<Criterion> getCriteria() {
            return this.criteria;
        }
        
        protected void addCriterion(final String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new Criterion(condition));
        }
        
        protected void addCriterion(final String condition, final Object value, final String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value));
        }
        
        protected void addCriterion(final String condition, final Object value1, final Object value2, final String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value1, value2));
        }
        
        public Criteria andOiidIsNull() {
            this.addCriterion("oiid is null");
            return (Criteria)this;
        }
        
        public Criteria andOiidIsNotNull() {
            this.addCriterion("oiid is not null");
            return (Criteria)this;
        }
        
        public Criteria andOiidEqualTo(final Integer value) {
            this.addCriterion("oiid =", value, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidNotEqualTo(final Integer value) {
            this.addCriterion("oiid <>", value, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidGreaterThan(final Integer value) {
            this.addCriterion("oiid >", value, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("oiid >=", value, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidLessThan(final Integer value) {
            this.addCriterion("oiid <", value, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("oiid <=", value, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidIn(final List<Integer> values) {
            this.addCriterion("oiid in", values, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidNotIn(final List<Integer> values) {
            this.addCriterion("oiid not in", values, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("oiid between", value1, value2, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andOiidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("oiid not between", value1, value2, "oiid");
            return (Criteria)this;
        }
        
        public Criteria andCountIsNull() {
            this.addCriterion("count is null");
            return (Criteria)this;
        }
        
        public Criteria andCountIsNotNull() {
            this.addCriterion("count is not null");
            return (Criteria)this;
        }
        
        public Criteria andCountEqualTo(final Integer value) {
            this.addCriterion("count =", value, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountNotEqualTo(final Integer value) {
            this.addCriterion("count <>", value, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountGreaterThan(final Integer value) {
            this.addCriterion("count >", value, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("count >=", value, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountLessThan(final Integer value) {
            this.addCriterion("count <", value, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountLessThanOrEqualTo(final Integer value) {
            this.addCriterion("count <=", value, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountIn(final List<Integer> values) {
            this.addCriterion("count in", values, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountNotIn(final List<Integer> values) {
            this.addCriterion("count not in", values, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountBetween(final Integer value1, final Integer value2) {
            this.addCriterion("count between", value1, value2, "count");
            return (Criteria)this;
        }
        
        public Criteria andCountNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("count not between", value1, value2, "count");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalIsNull() {
            this.addCriterion("subtotal is null");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalIsNotNull() {
            this.addCriterion("subtotal is not null");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalEqualTo(final Double value) {
            this.addCriterion("subtotal =", value, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalNotEqualTo(final Double value) {
            this.addCriterion("subtotal <>", value, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalGreaterThan(final Double value) {
            this.addCriterion("subtotal >", value, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("subtotal >=", value, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalLessThan(final Double value) {
            this.addCriterion("subtotal <", value, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalLessThanOrEqualTo(final Double value) {
            this.addCriterion("subtotal <=", value, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalIn(final List<Double> values) {
            this.addCriterion("subtotal in", values, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalNotIn(final List<Double> values) {
            this.addCriterion("subtotal not in", values, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalBetween(final Double value1, final Double value2) {
            this.addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andSubtotalNotBetween(final Double value1, final Double value2) {
            this.addCriterion("subtotal not between", value1, value2, "subtotal");
            return (Criteria)this;
        }
        
        public Criteria andPidIsNull() {
            this.addCriterion("pid is null");
            return (Criteria)this;
        }
        
        public Criteria andPidIsNotNull() {
            this.addCriterion("pid is not null");
            return (Criteria)this;
        }
        
        public Criteria andPidEqualTo(final Integer value) {
            this.addCriterion("pid =", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidNotEqualTo(final Integer value) {
            this.addCriterion("pid <>", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidGreaterThan(final Integer value) {
            this.addCriterion("pid >", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("pid >=", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidLessThan(final Integer value) {
            this.addCriterion("pid <", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("pid <=", value, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidIn(final List<Integer> values) {
            this.addCriterion("pid in", values, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidNotIn(final List<Integer> values) {
            this.addCriterion("pid not in", values, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pid between", value1, value2, "pid");
            return (Criteria)this;
        }
        
        public Criteria andPidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pid not between", value1, value2, "pid");
            return (Criteria)this;
        }
        
        public Criteria andOidIsNull() {
            this.addCriterion("oid is null");
            return (Criteria)this;
        }
        
        public Criteria andOidIsNotNull() {
            this.addCriterion("oid is not null");
            return (Criteria)this;
        }
        
        public Criteria andOidEqualTo(final Integer value) {
            this.addCriterion("oid =", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidNotEqualTo(final Integer value) {
            this.addCriterion("oid <>", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidGreaterThan(final Integer value) {
            this.addCriterion("oid >", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("oid >=", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidLessThan(final Integer value) {
            this.addCriterion("oid <", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("oid <=", value, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidIn(final List<Integer> values) {
            this.addCriterion("oid in", values, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidNotIn(final List<Integer> values) {
            this.addCriterion("oid not in", values, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("oid between", value1, value2, "oid");
            return (Criteria)this;
        }
        
        public Criteria andOidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("oid not between", value1, value2, "oid");
            return (Criteria)this;
        }
    }
    
    public static class Criterion
    {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;
        
        public String getCondition() {
            return this.condition;
        }
        
        public Object getValue() {
            return this.value;
        }
        
        public Object getSecondValue() {
            return this.secondValue;
        }
        
        public boolean isNoValue() {
            return this.noValue;
        }
        
        public boolean isSingleValue() {
            return this.singleValue;
        }
        
        public boolean isBetweenValue() {
            return this.betweenValue;
        }
        
        public boolean isListValue() {
            return this.listValue;
        }
        
        public String getTypeHandler() {
            return this.typeHandler;
        }
        
        protected Criterion(final String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            }
            else {
                this.singleValue = true;
            }
        }
        
        protected Criterion(final String condition, final Object value) {
            this(condition, value, null);
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
