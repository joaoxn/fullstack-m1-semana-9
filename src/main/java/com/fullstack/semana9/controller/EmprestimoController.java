package com.fullstack.semana9.controller;

import com.fullstack.semana9.database.entity.EmprestimoEntity;
import com.fullstack.semana9.service.EmprestimoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emprestimos")
public class EmprestimoController extends GenericController<EmprestimoEntity, EmprestimoRequest, EmprestimoService> {
    public EmprestimoController(EmprestimoService service) {
        super(service);
    }
}
