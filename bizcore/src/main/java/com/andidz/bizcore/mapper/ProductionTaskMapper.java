package com.andidz.bizcore.mapper;


import com.andidz.bizcore.domain.ProductionTask;

public interface ProductionTaskMapper {
    int deleteByPrimaryKey(Integer taskid);

    int insert(ProductionTask record);

    int insertSelective(ProductionTask record);

    ProductionTask selectByPrimaryKey(Integer taskid);

    int updateByPrimaryKeySelective(ProductionTask record);

    int updateByPrimaryKey(ProductionTask record);
}