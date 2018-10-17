package com.andidz.bizcore.mapper;


import com.andidz.bizcore.domain.ProductionCompletedDetail;

public interface ProductionCompletedDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductionCompletedDetail record);

    int insertSelective(ProductionCompletedDetail record);

    ProductionCompletedDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductionCompletedDetail record);

    int updateByPrimaryKey(ProductionCompletedDetail record);
}