package com.aulas.spring.models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void adicionaLivro(Livro livro) {
        this.livros.add(livro);
    }

    public Livro getLivroPorId(int id) {
        for (Livro livro: this.livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }

        return null;
    }

}
