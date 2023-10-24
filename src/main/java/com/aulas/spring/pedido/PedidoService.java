package com.aulas.spring.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private CalculadoraDesconto calculadoraDesconto;

    @Autowired
    public PedidoService(CalculadoraDesconto calculadoraDesconto) {
        this.calculadoraDesconto = calculadoraDesconto;
    }

    public double calcularValorTotal(Pedido pedido) {
        double valorTotal = pedido.getItens().stream().mapToDouble(ItemPedido::getPreco).sum();

        double desconto = calculadoraDesconto.calcularDesconto(pedido);

        return valorTotal - desconto;
    }
}
