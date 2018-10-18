package com.andidz.authorithy.mapper;

import com.andidz.authorithy.domain.UserType;
import com.andidz.authorithy.domain.UserTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTypeMapper {
    int countByExample(UserTypeExample example);

    int deleteByExample(UserTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserType record);

    int insertSelective(UserType record);

    List<UserType> selectByExample(UserTypeExample example);

    UserType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserType record, @Param("example") UserTypeExample example);

    int updateByExample(@Param("record") UserType record, @Param("example") UserTypeExample example);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);
}