package br.com.jsn.composite;

import java.util.ArrayList;
import java.util.List;


public class ManagerComposite extends ManagerComponent{

    String descricao  ;
    List<ManagerComponent> listElementosProjeto = new ArrayList<>();

    List<Object> listResult = new ArrayList<>();


    public ManagerComposite(String desc){
        this.descricao = desc ;
    }

    @Override
    public Object display() {
        
        for(ManagerComponent c : listElementosProjeto){
            listResult.add(c.display());
        }
       return  listResult;
    
    }


    public void add(ManagerComponent c){
        listElementosProjeto.add(c);
    }

    public void remove(ManagerComponent c){
        listElementosProjeto.remove(c);
    }

    public List<ManagerComponent> get(){
        return this.listElementosProjeto;
    }
    
    
    
}
