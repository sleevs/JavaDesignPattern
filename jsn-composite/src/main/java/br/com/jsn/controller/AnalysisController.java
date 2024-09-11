package br.com.jsn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.service.AnalyzeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class AnalysisController {
    
    @Autowired
    private AnalyzeService analyzeService;

    @Operation(
    summary = "Find analysis by Account",
    description = "Find Analysis by Id Account.",
    tags = {"Find Analysis"}
        )
    @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Analysis found with success"),
    @ApiResponse(responseCode = "404", description = "Analysis not found"),
    @ApiResponse(responseCode = "400", description = "Invalid Analysis Id")
    })
     @GetMapping("/find_analysis_by_id")
      public ResponseEntity<Object> findAnalysisById(@RequestParam(value= "id") Long param){
     
          return ResponseEntity.ok(analyzeService.findAnalyzeById(param));
         
      }
}
