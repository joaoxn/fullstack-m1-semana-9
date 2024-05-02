package com.fullstack.semana9.database.repository;

import com.fullstack.semana9.database.entity.LivroEntity;
import com.fullstack.semana9.database.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
}