package com.aulas.spring.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@RestController
public class LoggerController {
    Logger logger;
    /*
    * 1. Criar um endpoint POST /log que recebe um texto e salve no arquivo de log dizendo se veio por body ou por query param ou pathc
    * 2. Criar um endpoint GET /log que retorna o conteúdo do arquivo de log
    *
    */
    public LoggerController() throws IOException {
        logger = Logger.getLogger(LoggerController.class.getName());
        FileHandler fileHandler = new FileHandler("logger.txt", true); // O segundo parâmetro "true" indica append
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

    }

    @PostMapping("/log")
    public String log(@RequestBody String log) {
        logger.info(log+" - por body");
        return new ResponseEntity<String>(log, HttpStatus.OK).toString();
    }

}
