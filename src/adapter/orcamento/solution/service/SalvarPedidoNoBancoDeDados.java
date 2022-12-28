package adapter.orcamento.solution.service;


import adapter.orcamento.solution.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados: " + pedido);
    }
}
