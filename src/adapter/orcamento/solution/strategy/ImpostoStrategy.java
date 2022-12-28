package adapter.orcamento.solution.strategy;

import adapter.orcamento.solution.Orcamento;

import java.math.BigDecimal;

public interface ImpostoStrategy {

    BigDecimal calcula(Orcamento orcamento);
}
