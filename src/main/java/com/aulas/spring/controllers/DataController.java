package com.aulas.spring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/hora-fuso")
public class DataController {



    @GetMapping
    public String getFusoHorario(@RequestBody String fusoHorario) {
        /**
         * Enviar a hora de acordo com o país válido
         * Se enviar nome de país inválido, retornar 400
         */
        return LocalDateTime.now().toString();
    }
}
