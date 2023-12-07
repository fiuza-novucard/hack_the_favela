package com.aulas.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @GetMapping("/listar-historico")
    public String listarHistorico() {
        return "Listando histórico";
    }

}
