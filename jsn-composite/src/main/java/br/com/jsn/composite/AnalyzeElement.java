package br.com.jsn.composite;

import br.com.jsn.dto.AnalyzeDTO;



public class AnalyzeElement extends ManagerComponent{

    private AnalyzeDTO analyzeDTO;

    public AnalyzeElement(AnalyzeDTO analyzeDTO){
        this.analyzeDTO =analyzeDTO;
    }
    public AnalyzeElement(){

    }
    
     @Override
    public Object display() {
       
        return analyzeDTO;
    }
    
    
}
