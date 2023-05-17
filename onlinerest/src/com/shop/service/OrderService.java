// 
// 
// 

package com.shop.service;

import com.shop.Utils.PageBean;
import com.shop.po.Orderitem;
import com.shop.po.Orders;

public interface OrderService
{
    void toOrder(Orders p0) throws Exception;
    
    void toOrderItem(Orderitem p0) throws Exception;
    
    void payOrder(Orders p0) throws Exception;
    
    PageBean<Orders> findOrderByUidAndPage(int p0, Integer p1) throws Exception;
    
    Orders findOrderByOid(int p0);
    
    PageBean<Orders> findAllOrderByStateAndPage(int p0) throws Exception;
    
    void updateOrderStatus(int p0, int p1) throws Exception;
    
    PageBean<Orders> findAllOrderByStateAndPage(int p0, int p1) throws Exception;
}
