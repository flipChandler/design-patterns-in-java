package proxy.orcamento;


import proxy.orcamento.service.desconto.state.EmAnalise;
import proxy.orcamento.service.desconto.state.Finalizado;
import proxy.orcamento.service.desconto.state.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return valor;
    }

    public int getQuantidadeItens() {
        return itens.size();
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

    @Override
    public String toString() {
        return "Orcamento{" +
                "valor=" + valor +
                ", quantidadeItens=" + itens +
                ", situacao=" + situacao.toString() +
                '}';
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
}
