package com.aulas.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PedidoServiceTest {

    @InjectMocks
    PedidoService pedidoService;

    @Mock
    CalculadoraDesconto calculadoraDesconto;

    @Test
    public void testCalcularValorTotal() {

        Pedido pedido = new Pedido();

        ItemPedido item1 = new ItemPedido("feijao", 5.0);
        ItemPedido item2 = new ItemPedido("arroz", 10.0);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        when(calculadoraDesconto.calcularDesconto(any(Pedido.class))).thenReturn(2.0);

        double valorTotal = pedidoService.calcularValorTotal(pedido);

        Assertions.assertEquals(13.0, valorTotal);
        verify(calculadoraDesconto).calcularDesconto(any(Pedido.class));
    }
}
