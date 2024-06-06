package com.example.lab6.Controller;

import com.example.lab6.Entity.Concept;
import com.example.lab6.Service.ConceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/concepts")
public class ConceptController {

    @Autowired
    private ConceptService conceptService;

    @GetMapping
    public List<Concept> getAllConcepts() {
        return conceptService.getAllConcepts();
    }

    @GetMapping("/{id}")
    public Optional<Concept> getConceptById(@PathVariable Integer id) {
        return conceptService.getConceptById(id);
    }

    @PostMapping
    public Concept createConcept(@RequestBody Concept concept) {
        return conceptService.saveConcept(concept);
    }

    @PutMapping("/{id}")
    public Concept updateConcept(@PathVariable Integer id, @RequestBody Concept concept) {
        concept.setConceptId(id);
        return conceptService.saveConcept(concept);
    }

    @DeleteMapping("/{id}")
    public void deleteConcept(@PathVariable Integer id) {
        conceptService.deleteConcept(id);
    }
}

