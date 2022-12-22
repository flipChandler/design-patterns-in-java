package org.observer.orcamento.problem.strategy;

import org.observer.orcamento.problem.Orcamento;

import java.math.BigDecimal;

public class Icms implements ImpostoStrategy {

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
