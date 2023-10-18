package com.aulas.spring;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public List<ItemPedido> getItens() {
        return this.itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }
}