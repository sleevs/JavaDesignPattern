package br.com.jsn.observer;

public class ObserverDemo {

    public static void main (String [] args){

        Subject subject = new Subject();
        Real real = new Real(subject);
        Dollar dollar = new Dollar(subject);

        for(int i = 0 ; i < 5 ; i++){

            subject.setStatus(i);
            System.out.println("=========");
            dollar.update();
            System.out.println("=========");
            real.update();

        }

    }
}
