package com.digitalbooking.controller;

import com.digitalbooking.model.Product;
import com.digitalbooking.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.status(201).body(service.save(product));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> editById(@RequestBody Product category, @PathVariable Integer id) {
        return ResponseEntity.ok(service.editById(category, id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

//    @GetMapping("/city/{city}")
//    public ResponseEntity<List<Product>> findByCity(@PathVariable String city) {
//        return ResponseEntity.ok(service.findByCity(city));
//    }
//
//    @GetMapping("/category/{category}")
//    public ResponseEntity<List<Product>> findByCategory(@PathVariable String category) {
//        return ResponseEntity.ok(service.findByCategory(category));
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}