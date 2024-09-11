package br.com.jsn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class EmployeeController {
    

    @Autowired
    private EmployeeService employeeService;

    @Operation(
     summary = "Make a registe of professional",
     description = "Create a professional register to propose any solution to projects.",
     tags = {"Create a new Professional register"}
      )
    @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Prject created with success"),
    @ApiResponse(responseCode = "400", description = "Invalid Request")
    })
    @PostMapping("/employee")
     public ResponseEntity<Object> createEmployee(@RequestBody EmployeeDTO requestDTO){
    
         return ResponseEntity.ok(employeeService.saveEmployee(requestDTO));
        
     }

     @Operation(
     summary = "List of professionals by type ",
     description = "Generate a List of professionals by type registered in system.",
     tags = {"Find of professionals by type"}
          )
     @ApiResponses(value = {
     @ApiResponse(responseCode = "200", description = "List of Professionals found with success"),
     @ApiResponse(responseCode = "404", description = "Professionals by type not found"),
     @ApiResponse(responseCode = "400", description = "Invalid type request")
     })
     @GetMapping("/type-employee")
     public ResponseEntity<Object> getEmployeesByType(@RequestParam(value = "type" , required = true) String type){
    
          return ResponseEntity.ok(employeeService.findEmployeesByType(type));
        
     }

     @Operation(
    summary = "List of professionals",
    description = "Generate a List of professionals registered in system.",
    tags = {"Find of professionals"}
        )
    @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "List of Professionals found with success"),
    @ApiResponse(responseCode = "404", description = "Professionals not found"),
    @ApiResponse(responseCode = "400", description = "Invalid request")
    })
    @GetMapping("/employees")
     public ResponseEntity<Object> getEmployees(){
    
          return ResponseEntity.ok(employeeService.listEmployees());
        
     }
}
