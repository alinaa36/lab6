package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.*;

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

//    @OneToMany(mappedBy = "object_control", cascade = CascadeType.ALL)
//    private List<Metadata> metadata_list;

//    @Getter
//    @Setter
//    @OneToOne(mappedBy = "object_control", cascade = CascadeType.ALL)
//    private DataPoints dataPoints;
////
//    @Getter
//    @Setter
//    @OneToMany(mappedBy = "object_control", cascade = CascadeType.ALL)
//    private List<Concept> concept;
}
