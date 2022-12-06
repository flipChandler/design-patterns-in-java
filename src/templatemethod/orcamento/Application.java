package templatemethod.orcamento;

import templatemethod.orcamento.desconto.CalculadorDeDesconto;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();

        System.out.println(calculadorDeDesconto.calcularDescontoSobre(orcamento1));
        System.out.println(calculadorDeDesconto.calcularDescontoSobre(orcamento2));
    }
}
