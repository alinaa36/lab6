package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Metadata")
public class Metadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer metadataId;

    @Getter
    @Setter
    private String key;

    @Getter
    @Setter
    private String value;

    @ManyToOne
    @JoinColumn(name = "objectControlId", nullable = false)
    @Getter
    @Setter
    private ObjectControl objectControl;
}
