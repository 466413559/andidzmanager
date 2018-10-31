package com.andidz.bizcore.services.impl;

import com.andidz.bizcore.dao.ProductDao;
import com.andidz.bizcore.domain.Product;
import com.andidz.bizcore.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServices {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductByProductNumb(String productNumb) {
        List<Product> products = productDao.getProductByProductCode(productNumb);
        if(null == products || products.isEmpty())return null;
        return products.get(0);
    }

    @Override
    public Product getProductByProductId(Integer id) {
        if(null == id) return  null;
        return productDao.getProductById(id);
    }
}
