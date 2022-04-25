package com.digitalbooking.service;

import com.digitalbooking.model.Category;
import com.digitalbooking.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category save(Category category) {
        return repository.save(category);
    }

    public Category editById(Category editedCategory, Integer id) {

        return repository.findById(id)
                .map(category -> {
                    category.setTitle(editedCategory.getTitle());
                    category.setDescription(editedCategory.getDescription());
                    category.setUrlImage(editedCategory.getUrlImage());
                    return repository.save(category);
                })
                .orElseGet(() -> {
                    editedCategory.setId(id);
                    return repository.save(editedCategory);
                });
    }

    public Category getById(Integer id) {
        return repository.getById(id);
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
