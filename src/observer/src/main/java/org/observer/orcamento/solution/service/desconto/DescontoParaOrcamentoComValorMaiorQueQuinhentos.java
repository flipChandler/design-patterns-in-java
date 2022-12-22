package org.observer.orcamento.solution.service.desconto;

import org.observer.orcamento.solution.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends DescontoAbstract {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(DescontoAbstract proximo) {
        super(proximo);
    }

    @Override
    public boolean deveAplicarDescontoPara(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    public BigDecimal efetuarCalculoDescontoSobre(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
}
