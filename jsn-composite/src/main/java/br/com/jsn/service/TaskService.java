package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.composite.ManagerComposite;
import br.com.jsn.composite.TaskElement;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.TaskEntity;
import br.com.jsn.repository.TaskRepository;

@Service
public class TaskService implements CrudService<TaskEntity>{


    @Autowired
    private TaskRepository taskRepository;
    //
    //


    public TaskDTO build(TaskEntity e){

        
        TaskDTO task = new TaskDTO();
        task.setDescription(e.getDescription());
        task.setRequirements(e.getRequirements());
        task.setFunctional(e.getFunctional());
        task.setProject(e.getProject());
        task.setType(e.getTaskType());
        task.setId(e.getTaskId());
        return task ;
    }


    public TaskDTO buildAndSave(TaskEntity e){

        TaskEntity newTask = taskRepository.save(e);
        TaskDTO taskdDto = build(newTask);

        return taskdDto ;
        
    }

    

    public TaskEntity build(TaskDTO dto){

        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setDescription(dto.getDescription());
        taskEntity.setFunctional(dto.getFunctional());
        taskEntity.setRequirements(dto.getRequirements());
        taskEntity.setTaskType(dto.getType());
        
        return taskEntity ;
    }

    public TaskDTO saveTask(TaskDTO dto){

        TaskEntity recordTaskEntity  =  create(build(dto));
        TaskDTO task = build(recordTaskEntity);

        ManagerComposite project =new ManagerComposite("Paint");
        TaskElement taskService = new TaskElement(task);
        project.add(taskService);
        project.display();

        return null ;
        
    }
  

    @Override
    public TaskEntity create(TaskEntity e) {

            /*scenario cliente inicia projeto

         * give cliente cria uma task para projeto 
         * then enviar para analise de um profissional
         * when profissional visualizar reponder com analise 
        */
       return null ;


    }

    public List<TaskDTO> findTasksByProject(Long id){

       List<TaskEntity>  listInput = taskRepository.findTasksByProjectId(id);
       List<TaskDTO> listOutput = new ArrayList<>();
            for(TaskEntity e : listInput){
                listOutput.add(build(e));
                
            }
        
        return listOutput ;
    }

    public TaskDTO findTask(Long id) {
        
        return build(taskRepository.findTaskById(id));
    }


    @Override
    public TaskEntity read(Long id) {
        
        return taskRepository.findTaskById(id);
    }

    @Override
    public TaskEntity update(Long id, TaskEntity e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
