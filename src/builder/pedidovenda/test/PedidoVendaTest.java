package builder.pedidovenda.test;


import builder.pedidovenda.problem.model.Cliente;
import builder.pedidovenda.problem.model.ItemPedido;
import builder.pedidovenda.problem.model.PedidoVenda;
import builder.pedidovenda.solution.model.PedidoVendaBuilder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoVendaTest {

    @Test
    public void getValorTotal_deveCalcularValorTotal_seClienteVip() {
        PedidoVenda pedidoVenda = new PedidoVenda();

        Cliente cliente = new Cliente();
        cliente.setNome("John Doe");
        cliente.setVip(true);
        pedidoVenda.setCliente(cliente);

        ItemPedido item1 = new ItemPedido();
        item1.setNome("Calculadora");
        item1.setValorUnitario(new BigDecimal("200"));
        item1.setQuantidade(2);

        ItemPedido item2 = new ItemPedido();
        item2.setNome("Mochila");
        item2.setValorUnitario(new BigDecimal("250"));
        item2.setQuantidade(1);

        List<ItemPedido> itensPedidos = List.of(item1, item2);
        pedidoVenda.setItensPedido(itensPedidos);

        BigDecimal valorTotal = pedidoVenda.getValorTotal();
        assertEquals(new BigDecimal("624").doubleValue(), valorTotal.doubleValue(), 0.0001);
    }

    @Test
    public void getValorTotal_deveCalcularValorTotal_seClienteVip2() {
        PedidoVenda pedidoVenda = new PedidoVendaBuilder()
                .comClienteVip("John Doe")
                .comItem("Calculadora", 2, "200")
                .comItem("Mochila", 1, "250")
                .build();

        BigDecimal valorTotal = pedidoVenda.getValorTotal();
        assertEquals(new BigDecimal("624").doubleValue(), valorTotal.doubleValue(), 0.0001);
    }
}