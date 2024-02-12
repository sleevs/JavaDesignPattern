package br.com.jsn.command;

public class Invoker {

    private Command command ;

    public void storage(Command command ){
        this.command = command;
    }

    public void invoker(){
        command.executar();
    }
    
}
