package strategy.transportadora.solution.frete;

import strategy.transportadora.solution.Frete;

public class Normal implements Frete {

    public double calcularPreco(int distancia) {
        return distancia * 1.25 + 10;
    }
}
