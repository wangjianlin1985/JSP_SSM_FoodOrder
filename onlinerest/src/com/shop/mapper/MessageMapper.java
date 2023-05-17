// 
// 
// 

package com.shop.mapper;

import java.util.List;
import com.shop.po.Message;

public interface MessageMapper
{
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Message p0);
    
    int insertSelective(Message p0);
    
    int countAllMessage();
    
    List<Message> findAllMessageByPage(int p0, int p1);
}
