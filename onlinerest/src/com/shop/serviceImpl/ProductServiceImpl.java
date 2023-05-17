// 
// 
// 

package com.shop.serviceImpl;

import java.util.Date;
import com.shop.Utils.PageBean;
import com.shop.po.ProductExample;
import com.shop.po.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.mapper.ProductMapper;
import com.shop.service.ProductService;

public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductMapper productMapper;
    
    @Override
    public List<Product> findHotProduct() throws Exception {
        final ProductExample example = new ProductExample();
        final ProductExample.Criteria criteria = example.createCriteria();
        criteria.andIsHotEqualTo(1);
        example.setOrderByClause("pdate DESC");
        example.setBeginPage(0);
        example.setEnd(4);
        final List<Product> list = this.productMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
    
    @Override
    public List<Product> findNewProduct() throws Exception {
        final ProductExample example = new ProductExample();
        final ProductExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("pdate DESC");
        example.setBeginPage(0);
        example.setEnd(8);
        final List<Product> list = this.productMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
    
    @Override
    public Product productFindByPid(final int pid) throws Exception {
        return this.productMapper.selectByPrimaryKey(pid);
    }
    
    @Override
    public PageBean<Product> findProductyBycid(final int cid, final int page) throws Exception {
        final PageBean<Product> pageBean = new PageBean<Product>();
        pageBean.setPage(page);
        final int limitPage = 12;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        totlePage = this.productMapper.countProducyByCid(cid);
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final List<Product> list = this.productMapper.findProductByCid(cid, beginPage, limitPage);
        pageBean.setList(list);
        return pageBean;
    }
    
    @Override
    public PageBean<Product> finbProductByCsid(final int csid, final int page) {
        final PageBean<Product> pageBean = new PageBean<Product>();
        pageBean.setPage(page);
        final int limitPage = 12;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        totlePage = this.productMapper.countProducyByCsid(csid);
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final List<Product> list = this.productMapper.findProductBycsid(csid, beginPage, limitPage);
        pageBean.setList(list);
        return pageBean;
    }
    
    @Override
    public Product finbProductByPid(final int pid) {
        return this.productMapper.selectByPrimaryKey(pid);
    }
    
    @Override
    public PageBean<Product> findAllProduct(final int page) throws Exception {
        final PageBean<Product> pageBean = new PageBean<Product>();
        pageBean.setPage(page);
        final int limitPage = 12;
        pageBean.setLimitPage(limitPage);
        int totlePage = 0;
        final ProductExample example = new ProductExample();
        totlePage = this.productMapper.countByExample(example);
        if (Math.ceil(totlePage % limitPage) == 0.0) {
            totlePage /= limitPage;
        }
        else {
            totlePage = totlePage / limitPage + 1;
        }
        pageBean.setTotlePage(totlePage);
        final int beginPage = (page - 1) * limitPage;
        final List<Product> list = this.productMapper.findAllProduct(beginPage, limitPage);
        pageBean.setList(list);
        return pageBean;
    }
    
    @Override
    public void adminProduct_save(final Product product) throws Exception {
        this.productMapper.insert(product);
    }
    
    @Override
    public void adminProduct_deletecs(final int pid) throws Exception {
        this.productMapper.deleteByPrimaryKey(pid);
    }
    
    @Override
    public void adminProduct_update(final Product product) throws Exception {
        this.productMapper.updateByPrimaryKey(product);
    }
    
    @Override
    public List<Product> searchProduct(final String condition) throws Exception {
        final List<Product> list = this.productMapper.searchProduct(condition);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
}
