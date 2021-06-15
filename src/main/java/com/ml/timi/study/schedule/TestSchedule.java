/**
 * Description:
 * Copyright (C), 2021 2021/6/11 10:44
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */


package com.ml.timi.study.schedule;


import com.ml.timi.utils.DateUtils;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.Date;

//@Component
public class TestSchedule {



    public String dateNow = new Date().toString();
    @Scheduled(fixedRate = 2000L)
    public void TaskA(){
        System.out.println("定时任务——————"+dateNow);
        System.out.println(DateUtils.dateTimeString(LocalDateTime.now()));
    }
}
