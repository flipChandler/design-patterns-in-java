package facade.orcamento.service.desconto;

import facade.orcamento.Pedido;
import facade.orcamento.service.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
