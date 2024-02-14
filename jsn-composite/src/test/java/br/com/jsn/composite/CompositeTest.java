package br.com.jsn.composite;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.TaskDTO;

public class CompositeTest {



    /*
     * 
     * componente : project service
    */
    @Test
    @DisplayName("Should be true")
    public void createProject(){
       
        TaskDTO task = new TaskDTO();
        task.setDescription("I need a professional for paint my home");
        task.setRequirements("good knowledge with paint");
        task.setFunctional("Painter");
        ProjectComposite project =new ProjectComposite("Paint");
        TaskElementService taskService = new TaskElementService(task);
        project.add(taskService);
        project.display();

        //retorna um objeto projeto
       assertNotNull(project);
        // assertTrue(true);
    }




      /*
      componente : employee service
     * *scenario profissionais analisam o projeto

         * 1) give receber tarefa 
         * 2) then analisar a tarefa ou recusar
         * 3) when retornar para orçamento para o projeto
     * 
    */
    @Test
    @DisplayName("analysis of task for employees - system send the task to n employees to analysis ")
    public void enviarTaskToEmployees(){


        TaskDTO task = new TaskDTO();
        task.setDescription("I need a professional for paint my home");
        task.setRequirements("good knowledge with paint");
        task.setFunctional("Painter");
        ProjectComposite project =new ProjectComposite("Paint");
        TaskElementService taskService = new TaskElementService(task);
        project.add(taskService);
        project.display();

       

        List<EmployeeDTO> listEmployeesDTOs = new ArrayList<>() ;
        listEmployeesDTOs.add(new EmployeeDTO("Nelson Mandela" , "Painter" ,"mandela@gmail.com" 
        ,"21987456321" ,"tech skills", "media experiences", "College"));

        listEmployeesDTOs.add(new EmployeeDTO("Ryan" , "Painter" ,"ryan@gmail" 
        ,"21789654321" ,"Old school", "senior knowledge", "College"));

        listEmployeesDTOs.add(new EmployeeDTO("Jennifer" , "Painter" ,"jennifern_studio@gmail" 
        ,"21963852741" ,"High tech", "senior knowledge", "UNIVERSITY"));
      
        listEmployeesDTOs.add(new EmployeeDTO("Duke" , "Painter" ,"duke@gmail" 
        ,"21951753456" ,"Vivência no assunto", "senior", "Não possui"));
      

         //retorna um lista de profissionais/analises alcançados
        assertNotNull(listEmployeesDTOs);
        assertNotNull(task);
        for(EmployeeDTO e : listEmployeesDTOs){

            AnalyzeDTO analyzeDTO = new AnalyzeDTO();
            analyzeDTO.setAnalyst(e);
            analyzeDTO.setTask(task);

            System.out.println(" PROJECT " + analyzeDTO.getTask().getRequirements() );
            System.out.println(" PROFESSIONALS RECEIVERS PROPOSAL " + analyzeDTO.getAnalyst().getName() );
            System.out.println(" PROPOSAL " + analyzeDTO.getObjective() );

        }


        
     


    }

