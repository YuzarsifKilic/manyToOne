package com.example.manytoone.controller;

import com.example.manytoone.dto.CreateCvRequest;
import com.example.manytoone.dto.CvDto;
import com.example.manytoone.model.Cv;
import com.example.manytoone.service.CvService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
public class CvController {

    private final CvService cvService;

    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @GetMapping("/getall")
    public List<Cv> getAll() {
        return cvService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity<CvDto> save(@RequestBody CreateCvRequest request) {
        return ResponseEntity.ok(cvService.save(request));
    }
}
