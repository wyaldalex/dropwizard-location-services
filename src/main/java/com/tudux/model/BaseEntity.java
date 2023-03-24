package com.tudux.model;

public class BaseEntity {
    private Long id;
    private String creationOn;
    private String modification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreationOn() {
        return creationOn;
    }

    public void setCreationOn(String creationOn) {
        this.creationOn = creationOn;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public BaseEntity(Long id, String creationOn, String modification) {
        this.id = id;
        this.creationOn = creationOn;
        this.modification = modification;
    }
}
