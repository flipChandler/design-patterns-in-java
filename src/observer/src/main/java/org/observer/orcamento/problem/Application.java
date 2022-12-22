package org.observer.orcamento.problem;


import org.observer.orcamento.problem.command.GeraPedido;
import org.observer.orcamento.problem.command.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String cliente = scanner.nextLine();
            BigDecimal valorOrcamento = new BigDecimal(scanner.next());
            int quantidadeItens = Integer.parseInt(scanner.next());

            GeraPedido geradorPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
            GeraPedidoHandler handler = new GeraPedidoHandler();
            handler.execute(geradorPedido);
        }
    }
}
