package com.example.lab6.Controller;

import com.example.lab6.Entity.Metadata;
import com.example.lab6.Service.MetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/metadata")
public class MetadataController {

    @Autowired
    private MetadataService metadataService;

    @GetMapping
    public List<Metadata> getAllMetadata() {
        return metadataService.getAllMetadata();
    }

    @GetMapping("/{id}")
    public Optional<Metadata> getMetadataById(@PathVariable Integer id) {
        return metadataService.getMetadataById(id);
    }

    @PostMapping
    public Metadata createMetadata(@RequestBody Metadata metadata) {
        return metadataService.saveMetadata(metadata);
    }

    @PutMapping("/{id}")
    public Metadata updateMetadata(@PathVariable Integer id, @RequestBody Metadata metadata) {
        metadata.setMetadata_id(id);
        return metadataService.saveMetadata(metadata);
    }

    @DeleteMapping("/{id}")
    public void deleteMetadata(@PathVariable Integer id) {
        metadataService.deleteMetadata(id);
    }
}

