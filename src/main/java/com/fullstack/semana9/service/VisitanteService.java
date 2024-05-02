package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.VisitanteEntity;
import com.fullstack.semana9.database.repository.VisitanteRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitanteService extends GenericServiceImpl<VisitanteEntity, VisitanteEntity, VisitanteRepository> implements GenericService<VisitanteEntity, VisitanteEntity> {
    public VisitanteService(VisitanteRepository repository) {
        super(repository);
    }

    @Override
    public VisitanteEntity equalProperties(VisitanteEntity entity, VisitanteEntity data) {
        String nome = data.getNome();
        if (nome != null) {
            entity.setNome(nome);
        }

        String telefone = data.getTelefone();
        if (telefone != null) {
            entity.setTelefone(telefone);
        }

        return entity;
    }

    @Override
    public VisitanteEntity newEntity() {
        return new VisitanteEntity();
    }
}
