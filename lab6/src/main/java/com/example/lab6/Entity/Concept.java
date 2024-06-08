package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Concept")
public class Concept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer concept_id;

    @Getter
    @Setter
    @Column(name = "new_concept_name")
    private String new_concept_name;

    @Getter
    @Setter
    @Column(name = "new_type")
    private String new_type;

    @Getter
    @Setter
    @Column(name = "new_validator")
    private String new_validator;

    @Getter
    @Setter
    @Column(name = "new_table_name")
    private String new_table_name;

    @Getter
    @Setter
    @Column(name = "new_filter")
    private String new_filter;

//    @OneToMany(mappedBy = "concept_parent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @Getter
//    @Setter
//    private Set<Concept> subConcepts;

    @OneToOne
    @JoinColumn(name = "object_control_id",  nullable = false)
    @Getter
    @Setter
    private ObjectControl object_control;
}
