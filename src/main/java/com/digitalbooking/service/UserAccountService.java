package com.digitalbooking.service;

import com.digitalbooking.model.UserAccount;
import com.digitalbooking.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserAccountRepository repository;

    public UserAccount save(UserAccount userAccount) {
        String encryptedPassword = bCryptPasswordEncoder.encode(userAccount.getPassword());
        userAccount.setPassword(encryptedPassword);
        return repository.save(userAccount);
    }

    public UserAccount editById(UserAccount editedUser, Integer id) {

        return repository.findById(id)
                .map(user -> {
                    user.setName(editedUser.getName());
                    user.setLastName(editedUser.getLastName());
                    user.setEmail(editedUser.getEmail());
                    user.setPassword(editedUser.getPassword());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    editedUser.setId(id);
                    return repository.save(editedUser);
                });
    }

    public UserAccount getById(Integer id) {
        return repository.getById(id);
    }

    public UserAccount findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public List<UserAccount> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

