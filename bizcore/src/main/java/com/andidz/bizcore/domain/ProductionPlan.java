package com.andidz.bizcore.domain;

import java.util.Date;

public class ProductionPlan {
    private Integer planid;

    private String ordernumb;

    private Date data;

    private Integer planningproduce;

    private Integer completedproduce;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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