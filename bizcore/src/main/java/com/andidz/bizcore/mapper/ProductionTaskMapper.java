package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.ProductionTask;
import com.andidz.bizcore.domain.ProductionTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionTaskMapper {
    int countByExample(ProductionTaskExample example);

    int deleteByExample(ProductionTaskExample example);

    int deleteByPrimaryKey(Integer taskid);

    int insert(ProductionTask record);

    int insertSelective(ProductionTask record);

    List<ProductionTask> selectByExample(ProductionTaskExample example);

    ProductionTask selectByPrimaryKey(Integer taskid);

    int updateByExampleSelective(@Param("record") ProductionTask record, @Param("example") ProductionTaskExample example);

    int updateByExample(@Param("record") ProductionTask record, @Param("example") ProductionTaskExample example);

    int updateByPrimaryKeySelective(ProductionTask record);

    int updateByPrimaryKey(ProductionTask record);
}