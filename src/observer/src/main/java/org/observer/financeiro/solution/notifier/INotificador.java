package org.observer.financeiro.solution.notifier;

import org.observer.financeiro.solution.listeners.Listener;
import org.observer.financeiro.solution.model.Lancamento;

import java.util.List;

public interface INotificador {

    void registrarListener(Listener listener);
    void removerListener(Listener listener);
    void notificarListeners();
    void adicionarNovos(List<Lancamento> lancamentosVencidos);
    List<Lancamento> getAllLancamentosVencidos();
}
