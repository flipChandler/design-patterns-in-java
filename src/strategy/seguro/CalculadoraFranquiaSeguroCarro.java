package strategy.seguro;

public class CalculadoraFranquiaSeguroCarro implements CalculadoraFranquiaSeguro {

    @Override
    public double calcular(Cliente cliente, double valorCarro) {
        return cliente.getIdade() > 50 ? valorCarro * 0.05 : valorCarro * 0.075;
    }
}
