package br.com.jsn.creator;

import br.com.jsn.model.CoordinateModel;
import br.com.jsn.product.Product;


public abstract class Creator {


    public abstract Product  factoryMethod();


    public String operation(CoordinateModel o , CoordinateModel d){
        Product product = this.factoryMethod();
        String result = "CREATOR " + product.action(o , d) ;
        return result ;
    }
}
