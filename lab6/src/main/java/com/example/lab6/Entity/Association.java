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
    @JoinColumn(name = "dataPointsId", nullable = false)
    @Getter
    @Setter
    private DataPoints dataPoints;

    @ManyToOne
    @JoinColumn(name = "conceptId", nullable = false)
    @Getter
    @Setter
    private Concept concept;

    @ManyToOne
    @JoinColumn(name = "roleId", nullable = false)
    @Getter
    @Setter
    private Role role;
}

