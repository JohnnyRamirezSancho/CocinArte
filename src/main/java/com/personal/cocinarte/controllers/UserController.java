package com.personal.cocinarte.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.cocinarte.models.User;
import com.personal.cocinarte.services.UserService;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping(path = "/register", consumes = { "*/*" })
    public ResponseEntity<Map<String, String>> save(@RequestBody User user) {

        try {
            if (user.getPassword() == null) {
                user.setPassword("1");
            }
            User userDB = service.store(user);
            String iduser = userDB.getId() + "";
            Map<String, String> json = new HashMap<>();

            json.put("id", iduser);
            json.put("name", userDB.getUsername());
            json.put("message", "successful sign up");
            return ResponseEntity.status(HttpStatus.CREATED).body(json);
        } catch (Exception e) {
            Map<String, String> json = new HashMap<>();

            json.put("problem", e.getMessage());
            json.put("message", "Error to sign up");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(json);
        }
    }

    @GetMapping("/users/{id}")
    public User listOne(@PathVariable Long id) {
        return service.listOne(id);
    }    

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id) throws IOException {
        service.delete(id);
    }    

    @PutMapping("/users/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable Long id, @RequestBody User user) {
        try {
            user.setId(id);
            User userDB = service.store(user);
            String idNew = userDB.getId() + "";

            Map<String, String> json = new HashMap<>();
            json.put("id", idNew);
            json.put("name", userDB.getUsername());
            json.put("message", "successful sign up");
            return ResponseEntity.status(HttpStatus.OK).body(json);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}