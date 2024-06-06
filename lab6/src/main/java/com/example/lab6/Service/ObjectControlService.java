package com.example.lab6.Service;

import com.example.lab6.Entity.ObjectControl;
import com.example.lab6.Repository.ObjectControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObjectControlService {

    @Autowired
    private ObjectControlRepository objectControlRepository;

    public List<ObjectControl> getAllObjectControls() {
        return objectControlRepository.findAll();
    }

    public Optional<ObjectControl> getObjectControlById(Integer id) {
        return objectControlRepository.findById(id);
    }

    public ObjectControl saveObjectControl(ObjectControl objectControl) {
        return objectControlRepository.save(objectControl);
    }

    public void deleteObjectControl(Integer id) {
        objectControlRepository.deleteById(id);
    }
}
