package com.cpp.shedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by cpp on 2018/3/14.
 */
@Component
public class MyScheduler {


    //@Scheduled(cron = "0/5 * *  * * ? ")   //每5秒执行一次
    public void sayHello() {
        System.out.println("5秒定时任务");
    }

    //@Scheduled(fixedRate = 10000)   //每5秒执行一次
    public void scheduleDonotUseCorn() {
        System.out.println("10秒定时任务");
    }

}
