package com.mini.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtil {
    public static Date dateAdd(Date d , int num , String addType){
        if(Objects.isNull(d)) {
            return null;
        }
        Date ret = d;
        Calendar cal = Calendar.getInstance();
        cal.setTime(ret);//设置起时间
        switch (addType) {
            case "Y" :
                cal.add(Calendar.YEAR, num);//增加一年
                break;
            case "M":
                cal.add(Calendar.MONTH, num);
                break;

            case "D" :
                cal.add(Calendar.DATE, num);
                break;

            case "H":
                cal.add(Calendar.HOUR, num);
                break;

            case "m" :
                cal.add(Calendar.MINUTE, num);
                break;

            case "s" :
                cal.add(Calendar.SECOND, num);
                break;

            case "ms":
                cal.add(Calendar.MILLISECOND, num);
                break;

                default:
        }
        ret = cal.getTime();
        return ret;
    }
}
