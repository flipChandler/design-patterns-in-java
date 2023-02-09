package proxy.orcamento.service.desconto;

import proxy.orcamento.Pedido;
import proxy.orcamento.service.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
