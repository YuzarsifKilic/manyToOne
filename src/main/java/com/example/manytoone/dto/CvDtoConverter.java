package com.example.manytoone.dto;

import com.example.manytoone.model.Cv;
import org.springframework.stereotype.Component;

@Component
public class CvDtoConverter {

    private final CityDtoConverter cityDtoConverter;

    public CvDtoConverter(CityDtoConverter cityDtoConverter) {
        this.cityDtoConverter = cityDtoConverter;
    }

    public CvDto convert(Cv from) {
        return new CvDto(
                from.getName(),
                cityDtoConverter.convert(from.getCity())
        );
    }
}
