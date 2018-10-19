package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductionPlan;
import com.andidz.bizcore.domain.ProductionPlanExample;
import com.andidz.bizcore.mapper.ProductionPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductionPlanDao {
    @Autowired
    private ProductionPlanMapper productionPlanMapper;

    public Boolean insertProductionPlan(ProductionPlan plan){
        return productionPlanMapper.insert(plan)>0;
    }

    public List<ProductionPlan> getProductionPlanByTaskId(Integer taskId , Integer start, Integer pageSize){
        ProductionPlanExample example = new ProductionPlanExample();
        ProductionPlanExample.Criteria criteria = example.createCriteria();
    //    criteria.(orderNumb);
        if(null!= start && null!= pageSize){
            example.setStart(start);
            example.setPageSize(pageSize);
        }
        return productionPlanMapper.selectByExample(example);
    }



    public Boolean updateProductionPlan(ProductionPlan plan){
        return productionPlanMapper.updateByPrimaryKey(plan)>0;
    }

}
