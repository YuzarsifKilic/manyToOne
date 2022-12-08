package com.example.manytoone.dto;

public class CreateCvRequest {

    private String name;
    private int cityId;

    public CreateCvRequest() {}

    public CreateCvRequest(String name, int cityId) {
        this.name = name;
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
