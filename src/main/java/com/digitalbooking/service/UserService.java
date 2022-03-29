package com.digitalbooking.service;

import com.digitalbooking.model.UserAccount;
import com.digitalbooking.repository.IUserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserAccountRepository repository;

    public UserAccount save(UserAccount userAccount) {

        return repository.save(userAccount);
    }

    public UserAccount editById(UserAccount editedUserAccount, Integer id) {

        return repository.findById(id)
                .map(userAccount -> {
                    userAccount.setName(editedUserAccount.getName());
                    userAccount.setLastName(editedUserAccount.getLastName());
                    userAccount.setEmail(editedUserAccount.getEmail());
                    userAccount.setPassword(editedUserAccount.getPassword());
                    return repository.save(userAccount);
                })
                .orElseGet(() -> {
                    editedUserAccount.setId(id);
                    return repository.save(editedUserAccount);
                });
    }

    public UserAccount getById(Integer id) {
        return repository.getById(id);
    }

    public List<UserAccount> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}

