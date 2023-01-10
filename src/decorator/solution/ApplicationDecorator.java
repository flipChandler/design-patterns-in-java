package decorator.solution;


import decorator.solution.service.CalculadorDeImposto;
import decorator.solution.strategy.Icms;
import decorator.solution.strategy.ImpostoStrategy;
import decorator.solution.strategy.Iss;

import java.math.BigDecimal;
import java.util.Scanner;

public class ApplicationDecorator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" digite o valor do orcamento: ");
            String valorOrcamento = scanner.nextLine();
            System.out.println("digite a quantidade de itens: ");
            int quantidadeItens = scanner.nextInt();

            Orcamento orcamento = new Orcamento(new BigDecimal(valorOrcamento), quantidadeItens);

            ImpostoStrategy iss = new Iss(new Icms(null));
            CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto(iss);
            calculadorDeImposto.calcularImpostoSobre(orcamento);
        }
    }
}
