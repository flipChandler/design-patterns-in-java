package org.observer.financeiro.solution.notifier;

import org.observer.financeiro.solution.listeners.Listener;
import org.observer.financeiro.solution.model.Lancamento;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificadorLancamentosVencidosImpl implements INotificador {

    private Set<Listener> listeners;
    private List<Lancamento> lancamentosVencidos;

    public NotificadorLancamentosVencidosImpl() {
        this.listeners = new HashSet<>();
    }

    @Override
    public void registrarListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removerlistener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notificarListeners() {
        for (var listener : listeners) {
            listener.atualizar();
        }
    }

    @Override
    public void adicionarNovos(List<Lancamento> lancamentosVencidos) {
        this.lancamentosVencidos = lancamentosVencidos;
        this.notificarListeners();
    }

    @Override
    public List<Lancamento> getAllLancamentosVencidos() {
        return this.lancamentosVencidos;
    }
}
