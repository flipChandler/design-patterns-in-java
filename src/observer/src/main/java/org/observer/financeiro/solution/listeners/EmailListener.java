package org.observer.financeiro.solution.listeners;

import org.observer.financeiro.solution.notifier.INotificador;

public class EmailListener implements Listener {

    private INotificador notificador;

    public EmailListener(INotificador notificador) {
        this.notificador = notificador;
        this.notificador.registrarListener(this);    // notificador registra emailListener (this)
    }

    @Override
    public void atualizar() {
        for (var lancamento : notificador.getAllLancamentosVencidos()) {
            System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
        }
        // this.notificador.removerlistener(this);  ppoderia depois de atualizar, se descadastrar do notificador
    }
}
