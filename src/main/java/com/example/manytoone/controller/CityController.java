package com.example.manytoone.controller;

import com.example.manytoone.model.City;
import com.example.manytoone.service.CityService;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getall")
    public List<City> getAll() {
        return cityService.getAll();
    }
}
