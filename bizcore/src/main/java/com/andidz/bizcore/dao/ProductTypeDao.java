package com.andidz.bizcore.dao;

import com.andidz.bizcore.mapper.ProductTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductTypeDao {
    @Autowired
    private ProductTypeMapper productTypeMapper;

}
