package command.orcamento.command;

import command.orcamento.Orcamento;
import command.orcamento.Pedido;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injecao de dependencias: repository, service, etc

    public void execute(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados, do cliente - " + pedido.getCliente());
        System.out.println("Enviar email com dados do novo pedido do cliente - " + pedido.getCliente());
    }
}
