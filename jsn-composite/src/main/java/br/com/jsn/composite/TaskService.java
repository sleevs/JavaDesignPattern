package br.com.jsn.composite;

import br.com.jsn.dto.TaskDTO;

public class TaskService extends ProjectElement{

    private TaskDTO descricao ;

    public TaskService(TaskDTO descricao){
        this.descricao = descricao;
    }

    @Override
    public Object display() {
        System.out.println(" TASK " + descricao);
        return descricao;
    }
    
}
