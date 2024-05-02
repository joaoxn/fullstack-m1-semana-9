package com.fullstack.semana9.controller;

import java.time.LocalDate;

public record EmprestimoRequest(
        Long livro_id,
        Long membro_id,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao
) {
}
