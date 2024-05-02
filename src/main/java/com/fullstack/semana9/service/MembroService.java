package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.MembroEntity;
import com.fullstack.semana9.database.repository.MembroRepository;

public class MembroService extends GenericServiceImpl<MembroEntity, MembroEntity, MembroRepository> {
    public MembroService(MembroRepository repository) {
        super(repository);
    }

    @Override
    public MembroEntity equalProperties(MembroEntity entity, MembroEntity data) {


        return entity;
    }

    @Override
    public MembroEntity newEntity() {
        return new MembroEntity();
    }
}
