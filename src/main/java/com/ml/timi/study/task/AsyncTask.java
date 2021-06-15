/**
 * Description:
 * Copyright (C), 2021 2021/6/12 16:56
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */


package com.ml.timi.study.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Async//@Async标记为异步任务，在一个方法上架表示该方法为异步任务，在类上面加，表示类下面的所有方法都为异步方法
public class AsyncTask {



    public void task1(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException E){
            E.printStackTrace();
        }
        System.out.println("任务一");
    }

    public void task2(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException E){
            E.printStackTrace();
        }
        System.out.println("任务二");
    }

    public void task3(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException E){
            E.printStackTrace();
        }
        System.out.println("任务三");
    }

    public void task4(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException E){
            E.printStackTrace();
        }
        System.out.println("任务四");
    }
}
