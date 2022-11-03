package builder.pedidovenda.solution.model;


import builder.pedidovenda.problem.model.Cliente;
import builder.pedidovenda.problem.model.ItemPedido;
import builder.pedidovenda.problem.model.PedidoVenda;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoVendaBuilder {

    private PedidoVenda pedidoVenda;

    public PedidoVendaBuilder() {
        this.pedidoVenda = new PedidoVenda();
    }

    public PedidoVendaBuilder comClienteVip(String nome) {
        this.pedidoVenda.setCliente(new Cliente(nome, true));
        return this;
    }

    public PedidoVendaBuilder comClienteNormal(String nome) {
        this.pedidoVenda.setCliente(new Cliente(nome, false));
        return this;
    }

    public PedidoVendaBuilder comItem(String nome, Integer quantidade, String valorUnitario) {
        ItemPedido itemPedido = ItemPedido.of(nome, quantidade, new BigDecimal(valorUnitario));
        if (this.pedidoVenda.getItensPedido() == null) {
            this.pedidoVenda.setItensPedido(new ArrayList<>());
        }
        this.pedidoVenda.getItensPedido().add(itemPedido);

        return this;
    }

    public PedidoVenda build() {
        return this.pedidoVenda;
    }
}
