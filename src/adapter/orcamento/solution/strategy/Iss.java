package adapter.orcamento.solution.strategy;

import adapter.orcamento.solution.Orcamento;

import java.math.BigDecimal;

public class Iss implements ImpostoStrategy {

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
