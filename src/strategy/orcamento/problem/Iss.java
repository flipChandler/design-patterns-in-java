package strategy.orcamento.problem;

public class Iss {

    public double calculaIss(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
