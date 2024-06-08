package com.example.lab6.Controller;

import com.example.lab6.Entity.Concept;
import com.example.lab6.Entity.ObjectControl;
import com.example.lab6.Service.ConceptService;
import com.example.lab6.Service.ObjectControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/concepts")
public class ConceptController {

    @Autowired
    private ConceptService conceptService;


    private final ObjectControlService objectControlService;
    public ConceptController(ConceptService conceptService, ObjectControlService objectControlService) {
        this.conceptService = conceptService;
        this.objectControlService = objectControlService;
    }



    @GetMapping
    public List<Concept> getAllConcepts() {
        return conceptService.getAllConcepts();
    }

    @GetMapping("/{id}")
    public Optional<Concept> getConceptById(@PathVariable Integer id) {
        return conceptService.getConceptById(id);
    }
    @PostMapping
    public ResponseEntity<String> createConcept(@RequestBody Concept concept) {
        ObjectControl objectControl = objectControlService.getObjectControlById(concept.getObject_control().getObject_control_id());
        if (objectControl == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ObjectControl with provided id not found");
        }

        concept.setObject_control(objectControl);

        Concept savedConcept = conceptService.saveConcept(concept);

        return ResponseEntity.ok("Concept saved with id: " + savedConcept.getConcept_id());
    }

    @PutMapping("/{id}")
    public Concept updateConcept(@PathVariable Integer id, @RequestBody Concept concept) {
        concept.setConcept_id(id);
        return conceptService.saveConcept(concept);
    }

    @DeleteMapping("/{id}")
    public void deleteConcept(@PathVariable Integer id) {
        conceptService.deleteConcept(id);
    }
}

