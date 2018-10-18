package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.ProductionOrder;
import com.andidz.bizcore.domain.ProductionOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionOrderMapper {
    int countByExample(ProductionOrderExample example);

    int deleteByExample(ProductionOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductionOrder record);

    int insertSelective(ProductionOrder record);

    List<ProductionOrder> selectByExample(ProductionOrderExample example);

    ProductionOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductionOrder record, @Param("example") ProductionOrderExample example);

    int updateByExample(@Param("record") ProductionOrder record, @Param("example") ProductionOrderExample example);

    int updateByPrimaryKeySelective(ProductionOrder record);

    int updateByPrimaryKey(ProductionOrder record);
}