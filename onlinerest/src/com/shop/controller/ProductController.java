// 
// 
// 

package com.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.shop.po.Product;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController
{
    @Autowired
    private ProductService prodcutService;
    
    @RequestMapping({ "/productFindByPid" })
    public String productFindByPid(@RequestParam final int pid, final Model model) throws Exception {
        final Product product = this.prodcutService.productFindByPid(pid);
        model.addAttribute("product", (Object)product);
        return "product";
    }
}
