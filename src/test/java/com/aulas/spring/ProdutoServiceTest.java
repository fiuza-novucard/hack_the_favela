package com.aulas.spring;

import com.aulas.spring.produto.Produto;
import com.aulas.spring.produto.ProdutoRepository;
import com.aulas.spring.produto.ProdutoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
public class ProdutoServiceTest {

    @InjectMocks
    ProdutoService produtoService;

    @Mock
    ProdutoRepository produtoRepository;

    @Test
    public void testCriarProduto() {
        Long id = 1L;
        String nome = "Novo Produto";
        double preco = 100.0;

        Produto produto = new Produto(id, nome, preco);

        when(produtoRepository.salvar(any(Produto.class))).thenReturn(produto);

        Produto produtoRetornado = produtoService.criarProduto(id, nome, preco);

        Assertions.assertEquals(1L, produtoRetornado.getId());
        Assertions.assertEquals("Novo Produto", produtoRetornado.getNome());
        Assertions.assertEquals(100.0, produtoRetornado.getPreco());
    }

    @Test
    public void testBuscarProdutoPorId() {
        Long id = 1L;
        String nome = "Novo Produto";
        double preco = 100.0;

        Produto produto = new Produto(id, nome, preco);

        when(produtoRepository.buscarPorId(anyLong())).thenReturn(produto);

        Produto produtoRetornado = produtoService.buscarProdutoPorId(id);

        Assertions.assertEquals(1L, produtoRetornado.getId());
        Assertions.assertEquals("Novo Produto", produtoRetornado.getNome());
        Assertions.assertEquals(100.0, produtoRetornado.getPreco());
    }
}
