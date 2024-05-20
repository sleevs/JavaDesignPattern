package br.com.jsn.service;

public abstract  class Colleague {

    protected Mediator mediator;
    protected String user;

    public abstract void send(String message);
    public abstract void receiver(String message);

    public Colleague(Mediator mediator, String user){
        this.mediator = mediator;
        this.user = user;
    }

   
    
}
