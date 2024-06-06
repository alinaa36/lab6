package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DataPoints")
public class DataPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer dataPointsId;

    @Column(unique = true)
    @Getter
    @Setter
    private String tableName;

    @OneToOne
    @MapsId
    @JoinColumn(name = "dataPointsId")
    @Getter
    @Setter
    private ObjectControl objectControl;
}

