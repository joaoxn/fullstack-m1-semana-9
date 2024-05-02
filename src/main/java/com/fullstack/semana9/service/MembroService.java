package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.MembroEntity;
import com.fullstack.semana9.database.repository.MembroRepository;
import org.springframework.stereotype.Service;

@Service
public class MembroService extends GenericServiceImpl<MembroEntity, MembroEntity, MembroRepository> implements GenericService<MembroEntity, MembroEntity> {
    public MembroService(MembroRepository repository) {
        super(repository);
    }

    @Override
    public MembroEntity equalProperties(MembroEntity entity, MembroEntity data) {
        String nome = data.getNome();
        if (nome != null) {
            entity.setNome(nome);
        }

        String endereco = data.getEndereco();
        if (endereco != null) {
            entity.setEndereco(endereco);
        }

        String telefone = data.getTelefone();
        if (telefone != null) {
            entity.setTelefone(telefone);
        }

        return entity;
    }

    @Override
    public MembroEntity newEntity() {
        return new MembroEntity();
    }
}
