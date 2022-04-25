package com.digitalbooking.controller;

import com.digitalbooking.model.Characteristic;
import com.digitalbooking.service.CharacteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characteristic")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CharacteristicController {
    @Autowired
    private CharacteristicService service;

    @PostMapping
    public ResponseEntity<Characteristic> save(@RequestBody Characteristic characteristic){
        return ResponseEntity.status(201).body(service.save(characteristic));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Characteristic> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Characteristic>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
