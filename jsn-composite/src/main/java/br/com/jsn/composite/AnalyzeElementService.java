package br.com.jsn.composite;

import br.com.jsn.dto.AnalyzeDTO;

public class AnalyzeElementService extends ProjectComponent{

    private AnalyzeDTO analyzeDTO;

    public AnalyzeElementService(AnalyzeDTO analyzeDTO){
        this.analyzeDTO =analyzeDTO;
    }
    public AnalyzeElementService(){

    }
    
     @Override
    public Object display() {
        System.out.println(" Analyze " + analyzeDTO);
        return analyzeDTO;
    }
    
    
}
