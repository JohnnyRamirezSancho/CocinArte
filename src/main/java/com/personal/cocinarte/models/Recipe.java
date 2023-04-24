package com.personal.cocinarte.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, columnDefinition="TEXT")
    private String ingredients;
    @Column(nullable = false, columnDefinition="TEXT")
    private String recipe;

    @OneToOne
    private ImageRecipe imagerecipe;

    @OneToOne
    private Section section;

    public Recipe(Long id, String name, String ingredients, String recipe) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public ImageRecipe getImagerecipe() {
        return imagerecipe;
    }

    public void setImagerecipe(ImageRecipe imagerecipe) {
        this.imagerecipe = imagerecipe;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }    
}