package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.Product;

public interface ProductServices {

    /**
     * 根据产品编码获取产品信息
     * @param productNumb
     * @return
     */
    public Product getProductByProductNumb(String productNumb);
}
