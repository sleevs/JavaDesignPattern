package br.com.jsn.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeRequestDTO;
import br.com.jsn.dto.AnalyzeResponseDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.ProjectRequestDTO;
import br.com.jsn.service.EmployeeService;
import br.com.jsn.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProjectController {


    @Autowired
    private ProjectService projectService;

   

    @Operation(summary = "save a project and generate N task")
    @PostMapping("/project")
     public ResponseEntity<Object> createProject(@RequestBody ProjectRequestDTO requestDTO){
    
         return ResponseEntity.ok(projectService.createProject(requestDTO));
        
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


     @Operation(summary = "client receives 0 or N analysis of budget")
     @PostMapping("/receiver")
     public ResponseEntity<Object> receiverAnalysis(@RequestBody ProjectDTO dto){

        return ResponseEntity.ok(projectService.receiveAnalyses(dto));
     }
     @Operation(summary = "client make checking of analysis of tasks")
     @PostMapping("/verify")
     public ResponseEntity<Object> verifyAnalysis(@RequestBody AnalyzeResponseDTO dto){


        return ResponseEntity.ok(projectService.verifyAnalyses(dto));
     }
     @Operation(summary = "client choose the best budget of tasks") 
    @PostMapping("/accept_projects")
    public ResponseEntity<Object> acceptProjects(@RequestBody EmployeeDTO dto){
  
        return ResponseEntity.ok(projectService.projectsAccept(dto));
  
       
    }
    @Operation(summary = "professional receive a green light to make the task") 
    @PostMapping("/action")
    public ResponseEntity<Object> action(@RequestBody ActionDTO dto ){
  
        return ResponseEntity.ok(projectService.projectAction(dto));
  
       
    }
    @Operation(summary = "professional accept the job")
    @PostMapping("/action_update")
    public ResponseEntity<Object> actionUpdate(@RequestBody ActionDTO dto ){
  
        return ResponseEntity.ok(projectService.updateAction(dto));
  
       
    }
    

   

    
}
