package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.Product;
import com.andidz.bizcore.domain.ProductExample;
import com.andidz.bizcore.domain.WorkshopArt;
import com.andidz.bizcore.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao {
    @Autowired
    private ProductMapper productMapper;

    public Integer getProductCount(){
        return productMapper.countByExample(new ProductExample());
    }

    public List<Product> getProduct(Integer start,Integer pageSize){
        List<Product> result = new ArrayList<>();
        ProductExample productExample = new ProductExample();
        productExample.setStart(start);
        productExample.setPageSize(pageSize);
        result = productMapper.selectByExample(productExample);
        return result;
    }

    public List<Product> getProductByName(String productName){
        List<Product> result = new ArrayList<>();
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andProductnameLike("%"+productName+"%");
        result = productMapper.selectByExample(productExample);
        return result;
    }

    public Product getProductById(Integer productId){
        return productMapper.selectByPrimaryKey(productId);
    }

    public List<Product> getProductByProductCode(String productCode){
        List<Product> result = new ArrayList<>();
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andProductnumbLike("%"+productCode+"%");
        result = productMapper.selectByExample(productExample);
        return result;
    }

    public Boolean updateProduct(Product product){
        Boolean result = false;
        if(null == product.getId()){
            return result;
        }
        result = productMapper.updateByPrimaryKey(product)>0;
        return result;
    }
}
