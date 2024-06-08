package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Association")
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer index;

    @ManyToOne
    @JoinColumn(name = "data_points_id", nullable = false)
    @Getter
    @Setter
    private DataPoints data_points;

    @ManyToOne
    @JoinColumn(name = "concept_id", nullable = false)
    @Getter
    @Setter
    private Concept concept;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    @Getter
    @Setter
    private Role role;
}

