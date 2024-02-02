package br.com.jsn.composite;

import java.util.ArrayList;
import java.util.List;

public class Project extends ProjectElement{

    String descricao  ;
    List<ProjectElement> listElementosProjeto = new ArrayList<>();

    List<Object> listResult = new ArrayList<>();


    public Project(String desc){
        this.descricao = desc ;
    }

    @Override
    public Object display() {
        
        for(ProjectElement c : listElementosProjeto){
            listResult.add(c.display());
        }
       return  listResult;
    
    }


    public void add(ProjectElement c){
        listElementosProjeto.add(c);
    }

    public void remove(ProjectElement c){
        listElementosProjeto.remove(c);
    }
    
    
    
}
