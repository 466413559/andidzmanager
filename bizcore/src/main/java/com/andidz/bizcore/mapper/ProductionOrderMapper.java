package com.andidz.bizcore.mapper;


import com.andidz.bizcore.domain.ProductionOrder;

public interface ProductionOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductionOrder record);

    int insertSelective(ProductionOrder record);

    ProductionOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductionOrder record);

    int updateByPrimaryKey(ProductionOrder record);
}