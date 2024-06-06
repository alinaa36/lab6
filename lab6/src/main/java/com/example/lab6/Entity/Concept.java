package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Concept")
public class Concept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer conceptId;

    @Getter
    @Setter
    private String conceptName;

    @Getter
    @Setter
    private String type;

    @Getter
    @Setter
    private String validator;

    @Getter
    @Setter
    private String tableName;

    @Getter
    @Setter
    private String filter;

    @ManyToOne
    @JoinColumn(name = "conceptParentId")
    @Getter
    @Setter
    private Concept conceptParent;

    @OneToMany(mappedBy = "conceptParent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Set<Concept> subConcepts;

    @OneToOne
    @MapsId
    @JoinColumn(name = "conceptId")
    @Getter
    @Setter
    private ObjectControl objectControl;
}
