package com.adv.java.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

    public static String getCurrentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new Date();
        String currentDate = formatter.format(date);
        return currentDate;
    }

}
