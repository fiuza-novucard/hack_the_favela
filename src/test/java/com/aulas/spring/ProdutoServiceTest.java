package com.aulas.spring;

import com.aulas.spring.produto.Produto;
import com.aulas.spring.produto.ProdutoRepository;
import com.aulas.spring.produto.ProdutoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProdutoServiceTest {

    @InjectMocks
    ProdutoService produtoService;

    @Mock
    ProdutoRepository produtoRepository;

    @Test
    public void testCriarProduto(){

        Long id = 1L;
        String nome = "Carne moida";
        double preco = 15.0;


        Produto produto = new Produto(id,nome,preco);

        when(produtoRepository.salvar(any(Produto.class))).thenReturn(produto);

        Produto produtoRetornado = produtoService.criarProduto(id,nome,preco);

        Assertions.assertEquals(1L,produtoRetornado.getId());
        Assertions.assertEquals("Carne moida",produtoRetornado.getNome());
        Assertions.assertEquals(15.0,produtoRetornado.getPreco());
        verify(produtoRepository).salvar(any(Produto.class));







    }
}
