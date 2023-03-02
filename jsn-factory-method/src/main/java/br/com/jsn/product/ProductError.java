package br.com.jsn.product;

public class ProductError extends ProductLog {
    @Override
    public String action() {
       return "-- LOG ERROR --" ;
    }
}
