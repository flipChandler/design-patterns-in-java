package org.observer.orcamento.solution.service.desconto.state;

import org.observer.orcamento.solution.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
