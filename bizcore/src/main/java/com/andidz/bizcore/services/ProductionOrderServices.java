package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.ProductionOrder;

import java.util.List;

public interface ProductionOrderServices {

    public Integer getOederCount();

    //order start
    /**
     * 根据生产类型分页获取该类型下的生产指令（订单）
     * @param id
     * @param start
     * @param pageSize
     * @return
     */
    public List<ProductionOrder> queryOrderByTypeId(Integer id, Integer start, Integer pageSize);

    /**
     * 根据生产类型以及 计划产量，生产日期创建生产计划
     * @param order
     * @param shopNumbs 级联生产的对应车间的task任务，若为null则默认创建产品所有工艺的task
     * @return
     */
    public Boolean createProductionOrder(ProductionOrder order,List<Integer> shopNumbs) throws Exception;

    /**
     * 根据生产类型以及 计划产量，生产日期创建生产计划
     * @param order
     * @param numb 生产序号，用于确定是某一订单的第多少子订单主要用户生成生产令号，为null时为初始订单
     * @return
     */
    public Boolean recreateProductionOrder(ProductionOrder order,Integer numb);


    /**
     * 修改生产指令
     * @param order
     * @return
     */
    public Boolean updateProductionOrder(ProductionOrder order);
//order end
}
