// 
// 
// 

package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shop.po.Category;
import com.shop.po.CategoryExample;

public interface CategoryMapper
{
    int countByExample(CategoryExample p0);
    
    int deleteByExample(CategoryExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Category p0);
    
    int insertSelective(Category p0);
    
    List<Category> findCategoryAndSecondcategory();
    
    List<Category> selectByExample(CategoryExample p0);
    
    Category selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Category p0, @Param("example") CategoryExample p1);
    
    int updateByExample(@Param("record") Category p0, @Param("example") CategoryExample p1);
    
    int updateByPrimaryKeySelective(Category p0);
    
    int updateByPrimaryKey(Category p0);
}
