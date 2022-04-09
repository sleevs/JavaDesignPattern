package strategy;



public class StrategyDemo{


    private static void execute(Strategy strategy){
    	strategy.order();
    }

    public static void main (String [] args ){

        Strategy[] algorithms = {new Cozinha(), new Delivery()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }
}