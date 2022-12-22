package org.observer.orcamento.solution;

import org.observer.orcamento.solution.command.GeraPedido;
import org.observer.orcamento.solution.command.GeraPedidoHandler;
import org.observer.orcamento.solution.service.EnviarEmailPedido;
import org.observer.orcamento.solution.service.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String cliente = scanner.nextLine();
            BigDecimal valorOrcamento = new BigDecimal(scanner.next());
            int quantidadeItens = Integer.parseInt(scanner.next());

            GeraPedido geradorPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
            GeraPedidoHandler handler = new GeraPedidoHandler(
                    List.of(
                            new EnviarEmailPedido(),
                            new SalvarPedidoNoBancoDeDados()
                    ));
            handler.execute(geradorPedido);
        }
    }
}
