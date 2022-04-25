package com.digitalbooking.controller;

import com.digitalbooking.model.Product;
import com.digitalbooking.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.status(201).body(service.save(product));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> editById(@RequestBody Product category, @PathVariable Integer id) {
        return ResponseEntity.ok(service.editById(category, id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/city/{name}")
    public ResponseEntity<List<Product>> findByCity(@PathVariable String name) {
        return ResponseEntity.ok(service.findByCity(name));
    }

    @GetMapping("/city/{name}/{start}/{end}")
    public ResponseEntity<List<Product>> findByCityDateAvailable(@PathVariable String name, @PathVariable Date start, @PathVariable Date end) {
        return ResponseEntity.ok(service.findByCityDateAvailable(name, start, end));
    }

    @GetMapping("/dates/{start}/{end}")
    public ResponseEntity<List<Product>> findByDateAvailable(@PathVariable Date start, @PathVariable Date end) {
        return ResponseEntity.ok(service.findByDateAvailable(start, end));
    }


    @GetMapping("/category/{title}")
    public ResponseEntity<List<Product>> findByCategory(@PathVariable String title) {
        return ResponseEntity.ok(service.findByCategory(title));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
