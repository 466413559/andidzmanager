package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.ProductArtRelationship;
import com.andidz.bizcore.domain.ProductArtRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductArtRelationshipMapper {
    int countByExample(ProductArtRelationshipExample example);

    int deleteByExample(ProductArtRelationshipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductArtRelationship record);

    int insertSelective(ProductArtRelationship record);

    List<ProductArtRelationship> selectByExample(ProductArtRelationshipExample example);

    ProductArtRelationship selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductArtRelationship record, @Param("example") ProductArtRelationshipExample example);

    int updateByExample(@Param("record") ProductArtRelationship record, @Param("example") ProductArtRelationshipExample example);

    int updateByPrimaryKeySelective(ProductArtRelationship record);

    int updateByPrimaryKey(ProductArtRelationship record);
}