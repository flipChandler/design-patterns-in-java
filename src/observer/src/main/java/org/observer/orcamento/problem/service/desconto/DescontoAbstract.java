package org.observer.orcamento.problem.service.desconto;

import org.observer.orcamento.problem.Orcamento;

import java.math.BigDecimal;

public abstract class DescontoAbstract {

    protected DescontoAbstract proximo;

    public DescontoAbstract(DescontoAbstract proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcularDescontoSobre(Orcamento orcamento) {
        if (deveAplicarDescontoPara(orcamento)) {
            return efetuarCalculoDescontoSobre(orcamento);
        }
        return proximo.calcularDescontoSobre(orcamento);
    }

    protected abstract boolean deveAplicarDescontoPara(Orcamento orcamento);
    protected abstract BigDecimal efetuarCalculoDescontoSobre(Orcamento orcamento);
}
