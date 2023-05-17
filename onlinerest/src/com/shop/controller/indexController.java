// 
// 
// 

package com.shop.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shop.po.Category;
import java.util.List;
import com.shop.po.Product;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.CategoryService;
import org.springframework.stereotype.Controller;

@Controller
public class indexController
{
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    
    @RequestMapping({ "/index" })
    public String index(final Model model, final HttpServletRequest request) throws Exception {
        final List<Category> cList = this.categoryService.findCategory();
        request.getSession().getServletContext().setAttribute("cList", (Object)cList);
        final List<Product> hList = this.productService.findHotProduct();
        model.addAttribute("hList", (Object)hList);
        final List<Product> nList = this.productService.findNewProduct();
        model.addAttribute("nList", (Object)nList);
        if (hList.size() > 3) {
            final List<Product> sList = new ArrayList<Product>();
            sList.add(hList.get(0));
            sList.add(hList.get(1));
            sList.add(hList.get(2));
            model.addAttribute("sList", (Object)sList);
        }
        else {
            model.addAttribute("sList", (Object)hList);
        }
        return "index";
    }
    
    @RequestMapping({ "/about" })
    public String about(final Model model, final HttpServletRequest request) throws Exception {
        return "about";
    }
    
    @RequestMapping({ "/contact" })
    public String contact(final Model model, final HttpServletRequest request) throws Exception {
        return "contact";
    }
    
    @RequestMapping({ "/delivery" })
    public String delivery(final Model model, final HttpServletRequest request) throws Exception {
        return "delivery";
    }
    
    @RequestMapping({ "/searchProduct" })
    public String searchProduct(@RequestParam final String condition, final Model model, final HttpServletRequest request) throws Exception {
        final List<Category> cList = this.categoryService.findCategory();
        request.getSession().getServletContext().setAttribute("cList", (Object)cList);
        final List<Product> hList = this.productService.findHotProduct();
        model.addAttribute("hList", (Object)hList);
        final List<Product> srList = this.productService.searchProduct(condition);
        model.addAttribute("srList", (Object)srList);
        if (hList.size() > 3) {
            final List<Product> sList = new ArrayList<Product>();
            sList.add(hList.get(0));
            sList.add(hList.get(1));
            sList.add(hList.get(2));
            model.addAttribute("sList", (Object)sList);
        }
        else {
            model.addAttribute("sList", (Object)hList);
        }
        return "searchProduct";
    }
}
