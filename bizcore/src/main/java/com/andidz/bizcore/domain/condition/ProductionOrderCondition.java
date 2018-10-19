package com.andidz.bizcore.domain.condition;

import java.util.Date;

public class ProductionOrderCondition {
    private String ordernumb;

    private Integer productiontype;

    private String productnumb;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private Date expctstarttime;

    private Date expctendtime;

    private Integer start;

    private Integer pageSize;

    public String getOrdernumb() {
        return ordernumb;
    }

    public void setOrdernumb(String ordernumb) {
        this.ordernumb = ordernumb;
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
        this.productnumb = productnumb;
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
}
