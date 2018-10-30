package com.andidz.bizcore.services.impl;

import com.andidz.bizcore.dao.ProductionTypeDao;
import com.andidz.bizcore.domain.ProductionType;
import com.andidz.bizcore.services.ProductionTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionTypeServicesImpl implements ProductionTypeServices {

    @Autowired
    private ProductionTypeDao productionTypeDao;

    @Override
    public List<ProductionType> queryAllProductionType() {
        return productionTypeDao.getProductionType();
    }

    @Override
    public Boolean addProductionType(ProductionType productionType) {
        if(productionType.getName().isEmpty()){
            return false;
        }
        return productionTypeDao.insertProductionType(productionType);
    }
}
