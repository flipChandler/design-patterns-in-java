package proxy.orcamento.strategy;

import proxy.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Optional;

public abstract class ImpostoStrategy {

    private ImpostoStrategy outroImposto;

    public ImpostoStrategy(ImpostoStrategy outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract BigDecimal realizaCalculo(Orcamento orcamento);

    public BigDecimal calcula(Orcamento orcamento) {
        BigDecimal valorImposto = realizaCalculo(orcamento);
        BigDecimal valorDoOutroImposto = Optional.ofNullable(outroImposto)
                .map(imposto -> imposto.realizaCalculo(orcamento))
                .orElse(BigDecimal.ZERO);
        return valorImposto.add(valorDoOutroImposto);
    }
}
