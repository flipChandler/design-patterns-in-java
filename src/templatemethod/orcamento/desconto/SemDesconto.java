package templatemethod.orcamento.desconto;

import templatemethod.orcamento.Orcamento;

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
