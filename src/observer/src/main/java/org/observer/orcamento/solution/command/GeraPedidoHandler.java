package org.observer.orcamento.solution.command;

import org.observer.orcamento.solution.Orcamento;
import org.observer.orcamento.solution.Pedido;
import org.observer.orcamento.solution.service.AcaoAposGerarPedido;
import org.observer.orcamento.solution.service.EnviarEmailPedido;
import org.observer.orcamento.solution.service.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvarPedidoNoBancoDeDados = new SalvarPedidoNoBancoDeDados();

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
