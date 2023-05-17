// 
// 
// 

package com.shop.po;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart
{
    private double totale;
    private Map<Integer, CartItem> map;
    
    public Cart() {
        this.map = new HashMap<Integer, CartItem>();
    }
    
    public Collection<CartItem> getCartItems() {
        return this.map.values();
    }
    
    public Map<Integer, CartItem> getCartItem() {
        return this.map;
    }
    
    public void setCartItem(final Map<Integer, CartItem> cartItem) {
        this.map = cartItem;
    }
    
    public double getTotale() {
        return this.totale;
    }
    
    public void setTotale(final double totale) {
        this.totale = totale;
    }
    
    public void addCart(final CartItem item) {
        final Integer pid = item.getProduct().getPid();
        if (this.map.containsKey(pid)) {
            final CartItem existItem = this.map.get(pid);
            existItem.setCount(item.getCount() + existItem.getCount());
            existItem.setSubtotle(item.getSubtotle() + existItem.getSubtotle());
        }
        else {
            this.map.put(pid, item);
        }
        this.totale += item.getSubtotle();
    }
    
    public void delProFromCart(final int pid) {
        final CartItem item = this.map.remove(pid);
        this.totale -= item.getSubtotle();
    }
    
    public void clearCart() {
        this.map.clear();
        this.totale = 0.0;
    }
}
