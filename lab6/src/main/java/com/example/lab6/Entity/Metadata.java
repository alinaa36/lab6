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
    @Column(name = "metadata_key")
    private String metadata_key;

    @Getter
    @Setter
    @Column(name = "metadata_value")
    private String metadata_value;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "object_control_id", nullable = false)
    private ObjectControl object_control;
}
