package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductArtRelationship;
import com.andidz.bizcore.domain.ProductArtRelationshipExample;
import com.andidz.bizcore.mapper.ProductArtRelationshipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductArtRelationshipDao {
    @Autowired
    private ProductArtRelationshipMapper productArtRelationshipMapper;

    public boolean insertRelationship(ProductArtRelationship productArtRelationship){
        return productArtRelationshipMapper.insertSelective(productArtRelationship)>0;
    }

    public boolean deleteRelationshipByPrimaryKey(Integer id){
        return productArtRelationshipMapper.deleteByPrimaryKey(id)>0;
    }

    public boolean deleteRelationshipByProductId(String productNumb){
        ProductArtRelationshipExample example = new ProductArtRelationshipExample();
        ProductArtRelationshipExample.Criteria criteria = example.createCriteria();
        criteria.andProductnumbEqualTo(productNumb);
        return productArtRelationshipMapper.deleteByExample(example)>0;
    }

    public List<ProductArtRelationship> getRelationshipByProductNumb(String productNumb){
        ProductArtRelationshipExample example = new ProductArtRelationshipExample();
        ProductArtRelationshipExample.Criteria criteria = example.createCriteria();
        criteria.andProductnumbEqualTo(productNumb);
        return productArtRelationshipMapper.selectByExample(example);
    }
}
