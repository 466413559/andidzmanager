package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.ProductionOrder;
import com.andidz.bizcore.domain.ProductionTask;

import java.util.List;

public interface ProdcutionTaskServices {
    // task start
    /**
     * 根据生产指令创建生产任务
     * @param order
     * @return
     */
    public Boolean createProductionTaskByOrder(ProductionOrder order);

    /**
     * 修改生产任务
     * @param task
     * @return
     */
    public Boolean updateProdcutionTask(ProductionTask task);

    /**
     * 根据生产令号和状态分页查询生产任务
     * @param order 生产令号 不能为null
     * @param status 为null时查询所有状态
     * @param start
     * @param pageSize
     * @return
     */
    public List<ProductionTask> queryTaskByOrder(String order, Integer status, Integer start, Integer pageSize);
//task  end
}
