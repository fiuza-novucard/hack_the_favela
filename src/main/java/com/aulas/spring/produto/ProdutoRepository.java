package com.aulas.spring.produto;

import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository {

    Produto salvar(Produto produto);

    Produto buscarPorId(Long id);
}
