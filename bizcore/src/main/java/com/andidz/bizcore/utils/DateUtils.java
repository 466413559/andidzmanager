package com.andidz.bizcore.utils;

import java.util.Date;

public class DateUtils {

    /**
     * 允许第二天最晚的时间（小时）
     * eg. 12就是 第二天12点
     */
    private static Integer lastTime = 12;
    /**
     * 获取可以提交任务最晚时间
     * @param today
     * @return
     */
    public static Date getNextDate(Date today){
        today.setHours(0);
        today.setMinutes(0);
        today.setSeconds(0);
        return new Date(today.getTime()+(24+lastTime)*60*60*1000);
    }

    /**
     * 获取指定时间的0点时间
     * @param date
     * @return
     */
    public static Date getTodayDate(Date date){
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);
        return date;
    }
}
