package com.aulas.spring.controllers;

import com.aulas.spring.models.Biblioteca;
import com.aulas.spring.models.Livro;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private Biblioteca biblioteca = new Biblioteca();

    @PostMapping
    public ResponseEntity criarLivro(@RequestBody Livro livro,  HttpServletRequest request) {
        try {
             request.getHeaderNames().asIterator().forEachRemaining(headerName -> {
                 System.out.println(String.format("Header '%s' = %s", headerName, request.getHeader(headerName)));
             });
            ObjectMapper objectMapper = new ObjectMapper();
            biblioteca.adicionaLivro(livro);
            System.out.println( objectMapper.writeValueAsString(livro));
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (HttpClientErrorException.BadRequest | JsonProcessingException badRequest) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity listarLivros() {
        return new ResponseEntity(biblioteca.getLivros(), HttpStatus.OK);
    }

}
