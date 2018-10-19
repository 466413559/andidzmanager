package com.andidz.bizcore.domain;

import java.util.Date;

public class ProductionPlan {

    private Integer planid;

    /**
     * 生产指令，用来定义属于哪一个订单
     */
    private String ordernumb;

    /**
     * 任务id，用来定义该计划属于哪一个任务即车间
     */
    private Integer taskid;

    /**
     * 任务时间，用来定义是哪一天的任务
     */
    private Date date;

    /**
     * 计划当天完成的 产量
     */
    private Integer planningproduce;

    /**
     * 该计划已完成的产量
     */
    private Integer completedproduce;

    /**
     * 目标完成率（与车间完成率挂钩）
     */
    private Double targetcompletion;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private String feature;

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public String getOrdernumb() {
        return ordernumb;
    }

    public void setOrdernumb(String ordernumb) {
        this.ordernumb = ordernumb == null ? null : ordernumb.trim();
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPlanningproduce() {
        return planningproduce;
    }

    public void setPlanningproduce(Integer planningproduce) {
        this.planningproduce = planningproduce;
    }

    public Integer getCompletedproduce() {
        return completedproduce;
    }

    public void setCompletedproduce(Integer completedproduce) {
        this.completedproduce = completedproduce;
    }

    public Double getTargetcompletion() {
        return targetcompletion;
    }

    public void setTargetcompletion(Double targetcompletion) {
        this.targetcompletion = targetcompletion;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}