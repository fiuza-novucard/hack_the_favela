package com.aulas.spring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RestController
public class DataController {

    @GetMapping
    @RequestMapping("/hora-fuso")
    public ResponseEntity<String> getFusoHorario(@RequestBody String fusoHorario) {
        /**
         * Enviar a hora de acordo com o país válido
         * Se enviar nome de país inválido, retornar 400
         */

        try {
            String resultado = LocalDateTime.now(ZoneId.of(fusoHorario)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (DateTimeException dateTimeException) {
            String erro = String.format("O fuso horário %s é inválido!", fusoHorario);
            return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    @RequestMapping("/hora-fuso/{fusoHorario}/{formato}")
    //http://localhost:60000/fuso/UTC/HH:mm
    public ResponseEntity<String> getFusoHorario2(@PathVariable String fusoHorario, @PathVariable String formato) {
        /**
         * Enviar a hora de acordo com o país válido
         * Se enviar nome de país inválido, retornar 400
         */

        try {

            String resultado = LocalDateTime.now(ZoneId.of(fusoHorario)).format(DateTimeFormatter.ofPattern(formato));
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (DateTimeException dateTimeException) {
            String erro = String.format("O fuso horário %s é inválido!", fusoHorario);
            return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    @RequestMapping("/fuso")
    //http://localhost:60000/fuso?fuso=UTC&formato=HH:mm
    public ResponseEntity<String> getFusoHorario3(@RequestParam(name = "fuso") String fusoHorario, @RequestParam(name = "formato") String formato) {
        /**
         * Enviar a hora de acordo com o país válido
         * Se enviar nome de país inválido, retornar 400
         */

        try {
            formato = (formato == null) ? "dd/MM/yyyy HH:mm:ss" : formato;
            String resultado = LocalDateTime.now(ZoneId.of(fusoHorario)).format(DateTimeFormatter.ofPattern(formato));
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (DateTimeException dateTimeException) {
            String erro = String.format("O fuso horário %s é inválido!", fusoHorario);
            return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
        }
    }

}
