// 
// 
// 

package com.shop.serviceImpl;

import java.util.List;
import com.shop.Utils.PageBean;
import com.shop.po.Message;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.mapper.MessageMapper;
import com.shop.service.MessageService;

public class MessageServiceImpl implements MessageService
{
    @Autowired
    private MessageMapper messagesMapper;
    
    @Override
    public void insertMessage(final Message messages) throws Exception {
        this.messagesMapper.insert(messages);
    }
    
    @Override
    public PageBean<Message> findAllMessageByPage(final int page) throws Exception {
        final PageBean<Message> pageBean = new PageBean<Message>();
        pageBean.setPage(page);
        final int limitPage = 4;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        totlePage = this.messagesMapper.countAllMessage();
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final List<Message> list = this.messagesMapper.findAllMessageByPage(beginPage, limitPage);
        pageBean.setList(list);
        return pageBean;
    }
    
    @Override
    public void deleteMessage(final int messageid) throws Exception {
        this.messagesMapper.deleteByPrimaryKey(messageid);
    }
}
