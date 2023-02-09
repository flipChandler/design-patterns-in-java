package proxy.orcamento.strategy;

import proxy.orcamento.Orcamento;

import java.math.BigDecimal;

public class Icms extends ImpostoStrategy {

    public Icms(ImpostoStrategy outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal realizaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
