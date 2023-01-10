package decorator.solution;

import decorator.solution.http.HttpAdapter;
import state.orcamento.desconto.exception.DomainException;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento nao finalizado");
        }
        var url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );
        httpAdapter.post(url, dados);
    }
}
