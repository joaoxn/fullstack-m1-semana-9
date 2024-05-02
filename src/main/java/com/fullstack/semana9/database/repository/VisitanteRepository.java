package com.fullstack.semana9.database.repository;

import com.fullstack.semana9.database.entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
}