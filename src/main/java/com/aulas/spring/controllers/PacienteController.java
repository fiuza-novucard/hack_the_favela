package com.aulas.spring.controllers;

import com.aulas.spring.repositories.PacienteHistoricoRepository;
import com.aulas.spring.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {


    @Autowired
    private PacienteHistoricoRepository pacienteHistoricoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/listar-historico/{id}")
    public String listarHistorico(@RequestParam(value = "id", defaultValue = "0") Long id) {

        return "Listando histórico";
    }

}
