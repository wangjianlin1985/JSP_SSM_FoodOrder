// 
// 
// 

package com.shop.po;

import java.util.ArrayList;
import java.util.List;

public class UserExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public UserExample() {
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
        
        public Criteria andNameIsNull() {
            this.addCriterion("name is null");
            return (Criteria)this;
        }
        
        public Criteria andNameIsNotNull() {
            this.addCriterion("name is not null");
            return (Criteria)this;
        }
        
        public Criteria andNameEqualTo(final String value) {
            this.addCriterion("name =", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotEqualTo(final String value) {
            this.addCriterion("name <>", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameGreaterThan(final String value) {
            this.addCriterion("name >", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("name >=", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameLessThan(final String value) {
            this.addCriterion("name <", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameLessThanOrEqualTo(final String value) {
            this.addCriterion("name <=", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameLike(final String value) {
            this.addCriterion("name like", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotLike(final String value) {
            this.addCriterion("name not like", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameIn(final List<String> values) {
            this.addCriterion("name in", values, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotIn(final List<String> values) {
            this.addCriterion("name not in", values, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameBetween(final String value1, final String value2) {
            this.addCriterion("name between", value1, value2, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotBetween(final String value1, final String value2) {
            this.addCriterion("name not between", value1, value2, "name");
            return (Criteria)this;
        }
        
        public Criteria andEmailIsNull() {
            this.addCriterion("email is null");
            return (Criteria)this;
        }
        
        public Criteria andEmailIsNotNull() {
            this.addCriterion("email is not null");
            return (Criteria)this;
        }
        
        public Criteria andEmailEqualTo(final String value) {
            this.addCriterion("email =", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotEqualTo(final String value) {
            this.addCriterion("email <>", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailGreaterThan(final String value) {
            this.addCriterion("email >", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailGreaterThanOrEqualTo(final String value) {
            this.addCriterion("email >=", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailLessThan(final String value) {
            this.addCriterion("email <", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailLessThanOrEqualTo(final String value) {
            this.addCriterion("email <=", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailLike(final String value) {
            this.addCriterion("email like", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotLike(final String value) {
            this.addCriterion("email not like", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailIn(final List<String> values) {
            this.addCriterion("email in", values, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotIn(final List<String> values) {
            this.addCriterion("email not in", values, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailBetween(final String value1, final String value2) {
            this.addCriterion("email between", value1, value2, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotBetween(final String value1, final String value2) {
            this.addCriterion("email not between", value1, value2, "email");
            return (Criteria)this;
        }
        
        public Criteria andPhoneIsNull() {
            this.addCriterion("phone is null");
            return (Criteria)this;
        }
        
        public Criteria andPhoneIsNotNull() {
            this.addCriterion("phone is not null");
            return (Criteria)this;
        }
        
        public Criteria andPhoneEqualTo(final String value) {
            this.addCriterion("phone =", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotEqualTo(final String value) {
            this.addCriterion("phone <>", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneGreaterThan(final String value) {
            this.addCriterion("phone >", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("phone >=", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneLessThan(final String value) {
            this.addCriterion("phone <", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneLessThanOrEqualTo(final String value) {
            this.addCriterion("phone <=", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneLike(final String value) {
            this.addCriterion("phone like", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotLike(final String value) {
            this.addCriterion("phone not like", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneIn(final List<String> values) {
            this.addCriterion("phone in", values, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotIn(final List<String> values) {
            this.addCriterion("phone not in", values, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneBetween(final String value1, final String value2) {
            this.addCriterion("phone between", value1, value2, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotBetween(final String value1, final String value2) {
            this.addCriterion("phone not between", value1, value2, "phone");
            return (Criteria)this;
        }
        
        public Criteria andAddrIsNull() {
            this.addCriterion("addr is null");
            return (Criteria)this;
        }
        
        public Criteria andAddrIsNotNull() {
            this.addCriterion("addr is not null");
            return (Criteria)this;
        }
        
        public Criteria andAddrEqualTo(final String value) {
            this.addCriterion("addr =", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrNotEqualTo(final String value) {
            this.addCriterion("addr <>", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrGreaterThan(final String value) {
            this.addCriterion("addr >", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrGreaterThanOrEqualTo(final String value) {
            this.addCriterion("addr >=", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrLessThan(final String value) {
            this.addCriterion("addr <", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrLessThanOrEqualTo(final String value) {
            this.addCriterion("addr <=", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrLike(final String value) {
            this.addCriterion("addr like", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrNotLike(final String value) {
            this.addCriterion("addr not like", value, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrIn(final List<String> values) {
            this.addCriterion("addr in", values, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrNotIn(final List<String> values) {
            this.addCriterion("addr not in", values, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrBetween(final String value1, final String value2) {
            this.addCriterion("addr between", value1, value2, "addr");
            return (Criteria)this;
        }
        
        public Criteria andAddrNotBetween(final String value1, final String value2) {
            this.addCriterion("addr not between", value1, value2, "addr");
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
        
        public Criteria andCodeIsNull() {
            this.addCriterion("code is null");
            return (Criteria)this;
        }
        
        public Criteria andCodeIsNotNull() {
            this.addCriterion("code is not null");
            return (Criteria)this;
        }
        
        public Criteria andCodeEqualTo(final String value) {
            this.addCriterion("code =", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeNotEqualTo(final String value) {
            this.addCriterion("code <>", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeGreaterThan(final String value) {
            this.addCriterion("code >", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeGreaterThanOrEqualTo(final String value) {
            this.addCriterion("code >=", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeLessThan(final String value) {
            this.addCriterion("code <", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeLessThanOrEqualTo(final String value) {
            this.addCriterion("code <=", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeLike(final String value) {
            this.addCriterion("code like", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeNotLike(final String value) {
            this.addCriterion("code not like", value, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeIn(final List<String> values) {
            this.addCriterion("code in", values, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeNotIn(final List<String> values) {
            this.addCriterion("code not in", values, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeBetween(final String value1, final String value2) {
            this.addCriterion("code between", value1, value2, "code");
            return (Criteria)this;
        }
        
        public Criteria andCodeNotBetween(final String value1, final String value2) {
            this.addCriterion("code not between", value1, value2, "code");
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
