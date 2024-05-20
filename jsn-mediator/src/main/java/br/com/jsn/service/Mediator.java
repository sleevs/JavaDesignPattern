package br.com.jsn.service;

public abstract  class Mediator {


    public abstract void sendMessage(String message , Colleague user);
    public abstract void add(Colleague user);

    
}
