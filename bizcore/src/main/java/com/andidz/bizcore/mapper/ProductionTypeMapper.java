package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.ProductionType;
import com.andidz.bizcore.domain.ProductionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionTypeMapper {
    int countByExample(ProductionTypeExample example);

    int deleteByExample(ProductionTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductionType record);

    int insertSelective(ProductionType record);

    List<ProductionType> selectByExample(ProductionTypeExample example);

    ProductionType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductionType record, @Param("example") ProductionTypeExample example);

    int updateByExample(@Param("record") ProductionType record, @Param("example") ProductionTypeExample example);

    int updateByPrimaryKeySelective(ProductionType record);

    int updateByPrimaryKey(ProductionType record);
}