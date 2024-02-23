package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jsn.composite.ManagerComposite;
import br.com.jsn.composite.ProjectElement;
import br.com.jsn.composite.TaskElement;
import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeRequestDTO;
import br.com.jsn.dto.AnalyzeResponseDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.ProjectRequestDTO;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.ProjectEntity;
import br.com.jsn.entity.TaskEntity;
import br.com.jsn.helper.Builder;
import br.com.jsn.repository.ProjectRepository;

@Service
public class ProjectService implements Builder<ProjectEntity,ProjectDTO>{

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TaskService taskService ;
    @Autowired
    private EmployeeService employeeService ;
    @Autowired
    private AnalyzeService analyzeService ;
    @Autowired
    private ActionService actionService ;


    public Object createProject(ProjectRequestDTO projectRequestDTO){
      
      ProjectEntity projectEntity = new ProjectEntity();
      projectEntity.setProjectScope(projectRequestDTO.getScope());
      projectEntity.setProjectDescription(projectRequestDTO.getDescription());
      projectEntity.setProjectType(projectRequestDTO.getType());
      projectEntity.setProjectReponsability(projectRequestDTO.getAccount());
      
      ProjectEntity newProjectEntity =   projectRepository.save(projectEntity);
              
      ProjectDTO newProjectDto =  buildDto(newProjectEntity);
      
      
       TaskEntity task = new TaskEntity();
       task.setDescription(projectRequestDTO.getDescriptionTask());
       task.setProject(newProjectEntity.getProjectId());
       task.setTaskType(projectRequestDTO.getTypeTask());
       task.setFunctional(projectRequestDTO.getFunctional());
       task.setRequirements(projectRequestDTO.getRequirements());
     
       TaskDTO newTaskDto = taskService.buildAndSave(task);
        
       ManagerComposite managerComposite =new ManagerComposite(newProjectDto.getScope());
      
       ProjectElement projectElement = new ProjectElement(newProjectDto);
       TaskElement taskElementService = new TaskElement(newTaskDto);
      
       managerComposite.add(projectElement);
       managerComposite.add(taskElementService);
      System.out.println(managerComposite.display());

      return managerComposite.get();
    
    }

  

   public List<EmployeeDTO> sendTaskToEmployees(ProjectDTO projectDto){

    ProjectEntity project  = projectRepository.findProjectById(projectDto.getId());
    ProjectDTO newProjectDto =  buildDto(project);
    List<TaskDTO> listDto = taskService.findTasksByProject(newProjectDto.getId());
    List<EmployeeDTO> listEmployeeDTO =  employeeService.findEmployees(listDto.get(0).getType());

    return listEmployeeDTO;

 

}


     
      public AnalyzeDTO analysisOfTask(AnalyzeRequestDTO dto){
        

            EmployeeDTO employeeDTO = employeeService.findEmployeeById(dto.getEmployee());

            TaskDTO taskDTO = taskService.findTask(dto.getTask());

             AnalyzeDTO newAnalyze = new AnalyzeDTO();
             newAnalyze.setEmployee(employeeDTO.getId());
             newAnalyze.setTask(taskDTO.getId());
             newAnalyze.setComplexity(dto.getComplexity());
             newAnalyze.setCost(dto.getCost());
             newAnalyze.setPriority(dto.getPriority());
             newAnalyze.setTime(dto.getTime());
             newAnalyze.setValue(dto.getValue());
             newAnalyze.setResource(dto.getResource());
             newAnalyze.setStatus("PROCESSING");
           
             AnalyzeDTO analyzeDtoResult =  analyzeService.saveAnalyze(newAnalyze);
  
            System.out.println("RESULTADO " + analyzeDtoResult.getTime());
              //retorna uma analises 
            return analyzeDtoResult;
    
    
        }


 
        public List<AnalyzeDTO> receiveAnalyses(ProjectDTO projectDto){
     
           List<TaskDTO> listDto = taskService.findTasksByProject(projectDto.getId());
           List<AnalyzeDTO> analyzeDtoResult =  analyzeService.findByTaskId(listDto.get(0).getId());
    
            return analyzeDtoResult;

        }

        public List<AnalyzeDTO> verifyAnalyses(AnalyzeResponseDTO analyzeResponseDTO){
        
           return analyzeService.verifyAnalysis(analyzeResponseDTO);

       }


        /*
         * 
         * 
        /*scenario - profissional recebe aprovação de orçamento

         * give profissional receber sinal verde realizar atividade do projeto 
         * then cliente confirma orçamento 
         * when profissional fizanliar atividade cliente libera o pagamento
        */
         
    
        public List<AnalyzeDTO> projectsAccept(EmployeeDTO dto){
    
        List<AnalyzeDTO> listAnalysis = new ArrayList<>();
        listAnalysis = analyzeService.findAnalysisByEmployeeAndStatus(dto.getId(), "ACCEPTED");
                
           return listAnalysis ;    
    
            
        }

        public ActionDTO projectAction(ActionDTO dto , Long analyzeId){
        
          AnalyzeDTO result = analyzeService.findAnalyzeById(analyzeId);
          ActionDTO action = new ActionDTO();
          action.setTask(result.getTask());
          
           return actionService.createAction(action);
              
          }


        @Override
        public ProjectDTO buildDto(ProjectEntity e) {
          
          ProjectDTO projectDto = new ProjectDTO();
          projectDto.setAccount(e.getProjectReponsability());
          projectDto.setScope(e.getProjectScope());
          projectDto.setDescription(e.getProjectDescription());
          projectDto.setType(e.getProjectType());
          projectDto.setId(e.getProjectId());

          return projectDto;
        }


        @Override
        public ProjectEntity buildEntity(ProjectDTO dto) {

          ProjectEntity projectEntity =  projectRepository.findProjectByAccountId(dto.getAccount());

          return projectEntity ;
        }


        public ProjectEntity findProjectId(Long id) {
             
          return projectRepository.findProjectById(id) ;
        }


    
    



    


    
}
