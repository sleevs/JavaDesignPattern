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

@RestController
public class EmployeeController {
    

    @Autowired
    private EmployeeService employeeService;

    @Operation(summary = "save a employee")
    @PostMapping("/employee")
     public ResponseEntity<Object> createEmployee(@RequestBody EmployeeDTO requestDTO){
    
         return ResponseEntity.ok(employeeService.saveEmployee(requestDTO));
        
     }


    @Operation(summary = "list employees by type")
    @GetMapping("/type-employee")
     public ResponseEntity<Object> getEmployees(@RequestParam(value = "type" , required = true) String type){
    
          return ResponseEntity.ok(employeeService.findEmployeesByType(type));
        
     }
}
