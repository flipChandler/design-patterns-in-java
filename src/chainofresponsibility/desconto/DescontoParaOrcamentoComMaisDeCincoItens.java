package chainofresponsibility.desconto;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends DescontoAbstract {

    public DescontoParaOrcamentoComMaisDeCincoItens(DescontoAbstract proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcularDescontoSobre(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcularDescontoSobre(orcamento);
    }
}
