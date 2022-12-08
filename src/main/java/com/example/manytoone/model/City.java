package com.example.manytoone.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cvs"})
public class City {

    @Id
    @GeneratedValue
    private int id;
    private String cityName;
    @OneToMany(mappedBy = "city", cascade = {CascadeType.ALL})
    private Set<Cv> cvs = new HashSet<>();

    public City() {}

    public City(int id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public City(String cityName, Set<Cv> cvs) {
        this.cityName = cityName;
        this.cvs = cvs;
    }

    public City(int id, String cityName, Set<Cv> cvs) {
        this.id = id;
        this.cityName = cityName;
        this.cvs = cvs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Set<Cv> getCvs() {
        return cvs;
    }

    public void setCvs(Set<Cv> cvs) {
        this.cvs = cvs;
    }
}
