package facade.orcamento.http;

import facade.orcamento.Orcamento;
import facade.orcamento.RegistroOrcamento;

public class ApplicationAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
        registroOrcamento.registrar(orcamento);
    }
}
