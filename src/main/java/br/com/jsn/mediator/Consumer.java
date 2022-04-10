package br.com.jsn.mediator;

public class Consumer implements Runnable{

    private Mediator mediator;
    private int id ;
    private static int num = 1 ;

    public Consumer(Mediator mediator){
        this.mediator = mediator;
        id = num ++ ;


    }

    @Override
    public void run() {

        while(true){
            System.out.println( "CONSUMER " + id + " " + mediator.retriveMessage());
        }
    }
}
