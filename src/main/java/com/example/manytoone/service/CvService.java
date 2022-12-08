package com.example.manytoone.service;

import com.example.manytoone.dto.CreateCvRequest;
import com.example.manytoone.dto.CvDto;
import com.example.manytoone.dto.CvDtoConverter;
import com.example.manytoone.model.City;
import com.example.manytoone.model.Cv;
import com.example.manytoone.repository.CvRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvService {

    private final CvRepository cvRepository;
    private final CityService cityService;
    private final CvDtoConverter cvDtoConverter;

    public CvService(CvRepository cvRepository, CityService cityService, CvDtoConverter cvDtoConverter) {
        this.cvRepository = cvRepository;
        this.cityService = cityService;
        this.cvDtoConverter = cvDtoConverter;
    }

    public List<Cv> getAll() {
        return cvRepository.findAll();
    }

    public CvDto save(CreateCvRequest request) {
        City city = cityService.findById(request.getCityId());

        Cv cv = new Cv(
                request.getName(),
                city
        );

        Cv cv2 = cvRepository.save(cv);

        return cvDtoConverter.convert(cv2);
    }
}
