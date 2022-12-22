package org.observer.orcamento.solution.service;

import org.observer.orcamento.solution.Orcamento;
import org.observer.orcamento.solution.strategy.ImpostoStrategy;

import java.math.BigDecimal;

public class CalculadorDeImposto {

    private ImpostoStrategy imposto;

    public CalculadorDeImposto(ImpostoStrategy impostoStrategy) {
        this.imposto = impostoStrategy;
    }

    public void calcularImpostoSobre(Orcamento orcamento) {
        BigDecimal valorImposto = imposto.calcula(orcamento);
        System.out.println(valorImposto);
    }
}
