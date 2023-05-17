// 
// 
// 

package com.shop.service;

import com.shop.Utils.PageBean;
import com.shop.po.Message;

public interface MessageService
{
    void insertMessage(Message p0) throws Exception;
    
    void deleteMessage(int p0) throws Exception;
    
    PageBean<Message> findAllMessageByPage(int p0) throws Exception;
}
