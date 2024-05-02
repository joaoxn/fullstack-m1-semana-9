package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.LivroEntity;
import com.fullstack.semana9.database.repository.LivroRepository;

public class LivroService extends GenericServiceImpl<LivroEntity, LivroEntity, LivroRepository> {
    public LivroService(LivroRepository repository) {
        super(repository);
    }

    @Override
    public LivroEntity equalProperties(LivroEntity entity, LivroEntity data) {


        return entity;
    }

    @Override
    public LivroEntity newEntity() {
        return new LivroEntity();
    }
}
