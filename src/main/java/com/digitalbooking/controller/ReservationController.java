package com.digitalbooking.controller;

import com.digitalbooking.model.Product;
import com.digitalbooking.model.Reservation;
import com.digitalbooking.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReservationController {

    @Autowired
    private ReservationService service;

    @PostMapping
    public ResponseEntity<Reservation> save(@RequestBody Reservation reservation) {
        return ResponseEntity.status(201).body(service.save(reservation));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Reservation>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<List<Reservation>> findByProduct(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findByProduct(id));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Reservation>> findByUser(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findByUser(id));
    }
}
