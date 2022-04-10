package br.com.jsn.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediatorDemo {

    public static void main (String [] args){
        List<Thread> producerList = new ArrayList<>();
        System.out.println("Press ENTER ");
        Scanner scam = new Scanner(System.in);
        System.out.println("Press ENTER for exit");

        Mediator mediator = new Mediator();

        producerList.add(new Thread(new Producer(mediator)));
        producerList.add(new Thread(new Producer(mediator)));
        producerList.add(new Thread(new Producer(mediator)));
        producerList.add(new Thread(new Consumer(mediator)));
        producerList.add(new Thread(new Consumer(mediator)));
        producerList.add(new Thread(new Consumer(mediator)));

        for(Thread threadProducer : producerList){
            threadProducer.start();
        }

        boolean stop = false ;
        String exit = scam.nextLine();

        while (!stop){
            if(exit.equals("")){
                stop = true ;

                for(Thread p : producerList){
                    p.stop();

                }

            }

        }
    }
}
