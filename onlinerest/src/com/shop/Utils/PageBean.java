// 
// 
// 

package com.shop.Utils;

import java.util.List;

public class PageBean<T>
{
    private int page;
    private int totlePage;
    private int limitPage;
    private List<T> list;
    
    public int getPage() {
        return this.page;
    }
    
    public void setPage(final int page) {
        this.page = page;
    }
    
    public int getTotlePage() {
        return this.totlePage;
    }
    
    public void setTotlePage(final int totlePage) {
        this.totlePage = totlePage;
    }
    
    public int getLimitPage() {
        return this.limitPage;
    }
    
    public void setLimitPage(final int limitPage) {
        this.limitPage = limitPage;
    }
    
    public List<T> getList() {
        return this.list;
    }
    
    public void setList(final List<T> list) {
        this.list = list;
    }
    
    @Override
    public String toString() {
        return "PageBean [page=" + this.page + ", totlePage=" + this.totlePage + ", limitPage=" + this.limitPage + ", list=" + this.list + "]";
    }
}
