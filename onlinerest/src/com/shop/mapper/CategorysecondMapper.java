// 
// 
// 

package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shop.po.Categorysecond;
import com.shop.po.CategorysecondExample;

public interface CategorysecondMapper
{
    int countByExample(CategorysecondExample p0);
    
    int deleteByExample(CategorysecondExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Categorysecond p0);
    
    int insertSelective(Categorysecond p0);
    
    List<Categorysecond> selectByExample(CategorysecondExample p0);
    
    Categorysecond selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Categorysecond p0, @Param("example") CategorysecondExample p1);
    
    int updateByExample(@Param("record") Categorysecond p0, @Param("example") CategorysecondExample p1);
    
    int updateByPrimaryKeySelective(Categorysecond p0);
    
    int updateByPrimaryKey(Categorysecond p0);
    
    List<Categorysecond> selectByExample1();
}
