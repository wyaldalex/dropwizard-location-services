package com.tudux.data;

public enum Type {

    AMAZON("Amazon", "AMZ"),
    UPS("Ups","UPS");

    private String name;
    private String code;

    Type(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
