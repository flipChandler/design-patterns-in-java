package adapter.orcamento.solution.http;

import adapter.orcamento.solution.Orcamento;
import adapter.orcamento.solution.RegistroOrcamento;

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
