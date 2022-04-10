package br.com.jsn.strategy;


public class Delivery extends StrategySearch {
    private int status = 1;

    public Delivery() {
    }

    protected void preProcess() {
        System.out.println("preProcess");
    }

    protected void posProcess() {
        System.out.println("posProcess");
    }

    protected boolean search() {
        System.out.println("search " + this.status++);
        return this.status == 3;
    }
}
