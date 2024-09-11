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
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

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

    @Operation(
        summary = "save a project",
        description = "Create a project to solve any problem.",
        tags = {"Create a new Project"}
         )
       @ApiResponses(value = {
       @ApiResponse(responseCode = "200", description = "Prject created with success"),
       @ApiResponse(responseCode = "400", description = "Invalid Request")
       })
    @PostMapping("/project")
     public ResponseEntity<Object> createProject(@RequestBody ProjectDTO requestDTO){
    
         return ResponseEntity.ok(projectService.createProject(requestDTO));
        
     }

     
     @Operation(
        summary = "find project by ID",
        description = "Find the project structure by ID of project.",
        tags = {"Find Project"}
         )
       @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Project found with success"),
        @ApiResponse(responseCode = "404", description = "Project not found"),
        @ApiResponse(responseCode = "400", description = "Invalid Parameter")
       })
     @GetMapping("/find_project")
      public ResponseEntity<Object> findProject(@RequestParam(value= "id") Long param){
     
          return ResponseEntity.ok(projectService.findProjectId(param));
         
      }


      @Operation(
        summary = "find project by Account",
        description = "Find the project structure by user Account.",
        tags = {"Find Project by user Account"}
         )
       @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Project found with success"),
        @ApiResponse(responseCode = "404", description = "Project not found"),
        @ApiResponse(responseCode = "400", description = "Invalid Account")
       })
     @GetMapping("/find_project_account")
      public ResponseEntity<Object> findProjectAccount(@RequestParam(value= "account") Long param){
     
          return ResponseEntity.ok(projectService.findProjectAccount(param));
         
      }
     
      @Operation(
        summary = "Share the project with professional analysis",
        description = "System share the project to N employees to analysis and make solutions to the problem.",
        tags = {"Share Project to analysis"}
         )
       @ApiResponses(value = {
       @ApiResponse(responseCode = "200", description = "Sharing Project to analysis with success"),
       @ApiResponse(responseCode = "400", description = "Invalid Request")
       })
     @PostMapping("/send")
     public ResponseEntity<Object> searchAnalyst(@RequestBody ProjectDTO projectDto){

      return ResponseEntity.ok(projectService.sendTaskToEmployees(projectDto));
     }

        @Operation(
        summary = "Analysis of task for N employees",
        description = "Professional analyze the project problem and create a list of task to the solution.",
        tags = {"Create tasks to the solution"}
        )
        @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Analysis of Project registered with success"),
        @ApiResponse(responseCode = "400", description = "Invalid Request")
        })
        @PostMapping("/analyst")
        public ResponseEntity<Object> createAnalyze(@RequestBody AnalyzeRequestDTO dto){

        return ResponseEntity.ok(projectService.analysisOfTask(dto));
     }

     @Operation(
        summary = "Professional receive a green light to make the tasks",
        description = "User with account choose the best solution to the project problem.",
        tags = {"Choose the best solution to the project"}
        )
        @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Solution to the project registered with success"),
        @ApiResponse(responseCode = "400", description = "Invalid Request")
        })
     @PostMapping("/action")
     public ResponseEntity<Object> action(@RequestBody TaskDTO task ){
   
         return ResponseEntity.ok(projectService.processingTask(task));
     }

    
        @Operation(
        summary = "Client choose the best budget of tasks",
        description = "Client choose the best budget of tasks made to the Professional to be applied to the project.",
        tags = {"Choose best budget to the tasks"}
            )
        @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Professional analysis recording success"),
        @ApiResponse(responseCode = "400", description = "Invalid Request")
        })
        @PostMapping("/accept_projects")
        public ResponseEntity<Object> acceptProjects(@RequestBody EmployeeDTO dto){

        return ResponseEntity.ok(projectService.projectsAccept(dto));
        }

    
      @Operation(
      summary = "professional accept the job",
      description = "Make a record of a action for a task associed.",
      tags = {"Create a action to a task"}
       )
     @ApiResponses(value = {
     @ApiResponse(responseCode = "200", description = "Action recording success"),
     @ApiResponse(responseCode = "400", description = "Invalid Request")
     })
    @PostMapping("/action_update")
    public ResponseEntity<Object> actionUpdate(@RequestBody ActionDTO dto ){
  
        return ResponseEntity.ok(projectService.updateAction(dto));
  
       
    }
    

   

    
}
