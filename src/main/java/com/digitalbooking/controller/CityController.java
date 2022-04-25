package com.digitalbooking.controller;


import com.digitalbooking.model.City;
import com.digitalbooking.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CityController {

    @Autowired
    private CityService service;

    @PostMapping
    public ResponseEntity<City> save(@RequestBody City city) {
        return ResponseEntity.status(201).body(service.save(city));
    }

    @GetMapping
    public ResponseEntity<List<City>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
