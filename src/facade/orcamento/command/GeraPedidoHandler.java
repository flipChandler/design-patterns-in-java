package facade.orcamento.command;



import facade.orcamento.Pedido;
import facade.orcamento.service.AcaoAposGerarPedido;
import facade.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    // implementação do Facade
    public void execute(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
