// 
// 
// 

package com.shop.controller;

import com.shop.po.Adminuser;
import javax.servlet.http.HttpServletResponse;
import com.shop.exception.zdyException;
import org.springframework.ui.Model;
import com.shop.po.User;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class loginController
{
    @Autowired
    private UserService userService;
    
    @RequestMapping({ "login" })
    public String login() {
        return "login";
    }
    
    @RequestMapping({ "/userLogin" })
    public String userLogin(final HttpServletRequest request, @RequestParam final String checkImg, final User user, final Model model) throws zdyException, Exception {
        final String sessionCode = (String)request.getSession().getAttribute("checkcode");
        if (!sessionCode.equalsIgnoreCase(checkImg)) {
            request.getSession().setAttribute("message", (Object)"\u9a8c\u8bc1\u7801\u8f93\u5165\u9519\u8bef\u8bf7\u91cd\u65b0\u6ce8\u518c");
            return "redirect:login.action";
        }
        final User loginUser = this.userService.loginFindByUnameAndPwd(user.getUsername(), user.getPassword());
        if (loginUser == null) {
            request.getSession().setAttribute("message", (Object)"\u5bc6\u7801\u8f93\u5165\u9519\u8bef\u8bf7\u91cd\u65b0\u767b\u9646");
            return "redirect:login.action";
        }
        request.getSession().setAttribute("loginUser", (Object)loginUser);
        request.getSession().removeAttribute("message");
        return "redirect:index.action";
    }
    
    @RequestMapping({ "userLogout" })
    public String userLogout(final HttpServletRequest request, final HttpServletResponse response, final Model model) {
        request.getSession().removeAttribute("loginUser");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setHeader("refresh", "5;url=/shop/index.action");
        model.addAttribute("message", (Object)"\u9000\u51fa\u6210\u529f\uff0c\u7cfb\u7edf\u5c06\u57285\u79d2\u4e4b\u540e\u8df3\u8f6c\u5230\u9996\u9875......");
        return "msg";
    }
    
    @RequestMapping({ "/admin" })
    public String AdminIndex() {
        return "admin/index";
    }
    
    @RequestMapping({ "/admin/adminUser_login" })
    public String adminUser_login(final HttpServletRequest request, final Model model, @RequestParam final String username, @RequestParam final String password) throws Exception {
        final Adminuser adminuserLogin = this.userService.adminUser_login(username, password);
        System.out.println(username);
        System.out.println(password);
        if (adminuserLogin == null) {
            model.addAttribute("message", (Object)"\u6539\u7528\u6237\u672a\u88ab\u6388\u4e88\u7ba1\u7406\u5458\u8eab\u4efd\uff01");
            return "admin/index";
        }
        request.getSession().setAttribute("adminuserLogin", (Object)adminuserLogin);
        return "admin/home";
    }
}
