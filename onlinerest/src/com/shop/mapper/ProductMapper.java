// 
// 
// 

package com.shop.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shop.po.Product;
import com.shop.po.ProductExample;

public interface ProductMapper
{
    int countProducyByCid(int p0);
    
    int countByExample(ProductExample p0);
    
    int deleteByExample(ProductExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Product p0);
    
    int insertSelective(Product p0);
    
    List<Product> selectByExample(ProductExample p0);
    
    Product selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Product p0, @Param("example") ProductExample p1);
    
    int updateByExample(@Param("record") Product p0, @Param("example") ProductExample p1);
    
    int updateByPrimaryKeySelective(Product p0);
    
    int updateByPrimaryKey(Product p0);
    
    List<Product> findProductByCid(int p0, int p1, int p2);
    
    int countProducyByCsid(int p0);
    
    List<Product> findProductBycsid(int p0, int p1, int p2);
    
    List<Product> findAllProduct(int p0, int p1);
    
    List<Product> searchProduct(String p0);
}
