package com.andidz.authorithy.mapper;


import com.andidz.authorithy.domain.UserRightRelationship;

public interface UserRightRelationshipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRightRelationship record);

    int insertSelective(UserRightRelationship record);

    UserRightRelationship selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRightRelationship record);

    int updateByPrimaryKey(UserRightRelationship record);
}