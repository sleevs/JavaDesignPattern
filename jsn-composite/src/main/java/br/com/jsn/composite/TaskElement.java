package br.com.jsn.composite;

import br.com.jsn.dto.TaskDTO;
public class TaskElement extends ManagerComponent{

    private TaskDTO taskDTO ;

    public TaskElement(TaskDTO taskDTO){
        this.taskDTO = taskDTO;
     
    }




    @Override
    public Object display() {
     
        return taskDTO;
    }




    public TaskDTO getTaskDTO() {
        return taskDTO;
    }




    public void setTaskDTO(TaskDTO taskDTO) {
        this.taskDTO = taskDTO;
    }

    


    
    
}
