package com.personal.cocinarte.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_section")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

    @OneToOne
    private ImageSection imagesection;


    public Section(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Section() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageSection getImagesection() {
        return imagesection;
    }

    public void setImagesections(ImageSection imagesection) {
        this.imagesection = imagesection;
    }


}
