package strategy.seguro;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Cliente cliente = new Cliente();
            System.out.println("Nome do cliente: ");
            cliente.setNome(scanner.nextLine());

            System.out.println("Idade: ");
            cliente.setIdade(scanner.nextInt());

            System.out.println("Genero [1] MASCULINO | [2] FEMININO: ");
            cliente.setGenero(EGenero.values()[scanner.nextInt() - 1]);

            System.out.println("Tipo [1] CARRO | [2] MOTO: ");
            ETipoVeiculo tipoVeiculo = ETipoVeiculo.values()[scanner.nextInt() - 1];

            System.out.println("Valor do veiculo: ");
            double valorVeiculo = scanner.nextDouble();

            PropostaSeguro proposta = new PropostaSeguro(cliente, tipoVeiculo.getCalculadora());
            System.out.println(proposta.gerar(valorVeiculo));
        }
    }
}
