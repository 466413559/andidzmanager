package com.andidz.bizcore.services.impl;

import com.andidz.bizcore.dao.ProductionPlanDao;
import com.andidz.bizcore.domain.ProductionPlan;
import com.andidz.bizcore.domain.ProductionTask;
import com.andidz.bizcore.domain.condition.ProductionPlanCondition;
import com.andidz.bizcore.services.ProductionPlanServices;
import com.andidz.bizcore.services.ProductionTaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public class ProductionPlanServicesImpl implements ProductionPlanServices {

    @Autowired
    private ProductionPlanDao productionPlanDao;
    @Autowired
    private ProductionTaskServices productionTaskServices;
    @Override
    public ProductionPlan getPlanById(Integer id) {
        return productionPlanDao.getPlanById(id);
    }

    @Override
    @Transactional
    public Boolean createPlanningByTask(String orderNumb, Integer taskId, List<Date> dates, Integer planningCount) throws Exception{
        if(null == orderNumb || null == taskId || null== dates || dates.isEmpty()){
            return false;
        }
        ProductionTask task = productionTaskServices.queryTaskById(taskId);
        if(null == task)return false;
        int totalPlanningCount = 0;
        for(Date date : dates){
            ProductionPlan plan = new ProductionPlan();
            plan.setOrdernumb(orderNumb);
            plan.setTaskid(taskId);
            plan.setDate(date);
            plan.setPlanningproduce(planningCount);
            totalPlanningCount += planningCount;
            plan.setCreatetime(new Date());
            if(!productionPlanDao.insertProductionPlan(plan))throw new Exception();
        }
        task.setPlanningtotalproduce(task.getPlanningtotalproduce()+totalPlanningCount);
        if(!productionTaskServices.updateProdcutionTask(task))throw new Exception();
        return true;
    }

    @Override
    public List<ProductionPlan> queryPlanByTaskId(Integer taskId, Integer start, Integer pageSize) {
        ProductionPlanCondition condition = new ProductionPlanCondition();
        condition.setTaskid(taskId);
        condition.setStart(start);
        condition.setPageSize(pageSize);
        return productionPlanDao.getProductionPlanByCondition(condition);
    }

    @Override
    public List<ProductionPlan> queryResentPlanByTaskId(Integer taskId, Integer start, Integer pageSize) {
        ProductionPlanCondition condition = new ProductionPlanCondition();
        condition.setTaskid(taskId);
        condition.setStart(start);
        condition.setPageSize(pageSize);
        condition.setDate(new Date());
        return productionPlanDao.getProductionPlanByCondition(condition);
    }

    @Override
    @Transactional
    public Boolean updatePlan(ProductionPlan plan) throws Exception{
        if(null == plan || null == plan.getPlanid())return false;
        Integer taskId = plan.getTaskid();
        if(null == taskId)return false;
        ProductionTask task = productionTaskServices.queryTaskById(taskId);
        ProductionPlan oldPlan = productionPlanDao.getPlanById(plan.getPlanid());
        if(null  == task || null == oldPlan) return false;
        plan.setUpdatetime(new Date());
        Integer updatePlanningCount = plan.getPlanningproduce() - oldPlan.getPlanningproduce();
        task.setPlanningtotalproduce(task.getPlanningtotalproduce()+updatePlanningCount);
        if(!productionTaskServices.updateProdcutionTask(task))throw new Exception();
        return productionPlanDao.updateProductionPlan(plan);
    }
}
