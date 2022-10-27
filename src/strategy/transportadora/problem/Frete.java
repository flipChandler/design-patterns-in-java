package strategy.transportadora.problem;

public class Frete {

    private ETipoFrete tipo;

    public Frete(ETipoFrete tipo) {
        this.tipo = tipo;
    }

    public double calcularPreco(int distancia) {
        double preco = 0.0;

        if (tipo == ETipoFrete.NORMAL) {
            preco = distancia * 1.25 + 10;
        } else if (tipo == ETipoFrete.SEDEX) {
            preco = distancia * 1.45 + 12;
        }

        return preco;
    }
}
