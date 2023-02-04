package facade.orcamento.strategy;

import facade.orcamento.Orcamento;

import java.math.BigDecimal;

public class Iss extends ImpostoStrategy {

    public Iss(ImpostoStrategy outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal realizaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
