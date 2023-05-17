// 
// 
// 

package com.shop.controller;

import java.util.Iterator;
import java.util.List;
import com.shop.exception.zdyException;
import org.springframework.validation.ObjectError;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import com.shop.po.User;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class registController
{
    @Autowired
    private UserService userService;
    
    @RequestMapping({ "regist" })
    public String regist() {
        return "regist";
    }
    
    @RequestMapping({ "/userRegist" })
    public String userRegist(final Model model, final HttpServletRequest request, @Validated final User user, final BindingResult bindingResult, @RequestParam final String checkImg) throws Exception {
        if (bindingResult.hasErrors()) {
            final List<ObjectError> errors = (List<ObjectError>)bindingResult.getAllErrors();
            final List<String> list = new ArrayList<String>();
            for (final ObjectError objectError : errors) {
                final String str = new String(objectError.getDefaultMessage().getBytes("ISO-8859-1"), "gbk");
                list.add(str);
            }
            model.addAttribute("errors", (Object)list);
            return "regist";
        }
        final String sessionCode = (String)request.getSession().getAttribute("checkcode");
        if (!sessionCode.equalsIgnoreCase(checkImg)) {
            throw new zdyException("\u9a8c\u8bc1\u7801\u9519\u8bef\u8bf7\u91cd\u65b0\u6ce8\u518c");
        }
        this.userService.saveUser(user);
        model.addAttribute("message", (Object)"\u6ce8\u518c\u6210\u529f\u8bf7\u767b\u5f55");
        return "msg";
    }
    
    @RequestMapping({ "/activeUser" })
    public String activeUser(@RequestParam final String code, final Model model) throws zdyException, Exception {
        final User activeUser = this.userService.findByCode(code);
        if (activeUser == null) {
            throw new zdyException("\u6fc0\u6d3b\u7801\u88ab\u7be1\u6539\u4e86,\u8bf7\u91cd\u65b0\u6ce8\u518c");
        }
        activeUser.setState(1);
        activeUser.setCode(null);
        this.userService.activeUser(activeUser);
        model.addAttribute("message", (Object)"\u6fc0\u6d3b\u7801\u6210\u529f");
        return "msg";
    }
}
