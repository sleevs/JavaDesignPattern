package br.com.jsn.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.composite.ManagerComposite;
import br.com.jsn.composite.TaskElement;
import br.com.jsn.dto.AnalyzeRequestDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.ProjectRequestDTO;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.service.EmployeeService;
import br.com.jsn.service.ProjectService;
import br.com.jsn.service.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProjectController {


    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private ProjectService projectService;


    @PostMapping("/project")
     public ResponseEntity<Object> createProject(@RequestBody ProjectRequestDTO requestDTO){

        /*scenario cliente inicia projeto

         * give cliente cria uma task para projeto 
         * then enviar para analise de um profissional
         * when profissional visualizar reponder com analise 
        */
         System.out.println(requestDTO.toString());
      
         return ResponseEntity.ok(projectService.createProject(requestDTO));
   
       

        
     }


     @PostMapping("/stop")
     public ResponseEntity<Object> stopProject(){

        return ResponseEntity.ok("");
     }

     @PostMapping("/cancel")
     public ResponseEntity<Object> cancelProject(){

        return ResponseEntity.ok("");
     }


     @PostMapping("/task")
     public ResponseEntity<Object> addTask(){

        /*scenario cliente inicia projeto

         * give cliente cria uma task para projeto 
         * then enviar para analise de um profissional
         * when profissional visualizar reponder com analise 
        */

        

        return ResponseEntity.ok("");
     }

     @PostMapping("/send")
     public ResponseEntity<Object> searchAnalyst(@RequestBody ProjectDTO projectDto){

      return ResponseEntity.ok(projectService.sendTaskToEmployees(projectDto));
     }

    

     @PostMapping("/analyst")
     public ResponseEntity<Object> createAnalyze(@RequestBody AnalyzeRequestDTO dto){

     /*scenario profissionais analisam o projeto

         * give receber tarefa 
         * then analisar a tarefa ou recusar
         * when retornar para orçamento para o projeto
        */
   

        return ResponseEntity.ok(projectService.analysisOfTask(dto));
     }


     @PostMapping("/verify")
     public ResponseEntity<Object> verifyAnalysis(@RequestBody ProjectDTO dto){

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


    
}
