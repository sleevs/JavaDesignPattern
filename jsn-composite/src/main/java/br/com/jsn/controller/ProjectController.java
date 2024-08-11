package br.com.jsn.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.AnalyzeRequestDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ProjectController {


    @Autowired
    private ProjectService projectService;

    @CrossOrigin(origins = "http://localhost:4200") // Permite CORS apenas para o frontend especificado
    @Operation(summary = "save a project")
    @PostMapping("/project")
     public ResponseEntity<Object> createProject(@RequestBody ProjectDTO requestDTO){
    
         return ResponseEntity.ok(projectService.createProject(requestDTO));
        
     }

     @Operation(summary = "find project by ID")
     @CrossOrigin(origins = "http://localhost:4200") // Permite CORS apenas para o frontend especificado
     @GetMapping("/find_project")
      public ResponseEntity<Object> findProject(@RequestParam(value= "id") Long param){
     
          return ResponseEntity.ok(projectService.findProjectId(param));
         
      }


     @Operation(summary = "find project by Account")
     @CrossOrigin(origins = "http://localhost:4200") // Permite CORS apenas para o frontend especificado
     @GetMapping("/find_project_account")
      public ResponseEntity<Object> findProjectAccount(@RequestParam(value= "account") Long param){
     
          return ResponseEntity.ok(projectService.findProjectAccount(param));
         
      }
     
     @Operation(summary = "system send the task to N employees to analysis")
     @PostMapping("/send")
     public ResponseEntity<Object> searchAnalyst(@RequestBody ProjectDTO projectDto){

      return ResponseEntity.ok(projectService.sendTaskToEmployees(projectDto));
     }

    
     @Operation(summary = "analysis of task for N employees")
     @PostMapping("/analyst")
     public ResponseEntity<Object> createAnalyze(@RequestBody AnalyzeRequestDTO dto){

        return ResponseEntity.ok(projectService.analysisOfTask(dto));
     }


     @Operation(summary = "professional receive a green light to make the task") 
     @PostMapping("/action")
     public ResponseEntity<Object> action(@RequestBody TaskDTO task ){
   
         return ResponseEntity.ok(projectService.processingTask(task));
     }


     @Operation(summary = "client receives 0 or N analysis of budget")
     @PostMapping("/receiver")
     public ResponseEntity<Object> receiverAnalysis(@RequestBody ProjectDTO dto){

        return null;
     }

     @Operation(summary = "client make checking of analysis of tasks")
     @PostMapping("/verify")
     public ResponseEntity<Object> verifyAnalysis(@RequestBody AnalyzeDTO dto){
        return null;
     }

    @Operation(summary = "client choose the best budget of tasks") 
    @PostMapping("/accept_projects")
    public ResponseEntity<Object> acceptProjects(@RequestBody EmployeeDTO dto){
  
        return ResponseEntity.ok(projectService.projectsAccept(dto));
    }

 

    @Operation(summary = "professional accept the job")
    @PostMapping("/action_update")
    public ResponseEntity<Object> actionUpdate(@RequestBody ActionDTO dto ){
  
        return ResponseEntity.ok(projectService.updateAction(dto));
  
       
    }
    

   

    
}
