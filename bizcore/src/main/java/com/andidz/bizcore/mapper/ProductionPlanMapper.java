package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.ProductionPlan;
import com.andidz.bizcore.domain.ProductionPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionPlanMapper {
    int countByExample(ProductionPlanExample example);

    int deleteByExample(ProductionPlanExample example);

    int deleteByPrimaryKey(Integer planid);

    int insert(ProductionPlan record);

    int insertSelective(ProductionPlan record);

    List<ProductionPlan> selectByExample(ProductionPlanExample example);

    ProductionPlan selectByPrimaryKey(Integer planid);

    int updateByExampleSelective(@Param("record") ProductionPlan record, @Param("example") ProductionPlanExample example);

    int updateByExample(@Param("record") ProductionPlan record, @Param("example") ProductionPlanExample example);

    int updateByPrimaryKeySelective(ProductionPlan record);

    int updateByPrimaryKey(ProductionPlan record);
}