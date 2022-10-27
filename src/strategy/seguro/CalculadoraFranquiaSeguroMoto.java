package strategy.seguro;

public class CalculadoraFranquiaSeguroMoto implements CalculadoraFranquiaSeguro {

    @Override
    public double calcular(Cliente cliente, double valorMoto) {
        return cliente.getIdade() >= 18 && cliente.getIdade() <= 30
                ? valorMoto * 0.08
                : valorMoto * 0.04;
    }
}
