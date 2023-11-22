package com.aulas.spring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/hora-fuso")
public class DataController {

    @GetMapping
    public ResponseEntity<String> getFusoHorario(@RequestBody String fusoHorario) {
        /**
         * Enviar a hora de acordo com o país válido
         * Se enviar nome de país inválido, retornar 400
         */

        try {
            String resultado = LocalDateTime.now(ZoneId.of(fusoHorario)).toString();
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (DateTimeException dateTimeException) {
            String erro = String.format("O fuso horário %s é inválido!", fusoHorario);
            return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    @RequestMapping("/teste")
    public ResponseEntity<String> getTest() {
        return new ResponseEntity<>("TESTE", HttpStatus.BAD_REQUEST);
    }
}
