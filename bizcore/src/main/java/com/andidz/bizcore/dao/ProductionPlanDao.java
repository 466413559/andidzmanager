package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductionPlan;
import com.andidz.bizcore.domain.ProductionPlanExample;
import com.andidz.bizcore.domain.condition.ProductionPlanCondition;
import com.andidz.bizcore.mapper.ProductionPlanMapper;
import com.andidz.bizcore.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class ProductionPlanDao {
    @Autowired
    private ProductionPlanMapper productionPlanMapper;

    public Integer getProductionPlanCount(){
        return productionPlanMapper.countByExample(new ProductionPlanExample());
    }

    public Boolean insertProductionPlan(ProductionPlan plan){
        return productionPlanMapper.insert(plan)>0;
    }

    public List<ProductionPlan> getProductionPlanByTaskId(Integer taskId , Integer start, Integer pageSize){
        ProductionPlanExample example = new ProductionPlanExample();
        ProductionPlanExample.Criteria criteria = example.createCriteria();
        criteria.andTaskidEqualTo(taskId);
        if(null!= start && null!= pageSize){
            example.setStart(start);
            example.setPageSize(pageSize);
        }
        return productionPlanMapper.selectByExample(example);
    }

    public List<ProductionPlan> getProductionPlanByCondition(ProductionPlanCondition condition){
        List<ProductionPlan> result = new ArrayList<>();
        ProductionPlanExample example = new ProductionPlanExample();
        ProductionPlanExample.Criteria criteria = example.createCriteria();
        if(null == condition){
            return result;
        }
        if(null != condition.getOrdernumb()){
            criteria.andOrdernumbEqualTo(condition.getOrdernumb());
        }
        if(null != condition.getTaskid()){
            criteria.andTaskidEqualTo(condition.getTaskid());
        }
        if(null != condition.getStatus()){
            criteria.andStatusEqualTo(condition.getStatus());
        }

        if(null != condition.getDate()){
            Date date = DateUtils.getTodayDate(condition.getDate());
            criteria.andDateBetween(new Date(date.getTime()-24*60*60*1000),new Date(date.getTime()+24*60*60*1000));
        }

        if(null != condition.getCreatetime()){

        }

        if(null != condition.getUpdatetime()){

        }
        if(null!= condition.getStart() && null!= condition.getPageSize()){
            example.setStart(condition.getStart());
            example.setPageSize(condition.getPageSize());
        }
        result = productionPlanMapper.selectByExample(example);
        return result;
    }

    public Boolean updateProductionPlan(ProductionPlan plan){
        return productionPlanMapper.updateByPrimaryKey(plan)>0;
    }

}
