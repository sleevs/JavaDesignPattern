package br.com.jsn.observer;

public class Dollar extends Observer {

    public Dollar(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Dollar gerar Order " + subject.getStatus());

    }
}
