package org.observer.orcamento.solution.strategy;

import org.observer.orcamento.solution.Orcamento;

import java.math.BigDecimal;

public class Icms implements ImpostoStrategy {

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
