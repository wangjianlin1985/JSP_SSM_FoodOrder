// 
// 
// 

package com.shop.po;

public class Adminuser
{
    private Integer auid;
    private String username;
    private String password;
    
    public Integer getAuid() {
        return this.auid;
    }
    
    public void setAuid(final Integer auid) {
        this.auid = auid;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = ((username == null) ? null : username.trim());
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = ((password == null) ? null : password.trim());
    }
}
