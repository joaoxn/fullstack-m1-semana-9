package com.fullstack.semana9.controller;

import com.fullstack.semana9.database.entity.VisitanteEntity;
import com.fullstack.semana9.service.VisitanteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("visitantes")
public class VisitanteController extends GenericController<VisitanteEntity, VisitanteEntity, VisitanteService> {
    public VisitanteController(VisitanteService service) {
        super(service);
    }
}
