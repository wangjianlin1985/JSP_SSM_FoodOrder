// 
// 
// 

package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shop.po.Orderitem;
import com.shop.po.OrderitemExample;

public interface OrderitemMapper
{
    int countByExample(OrderitemExample p0);
    
    int deleteByExample(OrderitemExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Orderitem p0);
    
    int insertSelective(Orderitem p0);
    
    List<Orderitem> selectByExample(OrderitemExample p0);
    
    Orderitem selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Orderitem p0, @Param("example") OrderitemExample p1);
    
    int updateByExample(@Param("record") Orderitem p0, @Param("example") OrderitemExample p1);
    
    int updateByPrimaryKeySelective(Orderitem p0);
    
    int updateByPrimaryKey(Orderitem p0);
}
