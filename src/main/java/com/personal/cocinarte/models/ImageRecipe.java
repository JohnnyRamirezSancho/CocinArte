package com.personal.cocinarte.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imagerecipe")
public class ImageRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagerecipe")
    private Long id;
    @Column(nullable = false)
    private String image;

    public ImageRecipe(Long id, String image) {
        this.id = id;
        this.image = image;
    }

    public ImageRecipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
