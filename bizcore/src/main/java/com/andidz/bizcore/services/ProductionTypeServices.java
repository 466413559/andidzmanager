package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.ProductionType;

import java.util.List;

public interface ProductionTypeServices {
    // type start
    /**
     * 查询所有生产类型
     * @return
     */
    public List<ProductionType> queryAllProductionType();

    /**
     * 新增生产类型
     * @param productionType
     * @return
     */
    public Boolean addProductionType(ProductionType productionType);
//type end
}
