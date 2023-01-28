package composite.orcamento.http;

import composite.orcamento.Orcamento;
import composite.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class ApplicationAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
        registroOrcamento.registrar(orcamento);
    }
}
