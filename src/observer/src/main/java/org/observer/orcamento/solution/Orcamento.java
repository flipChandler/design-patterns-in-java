package org.observer.orcamento.solution;


import org.observer.orcamento.solution.service.desconto.state.EmAnalise;
import org.observer.orcamento.solution.service.desconto.state.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    // a propria situacao vai calcular o descontro extra pro orcamento :: this
    // ela (situacao) eh que vai transitar pro proximo estado
    public void aplicarDescontoExtra() {
        BigDecimal valorDescontroExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontroExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public SituacaoOrcamento getSituacao() {
        return this.situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
