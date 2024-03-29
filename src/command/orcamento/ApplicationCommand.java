package command.orcamento;

import command.orcamento.command.GeraPedido;
import command.orcamento.command.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.Scanner;

public class ApplicationCommand {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String cliente = scanner.nextLine();
            BigDecimal valorOrcamento = new BigDecimal(scanner.next());
            int quantidadeItens = Integer.parseInt(scanner.next());

            GeraPedido geradorPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
            GeraPedidoHandler handler = new GeraPedidoHandler(/* dependecias */);
            handler.execute(geradorPedido);
        }
    }
}
