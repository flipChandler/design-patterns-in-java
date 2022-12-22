package org.observer.financeiro.solution.builder;

import org.observer.financeiro.solution.model.TipoLancamento;
import org.observer.financeiro.solution.model.Lancamento;
import org.observer.financeiro.solution.model.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LancamentoBuilder {

    private Lancamento lancamento;

    public static LancamentoBuilder builder() {
        return new LancamentoBuilder();
    }

    public LancamentoBuilder() {
        this.lancamento = new Lancamento();
    }

    public LancamentoBuilder comPessoa(String nome, String email, String telefone) {
        this.lancamento.setPessoa(new Pessoa(nome, email, telefone));
        return this;
    }

    public LancamentoBuilder comDescricao(String descricao) {
        this.lancamento.setDescricao(descricao);
        return this;
    }

    public LancamentoBuilder comValor(BigDecimal valor) {
        this.lancamento.setValor(valor);
        return this;
    }

    public LancamentoBuilder comDataVencimento(LocalDate dataVencimento) {
        this.lancamento.setDataVencimento(dataVencimento);
        return this;
    }

    public LancamentoBuilder doTipo(TipoLancamento tipo) {
        this.lancamento.setTipo(tipo);
        return this;
    }
    public Lancamento build() {
        return this.lancamento;
    }
}
