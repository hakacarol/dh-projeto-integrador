package com.digitalbooking.controller;

import com.digitalbooking.model.UserAccount;
import com.digitalbooking.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserAccountController {

    @Autowired
    private UserAccountService service;

    @PostMapping
    public ResponseEntity<UserAccount> save(@RequestBody UserAccount userAccount) {
        return ResponseEntity.status(201).body(service.save(userAccount));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserAccount> editById(@RequestBody UserAccount userAccount, @PathVariable Integer id) {
        return ResponseEntity.ok(service.editById(userAccount, id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAccount> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserAccount> findByEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.findByEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<UserAccount>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
