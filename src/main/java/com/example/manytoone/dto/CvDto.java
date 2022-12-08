package com.example.manytoone.dto;

import com.example.manytoone.model.City;

public class CvDto {

    private String name;
    private CityDto city;

    public CvDto() {}

    public CvDto(String name, CityDto city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }
}
