package com.digitalbooking.service;

import com.digitalbooking.model.City;
import com.digitalbooking.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public City save(City city) {

        return repository.save(city);
    }

    public List<City> findAll() {
        return repository.findAll();
    }
}
