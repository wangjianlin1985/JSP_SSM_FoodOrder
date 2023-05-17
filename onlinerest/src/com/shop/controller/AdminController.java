// 
// 
// 

package com.shop.controller;

import com.shop.po.Message;
import com.shop.po.Orders;
import java.io.File;
import com.shop.Utils.UUIDUtiils;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.springframework.web.multipart.MultipartFile;
import com.shop.po.Product;
import com.shop.po.Categorysecond;
import com.shop.Utils.PageBean;
import org.springframework.web.bind.annotation.RequestParam;
import com.shop.po.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import com.shop.po.User;
import java.util.List;
import com.shop.po.Adminuser;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import com.shop.service.MessageService;
import com.shop.service.OrderService;
import com.shop.service.ProductService;
import com.shop.service.CategorySecondService;
import com.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController
{
    @Autowired
    private UserService userService;
    @Autowired
    public CategoryService categoryService;
    @Autowired
    public CategorySecondService categorySecondService;
    @Autowired
    public ProductService productService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private MessageService messageService;
    
    @RequestMapping({ "/admin/admin_findAll" })
    public String admin_findAll(final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final List<User> userList = this.userService.admin_findAll();
        model.addAttribute("userList", (Object)userList);
        return "admin/user/list";
    }
    
    @RequestMapping({ "/admin/adminCategory_findAll" })
    public String adminCategory_findAll(final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final List<Category> categoryList = this.categoryService.adminbFindCategory();
        model.addAttribute("categoryList", (Object)categoryList);
        return "admin/category/list";
    }
    
    @RequestMapping({ "/admin/adminCategory_add" })
    public String adminCategory_add(final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        return "admin/category/add";
    }
    
    @RequestMapping({ "/admin/adminCategory_save" })
    public String adminCategory_save(@RequestParam final String cname, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Category addCategory = new Category();
        addCategory.setCname(cname);
        this.categoryService.addCategory(addCategory);
        return "redirect:/admin/adminCategory_findAll.action";
    }
    
    @RequestMapping({ "/admin/adminCategory_edit" })
    public String adminCategory_delete(@RequestParam final int cid, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Category existCategory = this.categoryService.findCategory(cid);
        model.addAttribute("existCategory", (Object)existCategory);
        return "admin/category/edit";
    }
    
    @RequestMapping({ "/admin/adminCategory_update" })
    public String adminCategory_update(@RequestParam final int cid, @RequestParam final String cname, final HttpServletRequest request) {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Category category = new Category();
        category.setCid(cid);
        category.setCname(cname);
        this.categoryService.adminCategory_update(category);
        return "redirect:/admin/adminCategory_findAll.action";
    }
    
    @RequestMapping({ "/admin/adminCategory_delete" })
    public String adminCategory_delete(@RequestParam final int cid, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        this.categorySecondService.adminCategorySecond_deleteByCid(cid);
        this.categoryService.deleteCategoryByCid(cid);
        return "redirect:/admin/adminCategory_findAll.action";
    }
    
    @RequestMapping({ "/admin/adminCategorySecond_findAllByPage" })
    public String adminCategorySecond_findAllByPage(@RequestParam final int page, final Model model, final HttpServletRequest request) {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final PageBean<Categorysecond> csPageBean = this.categorySecondService.adminCategorySecond_findAllByPage(page);
        model.addAttribute("csPageBean", (Object)csPageBean);
        return "admin/categorysecond/list";
    }
    
    @RequestMapping({ "admin/adminCategorySecond_addPage" })
    public String adminCategorySecond_addPage(final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final List<Category> categoryList = this.categoryService.adminbFindCategory();
        model.addAttribute("categoryList", (Object)categoryList);
        return "admin/categorysecond/add";
    }
    
    @RequestMapping({ "admin/adminCategorySecond_save" })
    public String adminCategorySecond_save(@RequestParam final String csname, @RequestParam final int cid, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Categorysecond categorysecond = new Categorysecond();
        categorysecond.setCsname(csname);
        categorysecond.setCid(cid);
        this.categorySecondService.adminCategorySecond_save(categorysecond);
        return "redirect:/admin/adminCategorySecond_findAllByPage.action?page=1";
    }
    
    @RequestMapping({ "admin/adminCategorySecond_edit" })
    public String adminCategorySecond_edit(@RequestParam final int csid, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Categorysecond findByCsid = this.categorySecondService.findByCsid(csid);
        model.addAttribute("findByCsid", (Object)findByCsid);
        return "admin/categorysecond/edit";
    }
    
    @RequestMapping({ "admin/adminCategorySecond_update" })
    public String adminCategorySecond_update(@RequestParam final String csname, @RequestParam final int csid, final HttpServletRequest request) {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Categorysecond categorysecond = new Categorysecond();
        categorysecond.setCsname(csname);
        categorysecond.setCsid(csid);
        this.categorySecondService.adminCategorySecond_update(categorysecond);
        return "redirect:/admin/adminCategorySecond_findAllByPage.action?page=1";
    }
    
    @RequestMapping({ "admin/adminCategorySecond_delete" })
    public String adminCategorySecond_delete(@RequestParam final int csid, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        this.categorySecondService.adminCategorySecond_delete(csid);
        return "redirect:/admin/adminCategorySecond_findAllByPage.action?page=1";
    }
    
    @RequestMapping({ "/admin/adminProduct_findAllByPage" })
    public String adminProduct_findAllByPage(@RequestParam final int page, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final PageBean<Product> allProPageBean = this.productService.findAllProduct(page);
        model.addAttribute("allProPageBean", (Object)allProPageBean);
        return "admin/product/list";
    }
    
    @RequestMapping({ "/admin/adminProduct_addPage" })
    public String adminProduct_addPage(final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final List<Categorysecond> cslist = this.categorySecondService.findAll();
        model.addAttribute("cslist", (Object)cslist);
        return "admin/product/add";
    }
    
    @RequestMapping({ "/admin/adminProduct_save" })
    public String adminProduct_save(final Product product, final HttpServletRequest request, final MultipartFile file) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        final String today = sdf.format(new Date());
        product.setPdate(sdf.parse(today));
        if (file != null) {
            final String path = request.getServletContext().getRealPath("/products");
            final String uploadFileName = file.getOriginalFilename();
            final String fileName = String.valueOf(UUIDUtiils.getUUID()) + uploadFileName;
            final File diskFile = new File(String.valueOf(path) + "//" + fileName);
            file.transferTo(diskFile);
            product.setImage("products/" + fileName);
        }
        System.out.println(product.getImage());
        this.productService.adminProduct_save(product);
        return "redirect:/admin/adminProduct_findAllByPage.action?page=1";
    }
    
    @RequestMapping({ "admin/adminProduct_deletecs" })
    public String adminProduct_deletecs(@RequestParam final int pid, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        this.productService.adminProduct_deletecs(pid);
        return "redirect:/admin/adminProduct_findAllByPage.action?page=1";
    }
    
    @RequestMapping({ "admin/adminProduct_edit" })
    public String adminProduct_edit(@RequestParam final int pid, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Product product = this.productService.finbProductByPid(pid);
        model.addAttribute("findByPid", (Object)product);
        final List<Categorysecond> cslist = this.categorySecondService.findAll();
        model.addAttribute("cslist", (Object)cslist);
        return "admin/product/edit";
    }
    
    @RequestMapping({ "/admin/adminProduct_update" })
    public String adminProduct_update(final Product product, final HttpServletRequest request, final MultipartFile file) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        product.setPdate(new Date());
        if (file != null) {
            final String path = request.getServletContext().getRealPath("/products");
            final String uploadFileName = file.getOriginalFilename();
            final String fileName = String.valueOf(UUIDUtiils.getUUID()) + uploadFileName;
            final File diskFile = new File(String.valueOf(path) + "//" + fileName);
            file.transferTo(diskFile);
            product.setImage("products/" + fileName);
        }
        this.productService.adminProduct_update(product);
        return "redirect:/admin/adminProduct_findAllByPage.action?page=1";
    }
    
    @RequestMapping({ "/admin/adminOrder_findAllByPage" })
    public String adminOrder_findAllByPage(@RequestParam final int page, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final PageBean<Orders> allProPageBean = this.orderService.findAllOrderByStateAndPage(page);
        model.addAttribute("pageBean", (Object)allProPageBean);
        return "admin/order/list";
    }
    
    @RequestMapping({ "/admin/adminOrder_findByState" })
    public String adminOrder_findByState(@RequestParam final int page, @RequestParam final int state, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final PageBean<Orders> allProPageBean = this.orderService.findAllOrderByStateAndPage(state, page);
        model.addAttribute("pageBean", (Object)allProPageBean);
        return "admin/order/list";
    }
    
    @RequestMapping({ "/admin/adminOrder_findOrderItem" })
    public String adminOrder_findOrderItem(@RequestParam final int oid, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final Orders orderItems = this.orderService.findOrderByOid(oid);
        model.addAttribute("orderItems", (Object)orderItems);
        return "admin/order/list";
    }
    
    @RequestMapping({ "/admin/adminOrder_updateState" })
    public String adminOrder_updateState(@RequestParam final int oid, @RequestParam final int status, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        this.orderService.updateOrderStatus(oid, status);
        return "redirect:/admin/adminOrder_findAllByPage.action?page=1";
    }
    
    @RequestMapping({ "/admin/adminMessage_findAllByPage" })
    public String adminMessage_findAllByPage(@RequestParam final int page, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        final PageBean<Message> pageBean = this.messageService.findAllMessageByPage(page);
        model.addAttribute("pageBean", (Object)pageBean);
        return "admin/message/list";
    }
    
    @RequestMapping({ "/admin/adminMessage_delete" })
    public String adminOrder_updateState(@RequestParam final int messageid, final Model model, final HttpServletRequest request) throws Exception {
        final Adminuser adminuserLogin = (Adminuser)request.getSession().getAttribute("adminuserLogin");
        if (adminuserLogin == null) {
            request.getSession().setAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "admin/index";
        }
        this.messageService.deleteMessage(messageid);
        return "redirect:/admin/adminMessage_findAllByPage.action?page=1";
    }
}
