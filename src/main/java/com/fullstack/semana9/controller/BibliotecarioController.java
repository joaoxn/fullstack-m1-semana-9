package com.fullstack.semana9.controller;

import com.fullstack.semana9.database.entity.BibliotecarioEntity;
import com.fullstack.semana9.service.BibliotecarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bibliotecarios")
public class BibliotecarioController extends GenericController<BibliotecarioEntity, BibliotecarioEntity, BibliotecarioService> {
    public BibliotecarioController(BibliotecarioService service) {
        super(service);
    }
}
