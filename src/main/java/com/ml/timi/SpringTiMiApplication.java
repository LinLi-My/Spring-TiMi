package com.ml.timi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//启动扫描定时任务
@SpringBootApplication
public class SpringTiMiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTiMiApplication.class, args);
    }

}
