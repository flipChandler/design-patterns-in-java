package org.observer.financeiro.problem.senders;

import org.observer.financeiro.problem.model.Lancamento;

import java.util.List;

public class EnviadorEmail {

    public void enviar(List<Lancamento> lancamentosVencidos) {
        for (var lancamento : lancamentosVencidos) {
            System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
        }
    }
}
