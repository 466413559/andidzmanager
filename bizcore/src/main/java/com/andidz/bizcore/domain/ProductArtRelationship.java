package com.andidz.bizcore.domain;

public class ProductArtRelationship {
    private Integer id;

    private String productnumb;

    private Integer workshopnumb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductnumb() {
        return productnumb;
    }

    public void setProductnumb(String productnumb) {
        this.productnumb = productnumb == null ? null : productnumb.trim();
    }

    public Integer getWorkshopnumb() {
        return workshopnumb;
    }

    public void setWorkshopnumb(Integer workshopnumb) {
        this.workshopnumb = workshopnumb;
    }
}