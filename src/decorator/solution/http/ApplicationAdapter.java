package decorator.solution.http;

import decorator.solution.Orcamento;
import decorator.solution.RegistroOrcamento;

import java.math.BigDecimal;

public class ApplicationAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
        registroOrcamento.registrar(orcamento);
    }
}
