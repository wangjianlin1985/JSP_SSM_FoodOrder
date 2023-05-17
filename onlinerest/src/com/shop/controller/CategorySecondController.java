// 
// 
// 

package com.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.shop.po.Product;
import com.shop.Utils.PageBean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class CategorySecondController
{
    @Autowired
    private ProductService productService;
    
    @RequestMapping({ "/findCategorySecond" })
    public String findCategorySecond(final HttpServletRequest request, @RequestParam final int cid, final Model model, @RequestParam final int page) throws Exception {
        request.getSession().setAttribute("cid", (Object)cid);
        final PageBean<Product> proPageBean = this.productService.findProductyBycid(cid, page);
        model.addAttribute("pageBean", (Object)proPageBean);
        return "category";
    }
    
    @RequestMapping({ "/findCategorySecond1" })
    public String findCategorySecond1(@RequestParam final int csid, final Model model, @RequestParam final int page) {
        final PageBean<Product> proPageBean = this.productService.finbProductByCsid(csid, page);
        model.addAttribute("pageBean", (Object)proPageBean);
        return "category";
    }
}
