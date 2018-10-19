package com.andidz.bizcore.domain;

import java.util.Date;

public class ProductionTask {
    private Integer taskid;

    /**
     * 生产指令，定于该任务属于哪一个订单
     */
    private String ordernumb;

    /**
     * 车间号，定义该任务属于哪一个车间
     */
    private Integer workshopnumb;

    /**
     * 该任务计划生产的产量数量
     */
    private Integer planningtotalproduce;

    /**
     * 已生产的数量
     */
    private Integer totalproduce;

    /**
     * 已生产的合格产品的数量
     */
    private Integer totalqualify;

    /**
     * 已交接的产品数量
     */
    private Integer totaldeliver;

    private Date createtime;

    private Integer status;

    private String feature;

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

    public Integer getWorkshopnumb() {
        return workshopnumb;
    }

    public void setWorkshopnumb(Integer workshopnumb) {
        this.workshopnumb = workshopnumb;
    }

    public Integer getPlanningtotalproduce() {
        return planningtotalproduce;
    }

    public void setPlanningtotalproduce(Integer planningtotalproduce) {
        this.planningtotalproduce = planningtotalproduce;
    }

    public Integer getTotalproduce() {
        return totalproduce;
    }

    public void setTotalproduce(Integer totalproduce) {
        this.totalproduce = totalproduce;
    }

    public Integer getTotalqualify() {
        return totalqualify;
    }

    public void setTotalqualify(Integer totalqualify) {
        this.totalqualify = totalqualify;
    }

    public Integer getTotaldeliver() {
        return totaldeliver;
    }

    public void setTotaldeliver(Integer totaldeliver) {
        this.totaldeliver = totaldeliver;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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