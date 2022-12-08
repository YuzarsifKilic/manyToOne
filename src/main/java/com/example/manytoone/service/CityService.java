package com.example.manytoone.service;

import com.example.manytoone.exception.NotFoundException;
import com.example.manytoone.model.City;
import com.example.manytoone.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAll() {
        return cityRepository.findAll();
    }

    public City findById(int id) {
        return cityRepository.findById(id).orElseThrow(
                () -> new NotFoundException("City Bulunamadı")
        );
    }
}
