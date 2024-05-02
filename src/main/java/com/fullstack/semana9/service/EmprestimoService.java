package com.fullstack.semana9.service;

import com.fullstack.semana9.controller.EmprestimoRequest;
import com.fullstack.semana9.database.entity.EmprestimoEntity;
import com.fullstack.semana9.database.entity.LivroEntity;
import com.fullstack.semana9.database.entity.MembroEntity;
import com.fullstack.semana9.database.repository.EmprestimoRepository;
import com.fullstack.semana9.database.repository.LivroRepository;
import com.fullstack.semana9.database.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmprestimoService extends GenericServiceImpl<EmprestimoEntity, EmprestimoRequest, EmprestimoRepository> implements GenericService<EmprestimoEntity, EmprestimoRequest> {
    private final MembroRepository membroRepository;
    private final LivroRepository livroRepository;

    public EmprestimoService(EmprestimoRepository repository,
                             MembroRepository membroRepository,
                             LivroRepository livroRepository) {
        super(repository);
        this.membroRepository = membroRepository;
        this.livroRepository = livroRepository;
    }

    @Override
    public EmprestimoEntity equalProperties(EmprestimoEntity entity, EmprestimoRequest data) {
        LivroEntity livro = null;
        try {
        livro = livroRepository.findById(data.livro_id())
                .orElseThrow();
        } catch (Exception ignore) {}
        if (livro != null) {
            entity.setLivro(livro);
        }

        MembroEntity membro = null;
        try {
            membro = membroRepository.findById(data.membro_id())
                    .orElseThrow();
        } catch (Exception ignore) {}
        if (membro != null) {
            entity.setMembro(membro);
        }

        LocalDate dataEmprestimo = data.dataEmprestimo();
        if (dataEmprestimo != null) {
            entity.setDataEmprestimo(dataEmprestimo);
        }

        LocalDate dataDevolucao = data.dataDevolucao();
        if (dataDevolucao != null) {
            entity.setDataDevolucao(dataDevolucao);
        }

        return entity;
    }

    @Override
    public EmprestimoEntity newEntity() {
        return new EmprestimoEntity();
    }
}
