package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "data_points")
public class DataPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer data_points_id;

    @Column(unique = true)
    @Getter
    @Setter
    private String table_name;

    @OneToOne
    @JoinColumn(name = "object_control_id",  nullable = false)
    @Getter
    @Setter
    private ObjectControl object_control;
}

