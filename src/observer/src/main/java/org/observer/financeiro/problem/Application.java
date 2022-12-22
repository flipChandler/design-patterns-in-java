package org.observer.financeiro.problem;

import org.observer.financeiro.problem.job.LancamentosVencidosJob;
import org.observer.financeiro.problem.repository.LancamentoRepository;
import org.observer.financeiro.problem.senders.EnviadorEmail;
import org.observer.financeiro.problem.senders.EnviadorSms;
import org.quartz.JobDataMap;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class Application {

    public static void main(String[] args) throws SchedulerException, InterruptedException {
        var enviadorEmail = new EnviadorEmail();
        var enviadorSms = new EnviadorSms();
        var lancamentoRepository = new LancamentoRepository();

        var jobDataMap = new JobDataMap();
        var scheduler = StdSchedulerFactory.getDefaultScheduler();

        jobDataMap.put("lancamentoRepository", lancamentoRepository);
        jobDataMap.put("enviadorEmail", enviadorEmail);
        jobDataMap.put("enviadorSms", enviadorSms);

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
