// 
// 
// 

package com.shop.controller;

import com.shop.Utils.PageBean;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Iterator;
import com.shop.po.Orderitem;
import com.shop.po.CartItem;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.shop.po.User;
import com.shop.po.Cart;
import com.shop.po.Orders;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.OrderService;
import org.springframework.stereotype.Controller;

@Controller
public class orderController
{
    @Autowired
    private OrderService orderService;
    
    @RequestMapping({ "/toOrder" })
    public String toOrder(final HttpServletRequest request, final Model model) throws Exception {
        final Orders orders = new Orders();
        final Cart cart = (Cart)request.getSession().getAttribute("cart");
        final User loginUser = (User)request.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            model.addAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "msg";
        }
        orders.setState(0);
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        final String today = sdf.format(new Date());
        orders.setOrderTime(sdf.parse(today));
        orders.setUid(loginUser.getUid());
        orders.setMoney(cart.getTotale());
        this.orderService.toOrder(orders);
        final Map<Integer, CartItem> cartItems = cart.getCartItem();
        for (final Map.Entry<Integer, CartItem> entry : cartItems.entrySet()) {
            final CartItem cartItem = entry.getValue();
            final Orderitem orderitem = new Orderitem();
            orderitem.setProduct(cartItem.getProduct());
            orderitem.setCount(cartItem.getCount());
            orderitem.setPid(cartItem.getProduct().getPid());
            orderitem.setSubtotal(cartItem.getSubtotle());
            orderitem.setOid(orders.getOid());
            orders.getOiList().add(orderitem);
            this.orderService.toOrderItem(orderitem);
        }
        cart.clearCart();
        request.getSession().setAttribute("orders", (Object)orders);
        return "order";
    }
    
    @RequestMapping({ "/payOrder" })
    public String payOrder(final Orders orders, @RequestParam final String receiveInfo, @RequestParam final String phoNum, @RequestParam final String accepter) throws Exception {
        orders.setReceiveinfo(receiveInfo);
        orders.setPhonum(phoNum);
        orders.setAccepter(accepter);
        this.orderService.payOrder(orders);
        return "redirect:myOrder.action?page=1";
    }
    
    @RequestMapping({ "/payOrderAganin" })
    public String payOrderAganin(@RequestParam final int oid, final HttpServletRequest request) {
        final Orders noPayOrder = this.orderService.findOrderByOid(oid);
        request.getSession().setAttribute("orders", (Object)noPayOrder);
        return "order";
    }
    
    @RequestMapping({ "/myOrder" })
    public String myOrder(@RequestParam final int page, final Model model, final HttpServletRequest request) throws Exception {
        final User loginUser = (User)request.getSession().getAttribute("loginUser");
        final PageBean<Orders> pageBean = this.orderService.findOrderByUidAndPage(page, loginUser.getUid());
        model.addAttribute("pageBean", (Object)pageBean);
        return "orderList";
    }
    
    @RequestMapping({ "/updateState" })
    public String updateState(@RequestParam final int oid) throws Exception {
        this.orderService.updateOrderStatus(oid, 3);
        return "redirect:myOrder.action?page=1";
    }
}
