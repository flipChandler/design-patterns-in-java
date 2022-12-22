package org.observer.orcamento.problem.command;

import org.observer.orcamento.problem.Orcamento;
import org.observer.orcamento.problem.Pedido;
import org.observer.orcamento.problem.service.EnviarEmailPedido;
import org.observer.orcamento.problem.service.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void execute(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvarPedidoNoBancoDeDados = new SalvarPedidoNoBancoDeDados();

        enviarEmailPedido.executar(pedido);
        salvarPedidoNoBancoDeDados.executar(pedido);
    }
}
