/**
 * Description:
 * Copyright (C), 2021 2021/6/11 13:34
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */


package com.ml.timi.utils;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期处理工具
 */
public class DateUtils {

    static DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    static DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * LocalDateTime 转 String 年月日 时分秒
     */
    public static String dateTimeString(LocalDateTime localDateTime) {

        return dateTime.format(localDateTime);
    }

    /**
     * LocalDateTime 转 String 年月日
     */
    public static String dateString(LocalDateTime localDateTime) {

        return date.format(localDateTime);
    }

    /**
     * LocalDateTime 转 String 年月日
     */
    public static String timeString(LocalDateTime localDateTime) {

        return time.format(localDateTime);
    }

    /**
     * String 转 localDateTime 年月日 时分秒
     */
    public static LocalDateTime toDateTime(String localDateTime) {

        return LocalDateTime.parse(localDateTime, dateTime);
    }

    /**
     * String 转 localDate 年月日
     */
    public static LocalDate toDate(String localDate) {

        return LocalDate.parse(localDate, date);
    }

    /**
     * String 转 localTime 时分秒
     */
    public static LocalTime toTime(String localTime) {

        return LocalTime.parse(localTime, time);
    }



}


