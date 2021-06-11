/**
 * Description:
 * Copyright (C), 2021 2021/6/11 13:34
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */


package com.ml.timi.utils;




import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class DateTest{


    public  void run(){
        DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter time = DateTimeFormatter.ofPattern(" HH:mm:ss");

        /**
         * 获取当前年月日：时间
         */
         LocalDateTime localDateTime = LocalDateTime.now();
         System.out.println("获取当前年月日：时间           "+localDateTime);

        /**
         * localDateTime 转 String
         */
        String localDateTimeStr =datetime.format(localDateTime);
        System.out.println("localDateTime 转 String     "+localDateTimeStr);


        String DateStr =date.format(localDateTime);
        System.out.println("localDateTime 转 String     "+DateStr);









    }
    public static void main(String[] args) {
       new DateTest().run();

    }



}


