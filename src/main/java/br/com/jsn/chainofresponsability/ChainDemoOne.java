package br.com.jsn.chainofresponsability;

public class ChainDemoOne {

    public static void main(String [] args){

        HandlerOne rootChain = new HandlerOne();
        rootChain.add(new HandlerOne());
        rootChain.add(new HandlerOne());
        rootChain.add(new HandlerOne());
        rootChain.wrapAround(rootChain);

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("OPERATION " + i);
            rootChain.execute(1);
            System.out.println();
        }

    }
}
