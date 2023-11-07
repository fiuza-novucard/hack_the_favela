package com.aulas.spring.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto criarProduto(Long id, String nome, double preco) {
        Produto produto = new Produto(id, nome, preco);
        return produtoRepository.salvar(produto);
    }

    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.buscarPorId(id);
    }
}
