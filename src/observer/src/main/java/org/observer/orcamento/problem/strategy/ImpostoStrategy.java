package org.observer.orcamento.problem.strategy;

import org.observer.orcamento.problem.Orcamento;

import java.math.BigDecimal;

public interface ImpostoStrategy {

    BigDecimal calcula(Orcamento orcamento);
}
