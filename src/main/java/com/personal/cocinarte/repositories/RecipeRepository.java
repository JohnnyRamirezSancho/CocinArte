package com.personal.cocinarte.repositories;
import com.personal.cocinarte.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    
}
