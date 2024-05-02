package com.fullstack.semana9.service;

import com.fullstack.semana9.database.entity.BibliotecarioEntity;
import com.fullstack.semana9.database.repository.BibliotecarioRepository;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService extends GenericServiceImpl<BibliotecarioEntity, BibliotecarioEntity, BibliotecarioRepository> implements GenericService<BibliotecarioEntity, BibliotecarioEntity> {
    public BibliotecarioService(BibliotecarioRepository repository) {
        super(repository);
    }

    @Override
    public BibliotecarioEntity equalProperties(BibliotecarioEntity entity, BibliotecarioEntity data) {
        String nome = data.getNome();
        if (nome != null) {
            entity.setNome(nome);
        }

        String email = data.getEmail();
        if (email != null) {
            entity.setEmail(email);
        }

        String senha = data.getSenha();
        if (senha != null) {
            entity.setSenha(senha);
        }

        return entity;
    }

    @Override
    public BibliotecarioEntity newEntity() {
        return new BibliotecarioEntity();
    }
}
