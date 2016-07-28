package com.hpe.ddc.framework.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务配置类
 * Created by duxi on 2016/7/27.
 */
@Configuration
//为了让定时任务有效，需要使用@EnableScheduling
@EnableScheduling
@Slf4j
public class TaskSchedulingConfig {
    //在定时任务的方法上，指定@Scheduled
    //fixedDelay:在Task的执行完成时间点开始算起，到指定时间后再次执行Task.单位是ms
    //fixedRate:在Task的执行开始时间点开始算起，到指定时间后再次执行Task.单位是ms
    //initialDelay:在指定时间后开始第一次执行task.等位是ms.可以和fixedDelay或者fixedRate组合使用
    //cron:通过cron指定的周期开始执行task.
    //  cron从左边到右边，分别为秒(0-59)、分(0-59)、时(0-59)、日(1-31)、月(1-12)、星期几(0:星期天,1:星期1,2:星期2,3:星期3,4:星期4,5:星期5,6:星期6,7:星期天)
    //zone:cron启动时间的ZimeZone。没有指定的情况下使用确认的timezone.
    //@Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        log.info(">>>>>>>>>>>>> scheduled ... ");
    }
}
