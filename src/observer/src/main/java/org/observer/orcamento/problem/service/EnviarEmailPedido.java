package org.observer.orcamento.problem.service;

import org.observer.orcamento.problem.Pedido;

public class EnviarEmailPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido: " + pedido);
    }
}
