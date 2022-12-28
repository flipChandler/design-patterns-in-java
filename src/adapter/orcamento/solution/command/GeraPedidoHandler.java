package adapter.orcamento.solution.command;



import adapter.orcamento.solution.Orcamento;
import adapter.orcamento.solution.Pedido;
import adapter.orcamento.solution.service.AcaoAposGerarPedido;

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

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
