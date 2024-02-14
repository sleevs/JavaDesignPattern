package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.composite.ActionElementService;
import br.com.jsn.composite.AnalyzeElementService;
import br.com.jsn.composite.DeliveryElementService;
import br.com.jsn.composite.EmployeeElementService;
import br.com.jsn.composite.ProjectComposite;
import br.com.jsn.composite.TaskElementService;
import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.DeliveryDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.TaskDTO;

@Service
public class ProjectService {


    @Autowired
    private TaskService taskService ;
    @Autowired
    private EmployeeService employeeService ;
    @Autowired
    private AnalyzeService analyzeService ;
    @Autowired
    private ActionService actionService ;


    public void createProject(ProjectDTO projectDto){
        


       
        ProjectComposite projectComposite =new ProjectComposite(projectDto.getTask().getDescription());
        
        TaskDTO dto = taskService.saveTask(projectDto.getTask()); 
        
        TaskElementService taskElementService = new TaskElementService(dto);
        
        projectComposite.add(projectComposite);
        projectComposite.add(taskElementService);
    
    }


   // "analysis of task for employees - system send the task to n employees to analysis "
     
     //retorna um lista de profissionais/analises alcançados

   public List<EmployeeDTO> enviarTaskToEmployees(ProjectDTO projectDto){


   ProjectComposite projectComposite =new ProjectComposite(projectDto.getTask().getDescription());

   List<EmployeeDTO> listEmployeeDTO =  employeeService.findEmployees();

    for(EmployeeDTO employeeDTO : listEmployeeDTO){


        AnalyzeDTO analyzeDTO = new AnalyzeDTO();
        analyzeDTO.setAnalyst(employeeDTO);
        analyzeDTO.setTask(projectDto.getTask());

        EmployeeElementService employeeService = new EmployeeElementService(employeeDTO);
        projectComposite.add(employeeService);
        projectComposite.display();
    }

    return listEmployeeDTO;

 

}


     /*
        componente : analysis service
         * 
        
      analisar a tarefa ou recusar")
      */  
      public AnalyzeDTO analysisOfTask(ProjectDTO projectDto , AnalyzeDTO analyzeDTO){
        

        ProjectComposite projectComposite =new ProjectComposite(projectDto.getTask().getDescription());
          /* 
             buscar todas as oferta para analise para o employee id x
             */

             AnalyzeDTO newAnalyze = analyzeService.saveAnalyze(analyzeDTO);
             projectDto.getListAnalyzes().add(newAnalyze);
           
            AnalyzeElementService analyzeService = new AnalyzeElementService(newAnalyze);
          
 
            projectComposite.add(analyzeService);
            projectComposite.display();
          
              //retorna uma analises 
            return analyzeDTO;
    
    
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
        
        ProjectComposite projectComposite =new ProjectComposite(projectDto.getTask().getDescription());
            

        List<AnalyzeDTO> listAnalysisRetorno = new ArrayList<>();

        projectDto.getListAnalyzes().get(3).setStatus("APROVADO");
        

           //retorna uma lista de analises 
     
            return projectDto.getListAnalyzes();

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
        
        ProjectComposite projectComposite =new ProjectComposite(projectDto.getTask().getDescription());
                    




            List<AnalyzeDTO> listAnalysis = new ArrayList<>();

            listAnalysis.get(3).setStatus("APROVADO");
                ActionDTO actionDTO = new ActionDTO();
                actionDTO.setObjective(null);
                actionDTO.setResource(projectDto.getListAnalyzes().get(3).getResource().toString());
                actionDTO.setStart("19/02/2024");
                actionDTO.setEnd("26/02/2024");
                actionDTO.setStatus("PROCESSING"); 
                
                //retorna um objeto action atualizado
                
        ActionElementService actionService = new ActionElementService(actionDTO);
        projectComposite.add(actionService);
                
    
            
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


    
    



    


    
}
