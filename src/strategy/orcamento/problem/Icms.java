package strategy.orcamento.problem;

public class Icms {

    public double calculaIcms(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
