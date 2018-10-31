package com.andidz.bizcore.domain;

import java.util.Date;

public class ProductionCompletedDetail {
    private Integer id;

    private Integer planid;

    private Integer taskid;

    private String ordernumb;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private Integer type;

    private Integer completedProduce;

    private Integer qualifiedProduce;

    private String operator;

    private String feature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getOrdernumb() {
        return ordernumb;
    }

    public void setOrdernumb(String ordernumb) {
        this.ordernumb = ordernumb == null ? null : ordernumb.trim();
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCompletedProduce() {
        return completedProduce;
    }

    public void setCompletedProduce(Integer completedProduce) {
        this.completedProduce = completedProduce;
    }

    public Integer getQualifiedProduce() {
        return qualifiedProduce;
    }

    public void setQualifiedProduce(Integer qualifiedProduce) {
        this.qualifiedProduce = qualifiedProduce;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}