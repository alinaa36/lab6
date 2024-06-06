package com.example.lab6.Service;

import com.example.lab6.Entity.Metadata;
import com.example.lab6.Repository.MetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetadataService {

    @Autowired
    private MetadataRepository metadataRepository;

    public List<Metadata> getAllMetadata() {
        return metadataRepository.findAll();
    }

    public Optional<Metadata> getMetadataById(Integer id) {
        return metadataRepository.findById(id);
    }

    public Metadata saveMetadata(Metadata metadata) {
        return metadataRepository.save(metadata);
    }

    public void deleteMetadata(Integer id) {
        metadataRepository.deleteById(id);
    }
}

