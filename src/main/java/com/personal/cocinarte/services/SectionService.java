package com.personal.cocinarte.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.personal.cocinarte.models.Section;
import com.personal.cocinarte.repositories.SectionRepository;

@Service
public class SectionService {
    private SectionRepository repository;


    public SectionService(SectionRepository repository) {
        this.repository = repository;
    }


    public Section save(Section sectionNew) {
        return repository.save(sectionNew);
    }

    public List<Section> listAll() {
        return repository.findAll();
    }

    public Section listOne(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    public void delete(Long id) throws IOException {
        repository.deleteById(id);
    }

    public Section update(Long id, Section sectionNew) {
        Section sectionToUpdate = sectionNew;
        sectionToUpdate.setId(id);
        return repository.save(sectionToUpdate);
    }

}
