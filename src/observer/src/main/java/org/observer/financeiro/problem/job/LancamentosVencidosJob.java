package org.observer.financeiro.problem.job;

import org.observer.financeiro.problem.senders.EnviadorEmail;
import org.observer.financeiro.problem.repository.LancamentoRepository;
import org.observer.financeiro.problem.senders.EnviadorSms;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class LancamentosVencidosJob implements Job {

    // a cada minuto chama esse metodo
    @Override
    public void execute(JobExecutionContext context) {
        var jobDataMap = context.getJobDetail().getJobDataMap();

        var lancamentoRepository = (LancamentoRepository) jobDataMap.get("lancamentoRepository");
        var lancamentosVencidos = lancamentoRepository.getAllVencidos();

        var enviadorEmail = (EnviadorEmail) jobDataMap.get("enviadorEmail");
        var enviadorSms = (EnviadorSms) jobDataMap.get("enviadorSms");
        enviadorEmail.enviar(lancamentosVencidos);
        enviadorSms.enviar(lancamentosVencidos);

    }
}
