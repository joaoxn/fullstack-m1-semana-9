package com.fullstack.semana9.controller;

import com.fullstack.semana9.service.MembroService;
import com.fullstack.semana9.database.entity.MembroEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("membros")
public class MembroController extends GenericController<MembroEntity, MembroEntity, MembroService> {
    public MembroController(MembroService service) {
        super(service);
    }
}
