package com.andidz.authorithy.mapper;


import com.andidz.authorithy.domain.RightResource;

public interface RightResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RightResource record);

    int insertSelective(RightResource record);

    RightResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RightResource record);

    int updateByPrimaryKey(RightResource record);
}