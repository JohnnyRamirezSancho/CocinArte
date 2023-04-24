package com.personal.cocinarte.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.personal.cocinarte.models.User;
import com.personal.cocinarte.repositories.UserRepository;

@Service
public class UserService {

    private UserRepository repository;


    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User store(User user) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodePassword = encoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        return repository.save(user);
    }

    public User listOne(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
