package com.andidz.bizcore.domain;

public class ProductionCompletedDetail {
    private Integer id;

    private Integer planid;

    private String ordernumb;

    private String createtime;

    private String updatetime;

    private String status;

    private String type;

    private String completedproduce;

    private String qualifiedproduce;

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

    public String getOrdernumb() {
        return ordernumb;
    }

    public void setOrdernumb(String ordernumb) {
        this.ordernumb = ordernumb == null ? null : ordernumb.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCompletedproduce() {
        return completedproduce;
    }

    public void setCompletedproduce(String completedproduce) {
        this.completedproduce = completedproduce == null ? null : completedproduce.trim();
    }

    public String getQualifiedproduce() {
        return qualifiedproduce;
    }

    public void setQualifiedproduce(String qualifiedproduce) {
        this.qualifiedproduce = qualifiedproduce == null ? null : qualifiedproduce.trim();
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