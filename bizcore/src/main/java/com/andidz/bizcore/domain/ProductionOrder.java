package com.andidz.bizcore.domain;

import java.util.Date;

public class ProductionOrder {
    private Integer id;

    private String ordernumb;

    private Integer productiontype;

    private String productnumb;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private Date expctstarttime;

    private Date expctendtime;

    private Integer planningproducecount;

    private Integer completedproduce;

    private String feature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernumb() {
        return ordernumb;
    }

    public void setOrdernumb(String ordernumb) {
        this.ordernumb = ordernumb == null ? null : ordernumb.trim();
    }

    public Integer getProductiontype() {
        return productiontype;
    }

    public void setProductiontype(Integer productiontype) {
        this.productiontype = productiontype;
    }

    public String getProductnumb() {
        return productnumb;
    }

    public void setProductnumb(String productnumb) {
        this.productnumb = productnumb == null ? null : productnumb.trim();
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

    public Date getExpctstarttime() {
        return expctstarttime;
    }

    public void setExpctstarttime(Date expctstarttime) {
        this.expctstarttime = expctstarttime;
    }

    public Date getExpctendtime() {
        return expctendtime;
    }

    public void setExpctendtime(Date expctendtime) {
        this.expctendtime = expctendtime;
    }

    public Integer getPlanningproducecount() {
        return planningproducecount;
    }

    public void setPlanningproducecount(Integer planningproducecount) {
        this.planningproducecount = planningproducecount;
    }

    public Integer getCompletedproduce() {
        return completedproduce;
    }

    public void setCompletedproduce(Integer completedproduce) {
        this.completedproduce = completedproduce;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}