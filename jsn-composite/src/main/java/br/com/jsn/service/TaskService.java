package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.TaskEntity;
import br.com.jsn.repository.TaskRepository;

@Service
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;
   

    public TaskDTO build(TaskEntity e){

        
        TaskDTO taskDto = new TaskDTO();
        taskDto.setDescription(e.getDescription());
        taskDto.setRequirements(e.getRequirements());
        taskDto.setFunctional(e.getFunctional());
        taskDto.setAnalyze(e.getAnalyzeId());
        taskDto.setId(e.getTaskId());
        taskDto.setType(e.getTaskType());
        taskDto.setStatus(e.getTaskStatus());
        return taskDto ;
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
        taskEntity.setAnalyzeId(dto.getAnalyze());
        taskEntity.setTaskType(dto.getType());
        taskEntity.setTaskStatus(dto.getStatus());
        
        return taskEntity ;
    }

    public TaskDTO saveTask(TaskDTO dto){

        TaskEntity recordTaskEntity  =  build(dto);
        TaskEntity retornoTask = taskRepository.save(recordTaskEntity);
        return build(retornoTask);
        
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

    public List<TaskDTO> findTasksByAnalysis(Long id){

       if(id != null){
        List<TaskEntity>  listInput =  taskRepository.findTaskByAbalysisId(id);
        List<TaskDTO> listOutput = new ArrayList<>();
            for(TaskEntity e : listInput){
                listOutput.add(build(e));
                
            }
        
        return listOutput ;
       }
       return null ;
    
    }


   
    public TaskDTO update(TaskDTO dto) {
       
        TaskEntity  recordTaskEntity = taskRepository.findTaskById(dto.getId());
        recordTaskEntity.setTaskStatus(dto.getStatus());
        TaskEntity  updateTask = taskRepository.save(recordTaskEntity);
        return build(updateTask);
    }

    
    public boolean delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
