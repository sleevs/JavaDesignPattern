package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.TaskEntity;
import br.com.jsn.repository.TaskRepository;
import br.com.jsn.util.DtoMapper;

@Service
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private DtoMapper dtoMapper;
    
    @Autowired
    private ActionService actionService;


    public TaskDTO buildAndSave(TaskEntity e){

        TaskEntity newTask = taskRepository.save(e);
        TaskDTO taskdDto = dtoMapper.buildTaskDTO(newTask);

        return taskdDto ;
        
    }

    


    public TaskDTO saveTask(TaskDTO dto){

        TaskEntity recordTaskEntity  =  dtoMapper.buildTaskEntity(dto);
        TaskEntity retornoTask = taskRepository.save(recordTaskEntity);
        return dtoMapper.buildTaskDTO(retornoTask);
        
    }
  

    

    public List<TaskDTO> findTasksByProject(Long id){

       List<TaskEntity>  listInput = taskRepository.findTasksByProjectId(id);
       List<TaskDTO> listOutput = new ArrayList<>();
            for(TaskEntity e : listInput){
                var listAction = actionService.findActionsByTask(e.getTaskId());
                TaskDTO dto = dtoMapper.buildTaskDTO(e);
                dto.setActions(listAction);
                listOutput.add(dto);
                
            }
        
        return listOutput ;
    }

    public TaskDTO findTask(Long id) {
        
        return dtoMapper.buildTaskDTO(taskRepository.findTaskById(id));
    }


    public List<TaskDTO> findTasksByAnalysis(Long id){

       if(id != null){
        List<TaskEntity>  listInput =  taskRepository.findTaskByAnalysisId(id);
        List<TaskDTO> listOutput = new ArrayList<>();
            for(TaskEntity e : listInput){
                var listAction = actionService.findActionsByTask(e.getTaskId());
                TaskDTO dto = dtoMapper.buildTaskDTO(e);
                dto.setActions(listAction);
                listOutput.add(dto);
                
            }
        
        return listOutput ;
       }
       return null ;
    
    }


    public TaskDTO update(TaskDTO dto) {
       
        TaskEntity  recordTaskEntity = taskRepository.findTaskById(dto.getId());
        recordTaskEntity.setTaskStatus(dto.getStatus());
        TaskEntity  updateTask = taskRepository.save(recordTaskEntity);
        return dtoMapper.buildTaskDTO(updateTask);
    }

    
    public boolean delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
