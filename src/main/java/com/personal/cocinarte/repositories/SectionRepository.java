package com.personal.cocinarte.repositories;
import com.personal.cocinarte.models.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
    
}
