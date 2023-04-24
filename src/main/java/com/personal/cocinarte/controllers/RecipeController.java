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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.personal.cocinarte.models.Recipe;
import com.personal.cocinarte.services.RecipeService;

@RestController
@RequestMapping(path = "/api")

public class RecipeController {

    private RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @PostMapping(path = "/recipes")
    public Recipe store(@RequestBody Recipe recipe) {
        return service.save(recipe);
    }

    @GetMapping("/recipes")
    public List<Recipe> listAll() {
        return service.listAll();
    }

    @GetMapping("/recipes/{id}")
    public Recipe listOne(@PathVariable Long id) {
        return service.listOne(id);
    }

    @DeleteMapping("/recipes/{id}")
    public void delete(@PathVariable Long id) throws IOException {
        service.delete(id);
    }

    @PutMapping("/recipes/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable Long id, @RequestBody Recipe aboutus) {
        try {
            aboutus.setId(id);
            Recipe recipeDB = service.save(aboutus);
            String idNew = recipeDB.getId() + "";

            Map<String, String> json = new HashMap<>();
            json.put("id", idNew);
            json.put("name", recipeDB.getName());
            json.put("message", "successful sign up");
            return ResponseEntity.status(HttpStatus.OK).body(json);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/recipes/{id}/imagesrecipes")
    public ResponseEntity<Object> saveImageRecipe(@RequestParam("image") MultipartFile multipartFile,
            @PathVariable Long id) throws IOException {
        return service.saveImageRecipe(multipartFile, id);
    }

    @DeleteMapping("/aboutus/{id}/imagesrecipes")
    public void deleteImageRecipe(@PathVariable Long id) throws IOException {
        service.deleteImageRecipe(id);
    }

}