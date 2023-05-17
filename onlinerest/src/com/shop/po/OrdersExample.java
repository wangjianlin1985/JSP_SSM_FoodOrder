// 
// 
// 

package com.shop.po;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class OrdersExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public OrdersExample() {
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
        
        public Criteria andMoneyIsNull() {
            this.addCriterion("money is null");
            return (Criteria)this;
        }
        
        public Criteria andMoneyIsNotNull() {
            this.addCriterion("money is not null");
            return (Criteria)this;
        }
        
        public Criteria andMoneyEqualTo(final Double value) {
            this.addCriterion("money =", value, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyNotEqualTo(final Double value) {
            this.addCriterion("money <>", value, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyGreaterThan(final Double value) {
            this.addCriterion("money >", value, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("money >=", value, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyLessThan(final Double value) {
            this.addCriterion("money <", value, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyLessThanOrEqualTo(final Double value) {
            this.addCriterion("money <=", value, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyIn(final List<Double> values) {
            this.addCriterion("money in", values, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyNotIn(final List<Double> values) {
            this.addCriterion("money not in", values, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyBetween(final Double value1, final Double value2) {
            this.addCriterion("money between", value1, value2, "money");
            return (Criteria)this;
        }
        
        public Criteria andMoneyNotBetween(final Double value1, final Double value2) {
            this.addCriterion("money not between", value1, value2, "money");
            return (Criteria)this;
        }
        
        public Criteria andStateIsNull() {
            this.addCriterion("state is null");
            return (Criteria)this;
        }
        
        public Criteria andStateIsNotNull() {
            this.addCriterion("state is not null");
            return (Criteria)this;
        }
        
        public Criteria andStateEqualTo(final Integer value) {
            this.addCriterion("state =", value, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateNotEqualTo(final Integer value) {
            this.addCriterion("state <>", value, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateGreaterThan(final Integer value) {
            this.addCriterion("state >", value, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("state >=", value, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateLessThan(final Integer value) {
            this.addCriterion("state <", value, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateLessThanOrEqualTo(final Integer value) {
            this.addCriterion("state <=", value, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateIn(final List<Integer> values) {
            this.addCriterion("state in", values, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateNotIn(final List<Integer> values) {
            this.addCriterion("state not in", values, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateBetween(final Integer value1, final Integer value2) {
            this.addCriterion("state between", value1, value2, "state");
            return (Criteria)this;
        }
        
        public Criteria andStateNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("state not between", value1, value2, "state");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoIsNull() {
            this.addCriterion("receiveInfo is null");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoIsNotNull() {
            this.addCriterion("receiveInfo is not null");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoEqualTo(final String value) {
            this.addCriterion("receiveInfo =", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoNotEqualTo(final String value) {
            this.addCriterion("receiveInfo <>", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoGreaterThan(final String value) {
            this.addCriterion("receiveInfo >", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoGreaterThanOrEqualTo(final String value) {
            this.addCriterion("receiveInfo >=", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoLessThan(final String value) {
            this.addCriterion("receiveInfo <", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoLessThanOrEqualTo(final String value) {
            this.addCriterion("receiveInfo <=", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoLike(final String value) {
            this.addCriterion("receiveInfo like", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoNotLike(final String value) {
            this.addCriterion("receiveInfo not like", value, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoIn(final List<String> values) {
            this.addCriterion("receiveInfo in", values, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoNotIn(final List<String> values) {
            this.addCriterion("receiveInfo not in", values, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoBetween(final String value1, final String value2) {
            this.addCriterion("receiveInfo between", value1, value2, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andReceiveinfoNotBetween(final String value1, final String value2) {
            this.addCriterion("receiveInfo not between", value1, value2, "receiveinfo");
            return (Criteria)this;
        }
        
        public Criteria andPhonumIsNull() {
            this.addCriterion("phoNum is null");
            return (Criteria)this;
        }
        
        public Criteria andPhonumIsNotNull() {
            this.addCriterion("phoNum is not null");
            return (Criteria)this;
        }
        
        public Criteria andPhonumEqualTo(final String value) {
            this.addCriterion("phoNum =", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumNotEqualTo(final String value) {
            this.addCriterion("phoNum <>", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumGreaterThan(final String value) {
            this.addCriterion("phoNum >", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumGreaterThanOrEqualTo(final String value) {
            this.addCriterion("phoNum >=", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumLessThan(final String value) {
            this.addCriterion("phoNum <", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumLessThanOrEqualTo(final String value) {
            this.addCriterion("phoNum <=", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumLike(final String value) {
            this.addCriterion("phoNum like", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumNotLike(final String value) {
            this.addCriterion("phoNum not like", value, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumIn(final List<String> values) {
            this.addCriterion("phoNum in", values, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumNotIn(final List<String> values) {
            this.addCriterion("phoNum not in", values, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumBetween(final String value1, final String value2) {
            this.addCriterion("phoNum between", value1, value2, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andPhonumNotBetween(final String value1, final String value2) {
            this.addCriterion("phoNum not between", value1, value2, "phonum");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeIsNull() {
            this.addCriterion("order_time is null");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeIsNotNull() {
            this.addCriterion("order_time is not null");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeEqualTo(final Date value) {
            this.addCriterion("order_time =", value, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeNotEqualTo(final Date value) {
            this.addCriterion("order_time <>", value, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeGreaterThan(final Date value) {
            this.addCriterion("order_time >", value, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("order_time >=", value, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeLessThan(final Date value) {
            this.addCriterion("order_time <", value, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeLessThanOrEqualTo(final Date value) {
            this.addCriterion("order_time <=", value, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeIn(final List<Date> values) {
            this.addCriterion("order_time in", values, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeNotIn(final List<Date> values) {
            this.addCriterion("order_time not in", values, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeBetween(final Date value1, final Date value2) {
            this.addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andOrderTimeNotBetween(final Date value1, final Date value2) {
            this.addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria)this;
        }
        
        public Criteria andUidIsNull() {
            this.addCriterion("uid is null");
            return (Criteria)this;
        }
        
        public Criteria andUidIsNotNull() {
            this.addCriterion("uid is not null");
            return (Criteria)this;
        }
        
        public Criteria andUidEqualTo(final Integer value) {
            this.addCriterion("uid =", value, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidNotEqualTo(final Integer value) {
            this.addCriterion("uid <>", value, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidGreaterThan(final Integer value) {
            this.addCriterion("uid >", value, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("uid >=", value, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidLessThan(final Integer value) {
            this.addCriterion("uid <", value, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("uid <=", value, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidIn(final List<Integer> values) {
            this.addCriterion("uid in", values, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidNotIn(final List<Integer> values) {
            this.addCriterion("uid not in", values, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("uid between", value1, value2, "uid");
            return (Criteria)this;
        }
        
        public Criteria andUidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("uid not between", value1, value2, "uid");
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
