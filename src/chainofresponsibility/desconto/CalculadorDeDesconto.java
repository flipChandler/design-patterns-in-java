package chainofresponsibility.desconto;

import chainofresponsibility.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeDesconto {

    public BigDecimal calcularDescontoSobre(Orcamento orcamento) {
        var calculadorDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return calculadorDeDesconto.calcularDescontoSobre(orcamento);
    }
}
