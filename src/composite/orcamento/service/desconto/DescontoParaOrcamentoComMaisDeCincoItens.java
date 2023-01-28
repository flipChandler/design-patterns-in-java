package composite.orcamento.service.desconto;


import composite.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends DescontoAbstract {

    public DescontoParaOrcamentoComMaisDeCincoItens(DescontoAbstract proximo) {
        super(proximo);
    }

    @Override
    public boolean deveAplicarDescontoPara(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

    @Override
    public BigDecimal efetuarCalculoDescontoSobre(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
