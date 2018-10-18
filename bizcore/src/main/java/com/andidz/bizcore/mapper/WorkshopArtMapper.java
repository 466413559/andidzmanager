package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.WorkshopArt;
import com.andidz.bizcore.domain.WorkshopArtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkshopArtMapper {
    int countByExample(WorkshopArtExample example);

    int deleteByExample(WorkshopArtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkshopArt record);

    int insertSelective(WorkshopArt record);

    List<WorkshopArt> selectByExample(WorkshopArtExample example);

    WorkshopArt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkshopArt record, @Param("example") WorkshopArtExample example);

    int updateByExample(@Param("record") WorkshopArt record, @Param("example") WorkshopArtExample example);

    int updateByPrimaryKeySelective(WorkshopArt record);

    int updateByPrimaryKey(WorkshopArt record);
}