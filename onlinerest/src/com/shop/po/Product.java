// 
// 
// 

package com.shop.po;

import java.util.Date;

public class Product
{
    private Integer pid;
    private String pname;
    private Double marketPrice;
    private Double shopPrice;
    private String image;
    private String pdesc;
    private Integer isHot;
    private Date pdate;
    private Integer csid;
    
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(final Integer pid) {
        this.pid = pid;
    }
    
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(final String pname) {
        this.pname = ((pname == null) ? null : pname.trim());
    }
    
    public Double getMarketPrice() {
        return this.marketPrice;
    }
    
    public void setMarketPrice(final Double marketPrice) {
        this.marketPrice = marketPrice;
    }
    
    public Double getShopPrice() {
        return this.shopPrice;
    }
    
    public void setShopPrice(final Double shopPrice) {
        this.shopPrice = shopPrice;
    }
    
    public String getImage() {
        return this.image;
    }
    
    public void setImage(final String image) {
        this.image = ((image == null) ? null : image.trim());
    }
    
    public String getPdesc() {
        return this.pdesc;
    }
    
    public void setPdesc(final String pdesc) {
        this.pdesc = ((pdesc == null) ? null : pdesc.trim());
    }
    
    public Integer getIsHot() {
        return this.isHot;
    }
    
    public void setIsHot(final Integer isHot) {
        this.isHot = isHot;
    }
    
    public Date getPdate() {
        return this.pdate;
    }
    
    public void setPdate(final Date pdate) {
        this.pdate = pdate;
    }
    
    public Integer getCsid() {
        return this.csid;
    }
    
    public void setCsid(final Integer csid) {
        this.csid = csid;
    }
}
