package com.andidz.bizcore.services;

import com.andidz.bizcore.domain.ProductionCompletedDetail;

import java.util.List;

public interface ProductionDetailServices {

    /**
     * 查询某一订单的提交记录
     * @param orderNumb
     * @param type 提交类型（0为计划提交，1为交接提交  null为全部）
     * @return
     */
    public List<ProductionCompletedDetail> queryDetailByOrderNumb(String orderNumb ,Integer type,Integer start, Integer pageSize);

    /**
     * 查询某车间的提交记录（车间和订单挂钩，所以等价于查询某一订单里面的某一车间的提交记录）
     * @param taskId 车间id
     * @param type 提交类型（0为计划提交，1为交接提交  null为全部）
     * @return
     */
    public List<ProductionCompletedDetail> queryDetailByTaskId(Integer taskId , Integer type,Integer start, Integer pageSize);

    /**
     * 查询某天计划的提交记录
     * @param planId 车间id
     * @param type 提交类型（0为计划提交，1为交接提交  null为全部）
     * @return
     */
    public List<ProductionCompletedDetail> queryDetailByPlanId(Integer planId, Integer type,Integer start, Integer pageSize);

    /**
     * 查询某一提交记录的详细信息
     * @param id 记录Id
     * @return
     */
    public ProductionCompletedDetail queryDetailByDetailId(Integer id);

    /**
     * 新增计划提交信息，会联动修改plan，task，order等相关信息,入库提交信息特殊处理
     * @param planId 与提交挂钩的plan信息，通过该id可以获取到车间信息和order信息和task信息
     * @param completedCount
     * @param qualifiedCount
     * @param name
     * @return
     */
    public Boolean submitPlanDetail(Integer planId,Integer completedCount, Integer qualifiedCount, String name) throws Exception;

    /**
     * 新增交接提交信息，会联动修改plan，task，order等相关信息,入库提交信息特殊处理
     * @param taskId 与交接挂钩的任务信息，通过该id可以获取到车间信息和order信息
     * @param deliverCount
     * @param name 组长名及操作账号名
     * @return
     */
    public Boolean submitDeliverDetail(Integer taskId ,Integer deliverCount,String name) throws Exception;

    /**
     * 修改某一计划提交信息，会联动修改plan，task，order等相关信息,入库提交信息特殊处理
     * @param id
     * @param completedCount
     * @param qualifiedCount
     * @param name
     * @return
     */
    public Boolean updatePlanDetail(Integer id,Integer completedCount, Integer qualifiedCount, String name) throws Exception;

    /**
     * 修改某一交接提交信息，会联动修改task，order等相关信息,入库提交信息特殊处理
     * @param id
     * @param deliverCount
     * @return
     */
    public Boolean updateDeliverDetail(Integer id, Integer deliverCount,String name) throws Exception;

}
