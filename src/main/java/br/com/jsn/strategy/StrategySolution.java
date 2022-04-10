package br.com.jsn.strategy;

public abstract class StrategySolution implements Strategy {

    public void order() {
        this.start();

        while(this.nexTry() && !this.isSolution()) {
        }

        this.stop();
    }

    abstract void start();

    abstract boolean nexTry();

    abstract boolean isSolution();

    abstract void stop();
}
