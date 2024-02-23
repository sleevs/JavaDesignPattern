package br.com.jsn.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import br.com.jsn.composite.ActionElement;
import br.com.jsn.composite.AnalyzeElement;
import br.com.jsn.composite.EmployeeElement;
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
import br.com.jsn.entity.EmployeeEntity;
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
      /*
       * TYPE  ENTRADA REQUEST PROJECT
         VARIABLE  accountId , projectId and taskId
         ACTION  associar accountId to projectId and add taskId to project
         TEST       OK

         TYPE  RESULT  PROJECT COMPOSITE OBJECT 
         VARIABLE  account OBJECT , project OBJECT and task OBJECT
         ACTION  associar account to project and add task to project
         TEST       OK
       * 
      */
      
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

    /*
     * 
     * TYPE     : ENTRADA
     * VARIABLE : employees , task , project
     * ACTION   : if employee type == task type then add employer to analyst group 
     * TEST     : OK or 0  return analysis with task and employees associate
     * 
     * TYPE     : SAIDA
     * VARIABLE : employees , task , project , analysis
     * ACTION   : return ALL analyze record with task_project_id
     * TEST     : OK or 0 
    */
   // "analysis of task from employees - system send the task to n employees to make analysis "
     
     //retorna um lista de profissionais/analises alcançados

   public List<EmployeeDTO> sendTaskToEmployees(ProjectDTO projectDto){


    //project from stakholder
    ProjectEntity project  = projectRepository.findProjectById(projectDto.getId());

    ProjectDTO newProjectDto =  buildDto(project);
    //task from project
    List<TaskDTO> listDto = taskService.findTasksByProject(newProjectDto.getId());
    //employes whiche match with task
    List<EmployeeDTO> listEmployeeDTO =  employeeService.findEmployees(listDto.get(0).getType());


    return listEmployeeDTO;

 

}


     /*
        componente : analysis service
         * 
        
      analisar a tarefa ou recusar")
      */  
      public AnalyzeDTO analysisOfTask(AnalyzeRequestDTO dto){
        

          /* 
             buscar todas as oferta para analise para o employee id x
             */
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


        /*
            component project service

         scenario cliente recebe 0 or N analizes de orçamento

         * give 1) receber analise 
         * then 2) cliente verificar analise da tarefa
         * when 3) retornar para o projeto aceite/recusa
       

        
       "cliente recebe lista de orçamentos
        */
        public List<AnalyzeDTO> receberAnalyses(ProjectDTO projectDto){
     
            //receber analise 
           //retorna uma lista de analises - 
           List<TaskDTO> listDto = taskService.findTasksByProject(projectDto.getId());
           List<AnalyzeDTO> analyzeDtoResult =  analyzeService.findByTaskId(listDto.get(0).getId());
    
            return analyzeDtoResult;

        }

        public List<AnalyzeDTO> verifyAnalyses(AnalyzeResponseDTO analyzeResponseDTO){
          
          //cliente verificar analise da tarefa
          // retornar para o projeto aceite/recusa
        
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
         
  
        public void iniciarAtividade(ProjectDTO projectDto){
        
   
        List<AnalyzeDTO> listAnalysis = new ArrayList<>();

            listAnalysis.get(3).setStatus("APROVADO");
                ActionDTO actionDTO = new ActionDTO();
                actionDTO.setObjective(null);
            //  actionDTO.setStart("19/02/2024");
                actionDTO.setEnd("26/02/2024");
                actionDTO.setStatus("PROCESSING"); 
                
                //retorna um objeto action atualizado
                
        ActionElement actionService = new ActionElement(actionDTO);
                
    
            
        }


        public void stopAtividade(){

            String causa = "information about cause";

            List<AnalyzeDTO> listAnalysis = new ArrayList<>();

            listAnalysis.get(3).setStatus("APROVADO");
             ActionDTO actionDTO = new ActionDTO();
             actionDTO.setObjective(null);
             actionDTO.setResource(listAnalysis.get(3).getResource().toString());
             actionDTO.setStart("19/02/2024");
             actionDTO.setEnd("26/02/2024");
             actionDTO.setStatus("STOP"); 
             actionDTO.getDescription().add(causa);
             
              //retorna um objeto action atualizado
           


        }

        public void finalizarAtividade(){

                String causa = "information about cause";
    
                List<AnalyzeDTO> listAnalysis = new ArrayList<>();
    
                listAnalysis.get(3).setStatus("APROVADO");
                 ActionDTO actionDTO = new ActionDTO();
                 actionDTO.setObjective(null);
                 actionDTO.setResource(listAnalysis.get(3).getResource().toString());
                 actionDTO.setStart("19/02/2024");
                 actionDTO.setEnd("26/02/2024");
                 actionDTO.setStatus("FINISH"); 
                 actionDTO.getDescription().add(causa);
                 
                  //retorna um objeto action atualizado
      
            }

        
        public void cancelAtividade(ActionDTO action){

            String causa = "information about cause - DATA:";
            List<AnalyzeDTO> listAnalysis = new ArrayList<>();

            listAnalysis.get(3).setStatus("APROVADO");
             ActionDTO actionDTO = new ActionDTO();
             actionDTO.setObjective(null);
             actionDTO.setResource(listAnalysis.get(3).getResource().toString());
             actionDTO.setStart("19/02/2024");
             actionDTO.setEnd("26/02/2024");
             actionDTO.setStatus("CANCELED"); 
             actionDTO.getDescription().add(causa);
             
              //retorna um objeto action atualizado
          


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
