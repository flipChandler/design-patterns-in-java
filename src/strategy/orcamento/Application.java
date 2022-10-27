package strategy.orcamento;

import strategy.orcamento.solution.*;

public class Application {

    public static void main(String[] args) {
        ImpostoStrategy iss = new Iss();
        ImpostoStrategy icms = new Icms();

        Orcamento orcamento = new Orcamento(100.0);

        CalculadorDeImposto calculadorIss = new CalculadorDeImposto(iss);
        CalculadorDeImposto calculadorIcms = new CalculadorDeImposto(icms);

        calculadorIss.calcularImpostoSobre(orcamento);
        calculadorIcms.calcularImpostoSobre(orcamento);
    }
}
