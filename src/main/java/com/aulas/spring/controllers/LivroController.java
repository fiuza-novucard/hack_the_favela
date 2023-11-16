package com.aulas.spring.controllers;

import com.aulas.spring.models.Biblioteca;
import com.aulas.spring.models.Livro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private Biblioteca biblioteca = new Biblioteca();

    @PostMapping
    public ResponseEntity criarLivro(@RequestBody Livro livro) {
        try {
            biblioteca.adicionaLivro(livro);
            System.out.println(String.format("Id: %d, titulo: %s, genero: %s, autor: %s. Livro criado!", livro.getId(),
                    livro.getTitulo(), livro.getGenero(), livro.getAutor()));
            return new ResponseEntity(HttpStatus.CREATED);
        } catch (HttpClientErrorException.BadRequest badRequest) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}
