package com.example.lab6.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "role_id")  // Вказуємо правильне ім'я колонки
    private Integer role_id;

    @Getter
    @Setter
    @Column(name = "role_type")  // Вказуємо правильне ім'я колонки
    private String role_type;
}
