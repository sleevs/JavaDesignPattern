package br.com.jsn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.service.AnalyzeService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class AnalysisController {
    
    @Autowired
    private AnalyzeService analyzeService;

     @Operation(summary = "find analysis by Account")
     @GetMapping("/find_analysis_by_id")
      public ResponseEntity<Object> findAnalysisById(@RequestParam(value= "id") Long param){
     
          return ResponseEntity.ok(analyzeService.findAnalyzeById(param));
         
      }
}
