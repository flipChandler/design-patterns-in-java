package composite.orcamento;


import composite.orcamento.service.desconto.CalculadorDeDesconto;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        Orcamento orcamento3 = new Orcamento();
        orcamento3.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadorDeDesconto calculadorDeDesconto =  new CalculadorDeDesconto();
        System.out.println(calculadorDeDesconto.calcularDescontoSobre(orcamento1));
        System.out.println(calculadorDeDesconto.calcularDescontoSobre(orcamento2));
        System.out.println(calculadorDeDesconto.calcularDescontoSobre(orcamento3));
    }
}
