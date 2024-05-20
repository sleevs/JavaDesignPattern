package br.com.jsn.service;

import org.springframework.stereotype.Service;

@Service
public class UserService extends Colleague{

    public UserService(Mediator mediator, String user) {
        super(mediator, user);
       
    }

    @Override
    public void send(String message) {
 
        mediator.sendMessage(message,this);
    }

    @Override
    public void receiver(String message) {
   
        System.out.println(this.user + " RECEIVER" + message);
    }
    
}
