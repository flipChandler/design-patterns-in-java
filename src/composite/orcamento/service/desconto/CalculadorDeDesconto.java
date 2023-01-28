package composite.orcamento.service.desconto;

import composite.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeDesconto {

    public BigDecimal calcularDescontoSobre(Orcamento orcamento) {
        var cadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDesconto.calcularDescontoSobre(orcamento);
    }
}
