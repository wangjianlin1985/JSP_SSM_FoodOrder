// 
// 
// 

package com.shop.po;

import java.util.ArrayList;
import java.util.List;

public class CategorysecondExample
{
    protected int beginPage;
    protected int limitPage;
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public int getBeginPage() {
        return this.beginPage;
    }
    
    public void setBeginPage(final int beginPage) {
        this.beginPage = beginPage;
    }
    
    public int getLimitPage() {
        return this.limitPage;
    }
    
    public void setLimitPage(final int limitPage) {
        this.limitPage = limitPage;
    }
    
    public CategorysecondExample() {
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
        
        public Criteria andCsidIsNull() {
            this.addCriterion("csid is null");
            return (Criteria)this;
        }
        
        public Criteria andCsidIsNotNull() {
            this.addCriterion("csid is not null");
            return (Criteria)this;
        }
        
        public Criteria andCsidEqualTo(final Integer value) {
            this.addCriterion("csid =", value, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidNotEqualTo(final Integer value) {
            this.addCriterion("csid <>", value, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidGreaterThan(final Integer value) {
            this.addCriterion("csid >", value, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("csid >=", value, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidLessThan(final Integer value) {
            this.addCriterion("csid <", value, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("csid <=", value, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidIn(final List<Integer> values) {
            this.addCriterion("csid in", values, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidNotIn(final List<Integer> values) {
            this.addCriterion("csid not in", values, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("csid between", value1, value2, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("csid not between", value1, value2, "csid");
            return (Criteria)this;
        }
        
        public Criteria andCsnameIsNull() {
            this.addCriterion("csname is null");
            return (Criteria)this;
        }
        
        public Criteria andCsnameIsNotNull() {
            this.addCriterion("csname is not null");
            return (Criteria)this;
        }
        
        public Criteria andCsnameEqualTo(final String value) {
            this.addCriterion("csname =", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameNotEqualTo(final String value) {
            this.addCriterion("csname <>", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameGreaterThan(final String value) {
            this.addCriterion("csname >", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("csname >=", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameLessThan(final String value) {
            this.addCriterion("csname <", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameLessThanOrEqualTo(final String value) {
            this.addCriterion("csname <=", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameLike(final String value) {
            this.addCriterion("csname like", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameNotLike(final String value) {
            this.addCriterion("csname not like", value, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameIn(final List<String> values) {
            this.addCriterion("csname in", values, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameNotIn(final List<String> values) {
            this.addCriterion("csname not in", values, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameBetween(final String value1, final String value2) {
            this.addCriterion("csname between", value1, value2, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCsnameNotBetween(final String value1, final String value2) {
            this.addCriterion("csname not between", value1, value2, "csname");
            return (Criteria)this;
        }
        
        public Criteria andCidIsNull() {
            this.addCriterion("cid is null");
            return (Criteria)this;
        }
        
        public Criteria andCidIsNotNull() {
            this.addCriterion("cid is not null");
            return (Criteria)this;
        }
        
        public Criteria andCidEqualTo(final Integer value) {
            this.addCriterion("cid =", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidNotEqualTo(final Integer value) {
            this.addCriterion("cid <>", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidGreaterThan(final Integer value) {
            this.addCriterion("cid >", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("cid >=", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidLessThan(final Integer value) {
            this.addCriterion("cid <", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidLessThanOrEqualTo(final Integer value) {
            this.addCriterion("cid <=", value, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidIn(final List<Integer> values) {
            this.addCriterion("cid in", values, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidNotIn(final List<Integer> values) {
            this.addCriterion("cid not in", values, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cid between", value1, value2, "cid");
            return (Criteria)this;
        }
        
        public Criteria andCidNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("cid not between", value1, value2, "cid");
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
