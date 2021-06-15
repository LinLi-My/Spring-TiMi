/**
 * Description:
 * Copyright (C), 2021 2021/6/12 17:01
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */


package com.ml.timi.controller;

import com.ml.timi.study.task.AsyncTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @Resource
    public AsyncTask asyncTask;

    @GetMapping("asynctask")
    public String asyncTask(){
        long beginTime = System.currentTimeMillis();

        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();
        asyncTask.task4();
        long endTime = System.currentTimeMillis();
        System.out.println("11"+(endTime-beginTime));
        return "";
    }
}
