package com.fullstack.semana9.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "visitante")
        public class VisitanteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(80)", nullable = false)
    private String nome;

    @Column(columnDefinition = "varchar(12)", nullable = false)
    private String telefone;
}
