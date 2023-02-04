package facade.orcamento;


import facade.orcamento.command.GeraPedido;
import facade.orcamento.command.GeraPedidoHandler;
import facade.orcamento.service.EnviarEmailPedido;
import facade.orcamento.service.SalvarPedidoNoBancoDeDados;
import facade.orcamento.service.desconto.CalculadorDeDesconto;
import facade.orcamento.service.desconto.LogDePedido;

import java.math.BigDecimal;
import java.util.List;

public class ApplicationFacade {

    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal("745.99");
        int quantidadeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(List.of(
           new EnviarEmailPedido(),
           new SalvarPedidoNoBancoDeDados(),
           new LogDePedido()
        ));
        geraPedidoHandler.execute(gerador);
    }
}
