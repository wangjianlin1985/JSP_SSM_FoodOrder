// 
// 
// 

package com.shop.serviceImpl;

import com.shop.po.CategoryExample;
import com.shop.po.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.mapper.CategoryMapper;
import com.shop.service.CategoryService;

public class CategoryServiceImpl implements CategoryService
{
    @Autowired
    private CategoryMapper categoryMapper;
    
    @Override
    public List<Category> findCategory() throws Exception {
        final List<Category> list = this.categoryMapper.findCategoryAndSecondcategory();
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
    
    @Override
    public void addCategory(final Category addCategory) throws Exception {
        this.categoryMapper.insert(addCategory);
    }
    
    @Override
    public List<Category> adminbFindCategory() {
        System.out.println("3333333333333");
        final CategoryExample example = new CategoryExample();
        final List<Category> list = this.categoryMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
    
    @Override
    public Category findCategory(final int cid) throws Exception {
        return this.categoryMapper.selectByPrimaryKey(cid);
    }
    
    @Override
    public void adminCategory_update(final Category category) {
        this.categoryMapper.updateByPrimaryKey(category);
    }
    
    @Override
    public void deleteCategoryByCid(final int cid) throws Exception {
        this.categoryMapper.deleteByPrimaryKey(cid);
    }
}
