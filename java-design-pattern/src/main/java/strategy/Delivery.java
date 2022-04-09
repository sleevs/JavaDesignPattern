package strategy;
import strategy.StrategySearch;

public class Delivery extends StrategySearch{

    private int status = 1 ;


    protected void preProcess(){
        System.out.println("preProcess");

    }

    protected void posProcess(){
        System.out.println("posProcess");

    }



    protected boolean search(){
        System.out.println("search " + status++);
        return status == 3 ? true : false;
    }
}