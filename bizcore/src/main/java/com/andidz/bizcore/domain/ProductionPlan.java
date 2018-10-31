package com.andidz.bizcore.domain;

import java.util.Date;

public class ProductionPlan {
    private Integer planid;

    private String ordernumb;

    private Integer taskid;

    private Date date;

    private Integer planningproduce;

    private Integer completedproduce;

    private Integer qualifiedproduce;

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

    public Integer getQualifiedproduce() {
        return qualifiedproduce;
    }

    public void setQualifiedproduce(Integer qualifiedproduce) {
        this.qualifiedproduce = qualifiedproduce;
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