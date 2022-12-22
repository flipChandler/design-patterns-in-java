package org.observer.orcamento.solution.strategy;

import org.observer.orcamento.solution.Orcamento;

import java.math.BigDecimal;

public interface ImpostoStrategy {

    BigDecimal calcula(Orcamento orcamento);
}
