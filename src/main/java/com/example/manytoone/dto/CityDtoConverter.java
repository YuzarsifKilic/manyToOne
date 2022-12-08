package com.example.manytoone.dto;

import com.example.manytoone.model.City;
import org.springframework.stereotype.Component;

@Component
public class CityDtoConverter {

    public CityDto convert(City from) {
        return new CityDto(
                from.getId(),
                from.getCityName()
        );
    }
}
