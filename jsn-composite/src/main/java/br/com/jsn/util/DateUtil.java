package br.com.jsn.util;

import java.text.DateFormat;
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
    
}
