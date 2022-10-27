package strategy.transportadora.solution;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe a distancia: ");
            int distancia = scanner.nextInt();

            System.out.print("Qual eh o tipo de frete? [1] NORMAL | [2] SEDEX: ");
            int opcaoFrete = scanner.nextInt();

            ETipoFrete tipoFrete = ETipoFrete.values()[opcaoFrete - 1];

            Frete frete = tipoFrete.obterFrete();
            double preco = frete.calcularPreco(distancia);

            System.out.printf("O valor total eh de R$%.2f", preco);
        }
    }
}
