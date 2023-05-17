// 
// 
// 

package com.shop.controller;

import com.shop.po.User;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shop.po.Cart;
import com.shop.po.Product;
import com.shop.po.CartItem;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class cartController
{
    @Autowired
    private ProductService productService;
    
    @RequestMapping({ "/addCart" })
    public String addCart(final HttpServletRequest request, @RequestParam final int pid, @RequestParam final int count, final Model model) {
        final Product product = this.productService.finbProductByPid(pid);
        final CartItem cartItem = new CartItem();
        cartItem.setCount(count);
        cartItem.setProduct(product);
        cartItem.setSubtotle(count * product.getShopPrice());
        final Cart cart = this.getCart(request);
        cart.addCart(cartItem);
        return "cart";
    }
    
    @RequestMapping({ "/myCart" })
    public String myCart(final HttpServletRequest request, final Model model) {
        final User loginUser = (User)request.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            model.addAttribute("message", (Object)"\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55\uff01");
            return "msg";
        }
        return "cart";
    }
    
    @RequestMapping({ "/clearCart" })
    public String clearCart(final HttpServletRequest request) {
        final Cart cart = this.getCart(request);
        cart.clearCart();
        return "redirect:myCart.action";
    }
    
    @RequestMapping({ "/delProFromCart" })
    public String delProFromCart(@RequestParam final int pid, final HttpServletRequest request) {
        final Cart cart = this.getCart(request);
        cart.delProFromCart(pid);
        return "redirect:myCart.action";
    }
    
    public Cart getCart(final HttpServletRequest request) {
        Cart cart = (Cart)request.getSession().getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            request.getSession().setAttribute("cart", (Object)cart);
        }
        return cart;
    }
}
