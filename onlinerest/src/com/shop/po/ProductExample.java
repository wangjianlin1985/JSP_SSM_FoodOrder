// 
// 
// 

package com.shop.po;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ProductExample
{
    protected String orderByClause;
    protected int beginPage;
    protected int end;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public int getBeginPage() {
        return this.beginPage;
    }
    
    public void setBeginPage(final int beginPage) {
        this.beginPage = beginPage;
    }
    
    public int getEnd() {
        return this.end;
    }
    
    public void setEnd(final int end) {
        this.end = end;
    }
    
    public ProductExample() {
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
        
        public Criteria andPnameIsNull() {
            this.addCriterion("pname is null");
            return (Criteria)this;
        }
        
        public Criteria andPnameIsNotNull() {
            this.addCriterion("pname is not null");
            return (Criteria)this;
        }
        
        public Criteria andPnameEqualTo(final String value) {
            this.addCriterion("pname =", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotEqualTo(final String value) {
            this.addCriterion("pname <>", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameGreaterThan(final String value) {
            this.addCriterion("pname >", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("pname >=", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameLessThan(final String value) {
            this.addCriterion("pname <", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameLessThanOrEqualTo(final String value) {
            this.addCriterion("pname <=", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameLike(final String value) {
            this.addCriterion("pname like", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotLike(final String value) {
            this.addCriterion("pname not like", value, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameIn(final List<String> values) {
            this.addCriterion("pname in", values, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotIn(final List<String> values) {
            this.addCriterion("pname not in", values, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameBetween(final String value1, final String value2) {
            this.addCriterion("pname between", value1, value2, "pname");
            return (Criteria)this;
        }
        
        public Criteria andPnameNotBetween(final String value1, final String value2) {
            this.addCriterion("pname not between", value1, value2, "pname");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceIsNull() {
            this.addCriterion("market_price is null");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceIsNotNull() {
            this.addCriterion("market_price is not null");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceEqualTo(final Double value) {
            this.addCriterion("market_price =", value, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceNotEqualTo(final Double value) {
            this.addCriterion("market_price <>", value, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceGreaterThan(final Double value) {
            this.addCriterion("market_price >", value, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("market_price >=", value, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceLessThan(final Double value) {
            this.addCriterion("market_price <", value, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceLessThanOrEqualTo(final Double value) {
            this.addCriterion("market_price <=", value, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceIn(final List<Double> values) {
            this.addCriterion("market_price in", values, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceNotIn(final List<Double> values) {
            this.addCriterion("market_price not in", values, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceBetween(final Double value1, final Double value2) {
            this.addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andMarketPriceNotBetween(final Double value1, final Double value2) {
            this.addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceIsNull() {
            this.addCriterion("shop_price is null");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceIsNotNull() {
            this.addCriterion("shop_price is not null");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceEqualTo(final Double value) {
            this.addCriterion("shop_price =", value, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceNotEqualTo(final Double value) {
            this.addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceGreaterThan(final Double value) {
            this.addCriterion("shop_price >", value, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceLessThan(final Double value) {
            this.addCriterion("shop_price <", value, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceLessThanOrEqualTo(final Double value) {
            this.addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceIn(final List<Double> values) {
            this.addCriterion("shop_price in", values, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceNotIn(final List<Double> values) {
            this.addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceBetween(final Double value1, final Double value2) {
            this.addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andShopPriceNotBetween(final Double value1, final Double value2) {
            this.addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria)this;
        }
        
        public Criteria andImageIsNull() {
            this.addCriterion("image is null");
            return (Criteria)this;
        }
        
        public Criteria andImageIsNotNull() {
            this.addCriterion("image is not null");
            return (Criteria)this;
        }
        
        public Criteria andImageEqualTo(final String value) {
            this.addCriterion("image =", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageNotEqualTo(final String value) {
            this.addCriterion("image <>", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageGreaterThan(final String value) {
            this.addCriterion("image >", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageGreaterThanOrEqualTo(final String value) {
            this.addCriterion("image >=", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageLessThan(final String value) {
            this.addCriterion("image <", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageLessThanOrEqualTo(final String value) {
            this.addCriterion("image <=", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageLike(final String value) {
            this.addCriterion("image like", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageNotLike(final String value) {
            this.addCriterion("image not like", value, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageIn(final List<String> values) {
            this.addCriterion("image in", values, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageNotIn(final List<String> values) {
            this.addCriterion("image not in", values, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageBetween(final String value1, final String value2) {
            this.addCriterion("image between", value1, value2, "image");
            return (Criteria)this;
        }
        
        public Criteria andImageNotBetween(final String value1, final String value2) {
            this.addCriterion("image not between", value1, value2, "image");
            return (Criteria)this;
        }
        
        public Criteria andPdescIsNull() {
            this.addCriterion("pdesc is null");
            return (Criteria)this;
        }
        
        public Criteria andPdescIsNotNull() {
            this.addCriterion("pdesc is not null");
            return (Criteria)this;
        }
        
        public Criteria andPdescEqualTo(final String value) {
            this.addCriterion("pdesc =", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescNotEqualTo(final String value) {
            this.addCriterion("pdesc <>", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescGreaterThan(final String value) {
            this.addCriterion("pdesc >", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescGreaterThanOrEqualTo(final String value) {
            this.addCriterion("pdesc >=", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescLessThan(final String value) {
            this.addCriterion("pdesc <", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescLessThanOrEqualTo(final String value) {
            this.addCriterion("pdesc <=", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescLike(final String value) {
            this.addCriterion("pdesc like", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescNotLike(final String value) {
            this.addCriterion("pdesc not like", value, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescIn(final List<String> values) {
            this.addCriterion("pdesc in", values, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescNotIn(final List<String> values) {
            this.addCriterion("pdesc not in", values, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescBetween(final String value1, final String value2) {
            this.addCriterion("pdesc between", value1, value2, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andPdescNotBetween(final String value1, final String value2) {
            this.addCriterion("pdesc not between", value1, value2, "pdesc");
            return (Criteria)this;
        }
        
        public Criteria andIsHotIsNull() {
            this.addCriterion("is_hot is null");
            return (Criteria)this;
        }
        
        public Criteria andIsHotIsNotNull() {
            this.addCriterion("is_hot is not null");
            return (Criteria)this;
        }
        
        public Criteria andIsHotEqualTo(final Integer value) {
            this.addCriterion("is_hot =", value, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotNotEqualTo(final Integer value) {
            this.addCriterion("is_hot <>", value, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotGreaterThan(final Integer value) {
            this.addCriterion("is_hot >", value, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("is_hot >=", value, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotLessThan(final Integer value) {
            this.addCriterion("is_hot <", value, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotLessThanOrEqualTo(final Integer value) {
            this.addCriterion("is_hot <=", value, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotIn(final List<Integer> values) {
            this.addCriterion("is_hot in", values, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotNotIn(final List<Integer> values) {
            this.addCriterion("is_hot not in", values, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andIsHotNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria)this;
        }
        
        public Criteria andPdateIsNull() {
            this.addCriterion("pdate is null");
            return (Criteria)this;
        }
        
        public Criteria andPdateIsNotNull() {
            this.addCriterion("pdate is not null");
            return (Criteria)this;
        }
        
        public Criteria andPdateEqualTo(final Date value) {
            this.addCriterion("pdate =", value, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateNotEqualTo(final Date value) {
            this.addCriterion("pdate <>", value, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateGreaterThan(final Date value) {
            this.addCriterion("pdate >", value, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateGreaterThanOrEqualTo(final Date value) {
            this.addCriterion("pdate >=", value, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateLessThan(final Date value) {
            this.addCriterion("pdate <", value, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateLessThanOrEqualTo(final Date value) {
            this.addCriterion("pdate <=", value, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateIn(final List<Date> values) {
            this.addCriterion("pdate in", values, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateNotIn(final List<Date> values) {
            this.addCriterion("pdate not in", values, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateBetween(final Date value1, final Date value2) {
            this.addCriterion("pdate between", value1, value2, "pdate");
            return (Criteria)this;
        }
        
        public Criteria andPdateNotBetween(final Date value1, final Date value2) {
            this.addCriterion("pdate not between", value1, value2, "pdate");
            return (Criteria)this;
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