        /*
        componente : analysis service
         * 
        */
    @Test
    @DisplayName("analisar a tarefa ou recusar")
    public void analysisOfTask(){

       
        TaskDTO task = new TaskDTO();
        task.setDescription("I need a professional for paint my home");
        task.setRequirements("good knowledge with paint");
        task.setFunctional("Painter");
        ProjectComposite project =new ProjectComposite("Paint");
        TaskElementService taskService = new TaskElementService(task);
        project.add(taskService);
        project.display();

       

        List<EmployeeDTO> listEmployeesDTOs = new ArrayList<>() ;
        listEmployeesDTOs.add(new EmployeeDTO("Nelson Mandela" , "Painter" ,"mandela@gmail.com" 
        ,"21987456321" ,"tech skills", "media experiences", "College"));

        listEmployeesDTOs.add(new EmployeeDTO("Ryan" , "Painter" ,"ryan@gmail" 
        ,"21789654321" ,"Old school", "senior knowledge", "College"));

        listEmployeesDTOs.add(new EmployeeDTO("Jennifer" , "Painter" ,"jennifern_studio@gmail" 
        ,"21963852741" ,"High tech", "senior knowledge", "UNIVERSITY"));
      
        listEmployeesDTOs.add(new EmployeeDTO("Duke" , "Painter" ,"duke@gmail" 
        ,"21951753456" ,"Vivência no assunto", "senior", "Não possui"));
      
        List<AnalyzeDTO> listAnalysis = new ArrayList<>();

        assertNotNull(listEmployeesDTOs);
        assertNotNull(task);
        for(EmployeeDTO e : listEmployeesDTOs){

            AnalyzeDTO analyzeDTO = new AnalyzeDTO();
            analyzeDTO.setAnalyst(e);
            analyzeDTO.setTask(task);
            listAnalysis.add(analyzeDTO);

        }


        System.out.println(" PROPOSAL INICIAL " + listAnalysis.get(3) );
        System.out.println("\n");

       
        listAnalysis.get(3).setObjective("Realizar a limpesa e a pintura da parede da parte de fora da casa");
        listAnalysis.get(3).setComplexity("Baixa");
        listAnalysis.get(3).setCost("$100");
        listAnalysis.get(3).setPriority("Alta");
        listAnalysis.get(3).setTime("7 dias");
        listAnalysis.get(3).setValue("$50");

        List<String> listaDeMaterial = new ArrayList<>();
        listaDeMaterial.add("Lata de tinta 25 dollares");
        listaDeMaterial.add("pinsel e lixadeira 7 dollares ");
        listaDeMaterial.add("massa 8 dollares");

        listAnalysis.get(3).setResource(listaDeMaterial);



        System.out.println(" PROJECT " + listAnalysis.get(3).getTask().getRequirements() );
        System.out.println(" PROFESSIONALS RECEIVERS PROPOSAL " + listAnalysis.get(3).getAnalyst().getName() );
        System.out.println(" PROPOSAL FINAL" + listAnalysis.get(3) );

          //retorna uma analises 
          assertNotNull(listAnalysis.get(3));



    }






    
         /*
            component project service

         scenario cliente recebe 0 or N analizes de orçamento

         * give 1) receber analise 
         * then 2) cliente verificar analise da tarefa
         * when 3) retornar para o projeto aceite/recusa
        */

        @Test
        @DisplayName("cliente recebe lista de orçamentos")
        public void receberAnalyses(){

        List<AnalyzeDTO> listAnalysis = new ArrayList<>();

        listAnalysis.get(3).setStatus("APROVADO");

           //retorna uma lista de analises 
           assertNotNull(listAnalysis);



        }


        /*
         * 
         * 
        /*scenario - profissional recebe aprovação de orçamento

         * give profissional receber sinal verde realizar atividade do projeto 
         * then cliente confirma orçamento 
         * when profissional fizanliar atividade cliente libera o pagamento
        */
         
        @Test
        @DisplayName(" profissional recebe aprovação de orçamento")
        public void iniciarAtividade(){




           List<AnalyzeDTO> listAnalysis = new ArrayList<>();

           listAnalysis.get(3).setStatus("APROVADO");
            ActionDTO actionDTO = new ActionDTO();
            actionDTO.setObjective(null);
            actionDTO.setResource(listAnalysis.get(3).getResource().toString());
            actionDTO.setStart("19/02/2024");
            actionDTO.setEnd("26/02/2024");
            actionDTO.setStatus("PROCESSING"); 
            
             //retorna um objeto action atualizado
           assertNotNull(actionDTO);

            
        }


        @Test
        @DisplayName(" profissional recebe aprovação de orçamento")
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
            assertNotNull(actionDTO);


        }

        @Test
        @DisplayName(" profissional recebe aprovação de orçamento")
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
                assertNotNull(actionDTO);
    
    
            }


        


        @Test
        @DisplayName(" profissional recebe aprovação de orçamento")
        public void cancelAtividade(){


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
            assertNotNull(actionDTO);


        }


    
    }