// 
// 
// 

package com.shop.po;

public class Message
{
    private Integer messageid;
    private String message;
    private String messagedate;
    private Integer uid;
    private User user;
    
    public User getUser() {
        return this.user;
    }
    
    public void setUser(final User user) {
        this.user = user;
    }
    
    public Integer getUid() {
        return this.uid;
    }
    
    public void setUid(final Integer uid) {
        this.uid = uid;
    }
    
    public Integer getMessageid() {
        return this.messageid;
    }
    
    public void setMessageid(final Integer messageid) {
        this.messageid = messageid;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public String getMessagedate() {
        return this.messagedate;
    }
    
    public void setMessagedate(final String messagedate) {
        this.messagedate = messagedate;
    }
}
