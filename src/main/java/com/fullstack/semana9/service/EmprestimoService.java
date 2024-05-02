package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.EmprestimoEntity;
import com.fullstack.semana9.database.repository.EmprestimoRepository;

public class EmprestimoService extends GenericServiceImpl<EmprestimoEntity, EmprestimoEntity, EmprestimoRepository> {
    public EmprestimoService(EmprestimoRepository repository) {
        super(repository);
    }

    @Override
    public EmprestimoEntity equalProperties(EmprestimoEntity entity, EmprestimoEntity data) {


        return entity;
    }

    @Override
    public EmprestimoEntity newEntity() {
        return new EmprestimoEntity();
    }
}
