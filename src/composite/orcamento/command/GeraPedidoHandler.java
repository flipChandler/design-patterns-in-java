package composite.orcamento.command;



import composite.orcamento.Orcamento;
import composite.orcamento.Pedido;
import composite.orcamento.service.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
