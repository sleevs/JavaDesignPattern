package br.com.jsn.composite;

import br.com.jsn.dto.TaskDTO;

public class TaskElementService extends ProjectComponent{

    private TaskDTO descricao ;

    public TaskElementService(TaskDTO descricao){
        this.descricao = descricao;
     
    }




    @Override
    public Object display() {
        System.out.println(" TASK " + descricao);
        return descricao;
    }
    
}
