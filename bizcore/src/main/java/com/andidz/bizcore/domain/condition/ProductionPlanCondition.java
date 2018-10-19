package com.andidz.bizcore.domain.condition;

import java.util.Date;

public class ProductionPlanCondition {
    private String ordernumb;

    private Integer taskid;

    private Date date;

    private Integer start;

    private Integer pageSize;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    public String getOrdernumb() {
        return ordernumb;
    }

    public void setOrdernumb(String ordernumb) {
        this.ordernumb = ordernumb;
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

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}
