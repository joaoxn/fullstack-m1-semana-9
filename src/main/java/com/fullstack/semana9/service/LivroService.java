package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.LivroEntity;
import com.fullstack.semana9.database.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LivroService extends GenericServiceImpl<LivroEntity, LivroEntity, LivroRepository> implements GenericService<LivroEntity, LivroEntity> {
    public LivroService(LivroRepository repository) {
        super(repository);
    }

    @Override
    public LivroEntity equalProperties(LivroEntity entity, LivroEntity data) {
        String titulo = data.getTitulo();
        if (titulo != null) {
            entity.setTitulo(titulo);
        }

        String autor = data.getAutor();
        if (autor != null) {
            entity.setAutor(autor);
        }

        LocalDate dataPublicacao = data.getDataPublicacao();
        if (dataPublicacao != null) {
            entity.setDataPublicacao(dataPublicacao);
        }

        return entity;
    }

    @Override
    public LivroEntity newEntity() {
        return new LivroEntity();
    }
}
