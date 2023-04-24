package com.personal.cocinarte.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.personal.cocinarte.models.Recipe;
import com.personal.cocinarte.models.ImageRecipe;
import com.personal.cocinarte.repositories.RecipeRepository;
import com.personal.cocinarte.repositories.ImageRecipeRepository;
import com.personal.cocinarte.utils.FileUploadUtil;
import com.personal.cocinarte.utils.RouteFileUploadImage;

@Service
public class RecipeService {
    private RecipeRepository repository;

    @Autowired
    private ImageRecipeRepository imageRecipeRepository;

    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Object> saveImageRecipe(MultipartFile multipartFile, Long id) throws IOException {
        ImageRecipe imageExist = listOneImage(id);
        if (imageExist != null) {
            deleteImageRecipe(id);
        }

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        ImageRecipe fileNameExist = imageRecipeRepository.findByImage(fileName);

        if (fileNameExist != null) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }

        String uploadDir = RouteFileUploadImage.pathToSaveImage("imageRecipe");
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        ImageRecipe imageRecipeNew = new ImageRecipe();
        imageRecipeNew.setImage(fileName);
        imageRecipeRepository.save(imageRecipeNew);

        Recipe recipeToAddImage = repository.findById(id).orElseThrow();
        recipeToAddImage.setImagerecipe(imageRecipeNew);
        repository.save(recipeToAddImage);

        return new ResponseEntity<>(HttpStatus.OK);

    }

    public Recipe save(Recipe recipeNew) {
        return repository.save(recipeNew);
    }

    public List<Recipe> listAll() {
        return repository.findAll();
    }

    public Recipe listOne(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    public void delete(Long id) throws IOException {
        ImageRecipe imageExist = listOneImage(id);
        if (imageExist != null) {
            deleteImageRecipe(id);
        }
        repository.deleteById(id);
    }

    public Recipe update(Long id, Recipe recipeNew) {
        Recipe recipeToUpdate = recipeNew;
        recipeToUpdate.setId(id);
        return repository.save(recipeToUpdate);
    }

    public void deleteImageRecipe(Long idaboutus) throws IOException {
        Recipe recipeToDeleteImage = repository.findById(idaboutus).orElseThrow(null);
        ImageRecipe imageToDelete = recipeToDeleteImage.getImagerecipe();
        recipeToDeleteImage.setImagerecipe(null);
        imageRecipeRepository.delete(imageToDelete);
        String uploadDir = RouteFileUploadImage.pathToSaveImage("imageRecipe");
        Path fileToDeletePath = Paths.get(uploadDir + imageToDelete.getImage());
        Files.delete(fileToDeletePath);
    }

    public ImageRecipe listOneImage(Long id) {
        Recipe recipeImage = repository.findById(id).orElseThrow(null);
        ImageRecipe imagerecipe = recipeImage.getImagerecipe();
        if (imagerecipe == null) {
            return null;
        }
        Long idImage = imagerecipe.getId();
        return imageRecipeRepository.findById(idImage).orElseThrow(null);
    }

}
