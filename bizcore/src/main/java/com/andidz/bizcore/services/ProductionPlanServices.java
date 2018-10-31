package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.Product;
import com.andidz.bizcore.domain.ProductionPlan;

import java.util.Date;
import java.util.List;

public interface ProductionPlanServices {
    // plan start

    public ProductionPlan getPlanById(Integer id);
    /**
     *
     * @param orderNumb 生产指令
     * @param taskId 任务id
     * @param dates 计划的日期可以多天 也 可以 一天
     * @param planningCount 计划产量
     * @return
     */
    public Boolean createPlanningByTask(String orderNumb, Integer taskId, List<Date> dates, Integer planningCount) throws Exception;

    /**
     * 根据taskID查询计划
     * @param taskId
     * @param start
     * @param pageSize
     * @return
     */
    public List<ProductionPlan> queryPlanByTaskId(Integer taskId,Integer start,Integer pageSize);

    /**
     * 根据taskId查询最近两天计划
     * @param taskId
     * @param start
     * @param pageSize
     * @return
     */
    public List<ProductionPlan> queryResentPlanByTaskId(Integer taskId,Integer start,Integer pageSize);

    /**
     * 修改计划
     * @param plan
     * @return
     */
    public Boolean updatePlan(ProductionPlan plan) throws Exception;
    //plan end
}
