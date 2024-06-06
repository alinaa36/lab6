package com.example.lab6.Service;

import com.example.lab6.Entity.Concept;
import com.example.lab6.Repository.ConceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConceptService {

    @Autowired
    private ConceptRepository conceptRepository;

    public List<Concept> getAllConcepts() {
        return conceptRepository.findAll();
    }

    public Optional<Concept> getConceptById(Integer id) {
        return conceptRepository.findById(id);
    }

    public Concept saveConcept(Concept concept) {
        return conceptRepository.save(concept);
    }

    public void deleteConcept(Integer id) {
        conceptRepository.deleteById(id);
    }
}

