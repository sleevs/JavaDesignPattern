package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ChatService  extends Mediator{

    List<Colleague> users = new ArrayList<>();
    
    @Override
    public void sendMessage(String message, Colleague user) {

            for(Colleague u : users){

                if(u != user){
                    u.receiver(message);
                }
            }
  
    }

    @Override
    public void add(Colleague user) {
        users.add(user);
    }
    
}
