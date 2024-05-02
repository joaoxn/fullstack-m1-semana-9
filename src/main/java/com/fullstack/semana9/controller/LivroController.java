package com.fullstack.semana9.controller;

import com.fullstack.semana9.database.entity.LivroEntity;
import com.fullstack.semana9.service.LivroService;

public class LivroController extends GenericController<LivroEntity, LivroEntity, LivroService> {
    public LivroController(String controllerMapping, LivroService service) {
        super(controllerMapping, service);
    }
}
