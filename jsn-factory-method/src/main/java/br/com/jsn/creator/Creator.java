package br.com.jsn.creator;

import br.com.jsn.product.ProductLog;

public abstract class Creator {


    public abstract ProductLog factoryMethod();


    public String operation(){
        ProductLog productLog = this.factoryMethod();
        String result = "CREATOR " + productLog.action() ;
        return result ;
    }
}
