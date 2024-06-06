package com.example.lab6.Controller;

import com.example.lab6.Entity.Association;
import com.example.lab6.Service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/associations")
public class AssociationController {

    @Autowired
    private AssociationService associationService;

    @GetMapping
    public List<Association> getAllAssociations() {
        return associationService.getAllAssociations();
    }

    @GetMapping("/{id}")
    public Optional<Association> getAssociationById(@PathVariable Integer id) {
        return associationService.getAssociationById(id);
    }

    @PostMapping
    public Association createAssociation(@RequestBody Association association) {
        return associationService.saveAssociation(association);
    }

    @PutMapping("/{id}")
    public Association updateAssociation(@PathVariable Integer id, @RequestBody Association association) {
        association.setIndex(id);
        return associationService.saveAssociation(association);
    }

    @DeleteMapping("/{id}")
    public void deleteAssociation(@PathVariable Integer id) {
        associationService.deleteAssociation(id);
    }
}
