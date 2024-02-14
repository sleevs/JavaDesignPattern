package br.com.jsn.service;

import org.springframework.stereotype.Service;

import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.TaskEntity;

@Service
public class TaskService implements CrudService<TaskEntity>{


    //
    //


    public TaskDTO build(TaskEntity e){

        
        TaskDTO task = new TaskDTO();
        task.setDescription(e.getDescription());
        task.setRequirements(e.getRequirements());
        task.setFunctional(e.getFunctional());
        return task ;
    }

    public TaskEntity build(TaskDTO dto){

        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setDescription(dto.getDescription());
        taskEntity.setFunctional(dto.getFunctional());
        taskEntity.setRequirements(dto.getRequirements());

        return taskEntity ;
    }

    public TaskDTO saveTask(TaskDTO dto){

        TaskEntity recordTaskEntity  =  create(build(dto));
        return build(recordTaskEntity);
    }
  

    @Override
    public TaskEntity create(TaskEntity e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public TaskEntity read(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
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
