package com.personal.cocinarte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.cocinarte.models.ImageSection;

public interface ImageSectionRepository extends JpaRepository <ImageSection, Long> {
    public ImageSection findByImage(String image);
}
