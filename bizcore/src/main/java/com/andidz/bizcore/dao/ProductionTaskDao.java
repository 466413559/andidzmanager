package com.andidz.bizcore.dao;

import com.andidz.bizcore.domain.ProductionTask;
import com.andidz.bizcore.mapper.ProductionTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

    public List<ProductionTask> getProductionTaskByOrderNumb(String orderNumb){
        return null;
    }
}
