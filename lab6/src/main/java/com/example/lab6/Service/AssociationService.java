package com.example.lab6.Service;

import com.example.lab6.Entity.Association;
import com.example.lab6.Repository.AssociationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssociationService {

    @Autowired
    private AssociationRepository associationRepository;

    public List<Association> getAllAssociations() {
        return associationRepository.findAll();
    }

    public Optional<Association> getAssociationById(Integer id) {
        return associationRepository.findById(id);
    }

    public Association saveAssociation(Association association) {
        return associationRepository.save(association);
    }

    public void deleteAssociation(Integer id) {
        associationRepository.deleteById(id);
    }
}

