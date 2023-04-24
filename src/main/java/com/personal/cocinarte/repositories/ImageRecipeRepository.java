package com.personal.cocinarte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.cocinarte.models.ImageRecipe;

public interface ImageRecipeRepository extends JpaRepository <ImageRecipe, Long> {
    public ImageRecipe findByImage(String image);
}
