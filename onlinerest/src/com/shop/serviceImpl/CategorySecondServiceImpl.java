// 
// 
// 

package com.shop.serviceImpl;

import java.util.List;
import com.shop.po.CategorysecondExample;
import com.shop.po.Categorysecond;
import com.shop.Utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.mapper.CategorysecondMapper;
import com.shop.service.CategorySecondService;

public class CategorySecondServiceImpl implements CategorySecondService
{
    @Autowired
    private CategorysecondMapper categorysecondMapper;
    
    @Override
    public PageBean<Categorysecond> adminCategorySecond_findAllByPage(final int page) {
        final PageBean<Categorysecond> pageBean = new PageBean<Categorysecond>();
        pageBean.setPage(page);
        final int limitPage = 10;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        final CategorysecondExample example = new CategorysecondExample();
        totlePage = this.categorysecondMapper.countByExample(example);
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final CategorysecondExample csexample = new CategorysecondExample();
        csexample.setBeginPage(beginPage);
        csexample.setLimitPage(limitPage);
        final List<Categorysecond> list = this.categorysecondMapper.selectByExample(csexample);
        pageBean.setList(list);
        return pageBean;
    }
    
    @Override
    public void adminCategorySecond_save(final Categorysecond categorysecond) throws Exception {
        this.categorysecondMapper.insert(categorysecond);
    }
    
    @Override
    public Categorysecond findByCsid(final int csid) throws Exception {
        return this.categorysecondMapper.selectByPrimaryKey(csid);
    }
    
    @Override
    public void adminCategorySecond_update(final Categorysecond categorysecond) {
        this.categorysecondMapper.updateByPrimaryKey(categorysecond);
    }
    
    @Override
    public void adminCategorySecond_delete(final int csid) {
        this.categorysecondMapper.deleteByPrimaryKey(csid);
    }
    
    @Override
    public List<Categorysecond> findAll() throws Exception {
        return this.categorysecondMapper.selectByExample1();
    }
    
    @Override
    public void adminCategorySecond_deleteByCid(final int cid) throws Exception {
        final CategorysecondExample example = new CategorysecondExample();
        final CategorysecondExample.Criteria createCriteria = example.createCriteria();
        createCriteria.andCidEqualTo(cid);
        this.categorysecondMapper.deleteByExample(example);
    }
}
