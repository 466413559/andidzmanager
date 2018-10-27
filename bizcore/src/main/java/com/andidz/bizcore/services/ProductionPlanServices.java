package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.ProductionPlan;

public interface ProductionPlanServices {
    // plan start
    /**
     * 创建生产计划，并校验计划
     * @param plan
     * @return
     */
    public Boolean createPlanningByTask(ProductionPlan plan);

    /**
     * 根据taskID查询计划
     * @param taskId
     * @param start
     * @param pageSize
     * @return
     */
    public Boolean queryPlanByTaskId(Integer taskId,Integer start,Integer pageSize);

    /**
     * 根据taskId查询最近两天计划
     * @param taskId
     * @param start
     * @param pageSize
     * @return
     */
    public Boolean queryResentPlanByTskId(Integer taskId,Integer start,Integer pageSize);

    /**
     * 修改计划
     * @param plan
     * @return
     */
    public Boolean updatePlan(ProductionPlan plan);
    //plan end
}
