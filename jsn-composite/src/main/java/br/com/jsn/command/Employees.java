package br.com.jsn.command;

public class Employees implements Receiver{

    @Override
    public void action() {
       
        System.out.println("  RECEIVE TRANSACTION - ANALYZE TASK ");
    }
    
}
