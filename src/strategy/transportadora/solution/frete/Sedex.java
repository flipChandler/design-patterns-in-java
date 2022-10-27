package strategy.transportadora.solution.frete;

import strategy.transportadora.solution.Frete;

public class Sedex implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.45 + 12;
    }
}
