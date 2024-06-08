package com.example.lab6.Service;

import com.example.lab6.Entity.ObjectControl;
import com.example.lab6.Repository.ObjectControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObjectControlService {

    private final ObjectControlRepository objectControlRepository;

    @Autowired
    public ObjectControlService(ObjectControlRepository objectControlRepository) {
        this.objectControlRepository = objectControlRepository;
    }

    public ObjectControl getObjectControlById(int objectControlId) {
        return objectControlRepository.findById(objectControlId)
                .orElse(null); // Чи повертати null, якщо об'єкт не знайдено
    }

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
