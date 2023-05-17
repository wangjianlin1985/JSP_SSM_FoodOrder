// 
// 
// 

package com.shop.po;

import java.util.ArrayList;
import java.util.List;

public class AdminuserExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public AdminuserExample() {
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
        
        public Criteria andAuidIsNull() {
            this.addCriterion("auid is null");
            return (Criteria)this;
        }
        
        public Criteria andAuidIsNotNull() {
            this.addCriterion("auid is not null");
            return (Criteria)this;
        }
        
        public Criteria andAuidEqualTo(final Integer value) {
            this.addCriterion("auid =", value, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidNotEqualTo(final Integer value) {
            this.addCriterion("auid <>", value, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidGreaterThan(final Integer value) {
            this.addCriterion("auid >", value, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("auid >=", value, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidLessThan(final Integer value) {
            this.addCriterion("auid <", value, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("auid <=", value, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidIn(final List<Integer> values) {
            this.addCriterion("auid in", values, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidNotIn(final List<Integer> values) {
            this.addCriterion("auid not in", values, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("auid between", value1, value2, "auid");
            return (Criteria)this;
        }
        
        public Criteria andAuidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("auid not between", value1, value2, "auid");
            return (Criteria)this;
        }
        
        public Criteria andUsernameIsNull() {
            this.addCriterion("username is null");
            return (Criteria)this;
        }
        
        public Criteria andUsernameIsNotNull() {
            this.addCriterion("username is not null");
            return (Criteria)this;
        }
        
        public Criteria andUsernameEqualTo(final String value) {
            this.addCriterion("username =", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotEqualTo(final String value) {
            this.addCriterion("username <>", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameGreaterThan(final String value) {
            this.addCriterion("username >", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("username >=", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameLessThan(final String value) {
            this.addCriterion("username <", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameLessThanOrEqualTo(final String value) {
            this.addCriterion("username <=", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameLike(final String value) {
            this.addCriterion("username like", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotLike(final String value) {
            this.addCriterion("username not like", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameIn(final List<String> values) {
            this.addCriterion("username in", values, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotIn(final List<String> values) {
            this.addCriterion("username not in", values, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameBetween(final String value1, final String value2) {
            this.addCriterion("username between", value1, value2, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotBetween(final String value1, final String value2) {
            this.addCriterion("username not between", value1, value2, "username");
            return (Criteria)this;
        }
        
        public Criteria andPasswordIsNull() {
            this.addCriterion("password is null");
            return (Criteria)this;
        }
        
        public Criteria andPasswordIsNotNull() {
            this.addCriterion("password is not null");
            return (Criteria)this;
        }
        
        public Criteria andPasswordEqualTo(final String value) {
            this.addCriterion("password =", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotEqualTo(final String value) {
            this.addCriterion("password <>", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordGreaterThan(final String value) {
            this.addCriterion("password >", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordGreaterThanOrEqualTo(final String value) {
            this.addCriterion("password >=", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordLessThan(final String value) {
            this.addCriterion("password <", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordLessThanOrEqualTo(final String value) {
            this.addCriterion("password <=", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordLike(final String value) {
            this.addCriterion("password like", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotLike(final String value) {
            this.addCriterion("password not like", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordIn(final List<String> values) {
            this.addCriterion("password in", values, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotIn(final List<String> values) {
            this.addCriterion("password not in", values, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordBetween(final String value1, final String value2) {
            this.addCriterion("password between", value1, value2, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotBetween(final String value1, final String value2) {
            this.addCriterion("password not between", value1, value2, "password");
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
