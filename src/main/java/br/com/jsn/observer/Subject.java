package br.com.jsn.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> listObservers = new ArrayList<>();
    private int status ;

    public  void add(Observer observer){
        listObservers.add(observer);
    }

    public int getStatus(){
        return status ;
    }

    public void setStatus(int status){
        this.status = status ;
    }

    private void execute(){
        for(Observer o : listObservers){
            o.update();
        }
    }




}
