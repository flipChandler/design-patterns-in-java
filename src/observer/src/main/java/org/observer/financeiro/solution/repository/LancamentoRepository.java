package org.observer.financeiro.solution.repository;

import org.observer.financeiro.solution.builder.LancamentoBuilder;
import org.observer.financeiro.solution.model.TipoLancamento;
import org.observer.financeiro.solution.model.Lancamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class LancamentoRepository {

    public List<Lancamento> getAllVencidos() {
        var lancamento1 = LancamentoBuilder.builder()
                .comPessoa("Joao Silva", "joao@gmail.com", "(11)978734-8333")
                .comDescricao("Mesa Tabaco MDF")
                .comValor(new BigDecimal("1225.45"))
                .comDataVencimento(LocalDate.now())
                .doTipo(TipoLancamento.DESPESA)
                .build();

        var lancamento2 = LancamentoBuilder.builder()
                .comPessoa("Rey Miranda", "rey@gmail.com", "(11)93677-1122")
                .comDescricao("Armario MDF 3.00 x 2.40")
                .comValor(new BigDecimal("1225.45"))
                .comDataVencimento(LocalDate.now())
                .doTipo(TipoLancamento.DESPESA)
                .build();

        return List.of(lancamento1, lancamento2);
    }
}
