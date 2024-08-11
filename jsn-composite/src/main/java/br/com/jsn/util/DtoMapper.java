package br.com.jsn.util;

import java.util.Date;
import org.springframework.stereotype.Component;
import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.ActionEntity;
import br.com.jsn.entity.AnalyzeEntity;
import br.com.jsn.entity.EmployeeEntity;
import br.com.jsn.entity.ProjectEntity;
import br.com.jsn.entity.TaskEntity;

@Component
public class DtoMapper {

    // Método para converter ProjectEntity para ProjectDTO
  
    public ProjectDTO buildProjectDTO(ProjectEntity e) {
          
        ProjectDTO projectDto = new ProjectDTO();
        projectDto.setAccount(e.getAccountId());
        projectDto.setScope(e.getProjectScope());
        projectDto.setDescription(e.getProjectDescription());
        projectDto.setType(e.getProjectType());
        projectDto.setId(e.getProjectId());
        projectDto.setDate(DateUtil.formatDate(e.getProjectDate()));
     
        return projectDto;
      }


      public ProjectEntity buildProjectEntity(ProjectDTO dto) {
        ProjectEntity projectEntity = new ProjectEntity();

       projectEntity.setAccountId(dto.getAccount());
       
       return projectEntity ;
     }




    public TaskDTO buildTaskDTO(TaskEntity e){

        
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


    public TaskEntity buildTaskEntity(TaskDTO dto){

        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setDescription(dto.getDescription());
        taskEntity.setFunctional(dto.getFunctional());
        taskEntity.setRequirements(dto.getRequirements());
        taskEntity.setAnalyzeId(dto.getAnalyze());
        taskEntity.setTaskType(dto.getType());
        taskEntity.setTaskStatus(dto.getStatus());
        
        return taskEntity ;
    }



    public AnalyzeDTO buildAnalyzeDTO(AnalyzeEntity e){

        AnalyzeDTO analyzeDTO = new AnalyzeDTO();
        analyzeDTO.setEmployee(buildEmployeeDTO(e.getEmployee()));
        analyzeDTO.setComplexity(e.getComplexity());
        analyzeDTO.setCost(e.getCost());
        analyzeDTO.setStatus(e.getStatus());
        analyzeDTO.setValue(e.getValue());
        analyzeDTO.setId(e.getAnalyzeId());
        analyzeDTO.setEstimate(e.getAnalyzeEstimate());
        analyzeDTO.setProject(buildProjectDTO(e.getProject()));
        

        if(e.getAnalyzeDate() != null){
            analyzeDTO.setDate(DateUtil.formatDate(e.getAnalyzeDate()));
        }
        
        return analyzeDTO ;
    }

    public AnalyzeEntity buildAnalyzeEntity(AnalyzeDTO dto){
        Date dateNow = new Date();
        AnalyzeEntity analyzeEntity = new AnalyzeEntity();
        analyzeEntity.setEmployee(buildEmployeeEntity(dto.getEmployee()));
        analyzeEntity.setAnalyzeDate(dateNow);
        analyzeEntity.setComplexity(dto.getComplexity());
        analyzeEntity.setCost(dto.getCost());
        analyzeEntity.setStatus("PROCESSING BY CLIENT");
        analyzeEntity.setValue(dto.getValue());
        analyzeEntity.setAnalyzeEstimate(dto.getEstimate());
        analyzeEntity.setProject(buildProjectEntity(dto.getProject()));
      
        return analyzeEntity ;
    }



    public  EmployeeDTO buildEmployeeDTO(EmployeeEntity e){

        var dto = new EmployeeDTO();
        dto.setId(e.getEmployeeId());
        dto.setCertification(e.getEmployeeCertification());
        dto.setExperience(e.getEmployeeExperience());
        dto.setSkills(e.getEmployeeSkills());
        dto.setName(e.getEmployeeName());
        dto.setPhone(e.getEmployeePhone());
        dto.setType(e.getEmployeeType());
        dto.setEmail(e.getEmployeeEmail());
        if(e.getEmployeeDateTime() != null){
            dto.setDate(DateUtil.formatDate(e.getEmployeeDateTime()));
            
        }
        return dto;
    }


    public  EmployeeEntity buildEmployeeEntity(EmployeeDTO dto){

        var employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeCertification(dto.getCertification());
        employeeEntity.setEmployeeEmail(dto.getEmail());
        employeeEntity.setEmployeeExperience(dto.getExperience());
        employeeEntity.setEmployeePhone(dto.getPhone());
        employeeEntity.setEmployeeName(dto.getName());
        employeeEntity.setEmployeeSkills(dto.getSkills());
        employeeEntity.setEmployeeType(dto.getType());


        return employeeEntity;
       
    }



    public ActionDTO buildActionDTO(ActionEntity e){
        var action = new ActionDTO();
        action.setId(e.getActionId());
        action.setStatus(e.getStatus());
        action.setStart(e.getStart());
        action.setEnd(e.getEnd());
        action.setResource(e.getResource());
        action.setTask(e.getTaskId());
        action.setEmployee(e.getEmployee());
        action.setObjective(e.getObjective());
        return action;
    }
    

    public ActionEntity buildActionEntity(ActionDTO dto){
        ActionEntity action = new ActionEntity();
        
        action.setStart(dto.getStart());
        action.setEnd(dto.getEnd());
        action.setStatus(dto.getStatus());
        action.setResource(dto.getResource());
        action.setTaskId(dto.getTask());
        action.setEmployee(dto.getEmployee());
        action.setObjective(dto.getObjective());
        
        return action;
        
    }
    
    
}
