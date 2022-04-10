package br.com.jsn.mediator;

public class Producer implements Runnable{


    Mediator mediator ;
    private int id ;
    private static int num = 1 ;

    public  Producer(Mediator mediator){
        this.mediator = mediator;
        id = num++ ;
    }


    @Override
    public void run() {
        int num ;
        while(true){
            mediator.storeMessage(num = (int)(Math.random()*100));
            System.out.println("PRODUCER " + id + "======" + num);

        }
    }
}
