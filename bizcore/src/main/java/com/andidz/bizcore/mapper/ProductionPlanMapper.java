package com.andidz.bizcore.mapper;


import com.andidz.bizcore.domain.ProductionPlan;

public interface ProductionPlanMapper {
    int deleteByPrimaryKey(Integer planid);

    int insert(ProductionPlan record);

    int insertSelective(ProductionPlan record);

    ProductionPlan selectByPrimaryKey(Integer planid);

    int updateByPrimaryKeySelective(ProductionPlan record);

    int updateByPrimaryKey(ProductionPlan record);
}