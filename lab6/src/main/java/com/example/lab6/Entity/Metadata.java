package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "metadata")
public class Metadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "metadata_id")
    private Integer metadata_id;

    @Getter
    @Setter
    @Column(name = "matadata_key")
    private String matadata_key;

    @Getter
    @Setter
    @Column(name = "metadata_value")
    private String matadata_value;

    @ManyToOne
    @JoinColumn(name = "object_control_id", nullable = false)
    @Getter
    @Setter
    private ObjectControl object_control;
}
