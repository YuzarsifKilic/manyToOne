package com.example.manytoone.repository;

import com.example.manytoone.dto.CvDto;
import com.example.manytoone.model.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvRepository extends JpaRepository<Cv, Integer> {


}
