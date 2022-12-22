package org.observer.financeiro.solution.listeners;

import org.observer.financeiro.solution.notifier.INotificador;

public class SmsListener implements Listener {

    private INotificador notificador;

    public SmsListener(INotificador notificador) {
        this.notificador = notificador;
        this.notificador.registrarListener(this); // notificador registra smsListener (this)
    }

    @Override
    public void atualizar() {
        for (var lancamento : notificador.getAllLancamentosVencidos()) {
            System.out.println("Enviando SMS para " + lancamento.getPessoa().getTelefone());
        }
        // this.notificador.removerlistener(this);  ppoderia depois de atualizar, se descadastrar do notificador
    }
}
