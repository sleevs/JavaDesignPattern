package br.com.jsn.controller;

import org.springframework.web.bind.annotation.RestController;

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
import br.com.jsn.dto.TaskDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class ProjectController {

    /*

    Why? - What is the problem ? Why is it being sponsored?
    What? - What is the work that will be performed on the project? 
            What are the major products/deliverables?
    Who? - Who will be involved and what will be their responsibilities
            within the project? How will they be organized?
    When? - What is the project timeline and when will particularly
            meaningful points, referred to as milestones, be complete?

    Scope management
    Requirements management
    Schedule management
    Financial management
    Quality management
    Resource management
    Stakeholder management – New from PMBOK 5
    Communications management
    Project change management
    Risk management
     * 
    */


    /*

 FRAMEWORK 
 
 
 DEFINE
 ------------------
 PROBLEM  : 
                 is your customer :
                 - person or organiation who want make a service
 		 is everyone  ?  professional x  person or organiation
 		 a segment ?
                 - service 
                Urgent ? 
                  - Relative to other needs
                                - priority , which determines resources allocated 
                                - priority , choices consumer have to spend their money 
 		
   
 NEED	  :	B2C
 SOLUTION :
 IDEA     :


EVALUATE	
 ------------------
 GAIN     : Demostration
 PAIN	  : 	
 SOLUTION :
 IDEA     :



 BUILD
 ------------------
 VALUE    :
 PROP	  :	
 
     * 
     * 
    */

    @PostMapping("/task")
     public ResponseEntity<Object> createTask(){

        /*scenario cliente inicia projeto

         * give cliente cria uma task para projeto 
         * then enviar para analise de um profissional
         * when profissional visualizar reponder com analise 
        */

        return ResponseEntity.ok("");
     }

     @PostMapping("/professional")
     public ResponseEntity<Object> createProfessional(){

         /*scenario profissionais analisam o projeto

         * give receber tarefa 
         * then analisar a tarefa ou recusar
         * when retornar para orçamento para o projeto
        */

        return ResponseEntity.ok("");
     }

     @PostMapping("/analyze")
     public ResponseEntity<Object> createAnalyze(){


         /*scenario cliente recebe 0 or N analizes de orçamento

         * give receber analise 
         * then cliente verificar analise da tarefa
         * when retornar para o projeto aceite/recusa
        */

        return ResponseEntity.ok("");
     }

     @PostMapping("/action")
     public ResponseEntity<Object> createAction(){


        /*scenario - profissional recebe aprovação de orçamento

         * give profissional receber sinal verde realizar atividade do projeto 
         * then cliente confirma orçamento 
         * when profissional fizanliar atividade cliente libera o pagamento
        */

        return ResponseEntity.ok("");
     }


     @PostMapping("/delivery")
     public ResponseEntity<Object> createDelivery(){

        /*scenario - cliente recebe status de conclusão de serviço

            REGRA SENDO AVALIADA
         * give cliente recebe atualização do profissional  
         * then cliente faz validação  
         * when plataforma libera valor do profissional
        */

        return ResponseEntity.ok("");
     }


     @PostMapping("/stop")
     public ResponseEntity<Object> stopProject(){

        return ResponseEntity.ok("");
     }

     @PostMapping("/cancel")
     public ResponseEntity<Object> cancelProject(){

        return ResponseEntity.ok("");
     }

     @GetMapping("/test")
     public ResponseEntity<Object> createProject(){
     
       
       return ResponseEntity.ok("");
    }
    
}
