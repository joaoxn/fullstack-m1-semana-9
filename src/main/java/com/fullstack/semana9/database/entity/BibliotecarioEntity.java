package com.fullstack.semana9.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "bibliotecario")
public class BibliotecarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(80)", nullable = false)
    private String nome;

    @Column(columnDefinition = "varchar(256)", nullable = false)
    private String email;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String senha;
}
