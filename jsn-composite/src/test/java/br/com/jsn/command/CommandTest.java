package br.com.jsn.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommandTest {


    @Test
    @DisplayName("verify transaction initialization - Should be true")
    public void createTaskToProject(){

        Receiver receiverCliente = new Client();
        Receiver receiverEmployees = new Employees();

        Command commandClient = new ConcreteCommand(receiverCliente);
        Command commandEmployees = new ConcreteCommand(receiverEmployees);
        
        Invoker invokerClient = new Invoker();
        Invoker invokerEmployees = new Invoker();

        invokerClient.storage(commandClient);
        invokerClient.invoker();

        invokerEmployees.storage(commandEmployees);
        invokerEmployees.invoker();

    }
    
}
