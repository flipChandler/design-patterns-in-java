package org.observer.financeiro.problem.senders;

import org.observer.financeiro.problem.model.Lancamento;

import java.util.List;

public class EnviadorSms {

    public void enviar(List<Lancamento> lancamentosVencidos) {
        for (var lancamento : lancamentosVencidos) {
            System.out.println("Enviando SMS para " + lancamento.getPessoa().getTelefone());
        }
    }
}
