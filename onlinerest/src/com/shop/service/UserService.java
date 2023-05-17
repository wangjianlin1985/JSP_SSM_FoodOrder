// 
// 
// 

package com.shop.service;

import java.util.List;
import com.shop.po.Adminuser;
import com.shop.po.User;

public interface UserService
{
    User loginFindByid(String p0) throws Exception;
    
    void saveUser(User p0) throws Exception;
    
    User findByCode(String p0) throws Exception;
    
    void activeUser(User p0) throws Exception;
    
    User loginFindByUnameAndPwd(String p0, String p1) throws Exception;
    
    Adminuser adminUser_login(String p0, String p1) throws Exception;
    
    List<User> admin_findAll() throws Exception;
}
