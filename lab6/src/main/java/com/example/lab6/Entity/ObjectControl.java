package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "ObjectControl")
public class ObjectControl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int objectControlId;

    @Getter
    @Setter
    private String objectType;

    @Getter
    @Setter
    @OneToMany(mappedBy = "objectControl", cascade = CascadeType.ALL)
    private List<Metadata> metadataList;

    @Getter
    @Setter
    @OneToOne(mappedBy = "objectControl", cascade = CascadeType.ALL)
    private DataPoints dataPoints;

    @Getter
    @Setter
    @OneToOne(mappedBy = "objectControl", cascade = CascadeType.ALL)
    private Concept concept;

    // Getters and setters
}
