package com.digitalbooking.service;

import com.digitalbooking.model.Characteristic;
import com.digitalbooking.repository.CharacteristicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacteristicService {

    @Autowired
    private CharacteristicRepository repository;

    public Characteristic save(Characteristic characteristic) { return repository.save(characteristic); }

    public Characteristic getById(Integer id) {
        return repository.getById(id);
    }

    public List<Characteristic> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
