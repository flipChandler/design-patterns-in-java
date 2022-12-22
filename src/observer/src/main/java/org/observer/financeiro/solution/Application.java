package org.observer.financeiro.solution;

import org.observer.financeiro.solution.job.LancamentosVencidosJob;
import org.observer.financeiro.solution.listeners.EmailListener;
import org.observer.financeiro.solution.listeners.SmsListener;
import org.observer.financeiro.solution.notifier.NotificadorLancamentosVencidosImpl;
import org.observer.financeiro.solution.repository.LancamentoRepository;
import org.quartz.JobDataMap;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class Application {

    public static void main(String[] args) throws SchedulerException, InterruptedException {
        var notificador = new NotificadorLancamentosVencidosImpl();

        new EmailListener(notificador);
        new SmsListener(notificador);
        var lancamentoRepository = new LancamentoRepository();

        var jobDataMap = new JobDataMap();
        var scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("lancamentoRepository", lancamentoRepository);
        jobDataMap.put("notificador", notificador);

        var jobDetail = newJob(LancamentosVencidosJob.class)
                .setJobData(jobDataMap)
                .withIdentity("lancamentosVencidosJob", "lancamentosVencidosGroup")
                .build();

        var trigger = newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("0 * * * * ?"))
                .build();

        scheduler.scheduleJob(jobDetail, trigger);

        scheduler.start();

        Thread.sleep(220000);

        scheduler.shutdown(true);
    }
}
