package chainofresponsibility.desconto;

import chainofresponsibility.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends DescontoAbstract {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(DescontoAbstract proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcularDescontoSobre(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcularDescontoSobre(orcamento);
    }
}
