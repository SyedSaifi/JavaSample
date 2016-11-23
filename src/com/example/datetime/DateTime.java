package com.example.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static void main(String []args){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        String dateInString = "2016-11-04 13:45:12.0";
        Date date= null;
        
        try
        {
        date = formatter.parse(dateInString);
        System.out.println("Date is : " + date);
        
        //use getTime() method to retrieve milliseconds
        System.out.println("Date in millisecond " + date.getTime());
        }catch (ParseException e) {
            e.printStackTrace();
        }
        
        java.util.Date d = new java.util.Date(date.getTime());
        System.out.println(formatter.format(d));
     }
}
