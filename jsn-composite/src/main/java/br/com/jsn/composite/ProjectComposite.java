package br.com.jsn.composite;

import java.util.ArrayList;
import java.util.List;

public class ProjectComposite extends ProjectComponent{

    String descricao  ;
    List<ProjectComponent> listElementosProjeto = new ArrayList<>();

    List<Object> listResult = new ArrayList<>();


    public ProjectComposite(String desc){
        this.descricao = desc ;
    }

    @Override
    public Object display() {
        
        for(ProjectComponent c : listElementosProjeto){
            listResult.add(c.display());
        }
       return  listResult;
    
    }


    public void add(ProjectComponent c){
        listElementosProjeto.add(c);
    }

    public void remove(ProjectComponent c){
        listElementosProjeto.remove(c);
    }
    
    
    
}
