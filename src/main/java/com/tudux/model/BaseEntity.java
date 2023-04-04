package com.tudux.model;

public class BaseEntity {
    private Long id;
    private String createdOn;
    private String modifiedOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public BaseEntity(Long id, String createdOn, String modifiedOn) {
        this.id = id;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
    }

    public BaseEntity() {
    }
}
