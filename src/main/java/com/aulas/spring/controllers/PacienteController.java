package com.aulas.spring.controllers;

import com.aulas.spring.models.Paciente;
import com.aulas.spring.models.Paciente_imc;
import com.aulas.spring.repositories.PacienteHistoricoRepository;
import com.aulas.spring.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {


    @Autowired
    private PacienteHistoricoRepository pacienteHistoricoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/listar-historico/{id}")
    public List<Paciente_imc> listarHistorico(@RequestParam(value = "id", defaultValue = "0") Long id) {
       return pacienteHistoricoRepository.findByCampoFiltrado(id.intValue());
    }
    @PostMapping(value ="salvarpaciente")
    @ResponseBody
     public ResponseEntity<Paciente> salvarpaciente(@RequestBody Paciente paciente){
        Paciente cliente = pacienteRepository.save(paciente);
        return new ResponseEntity<Paciente>(cliente, HttpStatus.CREATED);
}
    @PostMapping(value ="salvardadospacienteimc")
    public  ResponseEntity<Paciente_imc> salvardadospacienteimc(@RequestBody Paciente_imc paciente_imc){
        Paciente_imc dados = pacienteHistoricoRepository.save(paciente_imc);
        return  new ResponseEntity<Paciente_imc>(dados,HttpStatus.CREATED);
    }

    @GetMapping("/media-imc/{dataInicio}/{dataFim}/{id}")
    public double mediaImc(@RequestParam(value = "id", defaultValue = "0") Long id, @RequestParam(value = "dataInicio", defaultValue = "0") String dataInicio, @RequestParam(value = "dataFim", defaultValue = "0") String dataFim) {
        return pacienteHistoricoRepository.mediaImc(id.intValue(), dataInicio, dataFim);
    }

}
