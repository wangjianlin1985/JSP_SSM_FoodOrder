// 
// 
// 

package com.shop.serviceImpl;

import com.shop.po.AdminuserExample;
import com.shop.po.Adminuser;
import com.shop.Utils.MailUtils;
import com.shop.Utils.UUIDUtiils;
import java.util.List;
import com.shop.po.UserExample;
import com.shop.po.User;
import com.shop.mapper.AdminuserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.mapper.UserMapper;
import com.shop.service.UserService;

public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AdminuserMapper adminuserMapper;
    
    @Override
    public User loginFindByid(final String username) throws Exception {
        final UserExample example = new UserExample();
        final UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        final List<User> list = this.userMapper.selectByExample(example);
        if (list.size() > 0 && list != null) {
            return list.get(0);
        }
        return null;
    }
    
    @Override
    public void saveUser(final User user) throws Exception {
        user.setState(0);
        user.setCode(UUIDUtiils.getUUID());
        final int i = this.userMapper.insert(user);
        System.out.println(i);
        final String emailMsg = "\u8bf7\u6fc0\u6d3b<a href='http://localhost:8080/onlinerest/activeUser.action?code=" + user.getCode() + "'>\u6fc0\u6d3b</a>\u6fc0\u6d3b\u7801\u662f\uff1a + user.getCode()";
        try {
            MailUtils.sendMail(user.getEmail(), emailMsg);
        }
        catch (Exception ex) {}
    }
    
    @Override
    public User findByCode(final String code) throws Exception {
        final UserExample example = new UserExample();
        final UserExample.Criteria criteria = example.createCriteria();
        criteria.andCodeEqualTo(code);
        final List<User> list = this.userMapper.selectByExample(example);
        if (list.size() > 0 && list != null) {
            return list.get(0);
        }
        return null;
    }
    
    @Override
    public void activeUser(final User activeUser) throws Exception {
        this.userMapper.updateByPrimaryKeySelective(activeUser);
    }
    
    @Override
    public User loginFindByUnameAndPwd(final String username, final String password) throws Exception {
        final UserExample example = new UserExample();
        final UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        final List<User> list = this.userMapper.selectByExample(example);
        if (list.size() > 0 && list != null) {
            return list.get(0);
        }
        return null;
    }
    
    @Override
    public Adminuser adminUser_login(final String username, final String password) throws Exception {
        final AdminuserExample example = new AdminuserExample();
        final AdminuserExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andUsernameEqualTo(username);
        createCriteria.andPasswordEqualTo(password);
        final List<Adminuser> list = this.adminuserMapper.selectByExample(example);
        if (list.size() > 0 && list != null) {
            return list.get(0);
        }
        return null;
    }
    
    @Override
    public List<User> admin_findAll() throws Exception {
        final UserExample example = new UserExample();
        return this.userMapper.selectByExample(example);
    }
}
