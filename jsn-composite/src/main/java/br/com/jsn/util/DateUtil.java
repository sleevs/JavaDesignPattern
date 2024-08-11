package br.com.jsn.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

     public static String formatDate(Date date){

        if(date != null){
            String pattern = "dd/MM/yyyy HH:mm:ss";
            DateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null ;
    }


    public static Date formatStringToDate(String data){

        String dateFormat = "dd/MM/yyyy HH:mm:ss";
        
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        try {
            Date date = formatter.parse(data);
           
            return date;
        } catch (ParseException e) {
            System.err.println("Date parsing failed: " + e.getMessage());
        }
        return null ;
    }
    
}
