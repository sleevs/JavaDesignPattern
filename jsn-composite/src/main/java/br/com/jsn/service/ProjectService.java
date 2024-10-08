package br.com.jsn.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.ActionResponseDTO;
import br.com.jsn.dto.AnalyzeRequestDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.ProjectResponseDTO;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.ProjectEntity;
import br.com.jsn.repository.ProjectRepository;
import br.com.jsn.util.DtoMapper;

@Service
public class ProjectService  {

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

    @Autowired
    private DtoMapper dtoMapper;
   
    public Object createProject(ProjectDTO dto){
      
      if(dto.getAccount() != null){
      Date dateNow = new Date();
      ProjectEntity projectEntity = new ProjectEntity();
      projectEntity.setAccountId(dto.getAccount());
      projectEntity.setProjectScope(dto.getScope());
      projectEntity.setProjectDescription(dto.getDescription());
      projectEntity.setProjectType(dto.getType());
      projectEntity.setProjectDate(dateNow);
      ProjectEntity newProjectEntity =   projectRepository.save(projectEntity);
      return dtoMapper.buildProjectDTO(newProjectEntity);
      }
                
      return null;
    
    }


    public ProjectResponseDTO findProjectId(Long id) {
             
      if(id != null){
        var projectDto = dtoMapper.buildProjectDTO(projectRepository.findProjectById(id)) ;
        List<AnalyzeDTO> listAnalysis = analyzeService.findAnalysisByProjectId(projectDto.getId());
        
        List<AnalyzeDTO> listAnalysisResult = new ArrayList<>();
        for(AnalyzeDTO a : listAnalysis){

        List<TaskDTO> listResult =  taskService.findTasksByAnalysis(a.getId());
        a.setTasks(listResult);
        listAnalysisResult.add(a);
        }
        
        ProjectResponseDTO projectResponseDTO = new ProjectResponseDTO();
        projectResponseDTO.setProject(projectDto);
        projectResponseDTO.setAnalysis(listAnalysisResult);
        return projectResponseDTO ;
      }
     return null ;
    }


    public List<ProjectResponseDTO> findProjectAccount(Long account){

      try{
       if(account != null){
       List<ProjectEntity> list = projectRepository.findProjectByAcountId(account);
       List<ProjectResponseDTO> listResult = new ArrayList<>();
       for(ProjectEntity projectEntity: list){
        ProjectResponseDTO projectResponseDTO = new ProjectResponseDTO();
        ProjectDTO projectDTO = dtoMapper.buildProjectDTO(projectEntity);
        projectResponseDTO.setAnalysis(analyzeService.findAnalysisByProjectId(projectDTO.getId()));
        projectResponseDTO.setProject(projectDTO);
        listResult.add(projectResponseDTO);
        
       }
       return listResult ;
      }
      
      }catch(Exception e){

      }
      return null ;
    }

   public List<EmployeeDTO> sendTaskToEmployees(ProjectDTO projectDto){

    ProjectEntity project  = projectRepository.findProjectById(projectDto.getId());
    ProjectDTO newProjectDto =  dtoMapper.buildProjectDTO(project);
    List<TaskDTO> listDto = taskService.findTasksByProject(newProjectDto.getId());
    List<EmployeeDTO> listEmployeeDTO =  employeeService.findEmployeesByType(listDto.get(0).getType());

    return listEmployeeDTO;

  }


       /*
         * 
         * 
        /*scenario - profissional realiza envio de análise para o cliente

         * give profissional enviar análise para o cliente com
         * informações detalhadas das atividades necessárias 
         * then cliente recebe as informações com status processing client 
       
        */
      public AnalyzeDTO analysisOfTask(AnalyzeRequestDTO analyzeRequestDTO){

            EmployeeDTO employeeDTO = employeeService.findEmployeeById(analyzeRequestDTO.getEmployee());
             List<TaskDTO> taskList = new ArrayList<>();
             AnalyzeDTO analyzeDTOInput = new AnalyzeDTO();
             analyzeDTOInput.setEmployee(employeeDTO);
             analyzeDTOInput.setComplexity(analyzeRequestDTO.getComplexity());
             analyzeDTOInput.setCost(analyzeRequestDTO.getCost());
             analyzeDTOInput.setEstimate(analyzeRequestDTO.getEstimate());
             analyzeDTOInput.setValue(analyzeRequestDTO.getValue());
             analyzeDTOInput.setProject(analyzeRequestDTO.getProject());

             var analysisComposition = analyzeService.saveAnalyze(analyzeDTOInput);

             for(TaskDTO taskDTO : analyzeRequestDTO.getTasks()){
              taskDTO.setAnalyze(analysisComposition.getId());
              taskDTO.setStatus("TODO");
              taskList.add(taskService.saveTask(taskDTO));
             }
             
             analysisComposition.setTasks(taskList);
              //retorna uma analises composition
            return analysisComposition;
  
        }


        public ActionResponseDTO processingTask(TaskDTO task){

            if(task.getId() != null){
              TaskDTO taskDto = taskService.findTask(task.getId());
              AnalyzeDTO  analyzeDTO = analyzeService.findAnalyzeById(taskDto.getAnalyze());
              ProjectDTO projectDTO = dtoMapper.buildProjectDTO(projectRepository.findProjectById(analyzeDTO.getProject().getId()));
              List<ActionDTO> actionResult = new ArrayList<>();

              for(ActionDTO a : task.getActions()){
                 
                taskDto.setStatus(a.getStatus());
                actionResult.add(actionService.createAction(a));
              }
            
              TaskDTO taskResult = taskService.update(taskDto);
              taskResult.setActions(actionResult);

              //atualizar a list a de task
              List<TaskDTO> lisTaskDTO = taskService.findTasksByAnalysis(analyzeDTO.getId());
              for(TaskDTO t: lisTaskDTO){

                if(t.getId().equals(taskResult.getId())){ 
                  lisTaskDTO.remove(t);
                  lisTaskDTO.add(taskResult);
                  break;
                }

              }

              analyzeDTO.setTasks(lisTaskDTO);
              ActionResponseDTO actionResponseDTO = new ActionResponseDTO();
              actionResponseDTO.setProject(projectDTO);
              actionResponseDTO.setAnalysis(analyzeDTO);

              return actionResponseDTO ;

              }
            
          return null ;
        }

 


        public void findActionByTasks(List<TaskDTO> task){

          List<ActionDTO> actionResult = new ArrayList<>();
          
          for(TaskDTO t : task){

            for(ActionDTO a : t.getActions()){
                 
              t.setStatus(a.getStatus());
              actionResult.add(actionService.createAction(a));
            }
          }

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

   



        public ActionDTO updateAction(ActionDTO dto){
          
         return actionService.createAction(dto);
              
        }


        public ProjectEntity buildEntity(ProjectDTO dto) {
           ProjectEntity projectEntity = new ProjectEntity();

          projectEntity.setAccountId(dto.getAccount());
          
          return projectEntity ;
        }


    
}
