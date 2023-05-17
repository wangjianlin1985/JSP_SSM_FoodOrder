// 
// 
// 

package com.shop.service;

import java.util.List;
import com.shop.po.Categorysecond;
import com.shop.Utils.PageBean;

public interface CategorySecondService
{
    PageBean<Categorysecond> adminCategorySecond_findAllByPage(int p0);
    
    void adminCategorySecond_save(Categorysecond p0) throws Exception;
    
    Categorysecond findByCsid(int p0) throws Exception;
    
    void adminCategorySecond_update(Categorysecond p0);
    
    void adminCategorySecond_delete(int p0) throws Exception;
    
    List<Categorysecond> findAll() throws Exception;
    
    void adminCategorySecond_deleteByCid(int p0) throws Exception;
}
