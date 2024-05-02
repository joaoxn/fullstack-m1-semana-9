package com.fullstack.semana9.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "emprestimo")
        public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livro_id", columnDefinition = "bigint")
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "membro_id", columnDefinition = "bigint")
    private MembroEntity membro;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    @Column(nullable = false)
    private LocalDate dataDevolucao;
}
