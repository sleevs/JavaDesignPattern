package br.com.jsn.util;

public enum Constants {

    ALERT ("ALERT :") ,
    EMAIL ("EMAIL :"),
    SMS ("SMS :"),
    DIALOG ("DIALOG :"),
    MESSAGE ("MESSAGE :");
    private String value ;

     Constants(String value){
        this.value =value ;
    }
    public String getValue(){
        return value ;
    }
}
