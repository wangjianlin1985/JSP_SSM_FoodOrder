// 
// 
// 

package com.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.shop.po.User;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class ajaxController
{
    @Autowired
    private UserService userService;
    
    @RequestMapping({ "/loginFindByid" })
    public void loginFindByid(final HttpServletRequest request, final HttpServletResponse response, @RequestParam final String username) {
        response.setContentType("text/html;charset=UTF-8");
        try {
            final User user = this.userService.loginFindByid(username);
            if (user != null) {
                response.getWriter().write("\u53ef\u4ee5\u767b\u5f55");
            }
            else {
                response.getWriter().write("\u4e0d\u53ef\u4ee5\u767b\u5f55");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @RequestMapping({ "/registFindByid" })
    public void registFindByid(final HttpServletRequest request, final HttpServletResponse response, @RequestParam final String username) {
        response.setContentType("text/html;charset=UTF-8");
        try {
            final User user = this.userService.loginFindByid(username);
            if (user != null) {
                response.getWriter().write("\u5df2\u7ecf\u88ab\u6ce8\u518c");
            }
            else {
                response.getWriter().write("\u53ef\u4ee5\u6ce8\u518c");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
