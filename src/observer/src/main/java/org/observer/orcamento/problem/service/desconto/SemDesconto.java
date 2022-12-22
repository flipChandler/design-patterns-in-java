package org.observer.orcamento.problem.service.desconto;



import org.observer.orcamento.problem.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends DescontoAbstract {

    public SemDesconto() {
        super(null);
    }

    @Override
    public boolean deveAplicarDescontoPara(Orcamento orcamento) {
        return true;
    }

    @Override
    public BigDecimal efetuarCalculoDescontoSobre(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
