// 
// 
// 

package com.shop.po;

public class Orderitem
{
    private Integer oiid;
    private Integer count;
    private Double subtotal;
    private Integer pid;
    private Integer oid;
    private Product product;
    
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(final Product product) {
        this.product = product;
    }
    
    public Integer getOiid() {
        return this.oiid;
    }
    
    public void setOiid(final Integer oiid) {
        this.oiid = oiid;
    }
    
    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(final Integer count) {
        this.count = count;
    }
    
    public Double getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(final Double subtotal) {
        this.subtotal = subtotal;
    }
    
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(final Integer pid) {
        this.pid = pid;
    }
    
    public Integer getOid() {
        return this.oid;
    }
    
    public void setOid(final Integer oid) {
        this.oid = oid;
    }
}
