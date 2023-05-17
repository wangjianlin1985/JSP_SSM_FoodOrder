// 
// 
// 

package com.shop.po;

public class Categorysecond
{
    private Integer csid;
    private String csname;
    private Integer cid;
    
    public Integer getCsid() {
        return this.csid;
    }
    
    public void setCsid(final Integer csid) {
        this.csid = csid;
    }
    
    public String getCsname() {
        return this.csname;
    }
    
    public void setCsname(final String csname) {
        this.csname = ((csname == null) ? null : csname.trim());
    }
    
    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(final Integer cid) {
        this.cid = cid;
    }
}
