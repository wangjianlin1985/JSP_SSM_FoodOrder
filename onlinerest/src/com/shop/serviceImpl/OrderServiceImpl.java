// 
// 
// 

package com.shop.serviceImpl;

import java.util.List;
import com.shop.Utils.PageBean;
import com.shop.po.Orderitem;
import com.shop.po.Orders;
import com.shop.mapper.OrderitemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.mapper.OrdersMapper;
import com.shop.service.OrderService;

public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderitemMapper orderitemMapper;
    
    @Override
    public void toOrder(final Orders orders) throws Exception {
        this.ordersMapper.insert(orders);
    }
    
    @Override
    public void toOrderItem(final Orderitem orderitem) throws Exception {
        this.orderitemMapper.insert(orderitem);
    }
    
    @Override
    public void payOrder(final Orders orders) throws Exception {
        final Orders payOrder = this.ordersMapper.selectByPrimaryKey(orders.getOid());
        if (orders.getReceiveinfo() != null && orders.getPhonum() != null) {
            payOrder.setPhonum(orders.getPhonum());
            payOrder.setReceiveinfo(orders.getReceiveinfo());
            payOrder.setAccepter(orders.getAccepter());
            payOrder.setState(1);
        }
        this.ordersMapper.updateByPrimaryKeySelective(payOrder);
    }
    
    @Override
    public PageBean<Orders> findOrderByUidAndPage(final int page, final Integer uid) throws Exception {
        final PageBean<Orders> pageBean = new PageBean<Orders>();
        pageBean.setPage(page);
        final int limitPage = 4;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        totlePage = this.ordersMapper.countOrdersByUid(uid);
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final List<Orders> list = this.ordersMapper.findOrderByUidAndPage(uid, beginPage, limitPage);
        pageBean.setList(list);
        return pageBean;
    }
    
    @Override
    public Orders findOrderByOid(final int oid) {
        return this.ordersMapper.selectByPrimaryKey(oid);
    }
    
    @Override
    public PageBean<Orders> findAllOrderByStateAndPage(final int page) throws Exception {
        final PageBean<Orders> pageBean = new PageBean<Orders>();
        pageBean.setPage(page);
        final int limitPage = 4;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        totlePage = this.ordersMapper.countAllOrders();
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final List<Orders> list = this.ordersMapper.findAllOrderByPage(beginPage, limitPage);
        pageBean.setList(list);
        return pageBean;
    }
    
    @Override
    public void updateOrderStatus(final int oid, final int status) throws Exception {
        final Orders payOrder = this.ordersMapper.selectByPrimaryKey(oid);
        payOrder.setState(status);
        this.ordersMapper.updateByPrimaryKeySelective(payOrder);
    }
    
    @Override
    public PageBean<Orders> findAllOrderByStateAndPage(final int state, final int page) throws Exception {
        final PageBean<Orders> pageBean = new PageBean<Orders>();
        pageBean.setPage(page);
        final int limitPage = 4;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        totlePage = this.ordersMapper.countOrdersByState(state);
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final List<Orders> list = this.ordersMapper.findAllOrderByStateAndPage(state, beginPage, limitPage);
        pageBean.setList(list);
        return pageBean;
    }
}
