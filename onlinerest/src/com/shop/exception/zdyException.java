// 
// 
// 

package com.shop.exception;

public class zdyException extends Exception
{
    private String message;
    
    public zdyException(final String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
}
