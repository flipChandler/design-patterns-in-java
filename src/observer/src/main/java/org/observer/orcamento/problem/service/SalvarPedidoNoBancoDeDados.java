package org.observer.orcamento.problem.service;

import org.observer.orcamento.problem.Pedido;

public class SalvarPedidoNoBancoDeDados {

    public void executar(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados: " + pedido);
    }
}
