package com.ml.timi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@ServletComponentScan   //扫描servlet
@EnableScheduling       //启动扫描定时任务
@EnableAsync            //扫描异步任务
@SpringBootApplication
public class SpringTiMiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTiMiApplication.class, args);
    }

}
