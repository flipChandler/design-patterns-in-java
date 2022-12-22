package org.observer.orcamento.problem.service.desconto.state;

import org.observer.orcamento.problem.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
