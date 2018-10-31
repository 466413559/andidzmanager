package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductionTask;
import com.andidz.bizcore.domain.ProductionTaskExample;
import com.andidz.bizcore.mapper.ProductionTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductionTaskDao {
    @Autowired
    private ProductionTaskMapper productionTaskMapper;

    public Boolean insertProductionTask(ProductionTask task){
        return productionTaskMapper.insert(task)>0;
    }

    public  Boolean updateProduction(ProductionTask task){
        if(null == task || null == task.getTaskid()){
            return false;
        }
        return productionTaskMapper.updateByPrimaryKey(task)>0;
    }

    public Boolean  deleteProductionTaskByPrimaryKey(Integer taskId){
        return productionTaskMapper.deleteByPrimaryKey(taskId)>0;
    }

    public List<ProductionTask> getProductionTaskByOrderNumb(String orderNumb,Integer start, Integer pageSize){
        List<ProductionTask> result =  new ArrayList<>();
        ProductionTaskExample example = new ProductionTaskExample();
        ProductionTaskExample.Criteria criteria = example.createCriteria();
        criteria.andOrdernumbEqualTo(orderNumb);
        if(null!= start && null!= pageSize){
            example.setStart(start);
            example.setPageSize(pageSize);
        }
        result = productionTaskMapper.selectByExample(example);
        return result;
    }

    public ProductionTask getProductionTaskById(Integer taskId){
        return productionTaskMapper.selectByPrimaryKey(taskId);
    }
}
