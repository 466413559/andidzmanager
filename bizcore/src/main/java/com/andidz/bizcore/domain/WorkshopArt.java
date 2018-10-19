package com.andidz.bizcore.domain;

public class WorkshopArt {
    private Integer id;

    private String artname;

    /**
     * 车间号，与工艺相对应
     */
    private Integer workshopnumb;

    private String artcode;

    private Double avgqualify;

    private String description;

    private String feature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtname() {
        return artname;
    }

    public void setArtname(String artname) {
        this.artname = artname == null ? null : artname.trim();
    }

    public Integer getWorkshopnumb() {
        return workshopnumb;
    }

    public void setWorkshopnumb(Integer workshopnumb) {
        this.workshopnumb = workshopnumb;
    }

    public String getArtcode() {
        return artcode;
    }

    public void setArtcode(String artcode) {
        this.artcode = artcode == null ? null : artcode.trim();
    }

    public Double getAvgqualify() {
        return avgqualify;
    }

    public void setAvgqualify(Double avgqualify) {
        this.avgqualify = avgqualify;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}