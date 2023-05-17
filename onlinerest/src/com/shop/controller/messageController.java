// 
// 
// 

package com.shop.controller;

import com.shop.Utils.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.shop.po.User;
import com.shop.po.Message;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.service.MessageService;
import org.springframework.stereotype.Controller;

@Controller
public class messageController
{
    @Autowired
    private MessageService messageService;
    
    @RequestMapping({ "/saveMessage" })
    public String saveMessage(@RequestParam final String messageinfo, final HttpServletRequest request, final Model model) throws Exception {
        final Message Message = new Message();
        final User loginUser = (User)request.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            model.addAttribute("message", (Object)"\u5bf9\u4e0d\u8d77\u60a8\u8fd8\u6ca1\u6709\u767b\u5f55");
            return "msg";
        }
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Message.setMessage(messageinfo);
        Message.setUid(loginUser.getUid());
        Message.setMessagedate(sdf.format(new Date()));
        this.messageService.insertMessage(Message);
        request.getSession().setAttribute("Message", (Object)Message);
        return "redirect:/messageList.action?page=1";
    }
    
    @RequestMapping({ "/messageList" })
    public String messageList(@RequestParam final int page, final Model model, final HttpServletRequest request) throws Exception {
        final PageBean<Message> pageBean = this.messageService.findAllMessageByPage(page);
        model.addAttribute("pageBean", (Object)pageBean);
        return "messageList";
    }
}
