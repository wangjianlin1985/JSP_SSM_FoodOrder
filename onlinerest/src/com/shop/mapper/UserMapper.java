// 
// 
// 

package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shop.po.User;
import com.shop.po.UserExample;

public interface UserMapper
{
    int countByExample(UserExample p0);
    
    int deleteByExample(UserExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(User p0);
    
    int insertSelective(User p0);
    
    List<User> selectByExample(UserExample p0);
    
    User selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") User p0, @Param("example") UserExample p1);
    
    int updateByExample(@Param("record") User p0, @Param("example") UserExample p1);
    
    int updateByPrimaryKeySelective(User p0);
    
    int updateByPrimaryKey(User p0);
}
