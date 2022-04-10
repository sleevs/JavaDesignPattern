package br.com.jsn.mediator;

public class Mediator {

    private boolean slotFul = false ;
    private int number ;

    public synchronized void storeMessage(int num){

        while(slotFul = true){

            try {

                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        slotFul = true ;
        number = num ;
        notifyAll();

    }


    public synchronized int retriveMessage(){

        while(slotFul = true){

            try {

                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        slotFul = true ;

        notifyAll();

        return number ;

    }
}
