package br.com.jsn.chainofresponsability;

import java.util.Random;

public class HandlerOne {


    private final static Random RANDOM = new Random();
    private static int nextId =  1;
    private int id = nextId ++ ;
    private HandlerOne nextInChain ;

    public void add(HandlerOne next){

        if(nextInChain == null){
            nextInChain = next ;

        }else{
            nextInChain.add(next);
        }
    }


    public void wrapAround(HandlerOne root){
        if(nextInChain == null){
            nextInChain = root ;

        }else{
            nextInChain.wrapAround(root);
        }

    }

    public void execute(int num){

        if(RANDOM.nextInt(4) != 0){
            System.out.println(" === " + id + "-BUSY");
            nextInChain.execute(num);

        }else{
            System.out.println( id + " -BUSY " + num);
        }
    }



}
