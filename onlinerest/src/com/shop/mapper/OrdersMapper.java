// 
// 
// 

package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shop.po.Orders;
import com.shop.po.OrdersExample;

public interface OrdersMapper
{
    int countByExample(OrdersExample p0);
    
    int deleteByExample(OrdersExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Orders p0);
    
    int insertSelective(Orders p0);
    
    List<Orders> selectByExample(OrdersExample p0);
    
    Orders selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Orders p0, @Param("example") OrdersExample p1);
    
    int updateByExample(@Param("record") Orders p0, @Param("example") OrdersExample p1);
    
    int updateByPrimaryKeySelective(Orders p0);
    
    int updateByPrimaryKey(Orders p0);
    
    int countOrdersByUid(Integer p0);
    
    int countOrdersByState(Integer p0);
    
    int countAllOrders();
    
    List<Orders> findOrderByUidAndPage(Integer p0, int p1, int p2);
    
    List<Orders> findAllOrderByPage(int p0, int p1);
    
    List<Orders> findAllOrderByStateAndPage(int p0, int p1, int p2);
}
