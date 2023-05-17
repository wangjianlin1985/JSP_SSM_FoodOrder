// 
// 
// 

package com.shop.service;

import com.shop.po.Category;
import java.util.List;

public interface CategoryService
{
    List<Category> findCategory() throws Exception;
    
    void addCategory(Category p0) throws Exception;
    
    List<Category> adminbFindCategory() throws Exception;
    
    Category findCategory(int p0) throws Exception;
    
    void adminCategory_update(Category p0);
    
    void deleteCategoryByCid(int p0) throws Exception;
}
