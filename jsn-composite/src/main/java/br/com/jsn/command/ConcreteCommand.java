package br.com.jsn.command;

public class ConcreteCommand  extends Command{

    private Receiver receiver;


    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void executar() {
        // TODO Auto-generated method stub
        receiver.action();
   
    }
    
}
