// 
// 
// 

package com.shop.po;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Orders
{
    private Integer oid;
    private Double money;
    private Integer state;
    private String receiveinfo;
    private String phonum;
    private Date orderTime;
    private Integer uid;
    private String accepter;
    private User user;
    private List<Orderitem> oiList;
    
    public Orders() {
        this.oiList = new ArrayList<Orderitem>();
    }
    
    public User getUser() {
        return this.user;
    }
    
    public void setUser(final User user) {
        this.user = user;
    }
    
    public List<Orderitem> getOiList() {
        return this.oiList;
    }
    
    public void setOiList(final List<Orderitem> oiList) {
        this.oiList = oiList;
    }
    
    public Integer getOid() {
        return this.oid;
    }
    
    public void setOid(final Integer oid) {
        this.oid = oid;
    }
    
    public Double getMoney() {
        return this.money;
    }
    
    public void setMoney(final Double money) {
        this.money = money;
    }
    
    public Integer getState() {
        return this.state;
    }
    
    public void setState(final Integer state) {
        this.state = state;
    }
    
    public String getReceiveinfo() {
        return this.receiveinfo;
    }
    
    public void setReceiveinfo(final String receiveinfo) {
        this.receiveinfo = ((receiveinfo == null) ? null : receiveinfo.trim());
    }
    
    public String getPhonum() {
        return this.phonum;
    }
    
    public void setPhonum(final String phonum) {
        this.phonum = ((phonum == null) ? null : phonum.trim());
    }
    
    public Date getOrderTime() {
        return this.orderTime;
    }
    
    public void setOrderTime(final Date orderTime) {
        this.orderTime = orderTime;
    }
    
    public Integer getUid() {
        return this.uid;
    }
    
    public void setUid(final Integer uid) {
        this.uid = uid;
    }
    
    public String getAccepter() {
        return this.accepter;
    }
    
    public void setAccepter(final String accepter) {
        this.accepter = accepter;
    }
}
