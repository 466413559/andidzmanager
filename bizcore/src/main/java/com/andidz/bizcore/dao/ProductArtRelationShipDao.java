package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductArtRelationship;
import com.andidz.bizcore.domain.ProductArtRelationshipExample;
import com.andidz.bizcore.mapper.ProductArtRelationshipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductArtRelationShipDao {
    @Autowired
    private ProductArtRelationshipMapper productArtRelationshipMapper;

    public boolean insertRelationship(ProductArtRelationship productArtRelationship){
        return productArtRelationshipMapper.insertSelective(productArtRelationship)>0;
    }

    public boolean deleteRelationshipByPrimaryKey(Integer id){
        return productArtRelationshipMapper.deleteByPrimaryKey(id)>0;
    }

    public boolean deleteRelationshipByProductId(Integer productId){
        ProductArtRelationshipExample example = new ProductArtRelationshipExample();
        ProductArtRelationshipExample.Criteria criteria = example.createCriteria();
        criteria.andProductidEqualTo(productId);
        return productArtRelationshipMapper.deleteByExample(example)>0;
    }

    public List<ProductArtRelationship> getRelationshipByProductId(Integer productId){
        ProductArtRelationshipExample example = new ProductArtRelationshipExample();
        ProductArtRelationshipExample.Criteria criteria = example.createCriteria();
        criteria.andProductidEqualTo(productId);
        return productArtRelationshipMapper.selectByExample(example);
    }
}
