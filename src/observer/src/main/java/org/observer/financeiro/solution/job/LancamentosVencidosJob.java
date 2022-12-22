package org.observer.financeiro.solution.job;

import org.observer.financeiro.solution.notifier.INotificador;
import org.observer.financeiro.solution.repository.LancamentoRepository;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class LancamentosVencidosJob implements Job {

    // a cada minuto chama esse metodo
    @Override
    public void execute(JobExecutionContext context) {
        var jobDataMap = context.getJobDetail().getJobDataMap();

        var lancamentoRepository = (LancamentoRepository) jobDataMap.get("lancamentoRepository");
        var notificador = (INotificador) jobDataMap.get("notificador");

        var lancamentosVencidos = lancamentoRepository.getAllVencidos();
        notificador.adicionarNovos(lancamentosVencidos);
    }
}
