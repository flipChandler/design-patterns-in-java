package proxy.orcamento.service;


import proxy.orcamento.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados: " + pedido);
    }
}
