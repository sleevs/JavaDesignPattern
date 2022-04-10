package br.com.jsn.strategy;

public abstract class StrategySearch implements Strategy {


    public void order() {
        while(true) {
            this.preProcess();
            if (this.search()) {
                return;
            }

            this.posProcess();
        }
    }

    abstract void preProcess();

    abstract boolean search();

    abstract void posProcess();
}
