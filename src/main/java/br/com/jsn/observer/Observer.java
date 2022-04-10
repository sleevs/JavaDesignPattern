package br.com.jsn.observer;

public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
