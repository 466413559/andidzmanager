package com.andidz.bizcore.mapper;


import com.andidz.bizcore.domain.ProductArtRelationship;

public interface ProductArtRelationshipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductArtRelationship record);

    int insertSelective(ProductArtRelationship record);

    ProductArtRelationship selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductArtRelationship record);

    int updateByPrimaryKey(ProductArtRelationship record);
}