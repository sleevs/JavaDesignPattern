package br.com.jsn.strategy;


public class Cozinha extends StrategySolution {
    private int status = 1;

    public Cozinha() {
    }

    protected void start() {
        System.out.println("start");
    }

    protected void stop() {
        System.out.println("stop");
    }

    protected boolean nexTry() {
        System.out.println("nexTry");
        return true;
    }

    protected boolean isSolution() {
        System.out.println("isSolution " + (this.status == 3));
        return this.status == 3;
    }
}
