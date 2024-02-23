package br.com.jsn.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.composite.ManagerComposite;
import br.com.jsn.composite.TaskElement;
import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.AnalyzeRequestDTO;
import br.com.jsn.dto.AnalyzeResponseDTO;
import br.com.jsn.dto.EmployeeDTO;
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


        return ResponseEntity.ok("");
     }

     @PostMapping("/send")
     public ResponseEntity<Object> searchAnalyst(@RequestBody ProjectDTO projectDto){

      return ResponseEntity.ok(projectService.sendTaskToEmployees(projectDto));
     }

    

     @PostMapping("/analyst")
     public ResponseEntity<Object> createAnalyze(@RequestBody AnalyzeRequestDTO dto){

        return ResponseEntity.ok(projectService.analysisOfTask(dto));
     }



     @PostMapping("/receiver")
     public ResponseEntity<Object> receiverAnalysis(@RequestBody ProjectDTO dto){

        return ResponseEntity.ok(projectService.receiveAnalyses(dto));
     }

     @PostMapping("/verify")
     public ResponseEntity<Object> verifyAnalysis(@RequestBody AnalyzeResponseDTO dto){


        return ResponseEntity.ok(projectService.verifyAnalyses(dto));
     }

    @PostMapping("/accept_projects")
    public ResponseEntity<Object> acceptProjects(@RequestBody EmployeeDTO dto){
  
        return ResponseEntity.ok(projectService.projectsAccept(dto));
  
       
    }

    @PostMapping("/action")
    public ResponseEntity<Object> action(@RequestBody ActionDTO dto , Long analyzeId){
  
        return ResponseEntity.ok(projectService.projectAction(dto,analyzeId));
  
       
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
