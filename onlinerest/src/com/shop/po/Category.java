// 
// 
// 

package com.shop.po;

import java.util.List;

public class Category
{
    private Integer cid;
    private String cname;
    private List<Categorysecond> csList;
    
    public List<Categorysecond> getCsList() {
        return this.csList;
    }
    
    public void setCsList(final List<Categorysecond> csList) {
        this.csList = csList;
    }
    
    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(final Integer cid) {
        this.cid = cid;
    }
    
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(final String cname) {
        this.cname = ((cname == null) ? null : cname.trim());
    }
}
