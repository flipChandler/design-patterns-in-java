package strategy.seguro;

public class PropostaSeguro {

    private Cliente cliente;
    private CalculadoraFranquiaSeguro calculadora;

    public PropostaSeguro(Cliente cliente, CalculadoraFranquiaSeguro calculadora) {
        this.cliente = cliente;
        this.calculadora = calculadora;
    }

    public String gerar(double valorVeiculo) {
        var tipoVeiculo = calculadora instanceof CalculadoraFranquiaSeguroCarro
                ? ETipoVeiculo.CARRO
                : ETipoVeiculo.MOTO;

        return new StringBuilder("\n=================================")
                .append("\nProposta de Seguro\n")
                .append("\nCliente: " + this.cliente.getNome())
                .append("\nIdade: " + this.cliente.getIdade())
                .append("\nGenero: " + this.cliente.getGenero())
                .append("\nTipo veiculo: " + tipoVeiculo)
                .append("\nValor do veiculo: " + valorVeiculo)
                .append("\nValor do Franquia: " + String.format("%.2f", calculadora.calcular(cliente, valorVeiculo)))
                .toString();
    }
}
