package br.com.jsn.strategy;

public class StrategyDemo{

    private static void execute(Strategy strategy) {
        strategy.order();
    }

    public static void main(String[] args) {
        Strategy[] algorithms = new Strategy[]{new Cozinha(), new Delivery()};
        Strategy[] var5 = algorithms;
        int var4 = algorithms.length;

        for (int i = 0; i < 10; i++) {
            Strategy algorithm = var5[i];
            execute(algorithm);
        }

    }

}