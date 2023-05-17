// 
// 
// 

package com.shop.po;

public class CartItem
{
    private Product product;
    private int count;
    private double subtotle;
    
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(final Product product) {
        this.product = product;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void setCount(final int count) {
        this.count = count;
    }
    
    public double getSubtotle() {
        return this.subtotle;
    }
    
    public void setSubtotle(final double subtotle) {
        this.subtotle = subtotle;
    }
}
