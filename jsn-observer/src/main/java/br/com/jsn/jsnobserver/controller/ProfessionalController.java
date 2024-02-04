package br.com.jsn.jsnobserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.jsnobserver.dto.ProfessionalDTO;

@RestController
public class ProfessionalController {


  
    
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody ProfessionalDTO professional){
        
        return null;
    }


    @GetMapping("/find{id}")
    public ResponseEntity<String> find(@PathVariable(value = "id") Long jobId ){
        
        return null;
    }

    @GetMapping("/list")
    public ResponseEntity<String> list(){
        
        return null;
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable(value = "id") Long jobId ,@RequestBody ProfessionalDTO professional){
        
        return null;
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long jobId ){
        
        return null;
    }
    
}
