package facade.orcamento.service;


import facade.orcamento.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido: " + pedido);
    }
}
