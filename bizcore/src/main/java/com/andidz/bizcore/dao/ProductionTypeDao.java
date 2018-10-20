package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductionType;
import com.andidz.bizcore.domain.ProductionTypeExample;
import com.andidz.bizcore.mapper.ProductionTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductionTypeDao {
    @Autowired
    private ProductionTypeMapper productionTypeMapper;

    public List<ProductionType> getProductionType(){
        return productionTypeMapper.selectByExample(new ProductionTypeExample());
    }

    public Boolean insertProductionType(ProductionType productionType){
        return productionTypeMapper.insert(productionType)>0;
    }

    public Boolean updateProductionType(ProductionType productionType){
        if(null == productionType || null == productionType.getId())
            return false;
        return productionTypeMapper.updateByPrimaryKey(productionType)>0;
    }

    public Boolean deleteProductionTypeById(Integer id){
        return productionTypeMapper.deleteByPrimaryKey(id)>0;
    }
}
