package org.observer.orcamento.solution.service;

import org.observer.orcamento.solution.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados: " + pedido);
    }
}
