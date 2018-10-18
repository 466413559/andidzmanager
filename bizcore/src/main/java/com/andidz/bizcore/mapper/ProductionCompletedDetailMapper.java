package com.andidz.bizcore.mapper;

import com.andidz.bizcore.domain.ProductionCompletedDetail;
import com.andidz.bizcore.domain.ProductionCompletedDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionCompletedDetailMapper {
    int countByExample(ProductionCompletedDetailExample example);

    int deleteByExample(ProductionCompletedDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductionCompletedDetail record);

    int insertSelective(ProductionCompletedDetail record);

    List<ProductionCompletedDetail> selectByExample(ProductionCompletedDetailExample example);

    ProductionCompletedDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductionCompletedDetail record, @Param("example") ProductionCompletedDetailExample example);

    int updateByExample(@Param("record") ProductionCompletedDetail record, @Param("example") ProductionCompletedDetailExample example);

    int updateByPrimaryKeySelective(ProductionCompletedDetail record);

    int updateByPrimaryKey(ProductionCompletedDetail record);
}