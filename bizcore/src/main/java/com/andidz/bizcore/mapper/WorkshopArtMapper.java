package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.WorkshopArt;

public interface WorkshopArtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkshopArt record);

    int insertSelective(WorkshopArt record);

    WorkshopArt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkshopArt record);

    int updateByPrimaryKey(WorkshopArt record);
}