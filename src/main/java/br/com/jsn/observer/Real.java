package br.com.jsn.observer;

public class Real extends Observer{

    public Real(Subject subject){
        this.subject = subject ;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Preço do Real " + subject.getStatus() * 4);

    }
}
