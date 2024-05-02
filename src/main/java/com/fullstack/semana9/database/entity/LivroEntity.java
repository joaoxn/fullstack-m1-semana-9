package com.fullstack.semana9.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "livro")
        public class LivroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(120)", nullable = false)
    private String titulo;

    @Column(columnDefinition = "varchar(80)")
    private String autor;

    @Column(columnDefinition = "date")
    private LocalDate dataPublicacao;
}
