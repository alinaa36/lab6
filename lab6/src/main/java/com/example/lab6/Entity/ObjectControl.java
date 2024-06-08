package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "object_control") // змінено назву таблиці
public class ObjectControl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "object_control_id") // змінено назву колонки
    private int object_control_id;

    @Getter
    @Setter
    @Column(name = "object_type") // змінено назву колонки
    private String object_type;

    @OneToMany(mappedBy = "object_control", cascade = CascadeType.ALL)
    private List<Metadata> metadata_list;

//    @Getter
//    @Setter
//    @OneToOne(mappedBy = "object_control", cascade = CascadeType.ALL)
//    @Column(name = "data_points") // змінено назву колонки
//    private DataPoints dataPoints;
//
//    @Getter
//    @Setter
//    @OneToOne(mappedBy = "object_control", cascade = CascadeType.ALL)
//    @Column(name = "concept") // змінено назву колонки
//    private Concept concept;

}
