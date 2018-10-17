package com.andidz.authorithy.mapper;


import com.andidz.authorithy.domain.UserType;

public interface UserTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserType record);

    int insertSelective(UserType record);
}