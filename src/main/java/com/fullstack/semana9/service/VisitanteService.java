package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.VisitanteEntity;
import com.fullstack.semana9.database.repository.VisitanteRepository;

public class VisitanteService extends GenericServiceImpl<VisitanteEntity, VisitanteEntity, VisitanteRepository> {
    public VisitanteService(VisitanteRepository repository) {
        super(repository);
    }

    @Override
    public VisitanteEntity equalProperties(VisitanteEntity entity, VisitanteEntity data) {


        return entity;
    }

    @Override
    public VisitanteEntity newEntity() {
        return new VisitanteEntity();
    }
}
