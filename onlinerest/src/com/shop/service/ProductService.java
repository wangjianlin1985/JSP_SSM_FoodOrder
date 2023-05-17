// 
// 
// 

package com.shop.service;

import com.shop.Utils.PageBean;
import com.shop.po.Product;
import java.util.List;

public interface ProductService
{
    List<Product> findHotProduct() throws Exception;
    
    List<Product> findNewProduct() throws Exception;
    
    List<Product> searchProduct(String p0) throws Exception;
    
    Product productFindByPid(int p0) throws Exception;
    
    PageBean<Product> findProductyBycid(int p0, int p1) throws Exception;
    
    PageBean<Product> finbProductByCsid(int p0, int p1);
    
    Product finbProductByPid(int p0);
    
    PageBean<Product> findAllProduct(int p0) throws Exception;
    
    void adminProduct_save(Product p0) throws Exception;
    
    void adminProduct_deletecs(int p0) throws Exception;
    
    void adminProduct_update(Product p0) throws Exception;
}
