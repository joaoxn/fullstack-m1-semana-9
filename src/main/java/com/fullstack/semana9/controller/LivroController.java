package com.fullstack.semana9.controller;

import com.fullstack.semana9.database.entity.LivroEntity;
import com.fullstack.semana9.service.LivroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livros")
public class LivroController extends GenericController<LivroEntity, LivroEntity, LivroService> {
    public LivroController(String controllerMapping, LivroService service) {
        super(controllerMapping, service);
    }
}
