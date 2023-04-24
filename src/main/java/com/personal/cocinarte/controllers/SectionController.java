package com.personal.cocinarte.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
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

import com.personal.cocinarte.models.Section;
import com.personal.cocinarte.services.SectionService;

@RestController
@RequestMapping(path = "/api")

public class SectionController {

    private SectionService service;

    public SectionController(SectionService service) {
        this.service = service;
    }

    @PostMapping(path = "/sections")
    public Section store(@RequestBody Section section) {
        return service.save(section);
    }

    @GetMapping("/sections")
    public List<Section> listAll() {
        return service.listAll();
    }

    @GetMapping("/sections/{id}")
    public Section listOne(@PathVariable Long id) {
        return service.listOne(id);
    }

    @DeleteMapping("/sections/{id}")
    public void delete(@PathVariable Long id) throws IOException {
        service.delete(id);
    }

    @PutMapping("/sections/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable Long id, @RequestBody Section aboutus) {
        try {
            aboutus.setId(id);
            Section sectionDB = service.save(aboutus);
            String idNew = sectionDB.getId() + "";

            Map<String, String> json = new HashMap<>();
            json.put("id", idNew);
            json.put("name", sectionDB.getName());
            json.put("message", "successful sign up");
            return ResponseEntity.status(HttpStatus.OK).body(json);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}