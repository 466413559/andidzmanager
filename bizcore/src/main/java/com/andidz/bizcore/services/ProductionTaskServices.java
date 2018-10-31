package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.ProductionOrder;
import com.andidz.bizcore.domain.ProductionTask;

import java.util.List;

public interface ProductionTaskServices {
    // task start
    /**
     * 根据生产指令创建生产任务
     * @param order
     * @return
     */
    public Boolean createProductionTaskByOrder(ProductionOrder order) throws Exception;

    /**
     * 创建生产任务
     * @param task
     * @return
     */
    public Boolean createProdctionTask(ProductionTask task);
    /**
     * 修改生产任务
     * @param task
     * @return
     */
    public Boolean updateProdcutionTask(ProductionTask task);

    /**
     * 根据生产令号和状态分页查询生产任务
     * @param orderNumb 生产令号 不能为null
     * @param start
     * @param pageSize
     * @return
     */
    public List<ProductionTask> queryTaskByOrder(String orderNumb, Integer start, Integer pageSize);

    /**
     * 根据taskId获取task信息
     * @param taskId
     * @return
     */
    public ProductionTask queryTaskById(Integer taskId);
//task  end
}
