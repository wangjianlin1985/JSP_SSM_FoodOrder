// 
// 
// 

package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shop.po.Adminuser;
import com.shop.po.AdminuserExample;

public interface AdminuserMapper
{
    int countByExample(AdminuserExample p0);
    
    int deleteByExample(AdminuserExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Adminuser p0);
    
    int insertSelective(Adminuser p0);
    
    List<Adminuser> selectByExample(AdminuserExample p0);
    
    Adminuser selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Adminuser p0, @Param("example") AdminuserExample p1);
    
    int updateByExample(@Param("record") Adminuser p0, @Param("example") AdminuserExample p1);
    
    int updateByPrimaryKeySelective(Adminuser p0);
    
    int updateByPrimaryKey(Adminuser p0);
}
